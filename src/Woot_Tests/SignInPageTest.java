package Woot_Tests;

import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.testng.AssertJUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import Woot_Lib.SignInPage;

public class SignInPageTest extends BaseTest{

	public static String Error_msg;
	

	
	@Test
	public void SigninScenario_Test01() throws Exception {
	
		driver.manage().window().maximize();
		driver.navigate().to("https://auth.woot.com/ap/signin?openid.ns=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0&openid.identity=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&openid.claimed_id=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&rmrMeStringID=ap_rememeber_me_default_message&openid.ns.pape=http%3a%2f%2fspecs.openid.net%2fextensions%2fpape%2f1.0&openid.pape.preferred_auth_policies=http%3a%2f%2fschemas.amazon.com%2fpape%2fpolicies%2f2010%2f05%2fsingle-factor-strong&server=%2fap%2fsignin%3fie%3dUTF8&openid.ns.oa2=http%3a%2f%2fwww.amazon.com%2fap%2fext%2foauth%2f2&openid.oa2.client_id=device%3a70c7390e-4ff5-4cef-bda5-2d3b5b7fbbca&openid.mode=checkid_setup&openid.assoc_handle=amzn_woot_desktop_us&openid.return_to=https%3a%2f%2faccount.woot.com%2fauth%3freturnUrl%3dhttps%253A%252F%252Fwww.woot.com%252F&pageId=wootgreen&openid.oa2.response_type=token&openid.oa2.scope=device_auth_access#signin");
	    
		
		  SignInPage sip = new SignInPage(driver);
		 
			sip.setUsername("vaildeail@gmail.com"); //Testcase was tested using my registered email id; changed to dummy one in the coder here
			sip.setpassword("8654389");
			sip.clickSignInBtn();
			
//			takeSnapShot(driver,"C:\\Users\\jayja\\eclipse-workspace\\MyFirstProject\\Screenshots\\SigninScenario_Test01.png");     
	        
			//validation
			boolean foundURL=false;
			String url= driver.getCurrentUrl();
				if(url.equals("https://www.woot.com/")) {
					foundURL=true;
				System.out.println("User logged in successfully");
			}else {
				System.out.println("Unsuccessful Signin");
				}
				assertTrue(foundURL);
	}
			 
	@Test 
	public void negativeSignIn_test02() {
		driver.manage().window().maximize();
		driver.navigate().to("https://auth.woot.com/ap/signin?openid.ns=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0&openid.identity=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&openid.claimed_id=http%3a%2f%2fspecs.openid.net%2fauth%2f2.0%2fidentifier_select&rmrMeStringID=ap_rememeber_me_default_message&openid.ns.pape=http%3a%2f%2fspecs.openid.net%2fextensions%2fpape%2f1.0&openid.pape.preferred_auth_policies=http%3a%2f%2fschemas.amazon.com%2fpape%2fpolicies%2f2010%2f05%2fsingle-factor-strong&server=%2fap%2fsignin%3fie%3dUTF8&openid.ns.oa2=http%3a%2f%2fwww.amazon.com%2fap%2fext%2foauth%2f2&openid.oa2.client_id=device%3a70c7390e-4ff5-4cef-bda5-2d3b5b7fbbca&openid.mode=checkid_setup&openid.assoc_handle=amzn_woot_desktop_us&openid.return_to=https%3a%2f%2faccount.woot.com%2fauth%3freturnUrl%3dhttps%253A%252F%252Fwww.woot.com%252F&pageId=wootgreen&openid.oa2.response_type=token&openid.oa2.scope=device_auth_access#signin");
      try {
		  SignInPage sip = new SignInPage(driver);
		 
			sip.setUsername("email@gmail.com");
			sip.setpassword("mytest007");
			sip.clickSignInBtn();
			
			String url= driver.getCurrentUrl();
			//independent if statement to capture error message.
			if (!url.equals("https://www.woot.com/")) {
				Error_msg =driver.findElement(By.id("auth-warning-message-box")).getText();
				//System.out.println(Error_msg);
			}
		//validation
			boolean teststatus=false;
			if(url.equals("https://www.woot.com/")) {
				System.out.println("User logged in successfully");
			}
			else if (!url.equals("https://www.woot.com/")) {
				System.out.println("User login unsuccessful and showing correct error msg");
				teststatus=true;
			} else {
				System.out.println("Unsuccessful login and not showing correct error msg");
			}
         AssertJUnit.assertTrue(teststatus);
           } catch (NoSuchElementException e) {
		           e.printStackTrace();
	  }
	
}

		
	
}