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

"A"             { return A; }
"B"             { return B; }
"AFTER"         { return AFTER; }
"("             { return LPAREN; }
")"             { return RPAREN; }
[\ \t\r\n]      { return com.intellij.psi.TokenType.WHITE_SPACE; }
