grammar Calculette;

@members {
    private TablesSymboles tablesSymboles = new TablesSymboles();
    private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles, pour whilebloc*/
    private String getNewLabel() { return "Label" +(_cur_label++); }
    // ...
    private String getScope(VariableInfo vi) {
        if (vi.scope == VariableInfo.Scope.GLOBAL){ return "G ";}
        else{ return "L ";}
    }
        }

start
    : calcul EOF; 

forbloc returns [ String code ]
@init{ $code = new String(); }
    : 'for' '(' debut=assignation ';' condition ';' incr=assignation ')' instruction
        {
            String labeldebut = getNewLabel();
            String labelfin = getNewLabel();
            $code += $debut.code + "LABEL "+ labeldebut +"\n"+ $condition.code + "JUMPF "+ labelfin + "\n" + $instruction.code + $incr.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
        }
    ;

branchement returns [ String code ]
@init{ $code = new String(); }
    : 'if' '(' condition ')' instruction
        {
            String label = getNewLabel();
            $code += $condition.code + "JUMPF " + label + "\n" + $instruction.code + "LABEL " + label + "\n";
        }
    | 'if' '(' condition ')' instr1=instruction 'else' instr2=instruction
        {
            String label1 = getNewLabel();
            String label2 = getNewLabel();
            $code += $condition.code + "JUMPF " + label1 + "\n" + $instr1.code + "JUMP " + label2 + "\n" + "LABEL " + label1 + "\n" + $instr2.code + "LABEL " + label2 + "\n";
        }
    ;

whilebloc returns [ String code ]
@init{ $code = new String(); }
    : 'while' '(' condition ')' instruction
        {   
            String labeldebut = getNewLabel();
            String labelfin = getNewLabel();
            $code += "LABEL "+ labeldebut +"\n"+ $condition.code + "JUMPF "+ labelfin + "\n" + $instruction.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
        }
    ;



bloc returns [ String code ]  
@init{ $code = new String(); }
    :   NEWLINE*
        '{'
        NEWLINE*

        (decl { $code += $decl.code; })*

        (instruction { $code += $instruction.code; })* 

        NEWLINE*
        '}'      
        NEWLINE*
    ;

//Parse un calcul (peut contenir plusieurs blocs et déclarations)
calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour l'utiliser comme accumulateur 
@after{ System.out.println($code); } // On affiche l’ensemble du code produit

    :   (decl { $code += $decl.code; })*
        { $code += "   JUMP Main\n"; }
        NEWLINE*
        (fonction { $code += $fonction.code; })*
        NEWLINE*

        { $code += "LABEL Main\n"; }
        (instruction { $code += $instruction.code; })*
        NEWLINE*
        { $code += "  HALT\n"; }
    ;

