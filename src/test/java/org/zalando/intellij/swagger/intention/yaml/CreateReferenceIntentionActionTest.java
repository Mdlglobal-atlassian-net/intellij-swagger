package org.zalando.intellij.swagger.intention.yaml;

import com.intellij.codeInspection.LocalInspectionTool;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.zalando.intellij.swagger.inspection.reference.YamlReferenceInspection;
import org.zalando.intellij.swagger.intention.IntentionActionTest;

public class CreateReferenceIntentionActionTest extends IntentionActionTest {

  @NotNull
  @Override
  protected LocalInspectionTool[] configureLocalInspectionTools() {
    return new LocalInspectionTool[] {new YamlReferenceInspection()};
  }

  public void test() {
    doAllTests();
  }

  @Override
  @NonNls
  protected String getBasePath() {
    return "/intention/createreference/yaml";
  }
}
