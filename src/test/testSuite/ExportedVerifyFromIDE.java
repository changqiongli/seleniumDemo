package test.testSuite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExportedVerifyFromIDE {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.w3schools.com/";
  }

  @Test
  public void testAssertVerify() throws Exception {
    driver.get(baseUrl);
        
    //exported Selenese command of assertVerify, try-catch added by exported tool
    try {
      assertEquals("Learn HTML", driver.findElement(By.linkText("Learn HTML")).getText());
    } catch (Error e) {
    	verificationErrors.append(e.toString());
    }
    
    System.out.println("Test success: ExportedVerifyFromIDE");
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      System.out.println(verificationErrorString); //print error in console
      //added fail() method by export tool
      //fail test with message, otherwise test status will be passed.
      fail(verificationErrorString); 
    }
  }

  
}
