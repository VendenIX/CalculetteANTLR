grammar Calculator;

start
    : calcul EOF
    ;

calcul returns [ String code ]
@init{ $code = new String(); }   // On initialise code, pour l'utiliser comme accumulateur 
@after{ System.out.println($code); } // On affiche l’ensemble du code produit

    : 
        NEWLINE*

        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; }
    ;

instruction returns [ String code ] 
    : expression finInstruction 
        { 
            $code = $expression.code;
        }
   | finInstruction
        {
            $code="";
        }
    ;

expression returns [ String code ]
    : 
      '(' g=expression ')'
    {
        $code = $g.code;
    } 
    |
      '-' d=expression 
    {
        $code = "PUSHI 0\n" + $d.code + "SUB\n";
    }
    |
    g=expression op=('*'|'/') d=expression 
    {
        if($op.text.equals("*")) {
            $code = $g.code + $d.code + "MUL\n";
        } else {
            $code = $g.code + $d.code + "DIV\n";
        }
    }
    |
     g=expression op=('+'|'-') d=expression
    {
        if($op.text.equals("+")) {
            $code = $g.code + $d.code + "ADD\n";
        } else {
            $code = $g.code + $d.code + "SUB\n";
        }
    }

    | ENTIER
    {
        $code = "PUSHI " + $ENTIER.text + "\n";
    }
    ;

finInstruction : ( NEWLINE | ';' )+ ;

NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

UNMATCH : . -> skip ;
