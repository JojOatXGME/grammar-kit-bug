// This is a generated file. Not intended for manual editing.
package org.example.idea.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.example.idea.psi.impl.*;

public interface LangTypes {

  IElementType CONTENT = new LangElementType("CONTENT");
  IElementType PARENS = new LangElementType("PARENS");
  IElementType ROOT = new LangElementType("ROOT");

  IElementType A = new LangTokenType("A");
  IElementType AFTER = new LangTokenType("AFTER");
  IElementType B = new LangTokenType("B");
  IElementType LPAREN = new LangTokenType("(");
  IElementType RPAREN = new LangTokenType(")");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONTENT) {
        return new LangContentImpl(node);
      }
      else if (type == PARENS) {
        return new LangParensImpl(node);
      }
      else if (type == ROOT) {
        return new LangRootImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
