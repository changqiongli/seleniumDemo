package test.testSuite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJavaScriptCode {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.w3schools.com/";
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testJavaScript() throws InterruptedException {
	    driver.get(baseUrl);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    String title = (String) js.executeScript("return document.title");
	    System.out.println(title);
	    assertEquals("W3Schools Online Web Tutorials", title);
	    
	    WebElement searchbox = (WebElement) js.executeScript("return document.getElementById('gs_tti50')");	    
	    System.out.println(searchbox.getAttribute("class"));
	    
	    int numberOfLinks = 80;
	    long links = (Long) js.executeScript("var links=document.getElementsByTagName('A'); return links.length");
	    System.out.println(links);
	    assertEquals(numberOfLinks, links);
	    
	    System.out.println("Test success: TestJavaScriptCode");
	    
	}

}
