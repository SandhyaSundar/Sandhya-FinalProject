package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	WebDriver driver;
	
	
	@FindBy(id="account")
	public WebElement profileName;
	
  	@FindBy(className="signout")
	public WebElement logoutLink;
	
	public boolean verifyLogoutLink()	{
		 
		profileName.click();
		
		boolean result = false;
		result= logoutLink.isDisplayed();
	    return result;
		
	}
	public ProfilePage (WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
}
}