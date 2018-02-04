package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FlashDealPage {
  WebDriver driver;
	
	
	 
	public FlashDealPage (WebDriver driver) {
	 	 this.driver=driver;
	     PageFactory.initElements(driver, this);
	}
}
