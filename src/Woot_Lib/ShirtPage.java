package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShirtPage {
    WebDriver driver;
	 
	
	
    public ShirtPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
}
    }
