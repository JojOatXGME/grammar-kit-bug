package org.example.idea.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static org.example.idea.psi.LangTypes.*;

%%

%class _LangLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%%

"kw"            { return KW; }
";"             { return SEMI; }
"valid"         { return VALID; }
"invalid"       { return INVALID; }
[\ \t\r\n]      { return com.intellij.psi.TokenType.WHITE_SPACE; }
