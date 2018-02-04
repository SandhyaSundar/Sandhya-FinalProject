package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	@FindBy(id="ap_email")
	public WebElement username;
	
	@FindBy(id="ap_password")
	public WebElement password;
	
	@FindBy(id="signInSubmit")
	public WebElement signInBtn;
	
	WebDriver driver;

	public void setUsername(String userNameData) {
	  username.sendKeys(userNameData);
	}
	
	public void setpassword(String passwordData) {
	  password.sendKeys(passwordData);	
	}
	
	public ProfilePage clickSignInBtn() { 
	//creating the object of the homePage
	    signInBtn.click();
		ProfilePage pp = new ProfilePage(driver);
		return pp;
	}
	
	public SignInPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
	}
	
}