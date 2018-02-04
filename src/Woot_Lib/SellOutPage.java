package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SellOutPage {
WebDriver driver;
	 
	
	
    public SellOutPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
}
}