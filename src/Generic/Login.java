package Generic;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login{
  private WebDriver driver;
  private String baseUrl;
   
  
  @Before
  public  void setUp() throws Exception{
  driver= new FirefoxDriver();
  baseUrl="http://www.host0128.com/M02/admin";
  }
  
  @Test
  public void testloginjava() throws Exception{
  driver.get(baseUrl);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  
  /*WebDriverWait wait = new WebDriverWait(driver,10);  
  wait.until(new ExpectedCondition<WebElement>(){  
      @Override  
      public WebElement apply(WebDriver d) {  
          return d.findElement(By.id("b"));  
      }}).click(); */ 
  
  
  driver.findElement(By.id("username")).clear();
  driver.findElement(By.id("username")).sendKeys("testingadmin");
  driver.findElement(By.id("login")).clear();
  driver.findElement(By.id("login")).sendKeys("admin123");
  driver.findElement(By.cssSelector("input.form-button")).click();
   
  driver.findElement(By.id("username")).clear();
  driver.findElement(By.id("username")).sendKeys("testingadmin");
  driver.findElement(By.id("login")).clear();
  driver.findElement(By.id("login")).sendKeys("admin123");
  driver.findElement(By.cssSelector("input.form-button")).click();
  
  driver.findElement(By.linkText("Log Out")).click();
  assertEquals("Log Magento Admin Page",driver.getTitle());
    }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
 

}

 