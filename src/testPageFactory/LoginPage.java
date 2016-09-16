package testPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		@FindBy(id = "userid")
		private WebElement userId;
		
		@FindBy(id = "pass")
		private WebElement userPassword;
		
		@FindBy(id = "sgnBt")
		private WebElement signInBtn;		
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void clickSignInBtn(){
			signInBtn.click();
		}
        
        
		public void enterPassword(String password) {
			userPassword.clear();
			userPassword.sendKeys(password);			
		}

		public void enterUserId(String username) {
			userId.clear();
			userId.sendKeys(username);			
		}		
	}