// This is a generated file. Not intended for manual editing.
package org.example.idea.lang;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.example.idea.psi.LangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class LangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return file(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // A B
  public static boolean content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "content")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONTENT, "<content>");
    result_ = consumeTokens(builder_, 1, A, B);
    pinned_ = result_; // pin = 1
    exit_section_(builder_, level_, marker_, result_, pinned_, parens_recover_parser_);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // root
  static boolean file(PsiBuilder builder_, int level_) {
    return root(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '(' content ')'
  public static boolean parens(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parens")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARENS, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, content(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // !')'
  static boolean parens_recover(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parens_recover")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // parens AFTER
  //   | parens
  public static boolean root(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = root_0(builder_, level_ + 1);
    if (!result_) result_ = parens(builder_, level_ + 1);
    exit_section_(builder_, marker_, ROOT, result_);
    return result_;
  }

  // parens AFTER
  private static boolean root_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "root_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parens(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, AFTER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  static final Parser parens_recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder builder_, int level_) {
      return parens_recover(builder_, level_ + 1);
    }
  };
}
