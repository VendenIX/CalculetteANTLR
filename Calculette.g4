grammar Calculette;

@members {
   private TablesSymboles tablesSymboles = new TablesSymboles();
        }


start
    : calcul EOF;

calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour l'utiliser comme accumulateur 
@after{ System.out.println($code); } // On affiche l’ensemble du code produit

    :   (decl { $code += $decl.code; })*

        NEWLINE*

        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; }
    ;
decl returns [ String code ]
    :
        TYPE IDENTIFIANT finInstruction
        {
            if ($TYPE.text.equals("int")){
                $code = "STOREG 0" + "\n";
                tablesSymboles.addVarDecl($IDENTIFIANT.text,"int");
            }
            else {
                $code = "STOREG 0" + "\n";
                tablesSymboles.addVarDecl($IDENTIFIANT.text,"double");
            }
        }
    ;

assignation returns [ String code ] 
    : IDENTIFIANT '=' expression
        {  
            $code = "STOREG " + $expression.code + "\n";
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
    | finInstruction
        {
            $code="";
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
    | IDENTIFIANT
        {
            VariableInfo vi = tablesSymboles.getVariableInfo($IDENTIFIANT.text);
            $code = vi.code
        }
    | ENTIER
        {
            $code = "PUSHI " + $ENTIER.text + "\n";
        }    
    ;

finInstruction : ( NEWLINE | ';' )+ ;

// lexer
NEWLINE : '\r'? '\n'  ;

ENTIER : ('0'..'9')+  ;

TYPE : 'int' | 'double' ;

MOTCLE
    :  'break' | 'class' | 'else' | 'if' | 'import' | 'public' | 'static' | 'throws'
    ;

IDENTIFIANT
    :   ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

WS :   (' '|'\t')+ -> skip  ;


UNMATCH : . -> skip ;