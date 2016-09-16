package test.testSuite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExportedAssertFromIDE {
  private WebDriver driver;
  private String baseUrl;
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.w3schools.com/";
  }

  @Test
  public void testAssertVerify() throws Exception {
    driver.get(baseUrl);
        
    //exported Selenese command of assertText
    //error in failure trace
    assertEquals("Learn HTML", driver.findElement(By.linkText("Learn HTML")).getText()); 
    
    System.out.println("Test success: ExportedAssertFromIDE");
  
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
   
  }

  
}
