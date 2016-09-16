package test.testSuite;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownOptions {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testDropDown() {

		driver.get("http://app.toronto.ca/tmmis/findAgendaItem.do?function=doPrepare");
		
		List<WebElement> options = driver.findElements(By
				.cssSelector("select[id='termId'] option"));

		System.out.println(options.size());

		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		
				
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
