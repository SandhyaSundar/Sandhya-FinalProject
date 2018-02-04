package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	 	
	@FindBy(partialLinkText="Sign in")
	 public WebElement SignInLink;
	
	
	 public SignInPage clickSignInLink()
	{
	  SignInLink.click();
 	  SignInPage sp = new SignInPage(driver);
     	  return sp;	
	 
	}
		public LandingPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
}
}