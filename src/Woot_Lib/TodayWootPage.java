package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TodayWootPage {

	WebDriver driver;
	

	 public TodayWootPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
		}

}
