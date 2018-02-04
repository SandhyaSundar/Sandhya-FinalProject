package Woot_Lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderNav {

	@FindBy(id="category-tab-everything-woot")
	public WebElement AllDeals;
	
	@FindBy(id="category-tab-home-woot")
	public WebElement Homenkit;
	
	@FindBy(id="category-tab-electronics-woot")
	public WebElement Electronics;
	
	@FindBy (id="category-tab-computers-woot")
	public WebElement Computers;
	
	@FindBy(id="category-tab-tools-woot")
	public WebElement Tools;
	
	@FindBy(id="category-tab-sport-woot")
	public WebElement Sports;
	
	@FindBy(id="category-tab-shirt-woot")
	public WebElement Shirt;
	
	@FindBy (id="category-tab-wine-woot")
	public WebElement Gourmet;
	
	@FindBy(id="category-tab-sellout-woot")
	public WebElement Sellout;
	
	@FindBy(id="category-tab-promotional-woot")
	public WebElement FlashDeals;
	
	WebDriver driver;
	
	public AllDealsPage clickAllDealLsink() {
		AllDeals.click();
		//creating the object of AllDeal page
	  AllDealsPage adp= new AllDealsPage(driver);
		return adp;
	}
		
	public HomeKitPage clickHomeKitLink() {
		//creating the object of HomeKitchen page
		Homenkit.click();
		HomeKitPage hkp= new HomeKitPage(driver);
		 return hkp;
	}
	public Electronics clickElectronicsLink() {
		Electronics.click();
		Electronics ep=new Electronics(driver);
		return ep;
	}
	 public Computers clickComputersLink() {
		 Computers.click();
		 Computers cp=new Computers (driver);
		 return cp;
	 }
	 
	 public ToolsPage clickToolsLink() {
		 Tools.click();
		 ToolsPage tp=new ToolsPage (driver);
		 return tp;
	 }
	
	 public SportsPage clickSportsLink() {
		 Sports.click();
		 SportsPage sp = new SportsPage(driver);
		 return sp;
		     
	}
	 
	 public ShirtPage clickShirtlink() {
		 Shirt.click();
		 ShirtPage spp= new ShirtPage(driver);
		 return spp;
	 }
	 
	public GourmetPage clickGourmetLink() {
		Gourmet.click();
		GourmetPage gp= new GourmetPage(driver);
		return gp;
	 }
	 
	 public SellOutPage clickSelloutLink() {
		 Sellout.click();
		 SellOutPage sop=new SellOutPage (driver);
		 return sop;
	 }
	 public FlashDealPage clickFlashDealLink() {
		 FlashDeals.click();
		 FlashDealPage fp= new FlashDealPage(driver);
		   return fp;
	 }
	 	 	 	 
	public HeaderNav (WebDriver driver) {
		     this.driver=driver;
		     PageFactory.initElements(driver, this);
		
		}
	 	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

