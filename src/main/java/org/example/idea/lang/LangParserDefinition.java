package org.example.idea.lang;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.example.idea.psi.LangTypes;
import org.jetbrains.annotations.NotNull;

public final class LangParserDefinition implements ParserDefinition {
  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new LangLexer();
  }

  @Override
  public PsiParser createParser(Project project) {
    return new LangParser();
  }

  @Override
  public IFileElementType getFileNodeType() {
    return new IFileElementType(LangLanguage.INSTANCE);
  }

  @Override
  public @NotNull TokenSet getCommentTokens() {
    return TokenSet.EMPTY;
  }

  @Override
  public @NotNull TokenSet getStringLiteralElements() {
    return TokenSet.EMPTY;
  }

  @Override
  public @NotNull PsiElement createElement(ASTNode node) {
    return LangTypes.Factory.createElement(node);
  }

  @Override
  public PsiFile createFile(FileViewProvider viewProvider) {
    return new LangFile(viewProvider);
  }
}
