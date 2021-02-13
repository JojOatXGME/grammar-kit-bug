package org.example.idea.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

public final class LangFileType extends LanguageFileType {
  public static final LangFileType INSTANCE = new LangFileType();

  private LangFileType() {
    super(LangLanguage.INSTANCE);
  }

  @Override
  public @NotNull String getName() {
    return "Lang file";
  }

  @Override
  public @NotNull @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
    return "Lang language file";
  }

  @Override
  public @NotNull String getDefaultExtension() {
    return "lang";
  }

  @Override
  public @Nullable Icon getIcon() {
    return null;
  }
}
