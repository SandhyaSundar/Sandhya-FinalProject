package Woot_Tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import Woot_Lib.AllDealsPage;

import org.openqa.selenium.WebElement;

public class AllDealPageTest extends BaseTest{
	
	
    @Test  //Home category
	public void selectByCategoryHome_Test01() {
    	
    	driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/alldeals");
    	
		
		AllDealsPage adp = new AllDealsPage(driver);
			
		   try {

			   List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/ul/li[2]/label/input"));  
			     for(WebElement e : checkbox) {
				      if(e.getAttribute("data-category-filter").equals("HOME")) {
					     e.click();
					    	break;
						  }
			   }
			
		//Validation
			Boolean foundURL = false;   
			String URL=driver.getCurrentUrl();
				if(URL.equals("https://www.woot.com/alldeals?selectedCategories=HOME")) {
					  foundURL = true;
				    System.out.println("Home category is successfully selected");
				}
				else {
					System.out.println("Home category is NOT successfully selected");
				}
	
			   assertTrue(foundURL);
			   
			  }
		    catch(NoSuchElementException e) {
				  e.printStackTrace();
			  }
		}
    
    @Test  //Computers Category
	public void selectByCategoryComputer_Test02() {
    	
    	driver.manage().window().maximize();
		driver.navigate().to("https://www.woot.com/alldeals");
    		
	     try {
			   List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/ul/li[4]/label/input"));  
			   for(WebElement e : checkbox) {
				   if(e.getAttribute("data-category-filter").equals("PC")) {
					  e.click();
					  break;
				  }
			   }
		//Validation
		 boolean foundURL=false;
		 String URL=driver.getCurrentUrl();
			if(URL.equals("https://www.woot.com/alldeals?selectedCategories=PC")) {
				foundURL =true;
			        System.out.println("Computers category is successfully selected");
				}
				else {
					System.out.println("Computers category is NOT successfully selected");
				}
				assertTrue(foundURL);
				}
		    catch(NoSuchElementException e) {
				  e.printStackTrace();
			  }
		}

    @Test  //Electronics Category
   	public void selectByCategoryElectronics_Test03() {
       	
       	driver.manage().window().maximize();
   		driver.navigate().to("https://www.woot.com/alldeals");
       		
   	     try { 
   			   List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/ul/li[3]/label/input"));  
   			   for(WebElement e : checkbox) {
   				   if(e.getAttribute("data-category-filter").equals("TECH")) {
   					  e.click();
   					  break;
   				  }
   			   }
   		//Validation
   		 boolean foundURL=false;
   		 String URL=driver.getCurrentUrl();
   			if(URL.equals("https://www.woot.com/alldeals?selectedCategories=TECH")) {
   				foundURL =true;
   			        System.out.println("Electronics category is successfully selected");
   				}
   				else {
   					System.out.println("Electronics category is NOT successfully selected");
   				}
   				assertTrue(foundURL);
   				}
   		    catch(NoSuchElementException e) {
   				  e.printStackTrace();
   			  }
   		}


    @Test  //Tools and Garden Category
   	public void selectByCategoryTools_Test04() {
       	
       	driver.manage().window().maximize();
   		driver.navigate().to("https://www.woot.com/alldeals");
       		
   	     try { 
   			   List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/ul/li[5]/label/input"));  
   			   for(WebElement e : checkbox) {
   				   if(e.getAttribute("data-category-filter").equals("TOOLS")) {
   					  e.click();
   					  break;
   				  }
   			   }
   		//Validation
   		 boolean foundURL=false;
   		 String URL=driver.getCurrentUrl();
   			if(URL.equals("https://www.woot.com/alldeals?selectedCategories=TOOLS")) {
   				foundURL =true;
   			        System.out.println("Tools and Garden category is successfully selected");
   				}
   				else {
   					System.out.println("Tools and Garden is NOT successfully selected");
   				}
   				assertTrue(foundURL);
   				}
   		    catch(NoSuchElementException e) {
   				  e.printStackTrace();
   			  }
   		}

    @Test  //Sports and Outdoor Category
   	public void selectByCategorySports_Test05() {
       	
       	driver.manage().window().maximize();
   		driver.navigate().to("https://www.woot.com/alldeals");
       		
   	     try { 
   			   List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/ul/li[6]/label/input"));  
   			   for(WebElement e : checkbox) {
   				   if(e.getAttribute("data-category-filter").equals("SPORT")) {
   					  e.click();
   					  break;
   				  }
   			   }
   		//Validation
   		 boolean foundURL=false;
   		 String URL=driver.getCurrentUrl();
   			if(URL.equals("https://www.woot.com/alldeals?selectedCategories=SPORT")) {
   				foundURL =true;
   			        System.out.println("Sports and Outdoor category is successfully selected");
   				}
   				else {
   					System.out.println("Sports and Outdoor is NOT successfully selected");
   				}
   				assertTrue(foundURL);
   				}
   		    catch(NoSuchElementException e) {
   				  e.printStackTrace();
   			  }
   		}


    @Test  //Gourmet Category
   	public void selectByCategoryGourmet_Test06() {
       	
       	driver.manage().window().maximize();
   		driver.navigate().to("https://www.woot.com/alldeals");
       		
   	     try { 
   			   List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/ul/li[7]/label/input"));  
   			   for(WebElement e : checkbox) {
   				   if(e.getAttribute("data-category-filter").equals("WINE")) {
   					  e.click();
   					  break;
   				  }
   			   }
   		//Validation
   		 boolean foundURL=false;
   		 String URL=driver.getCurrentUrl();
   			if(URL.equals("https://www.woot.com/alldeals?selectedCategories=WINE")) {
   				foundURL =true;
   			        System.out.println("Gourmet category is successfully selected");
   				}
   				else {
   					System.out.println("Gourmet is NOT successfully selected");
   				}
   				assertTrue(foundURL);
   				}
   		    catch(NoSuchElementException e) {
   				  e.printStackTrace();
   			  }
   		}

}
	



