package Woot_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderNavigation {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayja\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com");
		
		WebElement w= driver.findElement(By.id("category-tab-everything-woot"));
		w.click();
				
	    String url= driver.getCurrentUrl();
		
		if(url.equals("https://www.woot.com/alldeals?ref=w_gh_et_1")) {
			System.out.println("All Deals -Navigation Successful - passed");
		} 
		else {
			System.out.println("All Deals -Navigation Unsccessful- failed");
		}
		driver.navigate().back();	
		
		driver.findElement(By.id("category-tab-home-woot")).click();
		
		String url1= driver.getCurrentUrl();
		//System.out.println(url1);
		
		if(url1.equals("https://www.woot.com/category/home?ref=w_gh_hm_3")) {
			System.out.println("HomePage -Navigation Successful - passed");
		} 
		else {
			System.out.println("HomePage -Navigation Unsccessful- failed");
		}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-electronics-woot")).click();
		
        String url2= driver.getCurrentUrl();
		
		if(url2.equals("https://www.woot.com/category/electronics?ref=w_gh_el_4")) {
			System.out.println("Electronics Page -Navigation Successful - passed");
		} 
		else {
			System.out.println("Electronics Page -Navigation Unsccessful- failed");
		}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-computers-woot")).click();
		 String url3= driver.getCurrentUrl();
			
			if(url3.equals("https://www.woot.com/category/computers?ref=w_gh_cp_5")) {
				System.out.println("computers Page -Navigation Successful - passed");
			} 
			else {
				System.out.println("Computers Page -Navigation Unsccessful- failed");
			}
		
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-tools-woot")).click();
		 String url4= driver.getCurrentUrl();
			
			if(url4.equals("https://www.woot.com/category/tools?ref=w_gh_tg_6")) {
				System.out.println("Tools Page -Navigation Successful - passed");
			} 
			else {
				System.out.println("Tools Page -Navigation Unsccessful- failed");
			}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-sport-woot")).click();
		String url5= driver.getCurrentUrl();
		
		if(url5.equals("https://www.woot.com/category/sport?ref=w_gh_sp_7")) {
			System.out.println("Sports Page -Navigation Successful - passed");
		} 
		else {
			System.out.println("Sports Page -Navigation Unsccessful- failed");
		}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-shirt-woot")).click();
		
         String url6= driver.getCurrentUrl();
		
		if(url6.equals("https://shirt.woot.com/?ref=w_gh_sh_8")) {
			System.out.println("Shirts Page -Navigation Successful - passed");
		} 
		else {
			System.out.println("Shirts Page -Navigation Unsccessful- failed");
		}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-wine-woot")).click();
		 String url7= driver.getCurrentUrl();
			
			if(url7.equals("https://www.woot.com/category/wine?ref=w_gh_wn_9")) {
				System.out.println("Gourment Page -Navigation Successful - passed");
			} 
			else {
				System.out.println("Gourmnet Page -Navigation Unsccessful- failed");				
			}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-sellout-woot")).click();
		 String url8= driver.getCurrentUrl();
			
			if(url8.equals("https://www.woot.com/category/sellout?ref=w_gh_so_10")) {
				System.out.println("Sellout Page -Navigation Successful - passed");
			} 
			else {
				System.out.println("Sellout Page -Navigation Unsccessful- failed");				
			}
		driver.navigate().back();
		
		driver.findElement(By.id("category-tab-promotional-woot")).click();
		String url9= driver.getCurrentUrl();
		
		if(url9.equals("https://www.woot.com/flashdeals?ref=w_gh_promo_11")) {
			System.out.println("Clearance Page -Navigation Successful - passed");
		} 
		else {
			System.out.println("Clearance Page -Navigation Unsccessful- failed");	
		}
		driver.navigate().back();
		
		driver.quit();
		
		
				
	}
}
