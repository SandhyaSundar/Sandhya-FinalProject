package Woot_Lib;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DailyDealOffer {
 
	
	WebDriver driver;
	
	@FindBy(id="attr-quantity")
	public WebElement Quantity;
		
	@FindBy(xpath="//*[@id=\"attribute-selector\"]/a")
	public WebElement AddCart;
	
	@FindBy (xpath="//*[@id=\"minicart\"]/a")
	public WebElement AddCartIcon;
	
	public void clickQuantity() {
			Select Qty =new Select(Quantity);
			  Qty.selectByValue("2"); 
	 //Validation
	  WebElement SelectedValue= Qty.getFirstSelectedOption();
			System.out.println("After Selected Value is"+SelectedValue.getText());   
			}
	
	public void clickAddCartBtn() {
			AddCart.click();
			}
		
	public void addCartIcondisplay() {
	    
		boolean IconPresent	= AddCartIcon.isDisplayed();
		
	     //Validation
		if(IconPresent== true) {
			System.out.println("Addcart Icon displayed after adding items to Addcart");
		} else {
			System.out.println("Addcart Icon not displayed after adding items to Addcart");
		}
		
	}
		public DailyDealOffer (WebDriver driver) {
	 	 this.driver=driver;
	     PageFactory.initElements(driver, this);
	}

		
		}





	
	
