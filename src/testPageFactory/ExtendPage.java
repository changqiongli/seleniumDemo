package testPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtendPage extends HomePage{

	public ExtendPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = ".col-lg-10.col-md-10.col-sm-12.main>div>h1")
	private WebElement cssTitle;
	
	@FindBy(linkText = "CSS Properties Reference")
	private WebElement cssPropertiesRefLink;
	
	
	public void loadCssPage(WebDriver driver){
		driver.get("http://www.w3schools.com/css/default.asp");		
	}
		
	public String getCssTitle(){
		return cssTitle.getText();
	}
	
	public void clickPropertiesRefLink(){
		cssPropertiesRefLink.click();
	}

}
