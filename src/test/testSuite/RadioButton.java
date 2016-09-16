package test.testSuite;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

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
		driver.get("http://book.theautomatedtester.co.uk/chapter1");
	    
	    WebElement radioButton = driver.findElement(By.cssSelector( "input#radiobutton"));
	    
	    //check if the radio button is selected, if not, select it.
	    if(!radioButton.isSelected())
	    {
	    	radioButton.click();
	    }
	    
	    Thread.sleep(3000);
	    
	    //verify the radio button is selected
	    assertTrue(radioButton.isSelected());
		System.out.println("Step1: \"radio button\" is checked.");
		
		//in class exercise: verify if radio button is checked, if yes, uncheck it and verify it's unchecked.
	}

}
