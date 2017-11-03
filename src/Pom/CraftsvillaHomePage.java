package Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class CraftsvillaHomePage extends BasePage {
	
	@FindBy(xpath="//a[@href='/cvfeeds/craftsvilla-brands']")
	private WebElement craftsvillabrands;
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement sarees;
	@FindBy(xpath="//a[@href='/accessories/?MID=megamenu_accessories_seeall']")
	private WebElement acessories;
	@FindBy(xpath="//span[.='Cart ']")
	private WebElement cart;
	@FindBy(xpath="(//img[@class='img-responsive' and @title='Trending' ])[1]")
	private WebElement selectproduct;
	@FindBy(id="cv-logo")
	private WebElement companylogo;
	@FindBy(xpath="//span[.='Sign In']")
	private WebElement signin;
	@FindBy(xpath="(//a[@href='/cvfeeds/craftsvilla-sarees'])[1]")
	private WebElement craftsvillaMouseOptions1;
	@FindBy(xpath="(//a[@href='/cvfeeds/buy-craftsvilla-avanya-salwarsuits-online-craftsvilla'])[1]")
	private WebElement craftsvillaMouseOptions2;
	@FindBy(xpath="(//a[@href='/cvfeeds/anuswara-kurtis'])[1]")
	private WebElement craftsvillaMouseOptions3;
	@FindBy(xpath="//li[.='POLICIES & INFO']")
	private WebElement policiesinfo;
	@FindBy(xpath="//a[.='Terms & Conditions']")
	private WebElement termsconditions;
	@FindBy(xpath="//a[.='Policy for Sellers']")
	private WebElement policies1;
	@FindBy(xpath="//a[.='Policy for Buyers']")
	private WebElement policies2;
	@FindBy(xpath="//a[.='Shipping & Refund Policies']")
	private WebElement shipping;
	@FindBy(xpath="//a[.='Wholesale Policy']")
	private WebElement wholesale;
	@FindBy(xpath="//a[.='Privacy Policy']")
	private WebElement privacypolicy;
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement productselect;
	@FindBy(xpath="//span[.='Pushpalatha']")
	private WebElement account;
	
	@FindBy(xpath="//i[@class='icon cv-wishlist-icon']")
	private WebElement wishlist;
	@FindBy(xpath="//a[.='Account Settings']")
	private WebElement accountSettings;
	
    public CraftsvillaHomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
    public void clickCraftsVilla()
    {
    	craftsvillabrands.click();
    	
    }
    public void clickAccountSettings()
    {
    	verifyElementPresent(accountSettings);
    	accountSettings.click();
    	
    }
  
    public void clickWishList()
    {
    	verifyElementPresent(wishlist);
    	wishlist.click();
    	
    }
  
    
    public void clickSarees()
    {
    	sarees.click();
    }
    public void clickSignIn()
    {
    	signin.click();
    }
    public void selectOneProduct()
    {
    	productselect.click();
    }
    public void clickCart()
    {
    	cart.click();
    }
    public void clickAccessories()
    {
    	acessories.click();
    	
    }
    public void selectProduct1()
    {
    	selectproduct.click();
    }
    public void clickOnCompanyLogo()
    {
    	companylogo.click();
    }
    public void verifyCraftsvillaBrandMouseOver()
    {
    	mouseMoveOver(driver,craftsvillabrands);
    }
    public void clickPoliciesInfo()
    {
    	policiesinfo.click();
    	
    }
    public void clickTermsConditions()
    {
    	termsconditions.click();
    	
    }
    public void getLinksTextUnderPoliciesInfo()
    {
    	verifyElementPresent(termsconditions);
    	String text1 = termsconditions.getText();
    	verifyElementPresent(policies1);
    	String text2 = policies1.getText();
    	verifyElementPresent(policies1);
    	String text3 = policies2.getText();
    	verifyElementPresent(shipping);
    	String text4 = shipping.getText();
    	verifyElementPresent(wholesale);
    	String text5 = shipping.getText();
    	verifyElementPresent(privacypolicy);
    	String text6 = privacypolicy.getText();
    	Reporter.log("links displayed under policy&info",true);
    	Reporter.log(text1,true);
    	Reporter.log(text2,true);
    	Reporter.log(text3,true);
    	Reporter.log(text4,true);
    	Reporter.log(text5,true);
    	Reporter.log(text6,true);
    	
    	
    }
    public void mouseOverAccount()
    {
    	verifyElementPresent(account);
    mouseMoveOver(driver,account);
    }
    public void verifyTitle(String title)
    {
    	verifyTitle(title);
    }
    public void vrifyCompanyLogo()
    {
    	verifyElementPresent(companylogo);
    	if(companylogo.isDisplayed())
    	{
    		Reporter.log("Company logo displayed",true);
    	}else{
    		Reporter.log("company logo not displayed",true);
    	}
    }
    public void verifyCraftsBrandsMouseOverOptions1()
    {
    	verifyElementPresent(craftsvillaMouseOptions1);
    	
    	
    	if(craftsvillaMouseOptions1.isDisplayed())
    	{
    		//String text1 = craftsvillaMouseOptions1.getText();
    		Reporter.log("OPTIONS below CraftsvillaBrands are:",true);
    		String text1 = craftsvillaMouseOptions1.getText();
        	Reporter.log(text1,true);
    		
    		
    	}
    }
    public void verifyCraftsBrandsMouseOverOptions2()
    {
    	verifyElementPresent(craftsvillaMouseOptions2);
    	if(craftsvillaMouseOptions2.isDisplayed())
    	{
    		String text2 = craftsvillaMouseOptions2.getText();
    		
    		Reporter.log(text2,true);
    	}
    }
    public void verifyCraftsBrandsMouseOverOptions3()
    {
    	verifyElementPresent(craftsvillaMouseOptions3);
    	if(craftsvillaMouseOptions3.isDisplayed())
    	{
    		String text3 = craftsvillaMouseOptions3.getText();
    		
    		Reporter.log(text3,true);
    	}
    }
    public String verifyAccount()
    {
    	String text = account.getText();
    	return text;
    }
    public void verifySignIn()
    
    {
    	verifyElementPresent(signin);
    	if(signin.isDisplayed())
    	{
    		Reporter.log("SignIn displayed",true);
    	}else{
    		Reporter.log("SignIn  not displayed",true);
    	}
    }
}