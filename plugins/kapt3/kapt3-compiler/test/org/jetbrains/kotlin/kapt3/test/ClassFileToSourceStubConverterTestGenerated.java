/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kapt3.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kapt3/kapt3-compiler/testData/converter")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ClassFileToSourceStubConverterTestGenerated extends AbstractClassFileToSourceStubConverterTest {
    @TestMetadata("abstractEnum.kt")
    public void testAbstractEnum() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/abstractEnum.kt");
        doTest(fileName);
    }

    @TestMetadata("abstractMethods.kt")
    public void testAbstractMethods() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/abstractMethods.kt");
        doTest(fileName);
    }

    @TestMetadata("aliasedImports.kt")
    public void testAliasedImports() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/aliasedImports.kt");
        doTest(fileName);
    }

    public void testAllFilesPresentInConverter() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("plugins/kapt3/kapt3-compiler/testData/converter"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/annotations.kt");
        doTest(fileName);
    }

    @TestMetadata("annotations2.kt")
    public void testAnnotations2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/annotations2.kt");
        doTest(fileName);
    }

    @TestMetadata("comments.kt")
    public void testComments() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/comments.kt");
        doTest(fileName);
    }

    @TestMetadata("dataClass.kt")
    public void testDataClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/dataClass.kt");
        doTest(fileName);
    }

    @TestMetadata("defaultImpls.kt")
    public void testDefaultImpls() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/defaultImpls.kt");
        doTest(fileName);
    }

    @TestMetadata("enums.kt")
    public void testEnums() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/enums.kt");
        doTest(fileName);
    }

    @TestMetadata("errorLocationMapping.kt")
    public void testErrorLocationMapping() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/errorLocationMapping.kt");
        doTest(fileName);
    }

    @TestMetadata("fileFacadeJvmName.kt")
    public void testFileFacadeJvmName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/fileFacadeJvmName.kt");
        doTest(fileName);
    }

    @TestMetadata("functions.kt")
    public void testFunctions() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/functions.kt");
        doTest(fileName);
    }

    @TestMetadata("genericRawSignatures.kt")
    public void testGenericRawSignatures() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/genericRawSignatures.kt");
        doTest(fileName);
    }

    @TestMetadata("genericSimple.kt")
    public void testGenericSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/genericSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("ignoredMembers.kt")
    public void testIgnoredMembers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/ignoredMembers.kt");
        doTest(fileName);
    }

    @TestMetadata("importsForErrorTypes.kt")
    public void testImportsForErrorTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/importsForErrorTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("inheritanceSimple.kt")
    public void testInheritanceSimple() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/inheritanceSimple.kt");
        doTest(fileName);
    }

    @TestMetadata("innerClassesWithTypeParameters.kt")
    public void testInnerClassesWithTypeParameters() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/innerClassesWithTypeParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("invalidFieldName.kt")
    public void testInvalidFieldName() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/invalidFieldName.kt");
        doTest(fileName);
    }

    @TestMetadata("javaKeywords.kt")
    public void testJavaKeywords() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/javaKeywords.kt");
        doTest(fileName);
    }

    @TestMetadata("javaKeywordsInPackageNames.kt")
    public void testJavaKeywordsInPackageNames() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/javaKeywordsInPackageNames.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmOverloads.kt")
    public void testJvmOverloads() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/jvmOverloads.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmStatic.kt")
    public void testJvmStatic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/jvmStatic.kt");
        doTest(fileName);
    }

    @TestMetadata("jvmStaticFieldInParent.kt")
    public void testJvmStaticFieldInParent() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/jvmStaticFieldInParent.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14996.kt")
    public void testKt14996() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt14996.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14997.kt")
    public void testKt14997() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt14997.kt");
        doTest(fileName);
    }

    @TestMetadata("kt14998.kt")
    public void testKt14998() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt14998.kt");
        doTest(fileName);
    }

    @TestMetadata("kt15145.kt")
    public void testKt15145() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt15145.kt");
        doTest(fileName);
    }

    @TestMetadata("kt17567.kt")
    public void testKt17567() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt17567.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18377.kt")
    public void testKt18377() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt18377.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18682.kt")
    public void testKt18682() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt18682.kt");
        doTest(fileName);
    }

    @TestMetadata("kt18791.kt")
    public void testKt18791() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt18791.kt");
        doTest(fileName);
    }

    @TestMetadata("kt19700.kt")
    public void testKt19700() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt19700.kt");
        doTest(fileName);
    }

    @TestMetadata("kt19750.kt")
    public void testKt19750() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/kt19750.kt");
        doTest(fileName);
    }

    @TestMetadata("leadingDollars.kt")
    public void testLeadingDollars() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/leadingDollars.kt");
        doTest(fileName);
    }

    @TestMetadata("leadingDollars2.kt")
    public void testLeadingDollars2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/leadingDollars2.kt");
        doTest(fileName);
    }

    @TestMetadata("mapEntry.kt")
    public void testMapEntry() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/mapEntry.kt");
        doTest(fileName);
    }

    @TestMetadata("maxErrorCount.kt")
    public void testMaxErrorCount() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/maxErrorCount.kt");
        doTest(fileName);
    }

    @TestMetadata("methodParameterNames.kt")
    public void testMethodParameterNames() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/methodParameterNames.kt");
        doTest(fileName);
    }

    @TestMetadata("methodPropertySignatureClash.kt")
    public void testMethodPropertySignatureClash() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/methodPropertySignatureClash.kt");
        doTest(fileName);
    }

    @TestMetadata("modifiers.kt")
    public void testModifiers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/modifiers.kt");
        doTest(fileName);
    }

    @TestMetadata("multifileClass.kt")
    public void testMultifileClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/multifileClass.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedClasses.kt")
    public void testNestedClasses() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/nestedClasses.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedClasses2.kt")
    public void testNestedClasses2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/nestedClasses2.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedClassesNonRootPackage.kt")
    public void testNestedClassesNonRootPackage() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/nestedClassesNonRootPackage.kt");
        doTest(fileName);
    }

    @TestMetadata("nonExistentClass.kt")
    public void testNonExistentClass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClass.kt");
        doTest(fileName);
    }

    @TestMetadata("nonExistentClassTypesConversion.kt")
    public void testNonExistentClassTypesConversion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClassTypesConversion.kt");
        doTest(fileName);
    }

    @TestMetadata("nonExistentClassWIthoutCorrection.kt")
    public void testNonExistentClassWIthoutCorrection() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/nonExistentClassWIthoutCorrection.kt");
        doTest(fileName);
    }

    @TestMetadata("primitiveTypes.kt")
    public void testPrimitiveTypes() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/primitiveTypes.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyAnnotations.kt")
    public void testPropertyAnnotations() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/propertyAnnotations.kt");
        doTest(fileName);
    }

    @TestMetadata("severalPackageParts.kt")
    public void testSeveralPackageParts() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/severalPackageParts.kt");
        doTest(fileName);
    }

    @TestMetadata("strangeIdentifiers.kt")
    public void testStrangeIdentifiers() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/strangeIdentifiers.kt");
        doTest(fileName);
    }

    @TestMetadata("strangeNames.kt")
    public void testStrangeNames() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/strangeNames.kt");
        doTest(fileName);
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("plugins/kapt3/kapt3-compiler/testData/converter/topLevel.kt");
        doTest(fileName);
    }
}
