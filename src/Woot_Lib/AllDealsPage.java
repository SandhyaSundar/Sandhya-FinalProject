package Woot_Lib;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

   public class AllDealsPage {
 
	  WebDriver driver;

	//verify that user able to select categories by clicking checkbox.
	  
	
	@FindBy(css="div.list-header")
	public WebElement Category;
		
	@FindBy(name = "data-category-filter")
	public List<WebElement> CategoryCheckbox;	
	
	
	
	
    
	public AllDealsPage (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);

		}






	
	}

