package org.example.idea.lang;

import com.intellij.testFramework.ParsingTestCase;

public final class ParsingTest extends ParsingTestCase {
  public ParsingTest() {
    super("ParsingTest", "lang", new LangParserDefinition());
  }

  public void testTest() {
    doTest(true);
  }

  @Override
  protected String getTestDataPath() {
    return "src/test/testData";
  }

  @Override
  protected boolean includeRanges() {
    return true;
  }
}
