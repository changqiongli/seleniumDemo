package test.testSuite;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

	@Test
	public void test() throws InterruptedException {
		driver.get("https://efun.toronto.ca/torontofun/Facilities/FacilitiesSearchWizard.asp");
	    
		Thread.sleep(2000);	
		
	    WebElement alldays = driver.findElement(By.id("chkWeekDay8"));
	    
	    //check if the check-box is selected, if not, select it.
	    if(!alldays.isSelected())
	    {
	    	alldays.click();
	    }
	    
	    //verify the check-box is selected
	    assertTrue(alldays.isSelected());
		System.out.println("Step1: \"All\" is selected.");
		
		Thread.sleep(2000);		
		
		WebElement monday = driver.findElement(By.id("chkWeekDay2"));
		monday.click();
		System.out.println("Step2: \"Mon\" is checked, \"All\" is unchecked.");
		
		Thread.sleep(2000);		
		
		//Check if the check-box is selected, if yes, remove the selection.
		if (monday.isSelected())
		{
			monday.click();
		}

		//verify the check-box is not selected
		assertFalse(monday.isSelected());
		System.out.println("Step3: Verify \"Mon\" is not selected.");
		
		Thread.sleep(2000);		
		
	}

}
