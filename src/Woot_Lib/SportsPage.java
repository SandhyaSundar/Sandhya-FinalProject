package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SportsPage {
  WebDriver driver;
	
	
    public SportsPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
}


	}
