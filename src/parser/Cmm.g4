grammar Cmm;

// ** PARSER RULES **

// 'program' is the start rule for this grammar, it comprises zero or more
// declarations (var, function, struct) followed by exactly one main function.
program : (varDeclaration | functionDeclaration | structDeclaration)* mainFunction EOF;
varDeclaration : type arrayDimensions ID SEMI | type idList SEMI;

// Variable declarations can be for arrays or id lists, followed by a semicolon.
//varDeclaration : type arrayVarDecl SEMI | type idList SEMI;


idList : ID (COMMA ID)*;
arrayDimensions : (LBRACKET INT_CONSTANT RBRACKET)+;  // Array dimensions support multi-dimensional arrays.

// Function declarations have a return type, identifier, optional parameters, and a block of code.
functionDeclaration : type ID LPAREN paramList? RPAREN block;
// The 'main' function does not take parameters and returns void.
mainFunction : VOID MAIN LPAREN RPAREN block;

// Struct declarations have a name and one or more field declarations.
structDeclaration : STRUCT LBRACE fieldDeclaration+ RBRACE ID SEMI;
fieldDeclaration : type ID (LBRACKET INT_CONSTANT RBRACKET)* SEMI  // Fields can also be arrays.
                 | structDeclaration  // This allows nested structs.
                 ;

// Blocks contain zero or more statements or variable declarations.
block : LBRACE blockStatement* RBRACE
      | statement
      ;
blockStatement : varDeclaration
               | statement
               ;

// Statements define the various actions that can be performed in the language.
statement : varDeclaration
          | assignment
          | ifStatement
          | whileStatement
          | returnStatement
          | writeStatement
          | readStatement
          | functionCall SEMI
          ;

// Definitions of various types of statements.
ifStatement : IF LPAREN expr RPAREN block (ELSE block)?;
assignment : expr ASSIGN expr SEMI;
whileStatement : WHILE LPAREN expr RPAREN block;
returnStatement : RETURN expr SEMI;
writeStatement : WRITE exprList SEMI;
readStatement : READ exprList SEMI;
functionCall : ID LPAREN exprList? RPAREN;

// Expressions can be literals, IDs, function calls, or operations.
expr : INT_CONSTANT
     | DOUBLE_CONSTANT
     | CHAR_CONSTANT
     | ID
     | functionCall
     | ID DOT ID  // Struct field access
     | LPAREN expr RPAREN
     | NOT expr
     | LPAREN type RPAREN expr  // Type casting
     | expr MUL expr
     | expr DIV expr
     | expr MOD expr
     | expr ADD expr
     | expr SUB expr
     | expr LT expr
     | expr LTE expr
     | expr GT expr
     | expr GTE expr
     | expr EQ expr
     | expr NEQ expr
     | expr AND expr
     | expr OR expr
     | expr LBRACKET expr RBRACKET  // Array indexing
     ;

exprList : expr (COMMA expr)*;
paramList : param (COMMA param)*;
param : type ID;

// Types define the data type of a variable or return type of a function.
type : INT
     | DOUBLE
     | CHAR
     | VOID
     | ID  // This allows custom types like structs.
     ;


// ** LEXER RULES **

// Ignoring whitespace and comments.
ONE_LINE_COMMENT : '//' ~('\n')* -> skip ;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip ;
WS : [ \t\r\n]+ -> skip ;

// Keywords and special function names.
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

ID : [a-zA-Z_] [a-zA-Z_0-9]* ;

// Various literals and a fragment for escape sequences.
CHAR_CONSTANT : '\'' ( ESCAPE_SEQUENCE | ~('\'' | '\\') ) '\'';
fragment ESCAPE_SEQUENCE : '\\' ('n' | 't' | 'b' | 'r' | '\'' | '\\') | '\\' [0-7] [0-7]? [0-7]?;
DOUBLE_CONSTANT : [0-9]+ '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;
fragment EXPONENT : [eE] [+-]? [0-9]+;
INT_CONSTANT : '0' | [1-9][0-9]* ;

// More keywords.


// Operators and Separators.

