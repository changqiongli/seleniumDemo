package test.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.testSuite.ExportedAssertFromIDE;
import test.testSuite.ExportedVerifyFromIDE;
import test.testSuite.TestJavaScriptCode;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ExportedAssertFromIDE.class,
	ExportedVerifyFromIDE.class,
	TestJavaScriptCode.class
})

public class RunTestSuiteJUnitDifferentPackage {

}
