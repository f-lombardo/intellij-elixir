// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirMatchedQualifiedNoArgumentsCall extends ElixirMatchedExpression, MatchedCall, QualifiedNoArgumentsCall {

  @NotNull
  ElixirDotInfixOperator getDotInfixOperator();

  @NotNull
  ElixirMatchedExpression getMatchedExpression();

  @NotNull
  ElixirRelativeIdentifier getRelativeIdentifier();

  @Nullable
  String functionName();

  ASTNode functionNameNode();

  @NotNull
  String moduleName();

  @Nullable
  ElixirDoBlock getDoBlock();

  @NotNull
  OtpErlangObject quote();

  @NotNull
  String resolvedFunctionName();

  @NotNull
  String resolvedModuleName();

}
