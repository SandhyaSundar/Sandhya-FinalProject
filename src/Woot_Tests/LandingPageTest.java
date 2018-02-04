 package Woot_Tests;

import static org.testng.Assert.assertTrue;
import java.io.File;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.google.common.io.Files;
import Woot_Lib.ProfilePage;
import Woot_Lib.LandingPage;
import Woot_Lib.SignInPage;

public class LandingPageTest extends BaseTest{

	@Test
	public void LandingPageTest001() {
		driver.manage().window().maximize();
		driver.navigate().to("https://woot.com");
		try {
			LandingPage lp = new LandingPage (driver);
     			lp.SignInLink.click();
     			//validation
     			boolean foundURL=false;
     			String url=driver.getCurrentUrl();
     			if (url.equals("https://auth.woot.com/ap/signin?openid.ns=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0&openid.identity=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&openid.claimed_id=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&rmrMeStringID=ap_rememeber_me_default_message&openid.ns.pape=http%3a%2f%2fspecs.openid.net%2fextensions%2fpape%2f1.0&openid.pape.preferred_auth_policies=http%3a%2f%2fschemas.amazon.com%2fpape%2fpolicies%2f2010%2f05%2fsingle-factor-strong&server=%2fap%2fsignin%3fie%3dUTF8&openid.ns.oa2=http%3a%2f%2fwww.amazon.com%2fap%2fext%2foauth%2f2&openid.oa2.client_id=device%3a70c7390e-4ff5-4cef-bda5-2d3b5b7fbbca&openid.mode=checkid_setup&openid.assoc_handle=amzn_woot_desktop_us&openid.return_to=https%3a%2f%2faccount.woot.com%2fauth%3freturnUrl%3dhttps%253A%252F%252Fwww.woot.com%252F&pageId=wootgreen&openid.oa2.response_type=token&openid.oa2.scope=device_auth_access#signin")) {
     			    foundURL=true;
     				System.out.println("user navigated to sigin Page");
	         	}else {
     				System.out.println("User not directed to Sigin page");
     			}
     			assertTrue(foundURL);
		}
		
		 catch(NoSuchElementException e) {
			  e.printStackTrace(); 
		  }
 	  			
			driver.close();
	}
		
		}
	
	
	
	 
