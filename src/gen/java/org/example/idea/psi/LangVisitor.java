// This is a generated file. Not intended for manual editing.
package org.example.idea.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class LangVisitor extends PsiElementVisitor {

  public void visitContent(@NotNull LangContent o) {
    visitPsiElement(o);
  }

  public void visitParens(@NotNull LangParens o) {
    visitPsiElement(o);
  }

  public void visitRoot(@NotNull LangRoot o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
