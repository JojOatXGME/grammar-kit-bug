package org.example.idea.lang;

import com.intellij.lang.Language;

public final class LangLanguage extends Language {
  public static final LangLanguage INSTANCE = new LangLanguage();

  private LangLanguage() {
    super("Lang");
  }
}
