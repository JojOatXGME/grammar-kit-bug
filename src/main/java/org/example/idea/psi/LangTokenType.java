package org.example.idea.psi;

import com.intellij.psi.tree.IElementType;
import org.example.idea.lang.LangLanguage;
import org.jetbrains.annotations.NotNull;

public final class LangTokenType extends IElementType {
  public LangTokenType(@NotNull String debugName) {
    super(debugName, LangLanguage.INSTANCE);
  }
}
