package Woot_Lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeKitPage {

	
   WebDriver driver;

          	
//Verify that user able to click shop now button in Daily Deal section in Home and kitchen Page

   @FindBy(xpath="//*[@id=\"daily-deal-section\"]/div/div/div[1]/a")
   public WebElement ShopNow;
   
     public  DailyDealOffer clickDdHomeKit() throws InterruptedException {
      Thread.sleep(2000);
	  ShopNow.click();
	  DailyDealOffer dd= new DailyDealOffer(driver);
	  return dd;
   }
     
     
          
   
	
     public HomeKitPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
		}

}
