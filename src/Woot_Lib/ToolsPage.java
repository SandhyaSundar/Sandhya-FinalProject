package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ToolsPage {
 
	WebDriver driver;
	
	
	
    public ToolsPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
		}
}
