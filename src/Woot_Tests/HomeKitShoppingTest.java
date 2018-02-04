package Woot_Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import Woot_Lib.DailyDealOffer;
import Woot_Lib.HomeKitPage;
 
public class HomeKitShoppingTest extends BaseTest {
	
	//verify that user able to add items to Addcart from Home Kitchen page
   @Test
	public void HomeKitShopping_test01() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/category/home?ref=w_gh_hm_3");
		
		HomeKitPage hk= new HomeKitPage(driver);
		hk.ShopNow.click();
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://home.woot.com/offers/swinging-monkey-products-giant-mat-platform-swing?ref=w_cnt_cdet_home_dly_wobtn")) {
		      foundURL=true;
			System.out.println("Navigated successfully to the home and kitchen daily deal offer page");
	}
	   else {
		System.out.println("Navigated successfully to the home and kitchen daily deal offer page");
	}
          assertTrue(foundURL);
   }
	
   @Test
	 public void selectQuantity_test02 () {
		
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/category/home?ref=w_gh_hm_3");
		HomeKitPage hk= new HomeKitPage(driver);
		hk.ShopNow.click();	
		
		DailyDealOffer ddo=new DailyDealOffer(driver);
		ddo.clickQuantity();
		ddo.clickAddCartBtn();
		ddo.addCartIcondisplay(); 	
				
	}
	
}
