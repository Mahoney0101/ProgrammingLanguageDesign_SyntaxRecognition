grammar Cmm;

// Parser Rules
program : (varDeclaration | functionDeclaration | structDeclaration)* mainFunction EOF;

varDeclaration : type idList (LBRACKET INT_CONSTANT RBRACKET)* SEMI;
idList : ID (COMMA ID)*;

functionDeclaration : type ID LPAREN paramList? RPAREN block;
mainFunction : VOID 'main' LPAREN RPAREN block;

structDeclaration : STRUCT LBRACE fieldDeclaration+ RBRACE ID SEMI;
fieldDeclaration : type ID (LBRACKET INT_CONSTANT RBRACKET)* SEMI;

block : LBRACE varDeclaration* statement* RBRACE;
statement : varDeclaration
          | assignment
          | ifStatement
          | whileStatement
          | returnStatement
          | writeStatement
          | readStatement
          | functionCall SEMI
          ;

assignment : expr ASSIGN expr SEMI;
ifStatement : IF LPAREN expr RPAREN statement (ELSE statement)?;
whileStatement : WHILE LPAREN expr RPAREN statement;
returnStatement : RETURN expr SEMI;
writeStatement : WRITE exprList SEMI;
readStatement : READ exprList SEMI;
functionCall : ID LPAREN exprList? RPAREN;

expr : expr ADD expr
     | expr SUB expr
     | expr MUL expr
     | expr DIV expr
     | expr MOD expr
     | expr GT expr
     | expr GTE expr
     | expr LT expr
     | expr LTE expr
     | expr NEQ expr
     | expr EQ expr
     | expr AND expr
     | expr OR expr
     | NOT expr
     | LPAREN expr RPAREN
     | INT_CONSTANT
     | REAL_CONSTANT
     | CHAR_CONSTANT
     | ID
     | functionCall
     | ID DOT ID
     ;

exprList : expr (COMMA expr)*;
paramList : param (COMMA param)*;
param : type ID;

type : INT
     | REAL
     | CHAR
     | ID
     ;


// Lexer Rules
ONE_LINE_COMMENT : '//' ~('\n')* -> skip ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;
ID : [a-zA-Z_] [a-zA-Z_0-9]* ;

CHAR_CONSTANT : '\'' ( ESCAPE_SEQUENCE | ~('\'' | '\\') ) '\'';
fragment ESCAPE_SEQUENCE : '\\' ('n' | 't' | 'b' | 'r' | '\'' | '\\') | '\\' [0-7] [0-7]? [0-7]?;

REAL_CONSTANT : [0-9]+ '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;
fragment EXPONENT : [eE] [+-]? [0-9]+;

INT_CONSTANT : [1-9] [0-9]+ | '0';

// Keywords
STRUCT : 'struct';
INT : 'int';
REAL : 'real';
CHAR : 'char';
WRITE : 'write';
READ : 'read';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
RETURN : 'return';
VOID : 'void';

// Operators and Separators
LBRACE : '{';
RBRACE : '}';
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
SEMI : ';';
COMMA : ',';
ASSIGN : '=';
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
