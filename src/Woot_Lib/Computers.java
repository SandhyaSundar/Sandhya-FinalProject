package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Computers {
WebDriver driver;
	
	
	
    public Computers (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
		}
}
