 package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GourmetPage {

	WebDriver driver;
	
	
	
    public GourmetPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
}

}
