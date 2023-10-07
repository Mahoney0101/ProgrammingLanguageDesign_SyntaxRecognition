grammar Cmm;

// ** PARSER RULES **

// ** Program Structure **
program : (varDeclaration | functionDeclaration | structDeclaration)* mainFunction EOF;
mainFunction : VOID MAIN LPAREN RPAREN block;

// ** Declarations **

varDeclaration : (type | structTypeDeclaration) arrayDimensions? idList SEMI;


fieldDeclaration : (type arrayDimensions? | structTypeDeclaration arrayDimensions?) idList SEMI;

structTypeDeclaration : STRUCT ID? LBRACE fieldDeclaration+ RBRACE ;

structDeclaration : STRUCT LBRACE fieldDeclaration+ RBRACE arrayDimensions? ID SEMI;
functionDeclaration : type ID LPAREN paramList? RPAREN block;

// ** Statements and Blocks **
statement : varDeclaration
          | assignment
          | ifStatement
          | whileStatement
          | returnStatement
          | writeStatement
          | readStatement
          | functionCall SEMI
          ;

block : LBRACE blockStatement* RBRACE
      | statement
      ;

blockStatement : varDeclaration
               | statement
               ;

// ** Specific Statement Types **
ifStatement : IF LPAREN expr RPAREN block (ELSE block)?;
assignment : expr ASSIGN expr SEMI;
whileStatement : WHILE LPAREN expr RPAREN block;
returnStatement : RETURN expr SEMI;
writeStatement : WRITE exprList SEMI;
readStatement : READ exprList SEMI;

// ** Expressions and Types **
expr : expr OR expr            // orExpr
     | expr AND expr           // andExpr
     | expr EQ expr            // eqExpr
     | expr NEQ expr           // neqExpr
     | expr LTE expr           // lteExpr
     | expr LT expr            // ltExpr
     | expr GTE expr           // gteExpr
     | expr GT expr            // gtExpr
     | expr ADD expr           // addExpr
     | expr SUB expr           // subExpr
     | expr MUL expr           // mulExpr
     | expr DIV expr           // divExpr
     | expr MOD expr           // modExpr
     | SUB expr                // unaryMinusExpr
     | NOT expr                // notExpr
     | LPAREN expr RPAREN      // parenExpr
     | INT_CONSTANT            // intConst
     | DOUBLE_CONSTANT         // doubleConst
     | CHAR_CONSTANT           // charConst
     | ID                      // idExpr
     | functionCall            // functionCallExpr
     | ID DOT ID               // structFieldAccess
     | expr LBRACKET expr RBRACKET  // arrayIndexing
     | expr DOT ID              // nestedStructFieldAccess
     | LPAREN type RPAREN expr // typeCast
     ;

exprList : expr (COMMA expr)*;
paramList : param (COMMA param)*;
param : type ID;

type : baseType
     | ID
     ;

baseType : INT
         | DOUBLE
         | CHAR
         | VOID
         ;

// ** Variable and Function Handling **
idList : (ID arrayDimensions?)(COMMA ID arrayDimensions?)*;

arrayDimensions : (LBRACKET INT_CONSTANT RBRACKET)+;

functionCall : ID LPAREN exprList? RPAREN;

// ** LEXER RULES **

// ** Keywords and Special Symbols **
IF : 'if';
ELSE : 'else';
WHILE : 'while';
VOID : 'void';
MAIN : 'main';  // 'main' function identifier.
WRITE : 'write';
STRUCT : 'struct';
INT : 'int';
DOUBLE : 'double';
CHAR : 'char';
READ : 'read';
RETURN : 'return';

ASSIGN : '=';
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
SEMI : ';';
COMMA : ',';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
MOD : '%';
GT : '>';
GTE : '>=';
LT : '<';
LTE : '<=';
NEQ : '!=';
EQ : '==';
AND : '&&';
OR : '||';
NOT : '!';
DOT : '.';

// ** Identifiers and Literals **
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;
CHAR_CONSTANT : '\'' ( ESCAPE_SEQUENCE | ~('\'' | '\\') ) '\'';
DOUBLE_CONSTANT : [0-9]+ '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;
INT_CONSTANT : '0' | [1-9][0-9]* ;

fragment ESCAPE_SEQUENCE : '\\' ('n' | 't' | 'b' | 'r' | '\'' | '\\') | '\\' [0-7] [0-7]? [0-7]?;
fragment EXPONENT : [eE] [+-]? [0-9]+;

// ** Comments and Whitespace **
ONE_LINE_COMMENT : '//' ~('\n')* -> skip ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;

