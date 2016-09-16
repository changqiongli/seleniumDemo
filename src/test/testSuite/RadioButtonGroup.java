package test.testSuite;

import static org.junit.Assert.assertTrue;



import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonGroup {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

	@Test
	public void test() throws InterruptedException {
		driver.get("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
		driver.switchTo().frame(0); //will explain frame in next class
	    
	    List<WebElement> radioButtonGroup = driver.findElements(By.cssSelector("input[type='radio']"));
	    for (WebElement radioBtn: radioButtonGroup )
	    {
	    		//Search for radio button of "Female" and select it	
	    		if (radioBtn.getAttribute("value").equals("female"))
	    		{
	    			if (!radioBtn.isSelected())
	    				radioBtn.click();
	    	    } 
	    }

	    Thread.sleep(2000);
	    
	    for (WebElement radioBtn: radioButtonGroup )
	    {
	    		//Search for radio button of "Female" and select it	
	    		if (radioBtn.getAttribute("value").equals("male"))
	    		{
	    			if (!radioBtn.isSelected())
	    				radioBtn.click();
	    	    } 
	    }
	 	
	    Thread.sleep(2000);

	}

}
