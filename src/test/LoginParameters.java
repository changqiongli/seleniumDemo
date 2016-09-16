package test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 

public class LoginParameters {
	 

		private WebDriver driver;
		String username;String password; String baseUrl;
		
		@BeforeClass
		public void setUp() throws Exception {
			driver = new FirefoxDriver();
		}
		@AfterClass
		public void tearDown() throws Exception {
			driver.quit();
		}
		@DataProvider(name = "testData")
		public static  Object[][] readExcle() throws BiffException, IOException {		
			File f= new File("C:/SeleniumFrameWork/src/databaseANDtestng/EndToEnd/data/path");
			Workbook w=Workbook.getWorkbook(f) ;
			Sheet s=w.getSheet("sheet1");
			int rows=s.getRows();
			int columns=s.getColumns();			

			String inputData[][]=new String[rows][columns];
			for(int i=0;i<rows; i++){
				for(int j=0; j<columns;j++){
					Cell c=s.getCell(j, i);
					inputData[i][j]=c.getContents();				
					
				}
			}
			return inputData ;
		}		
		 
        @Test(dataProvider="testData")
        public void  login(String usename, String password) throws Exception{
        	  driver.get(baseUrl);
        	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
        	  
        	  /*WebDriverWait wait = new WebDriverWait(driver,10);  
        	  wait.until(new ExpectedCondition<WebElement>(){  
        	      @Override  
        	      public WebElement apply(WebDriver d) {  
        	          return d.findElement(By.id("b"));  
        	      }}).click(); */ 
        	  
        	  
        	  driver.findElement(By.id("username")).clear();
        	  driver.findElement(By.id("username")).sendKeys(username);
        	  driver.findElement(By.id("password")).clear();
        	  driver.findElement(By.id("password")).sendKeys(password);       	  
        	  driver.findElement(By.cssSelector("input.form-button")).click();      	    	  
        	  
        	 assertEquals("Log Magento Admin Page",driver.getTitle());
        	 
        	 
        	   
        	    }
}
 