//Parse les déclarations de variables
decl returns [String code]
    : TYPE IDENTIFIANT finInstruction
        {
            if (!$TYPE.text.equals("double")) {
                $code = "PUSHI 0\n";
                tablesSymboles.addVarDecl($IDENTIFIANT.text, "int");
            }else{
                $code = "PUSHF 0.0\n";
                tablesSymboles.addVarDecl($IDENTIFIANT.text, "double");
            }
        }
    | TYPE IDENTIFIANT '=' expression finInstruction
        {
            if (!$TYPE.text.equals("double")) {
                tablesSymboles.addVarDecl($IDENTIFIANT.text, "int");
                VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
                $code = "PUSHI 0\n"+ $expression.code + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                tablesSymboles.addVarDecl($IDENTIFIANT.text, "double");
                VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
                $code = "PUSHF 0.0\n"+ $expression.code + "STORE"+ getScope(vi) + (vi.address + 1) + "\n"+ "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    ;


//Parse les assignations de variables
assignation returns [ String code , String type]
@init{ $type = "int"; }
    : IDENTIFIANT '=' expression
        {  
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type = vi.type;
            if (!$type.equals("double")){
                $code = $expression.code + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = $expression.code + "STORE"+ getScope(vi) + (vi.address + 1)+ "\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    | IDENTIFIANT '+=' expression
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type = vi.type;
            if (!$type.equals("double")){
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + $expression.code + "ADD\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSH"+ getScope(vi) + (vi.address + 1) + "\n" + $expression.code + "FADD\n" + "STORE"+ getScope(vi) + (vi.address + 1) + "\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    | IDENTIFIANT '-=' expression
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type = vi.type;
            if (!$type.equals("double")){
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + $expression.code + "FSUB\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSH"+ getScope(vi) + (vi.address + 1) + "\n" + $expression.code + "FSUB\n" + "STORE"+ getScope(vi) + (vi.address + 1) + "\n"+ "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    | IDENTIFIANT '*=' expression
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type  = vi.type;
            if (!$type.equals("double")){
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + $expression.code + "FMUL\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSH"+ getScope(vi) + (vi.address + 1) + "\n" + $expression.code + "FMUL\n" + "STORE"+ getScope(vi) + (vi.address + 1) + "\n"+ "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    | IDENTIFIANT '/=' expression
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type = vi.type;
            if (!$type.equals("double")){
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + $expression.code + "DIV\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSH"+ getScope(vi) + (vi.address + 1) + "\n" + $expression.code + "FDIV\n" + "STORE"+ getScope(vi) + (vi.address + 1) + "\n"+ "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    | IDENTIFIANT '++'
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type = vi.type;
            if (!$type.equals("double")){
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSHI 1\n" + "ADD\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSH"+ getScope(vi) + (vi.address + 1) + "\n"+ "PUSHF 1.0\n" + "FADD\n" + "STORE"+ getScope(vi) + (vi.address + 1) + "\n"+ "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    | IDENTIFIANT '--'
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $type = vi.type;
            if (!$type.equals("double")){
                $code = "PUSH"+ getScope(vi)  + "\n" + "PUSHI 1\n" + "SUB\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
	            $code = "PUSH"+ getScope(vi) + vi.address + "\n" + "PUSH"+ getScope(vi) + (vi.address + 1) + "\n"+ "PUSHF 1.0\n" + "FADD\n" + "STORE"+ getScope(vi) + (vi.address + 1) + "\n"+ "STORE"+ getScope(vi) + vi.address + "\n";
            }
        }
    ;

//à améliorer pour ne pas poursuivre le and et le or lorsque condition de gauche suffit à valider/invalider la condition avec des jumps
condition returns [ String code]
    : '!' condition
        {
            $code= "PUSHI 1\n" + $condition.code + "SUB \n";
        }
    
    | a = condition ('&&') b=condition
        {
            $code= $a.code + $b.code + "MUL \n";
        } 
    | a = condition ('||') b=condition
        {
            $code = $a.code + $b.code + "ADD \n PUSHI 1\n SUPEQ \n";
        }
    | conditionbasique
        {
            $code = $conditionbasique.code;
        }
    |'true'
        {$code = "PUSHI 1\n";
        }
    |'false'
        {$code = "PUSHI 0\n";
        }
    | expression
        {
            $code = $expression.code;
        }
    ;

entree returns [ String code ] 
    : 'input' '(' IDENTIFIANT ')'
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if (!vi.type.equals("double")){
                $code = "READ\n" + "STORE"+ getScope(vi) + vi.address + "\n";
            }else{
                $code = "READF\n" + "STORE" + getScope(vi) + (vi.address+ 1) + "\n" + "STORE" + getScope(vi) + vi.address + "\n";
            }
        }
    ;

//Parse les sorties clavier
sortie returns [ String code ] 
    : 'print' '(' expression ')'
        {
            if (!$expression.type.equals("double")){
                $code = $expression.code +"WRITE\nPOP \n";
            } else {
                $code = $expression.code+"WRITEF\nPOP\nPOP\n";
            }
        }

    ;

//Parse les instructions (assignations, entrées, sorties, expressions)
instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
    | assignation finInstruction
        { 
		    $code = $assignation.code;
        }
    | entree finInstruction
        {   
            $code = $entree.code;
        }
    | sortie finInstruction
        {
            $code= $sortie.code;
        }
    | decl 
        {
            $code = $decl.code;
        }
    | bloc
        {
            $code = $bloc.code;
        }
    | whilebloc 
        {
            $code = $whilebloc.code;
        }
    | branchement
        {
            $code = $branchement.code;
        }
    | forbloc
        {
            $code = $forbloc.code;
        }
    | fonction
        {
            $code = $fonction.code;
        }
    | RETURN expression finInstruction {
            VariableInfo vi = tablesSymboles.getReturn();
            if(vi.type.equals("double")){
                $expression.code = $expression.type.equals("double") ? $expression.code : $expression.code + "ITOF\n";
                $code = $expression.code + "STOREL "+ (vi.address+1) + "\nSTOREL "+vi.address+"\n";
            }else{
                $code = $expression.code + "STOREL "+vi.address+"\n";
            }
                $code +="RETURN\n";
        }
    ;

//Parse les expressions (opérations, parenthèses, entiers, variables)
expression returns [ String code, String type]
    @init { $type = "int";}
    : '(' c=expression ')'
        {
            $code = $c.code;
            $type = $c.type;
        }
    | '-' d=expression 
        {
            $code = "PUSHI 0\n"+ $d.code + "SUB\n";
        }
    | a = expression op=('*'|'/') b=expression
    {
        if($a.type.equals("double") || $b.type.equals("double")) {
            $type = "double";
            $a.code= $a.type.equals("int") ? $a.code + "ITOF\n" : $a.code;
            $b.code= $b.type.equals("int") ? $b.code + "ITOF\n" : $b.code;
            if($op.text.equals("*")){ 
                $code = $a.code + $b.code + "FMUL\n";
            } else {
                $code = $a.code + $b.code + "FDIV\n";
            }
        }else {
            $type = "int";
            if($op.text.equals("*")){ $code = $a.code + $b.code + "MUL\n";}
            else {$code = $a.code + $b.code + "DIV\n";}
        }
    }
    | a = expression op=('+'|'-') b=expression
    {
        if ($a.type == "double" || $b.type == "double"){
            $type = "double";
            if($a.type == "int"){ 
                $a.code += "ITOF\n";
            }
            if($b.type == "int"){ 
                $b.code += "ITOF\n";
            }
            if($op.text.equals("+")){ 
                $code = $a.code + $b.code + "FADD\n";
            } else {
                $code = $a.code + $b.code + "FSUB\n";
            }
        }else {
            $type = "int";
            if($op.text.equals("+")){ $code = $a.code + $b.code + "ADD\n";}
            else {$code = $a.code + $b.code + "SUB\n";}
        }
    }
    | BOOLEEN=('true' | 'false')
        {
            if($BOOLEEN.text.equals("true"))
            {
                $code = "PUSHI 1\n";
            }else{
                $code = "PUSHI 0\n";
            }
            $type="bool";


        } 
    | FLOTTANT
        {
            $type = "double";
            $code = "PUSHF " + $FLOTTANT.text + "\n";
        }
    | ENTIER
        {
            $code = "PUSHI " + $ENTIER.text + "\n";
            $type = "int";
        }
    | IDENTIFIANT 
        { 
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
        $type = vi.type;
        if (!$type.equals("double")){
            $code = "PUSH"+ getScope(vi)+ vi.address + "\n";
        }else{
            $code = "PUSH"+ getScope(vi)+ vi.address + "\n" + "PUSH"+ getScope(vi)+ (vi.address + 1)+ "\n";
        }
        }

    | IDENTIFIANT '(' args ')' //appel de fonction avec arguments
        {
            //ajouter ici le nettoyage de la pile 
            String functionType = tablesSymboles.getFunction($IDENTIFIANT.text);
            $type = functionType;
            if (!$type.equals("double")){
                $code = "PUSHI 0\n"; //output de la fonction
                $code+= $args.code + "CALL " + $IDENTIFIANT.text + "\n";
            }else{
                $code = "PUSHI 0\nPUSHI 0\n"; //output de la fonction
                $code+= $args.code + "CALL " + $IDENTIFIANT.text + "\n";
            }
            for (int i = $args.size; i > 0; i--){
                $code += "POP \n";
            }
        }
    | '(' TYPE ')' expression 
        { 
            $type = $TYPE.text;
            $code = $expression.code;
                if($TYPE.text.equals("int")){ 
                    if($expression.type.equals("double")){
                        $code += "FTOI\n";
                    }
                }
                    
                if($TYPE.text.equals("double")){
                    if(!$expression.text.equals("double")){
                        $code += "ITOF\n";
                    }
                }

                if($TYPE.text.equals("bool")){
                    if($expression.text.equals("double")){
                        $code += "ITOF\nPUSHI 0\nSUP\n";
                    }else if ($expression.text.equals("int")){ 
                        $code += "PUSHI 0\nSUP\n";
                    }
                }

                    
        }
    ;

conditionbasique returns [ String code, String type]
    :
    | a = expression '<' b = expression 
    {
        if($a.type.equals("double")) {
            $type = $a.type ;
            /*Si $b.type.equals("double") alors on ne fait rien (conversion implicite), sinon on convertit b en double*/
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FINF\n";  
        }else if($b.type.equals("double")) {
            $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FINF\n";  
        }else {
            $type = $a.type ;
            $code = $a.code + $b.code + "INF\n";  
        }
    }
    |
    	| a = expression '>' b = expression 
    {
       
        if($a.type.equals("double")) {
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUP\n";  
                 
        }else if($b.type.equals("double")) {
             $type = $b.type ;    
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUP\n";             
        }else {
            $type = $a.type ;    
            $code = $a.code + $b.code + "SUP\n";  
        }
        
    }
	| a = expression '>=' b = expression 
    {
        if($a.type.equals("double")) {
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUPEQ\n";  
        }else if($b.type.equals("double")) {
            $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FSUPEQ\n";  
        }else {
            $type = $a.type ; 
            $code = $a.code + $b.code + "SUPEQ\n";  
        }

    }
    	| a = expression '<=' b = expression 
    {   
         if($a.type.equals("double")) {
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FINFEQ\n";  
                 
        }else if($b.type.equals("double")) {
            $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FINFEQ\n";  
        }else {
         $type = $a.type ;             
         $code = $a.code + $b.code + "INFEQ\n";  
        }
        
    }
    | a = expression '==' b = expression
    {
         if($a.type.equals("double")) {
            $type = $a.type ;    
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FEQUAL\n";  
                 
        }else if($b.type.equals("double")) {
            $type = $b.type ;    
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FEQUAL\n";  
                 
        }else {
            $type = $a.type ;
            $code = $a.code + $b.code + "EQUAL\n";  
        }
        
    }
    | a = expression ('!='|'<>') b = expression
    {
         if($a.type.equals("double")) {    
            $type = $a.type ;
            $b.code= $b.type.equals("double") ? $b.code : $b.code + "ITOF\n";
            $code = $a.code + $b.code + "FNEQ\n";  
                 
        }else if($b.type.equals("double")) {   
            $type = $b.type ;
            $a.code= $a.type.equals("double") ? $a.code : $a.code + "ITOF\n";
            $code = $a.code + $b.code + "FNEQ\n";  
        }else {
            $type = $a.type ;
            $code = $a.code + $b.code + "NEQ\n";  
        }
    }
    ;


fonction returns [ String code ]
@init{ tablesSymboles.enterFunction();}
@after{ tablesSymboles.exitFunction();}
    //Permet de reconnaître une déclaration de fonction
    : TYPE IDENTIFIANT '(' params ? ')'
        {
            //Enregistre le type de la fonction:  
            tablesSymboles.addFunction($IDENTIFIANT.text, $TYPE.text);

            $code = "LABEL " + $IDENTIFIANT.text + "\n";
        }
            bloc 
        {
            // corps de la fonction
            $code += $bloc.code;
            $code += "RETURN\n";
        }
    ;

//Permet de reconnaître les paramètres
params
    : (TYPE IDENTIFIANT
        {
            //code java gérant une variable locale (arg0)
            // quand tu as un seul argument
            //tablesSymboles.addVarDecl($IDENTIFIANT.text, $TYPE.text);
            tablesSymboles.addParam($IDENTIFIANT.text, $TYPE.text);

        }
        ( ',' TYPE IDENTIFIANT
            {
                // code java gérant une variable locale (argi)
                // quand t'en as un autre, ou plusieurs autres
                //tablesSymboles.addVarDecl($IDENTIFIANT.text, $TYPE.text);
                tablesSymboles.addParam($IDENTIFIANT.text, $TYPE.text);
            }
        )*
    )
    ;

//size correspond au nombre d'arguments
//Permet de passer un argument passé à une fonction
args returns [String code, int size]
@init{ $code = new String(); $size = 0;}
    : ( expression
        {
            $code += $expression.code;
            if($expression.type.equals("double")){
                $size +=2;
            } else{
                $size +=1;
            }
        }
      ( ',' expression
        {
            $code += $expression.code;
            if($expression.type.equals("double")){
                $size +=2;
            } else{
                $size +=1;
            }
        }
      )*
    )?
    ;

finInstruction : ( NEWLINE | ';' )+ ;

COMMENTAIRE
    // Simple commentaire      Commentaire multi-lignes
    : (('%' ~('\n'|'\r')*) | ('#' ~('\n'|'\r')*) | ('/*' .*? '*/'))
    -> skip
    ;

// lexer
NEWLINE : '\r'? '\n'  ;

BOOLEEN : 'true' | 'false';

ENTIER : ('0'..'9')+  ;

FLOTTANT : (ENTIER '.' ENTIER*);

TYPE : 'int' | 'double' | 'bool' ;

RETURN: 'return';

IDENTIFIANT
    :   ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;




// Ignorer les espaces et les tabulations
WS :   (' '|'\t')+ -> skip  ;

UNMATCH : . -> skip ;

/*
    Rappel des instructions 

    Opérations sur la pile:
        PUSHI n: met la valeur n sur la pile
        POP: enlève la valeur du sommet de la pile
        DUP: duplique la valeur du sommet de la pile
        ADD (SUB, MUL, DIV): effectue l’opération sur les deux valeurs du sommet de la pile (la valeur du sommet est la deuxième opérande)
    Données: 
        PUSHG n: copie une valeur de la pile à l'adresse n au sommet de la pile
        PUSHL n:
        STOREG n: stocke la valeur du sommet de la pile à l'adresse n
        STOREL n:
        READ: lit une valeur au clavier et la met sur la pile
        WRITE: écrit la valeur du sommet de la pile
    Contrôle de flot:
        JUMP Label: saute à l'instruction Label
        JUMPF Label: saute à l'instruction Label si la valeur du sommet de la pile est 0
        CALL Label: empile l'adresse de l'instruction suivante et saute à l'instruction Label
        RETURN: saute à l'instruction suivant l'instruction CALL
    Flottants:
        PUSHF f: met la valeur f sur la pile
        FADD (FSUB, FMUL, FDIV): effectue l’opération sur les deux valeurs du sommet de la pile (la valeur du sommet est la deuxième opérande)
        FSUP (FSUPEQ,FINF,FINFEQ,FEQ,FNEQ): effectue l’opération sur les deux valeurs du sommet de la pile (la valeur du sommet est la deuxième opérande)
        READF: lit une valeur au clavier et la met sur la pile
        WRITEF: écrit la valeur du sommet de la pile
        ITOF: convertit la valeur du sommet de la pile en flottant
        FTOI: convertit la valeur du sommet de la pile en entier
    Autres:
        FREE n: libère n cases de la pile
        ALLOC n: alloue n cases de la pile
        HALT: arrête l'exécution du programme
        PUSHR n: copie une valeur de la pile à l'adresse relative n au sommet de la pile
        STORER n: stocke la valeur du sommet de la pile à l'adresse relative n
        JUMPR Label: saute à l'instruction relative Label
        PUSHSP: met l'adresse du sommet de la pile sur la pile
        PUSHFP: met l'adresse du début de la pile de la fonction sur la pile
 */

