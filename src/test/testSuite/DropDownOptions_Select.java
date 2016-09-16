package test.testSuite;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOptions_Select {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseUrl = "http://app.toronto.ca/tmmis/findAgendaItem.do?function=doPrepare";
	}

	@Test
	public void testDropDown() throws InterruptedException {

//		//with Select class, we can select option by visible text
//		driver.get(baseUrl);
//		Select options = new Select(driver.findElement(By.cssSelector("select[id='termId']")));
//		System.out.println(options.getOptions().size());
//		options.selectByVisibleText("2014-2018");
//		Thread.sleep(3000);
		
//		//with Select class, we can select option by value attribute
//		driver.get(baseUrl);
//		Select options2 = new Select(driver.findElement(By.cssSelector("select[id='termId']")));
//		options2.selectByValue("3");
//		Thread.sleep(3000);
		
//		//with Select class, we can select option by index
//		driver.get(baseUrl);
//		Select options3 = new Select(driver.findElement(By.cssSelector("select[id='termId']")));
//		options3.selectByIndex(2);
//		Thread.sleep(3000);
		
		//verify dropdown values expected/actual
		List<String> expected_opts = Arrays.asList(new String[]{" ","2014-2018","2010-2014","2006-2010"});
		List<String> actual_opts = new ArrayList<String>();
		
		//get actual option values
		driver.get(baseUrl);
		Select options4 = new Select(driver.findElement(By.cssSelector("select[id='termId']")));
		for (WebElement option : options4.getOptions()) {
			actual_opts.add(option.getText());
		}
		
		assertEquals(expected_opts, actual_opts);
		System.out.println(actual_opts);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
