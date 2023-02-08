grammar Calculette;


@parser::members {

    private int evalexpr (int x, String op, int y) {
        if ( op.equals("*") ){
            return x*y;
        } else if ( op.equals("+") ){
            return x+y;
        } else if (op.equals("/")) {
            return x/y;
        } else if (op.equals("-")) {
            return x-y;
        }
        else {
           System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
           throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
        }
    }

}

start
    : expr EOF {System.out.println($expr.val);}
    ;

/*
    '(' expr ')'
    expr '*' expr
    expr '/' expr
    expr '+' expr
    expr '-' expr
    ENTIER
 */

/*
expr  returns [ int val ]
    :  '(' a=expr ')' {$val = $a.val;} 
    | a=expr '*' b=expr {$val = $a.val * $b.val;} 
    | a=expr '/' b=expr {$val = $a.val / $b.val;}
    | a=expr '+' b=expr {$val = $a.val + $b.val;}
    | a=expr '-' b=expr {$val = $a.val - $b.val;}
    | c=ENTIER {$val = $c.int;}
    ;
*/

expr  returns [ int val ]
    :  '(' a=expr ')' {$val = $a.val;} 
    | '-' b=expr {$val = -1*$b.val;}
    | a=expr op=('*'|'/') b=expr {$val = evalexpr($a.val,$op.text,$b.val);} 
    | a=expr op=('+'|'-') b=expr {$val = evalexpr($a.val,$op.text,$b.val);}
    | c=ENTIER {$val = $c.int;}
    ;
    /* 
expr returns [ int val ]
    : a=expr op=('*'|'/') b=expr {System.out.println($op.text);}
    */
// lexer
NEWLINE : '\r'? '\n'  -> skip;

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

UNMATCH : . -> skip ;