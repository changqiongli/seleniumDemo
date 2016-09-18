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


public class CommonMethods{
 
  public static void login( String username, String password) throws Exception{
  driver.get(baseUrl);
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
  driver.findElement(By.id("username")).clear();
  driver.findElement(By.id("username")).sendKeys("username");
  driver.findElement(By.id("login")).clear();
  driver.findElement(By.id("login")).sendKeys("password");
  driver.findElement(By.cssSelector("input.form-button")).click();
  
  //driver.findElement(By.linkText("Log Out")).click();
  //assertEquals("Admin Page",driver.getTitle());
  }
  
   

}

 
