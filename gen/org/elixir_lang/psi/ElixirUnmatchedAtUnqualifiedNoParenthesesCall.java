// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirUnmatchedAtUnqualifiedNoParenthesesCall extends ElixirUnmatchedExpression, AtUnqualifiedNoParenthesesCall {

  @NotNull
  ElixirAtPrefixOperator getAtPrefixOperator();

  @Nullable
  ElixirDoBlock getDoBlock();

  @NotNull
  ElixirNoParenthesesOneArgument getNoParenthesesOneArgument();

  @Nullable
  String functionName();

  @Nullable
  ASTNode functionNameNode();

  @Nullable
  String moduleName();

  @NotNull
  OtpErlangObject quote();

  @Nullable
  String resolvedFunctionName();

  @Nullable
  String resolvedModuleName();

}
