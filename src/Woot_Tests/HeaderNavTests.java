package Woot_Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Woot_Lib.HeaderNav;

public class HeaderNavTests extends BaseTest{
	
	@Test   
	public void navigationToAllDeals_test01(){
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn= new HeaderNav(driver);
		hn.AllDeals.click();
		
		//Validation
		boolean foundURL= false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/alldeals?ref=w_gh_et_1")) {
			foundURL=true;
		System.out.println("Navigation Success to All Deals Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to All Deals Page -Failed");
		}
		assertTrue(foundURL);
	}
		
	@Test
	    public void navigationToHomeKit_test02() {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn= new HeaderNav(driver);
		hn.Homenkit.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/home?ref=w_gh_hm_3")) {
			foundURL=true;
		System.out.println("Navigation Success to Home and Kitchen Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Home and Kitchen -Failed");
		}
		assertTrue(foundURL);
	}
	
	@Test
	    public void navigationToElectronics_test03(){
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Electronics.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/electronics?ref=w_gh_el_4")) {
			foundURL=true;
		System.out.println("Navigation Success to Electronics Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Electronics Page -Failed");
		}
		assertTrue(foundURL);
	}
	
	@Test
	 public void navigationToComputers_test04(){
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Computers.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/computers?ref=w_gh_cp_5")) {
		System.out.println("Navigation Success to Computers Link Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Computers Link Page -Failed");
		}
		assertTrue(foundURL);
	}
	
	@Test
	
	public void naviagtionToTools_test05() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Tools.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/tools?ref=w_gh_tg_6")) {
			foundURL=true;
		System.out.println("Navigation Success to Tools and Garden Link Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Tools and Garden Link -Failed");
		}
		assertTrue(foundURL);
	}
	
	@Test
	public void navigationToSports_test06() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Sports.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/sport?ref=w_gh_sp_7")) {
			foundURL=true;
		System.out.println("Navigation Success to Sports and Outdoor Link Page -Passed");
			
		}
		
		else {
			System.out.println("Navigation Unsuccess to Sports and Outdoor Link -Failed");
		}
		assertTrue(foundURL);
	}
	
	@Test
	public void navigationToShirt_test07() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Shirt.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://shirt.woot.com/?ref=w_gh_sh_8")) {
			foundURL=true;
		System.out.println("Navigation Success to Shirt Link Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Shirt Link -Failed");
		}
		assertTrue(foundURL);
	}
	
	  @Test
	  public void navigationToGourment_test08() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Gourmet.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/wine?ref=w_gh_wn_9")) {
			foundURL=true;
		System.out.println("Navigation Success to Gourmet Link Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Gourmet Link -Failed");
		}
		assertTrue(foundURL);
	}
	@Test
		public void navigationToSellout_test09() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		
		HeaderNav hn = new HeaderNav(driver);
		hn.Sellout.click();
		
		//Validation
		boolean foundURL=false;
		String url= driver.getCurrentUrl();
		if (url.equals("https://www.woot.com/category/sellout?ref=w_gh_so_10")) {
		System.out.println("Navigation Success to Sellout Page -Passed");
		}
		else {
			System.out.println("Navigation Unsuccess to Sellout Page Link -Failed");
		}
		assertTrue(foundURL);
	}
   
	@Test
      public void navigationToClearance_test10() throws InterruptedException { 
    	 Thread.sleep(3000);
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.woot.com/");
	
	    HeaderNav hn = new HeaderNav(driver);
	    hn.FlashDeals.click();
	
	   //Validation
	    boolean foundURL=false;
	   String url= driver.getCurrentUrl();
	   if (url.equals("https://www.woot.com/flashdeals?ref=w_gh_promo_11")) {
		   foundURL=true;
	  System.out.println("Navigation Success to Flash Deals Page -Passed");
	}
	else {
		System.out.println("Navigation Unsuccess to Flash Deals Page Link -Failed");
	}
	   assertTrue(foundURL);
}

}
		
			
		
