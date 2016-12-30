package org.zalando.intellij.swagger.completion.field.yaml;

import com.intellij.openapi.vfs.VirtualFile;
import org.zalando.intellij.swagger.SwaggerLightCodeInsightFixtureTestCase;
import org.zalando.intellij.swagger.assertion.AssertableList;

public class ParametersFileCompletionTest extends SwaggerLightCodeInsightFixtureTestCase {

    private static final String PARTIAL_FILES_PATH = "completion/field/partial/yaml";

    public void testThatParameterFieldsAreCompletedForPartialYamlSwaggerFile() {
        myFixture.copyFileToProject(PARTIAL_FILES_PATH + "/parameter.yaml", "parameter.yaml");
        final VirtualFile swaggerFile = myFixture.copyFileToProject(PARTIAL_FILES_PATH + "/swagger.yaml", "swagger.yaml");
        myFixture.configureFromExistingVirtualFile(swaggerFile);

        final AssertableList completions = new AssertableList(myFixture.getCompletionVariants("parameter.yaml"));

        completions.assertContains("name", "in", "description", "required", "schema", "type", "format",
                "allowEmptyValue", "items", "collectionFormat", "default", "maximum", "exclusiveMaximum",
                "minimum", "exclusiveMinimum", "maxLength", "minLength", "pattern", "maxItems", "minItems",
                "uniqueItems", "enum", "multipleOf")
                .isOfSize(23);
    }
}
