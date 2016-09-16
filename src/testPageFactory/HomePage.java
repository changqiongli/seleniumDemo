package testPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(css = ".topnav[href='/html/default.asp']")
	private WebElement htmlTutorialLink;
	
	@FindBy(css = ".topnav[href='/css/default.asp']")
	private WebElement cssTutorialLink;
	
	@FindBy(css = ".topnav[href='/sql/default.asp']")
	private WebElement sqlTutorialLink;
	
	@FindBy(id = "dropdownSearchBtn")
	private WebElement searchIcon;
	
	@FindBy(id = "gsc-i-id1")
	private WebElement searchBox;
	
	@FindBy(css = ".gsc-search-button.gsc-search-button-v2")
	private WebElement googleSearchBtn;
	
	@FindBy(css = "#gsc-iw-id1")
	private WebElement searchPanel;
	
	@FindBy(css = "a.gs-title")
	private WebElement searchedLink;

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void loadTutorialPage(WebDriver driver){
		driver.get("http://www.w3schools.com/html/default.asp");		
	}
	
	public void clickSearchIcon(){
		searchIcon.click();
	}
	
	public void searchByText(String searchText){
		searchBox.sendKeys(searchText);
		googleSearchBtn.click();
	}
	
	public String getSearchedLinkText(){
		return searchedLink.getText();
	}	

	public void clickSearchedLink(){
		searchedLink.click();
	}	
		
	public void clickCssLink(){
		cssTutorialLink.click();
	}
	
	public void clickHtmlLink(){
		htmlTutorialLink.click();
	}
}
