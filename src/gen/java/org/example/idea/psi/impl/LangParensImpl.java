// This is a generated file. Not intended for manual editing.
package org.example.idea.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.example.idea.psi.LangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.example.idea.psi.*;

public class LangParensImpl extends ASTWrapperPsiElement implements LangParens {

  public LangParensImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LangVisitor visitor) {
    visitor.visitParens(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LangVisitor) accept((LangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LangContent getContent() {
    return findChildByClass(LangContent.class);
  }

}