// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.ElixirInInfixOperator;
import org.elixir_lang.psi.ElixirMatchedExpression;
import org.elixir_lang.psi.ElixirMatchedInOperation;
import org.elixir_lang.psi.ElixirVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ElixirMatchedInOperationImpl extends ElixirMatchedExpressionImpl implements ElixirMatchedInOperation {

  public ElixirMatchedInOperationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitMatchedInOperation(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirInInfixOperator getInInfixOperator() {
    return findNotNullChildByClass(ElixirInInfixOperator.class);
  }

  @Override
  @NotNull
  public List<ElixirMatchedExpression> getMatchedExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirMatchedExpression.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
