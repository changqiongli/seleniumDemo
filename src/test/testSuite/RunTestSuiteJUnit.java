package test.testSuite;

import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.testng.annotations.AfterClass;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	CheckBoxes.class,
	RadioButtonGroup.class,
	DropDownOptions.class
})

public class RunTestSuiteJUnit {
	/***
	 * *Setup method to set system properties
	 */
	 @BeforeClass
	 public static void main(String[] args){
		 Result result=JUnitCore.runClasses(RunTestSuiteJUnit.class);
		 System.out.println("test cases run:"+result.getRunCount());
		 
		 System.out.println("test cases run:"+result.getFailureCount());
		 for(Failure failure :result.getFailures()){
			 System.out.println("\nTest name:"+failure.getTestHeader());
			 System.out.println("\nError:"+failure.getMessage()+"\n");
			 System.out.println(failure.getTrace());
			 System.exit(1);//a nonzero status code indicates abnormal termination.
		 
		 }
	 }

	 /***
	  * report test results
	  * **/
	 @AfterClass
	 public static void TearDown(){
		 
	 }
}
