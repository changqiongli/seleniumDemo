package test.testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WorkWithDifferentBrowsers {

	public static void main(String[] args) throws InterruptedException {
 	FirefoxDriver fox = new FirefoxDriver();
 	fox.get("http://www.google.ca");
 		Thread.sleep(2000);
 		fox.quit();
 	System.out.println("firefox opened.");
        
 	System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\referenceFile\\chromedriver_win32\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
	   chrome.get("http://www.google.ca");
		 Thread.sleep(2000);
	    chrome.quit();
		System.out.println("chrome opened."); 
				
	 System.setProperty("webdriver.ie.driver", "E:\\JAVA\\referenceFile\\IEDriverServer_x64_2.45.0\\IEDriverServer.exe");
		InternetExplorerDriver iedriver = new InternetExplorerDriver();
		iedriver.get("http://www.google.ca");
		Thread.sleep(2000);
		iedriver.quit();
		System.out.println("IE opened.");
		
	}

}
