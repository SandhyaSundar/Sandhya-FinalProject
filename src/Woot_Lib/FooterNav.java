package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterNav {

	WebDriver driver;
	
	@FindBy(linkText="Today's Woot")
	public WebElement TodaysWoot;
	
	@FindBy (linkText="Blog")
	public WebElement Blog;
	
	@FindBy (linkText="Community")
	public WebElement Community;
	
	@FindBy(linkText="What is Woot?")
	public WebElement whatiswoot;
	
	@FindBy(linkText="Customer Service")
	public WebElement CustomerService;
	
	@FindBy (linkText="Feedback")
	public WebElement Feedback;
	
	@FindBy(linkText="Woots")
	public WebElement Woots;
	
	@FindBy(linkText="World of Woot")
	public WebElement Worldofwoot;
	
	@FindBy (linkText="Everything But Woot")
	public WebElement Everythingwoot;
	
	
	@FindBy(linkText="Woot")
	public WebElement woot;
	
	
    TodayWootPage clickTodayWootLink() {
		TodaysWoot.click();
		TodayWootPage tw= new TodayWootPage(driver);
		 return tw;		
	}
	public void clickBlogLink() {
		Blog.click();	
	}
	public void clickCommunityLink() {
		Community.click();
	}
	public void clickWhatsWootLink() {
		whatiswoot.click();
	}
	public void clickCustomerServiceLink() {
		CustomerService.click();
	}
	
	public void clickFeedBackLink() {
		Feedback.click();
	}
	
	public void clickWootsLink() {
		Woots.click();
	}
	
	public void clickWorldOfWoot() {
		Worldofwoot.click();
	}
	
	public void clickEverythingWoot() {
		Everythingwoot.click();
	}
		
	public void clickWootLink() {
	    woot.click();
	
	}
	
	public FooterNav (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	
		}

}
