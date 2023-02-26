grammar Calculette;

@headers {
        }

@members {
    private TablesSymboles tablesSymboles = new TablesSymboles();
    private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles, pour whilebloc*/
    private String getNewLabel() { return "Label" +(_cur_label++); }
    // ...
        }


start
    : calcul EOF; 
    
whilebloc returns [ String code ]
@init{ $code = new String(); }
    : 'while' '(' condition ')' bloc
        {   
            String labeldebut = getNewLabel();
            String labelfin = getNewLabel();
            $code += "LABEL "+ labeldebut +"\n"+ $condition.code + "JUMPF "+ labelfin + "\n" + $bloc.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
        }
    ;



bloc returns [ String code ]  
@init{ $code = new String(); }
    : '{'

        NEWLINE*

        (decl { $code += $decl.code; })*

        (instruction { $code += $instruction.code; })* 

        NEWLINE*
      '}'
      
        NEWLINE*
    ;


calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour l'utiliser comme accumulateur 
@after{ System.out.println($code); } // On affiche l’ensemble du code produit

    :   (whilebloc { $code += $whilebloc.code; })*
    
        (bloc { $code += $bloc.code; })*
    
        (decl { $code += $decl.code; })*

        NEWLINE*

        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; }
    ;
decl returns [ String code ]
    : TYPE IDENTIFIANT finInstruction
        {
            if ($TYPE.text.equals("int")){
                $code = "PUSHI 0\n";
                tablesSymboles.addVarDecl($IDENTIFIANT.text,"int");
            }
            else {
                $code = "PUSHI 0\n";
                tablesSymboles.addVarDecl($IDENTIFIANT.text,"double");
            }
        }
    ;

assignation returns [ String code ] 
    : IDENTIFIANT '=' expression
        {  
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = $expression.code + "STOREG " + vi.address + "\n";
        }
    ;

increment returns [ String code ]
    : IDENTIFIANT '+=' expression
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            $code = "PUSHG " + vi.address + "\n" + $expression.code + "ADD\n" + "STOREG " + vi.address + "\n";
        }
    ;

condition returns [ String code]
    : g=expression op=('=='|'!='|'<'|'<='|'>'|'>=') d=expression
        {$code = $g.code + $d.code + ($op.text)+ "\n";
        }
    |'true'
        {$code = "PUSHI 1\n";
        }
    |'false'
        {$code = "PUSHI 0\n";
        }
    ;

entree returns [ String code ] 
    : 'input' '(' IDENTIFIANT ')'
        {
            VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);
            if (vi.type == "int"){
                $code = "READ\n" + "STOREG " + vi.address + "\n";
            }
        }
    ;

sortie returns [ String code ] 
    : 'print' '(' expression ')'
        {
           $code = $expression.code +"WRITE\nPOP \n";
        }
    ;

instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
    | assignation finInstruction
        { 
		    $code = $assignation.code;
        }
    | increment finInstruction
        {
            $code = $increment.code;
        }
    | entree finInstruction
        {   
            $code = $entree.code;
        }
    | sortie finInstruction
        {
            $code= $sortie.code;
        }
    | bloc
        {
            $code = $bloc.code;
        }
    | whilebloc
        {
            $code = $whilebloc.code;
        }
    ;

expression returns [ String code ]
    : '(' c=expression ')'
        {
            $code = $c.code;
        }
    | '-' d=expression 
        {
            $code = "PUSHI 0\n"+ $d.code + "SUB\n";
        }
    | a = expression op=('*'|'/') b=expression
        {
            if($op.text.equals("*")){ $code = $a.code + $b.code + "MUL\n";}
            else {$code = $a.code + $b.code + "DIV\n";}
        }
    | a = expression op=('+'|'-') b=expression
        {
            if($op.text.equals("+")){ $code = $a.code + $b.code + "ADD\n";}
            else {$code = $a.code + $b.code + "SUB\n";}
        }
    | ENTIER
        {
            $code = "PUSHI " + $ENTIER.text + "\n";
        }  
    | IDENTIFIANT 
        { 
        VariableInfo vi = tablesSymboles.getVar($IDENTIFIANT.text);            
        $code = "PUSHG "+ vi.address + "\n";
        }
    ;

finInstruction : ( NEWLINE | ';' )+ ;

// lexer
NEWLINE : '\r'? '\n'  ;

ENTIER : ('0'..'9')+  ;

TYPE : 'int' | 'double' ;

MOTCLE
    :  'break' | 'class' | 'else' | 'if' | 'import' | 'public' | 'static' | 'throws' | 'print' | 'input'
    ;

IDENTIFIANT
    :   ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

WS :   (' '|'\t')+ -> skip  ;


UNMATCH : . -> skip ;