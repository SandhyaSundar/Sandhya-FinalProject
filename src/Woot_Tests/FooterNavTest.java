package Woot_Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Woot_Lib.FooterNav;

public class FooterNavTest extends BaseTest{

		
	@Test
	public void naviagtiontoTodaysWootPage_test01() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.TodaysWoot.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/?ref=w_ft_wt_tywt")) {
			foundURL=true;
			System.out.println("Naviagtion successful to Today's Woot deal page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to Today's Woot deal page");
		}
		assertTrue(foundURL);
	}
	
	@Test 
	public void navigationToBlogPage_test02() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.Blog.click();
		//validation
		
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/blog?ref=w_ft_wt_blg")) {
			foundURL=true;
			System.out.println("Naviagtion successful to Blog page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to Blog page");
		}
		assertTrue(foundURL);
	}
	
	@Test
	public void navigationToCommunityPage_test03() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.Community.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/forums/?ref=w_ft_wt_cmty")) {
			foundURL=true;
			System.out.println("Naviagtion successful to Community page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to Community page");
		}
		assertTrue(foundURL);
	}
	@Test
	public void naviagtionToWhatsWoot_test04() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.whatiswoot.click();
		
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/faq?ref=w_ft_wt_wiw")) {
			foundURL=true;
			System.out.println("Naviagtion successful to What is woot page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to  What is woot page");
		}
		assertTrue(foundURL);
	}
	
	@Test
	
	   public void naviagtionToCustomerService_test05() {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.CustomerService.click();
		
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://auth.woot.com/ap/signin?openid.ns=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0&openid.identity=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&openid.claimed_id=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&rmrMeStringID=ap_rememeber_me_default_message&openid.ns.pape=http%3a%2f%2fspecs.openid.net%2fextensions%2fpape%2f1.0&openid.pape.preferred_auth_policies=http%3a%2f%2fschemas.amazon.com%2fpape%2fpolicies%2f2010%2f05%2fsingle-factor-strong&server=%2fap%2fsignin%3fie%3dUTF8&openid.ns.oa2=http%3a%2f%2fwww.amazon.com%2fap%2fext%2foauth%2f2&openid.oa2.client_id=device%3a70c7390e-4ff5-4cef-bda5-2d3b5b7fbbca&openid.mode=checkid_setup&openid.assoc_handle=amzn_woot_desktop_us&openid.return_to=https%3a%2f%2faccount.woot.com%2fauth%3freturnUrl%3dhttps%253A%252F%252Faccount.woot.com%252Fsupport%253Fref%253Dw_ft_wt_spt&pageId=wootgreen&openid.oa2.response_type=token&openid.oa2.scope=device_auth_access#ref=www.woot.com/footer/link@1.4")) {
			foundURL=true;
			System.out.println("Naviagtion successful to customer service  page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to customer service page");
		}	
		assertTrue(foundURL);
	}
	
	@Test
	public void naviagationToFeedback_test06() {
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.Feedback.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/feedback?ref=w_ft_wt_fdbk")){
			foundURL=true;
			System.out.println("Naviagtion successful to feedback page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to feedback page");
		}	
		assertTrue(foundURL);	
	}
	@Test 
	public void naviagationToEverythingWoot_test07() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.Everythingwoot.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/forums/viewforum.aspx?forumid=17&ref=w_ft_cmty_ebw")) {
			foundURL= true;
			System.out.println("Naviagtion successful to Everything but Woot page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to Everything but Woot page");
		}
		assertTrue(foundURL);
	}
	
	@Test
	public void naviagationToWoot_test08()	{
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.woot.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		
		if(url.equals("https://www.woot.com/blog/tagged/woot?ref=w_ft_blg_wt")) {
			foundURL= true;
			System.out.println("Naviagtion successful to Woot page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to Woot page");
		}
		assertTrue(foundURL);
	}
	
	@Test
	public void navigationToWoots_test09() {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.Woots.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/forums/?ref=w_ft_cmty_wts")) {
			foundURL=true;
			System.out.println("Naviagtion successful to Woots page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to Woots page");
		}
		assertTrue(foundURL);
	}
	
	@Test
	
	public void navigationToWorldOfWoot_test10(){
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/");
		FooterNav fv= new FooterNav (driver);
		fv.Worldofwoot.click();
		//validation
		boolean foundURL=false;
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.woot.com/forums/viewforum.aspx?forumid=15&ref=w_ft_cmty_wow")) {
			foundURL=true;
			System.out.println("Naviagtion successful to world of Woot page");
		}
		else {
			System.out.println("Naviagtion unsuccessful to World of Woot page");
		}
		assertTrue(foundURL);		
	}
	
	
}

