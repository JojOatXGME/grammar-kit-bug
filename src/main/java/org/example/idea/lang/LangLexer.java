package org.example.idea.lang;

import com.intellij.lexer.FlexAdapter;

public final class LangLexer extends FlexAdapter {
  public LangLexer() {
    super(new _LangLexer(null));
  }
}
