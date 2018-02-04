package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Electronics {
	WebDriver driver;
	

	
    public Electronics (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
		}
}
