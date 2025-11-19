package io.vito.arf.arfintellij;

import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

%%

%class ArfLexer
%implements com.intellij.lexer.FlexLexer
%unicode
%function advance
%type com.intellij.psi.TokenType
%type com.intellij.psi.tree.IElementType
%public

WHITE_SPACE = [ \t\r\n]+
DIGIT       = [0-9]
ID_START    = [A-Za-z_]
ID_CONT     = [A-Za-z0-9_]
IDENT       = {ID_START}{ID_CONT}*
NUMBER      = {DIGIT}+

STRING      = \"([^\"\\]|\\.)*\"?

COMMENT     = \#.*

ANNOTATION  = "@"{IDENT}

%%

{WHITE_SPACE}      { return TokenType.WHITE_SPACE; }

{COMMENT}          { return ArfTypes.LINE_COMMENT; }
{ANNOTATION}       { return ArfTypes.ANNOTATION; }

"package"          { return ArfTypes.KW_PACKAGE; }
"import"           { return ArfTypes.KW_IMPORT; }
"as"               { return ArfTypes.KW_IMPORT_AS; }
"struct"           { return ArfTypes.KW_STRUCT; }
"enum"             { return ArfTypes.KW_ENUM; }
"service"          { return ArfTypes.KW_SERVICE; }
"stream"           { return ArfTypes.KW_STREAM; }
"optional"         { return ArfTypes.KW_OPTIONAL; }
"array"            { return ArfTypes.KW_ARRAY; }
"map"              { return ArfTypes.KW_MAP; }

"bool"             { return ArfTypes.KW_BOOL; }
"int8"             { return ArfTypes.KW_INT8; }
"int16"            { return ArfTypes.KW_INT16; }
"int32"            { return ArfTypes.KW_INT32; }
"int64"            { return ArfTypes.KW_INT64; }
"uint8"            { return ArfTypes.KW_UINT8; }
"uint16"           { return ArfTypes.KW_UINT16; }
"uint32"           { return ArfTypes.KW_UINT32; }
"uint64"           { return ArfTypes.KW_UINT64; }
"float32"          { return ArfTypes.KW_FLOAT32; }
"float64"          { return ArfTypes.KW_FLOAT64; }
"string"           { return ArfTypes.KW_STRING; }
"bytes"            { return ArfTypes.KW_BYTES; }

{STRING}           { return ArfTypes.STRING; }
{NUMBER}           { return ArfTypes.NUMBER; }
{IDENT}            { return ArfTypes.IDENTIFIER; }

"{"                { return ArfTypes.LBRACE; }
"}"                { return ArfTypes.RBRACE; }
"("                { return ArfTypes.LPAREN; }
")"                { return ArfTypes.RPAREN; }
"<"                { return ArfTypes.LT; }
">"                { return ArfTypes.GT; }
","                { return ArfTypes.COMMA; }
"."                { return ArfTypes.DOT; }
"="                { return ArfTypes.EQ; }
"->"               { return ArfTypes.ARROW; }
";"                { return ArfTypes.SEMI; }
"@"                { return ArfTypes.ATSIGN; }

.                  { return TokenType.BAD_CHARACTER; }