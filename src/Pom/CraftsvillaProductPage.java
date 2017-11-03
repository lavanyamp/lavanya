package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class CraftsvillaProductPage extends BasePage{
	@FindBy(id="priceOrder_ASC")
	private WebElement priceLTH1;
	@FindBy(id="discountedPriceOrder_DESC")
	private WebElement discount;
	@FindBy(id="showcodlabel")
	private WebElement codproduct;
	@FindBy(id="priceOrder_DESC")
	private WebElement priceHtoL;
	@FindBy(xpath="(//img[@class='product-image lazy-onload'])[1]")
	private WebElement producttobuy;
	@FindBy(xpath="//h1[@itemprop='name']")
	private WebElement producttext;
	@FindBy(xpath="//a[.='1']")
	private WebElement page1;
	@FindBy(xpath="//p[.='Craftsvilla Peach Color Silk Embroidered Semi-Stitched Straight Suit ']")
	private WebElement expectedtext;
	@FindBy(xpath="//h1[@itemprop='name']")
	private WebElement expectedtext1;
	@FindBy(xpath="(//a[@class='paginate'])[6]")
	private WebElement nextbutton;
	@FindBy(xpath="//a[.='2']")
	private WebElement page2;
	@FindBy(xpath="(//a[.='Quick View'])[1]")
	private WebElement quickview;
	
	public CraftsvillaProductPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	public String verifyTextOfProduct()
	{
		String text = producttext.getText();
		return text;
	}
	public void verifyExpectedTextOfProduct(String s)
	{
		Reporter.log("same product");
		Reporter.log(s);
		//String text1 = expectedtext1.getText();
		//return text1;
	}
	public void priceLtHClick()
	{
		priceLTH1.click();
	}
	public void clickQuickView()
	{
		quickview.click();
	}
	public void clickNext()
	{
		nextbutton.click();
	}
	public void codproductClick()
	{
		codproduct.click();
	}
	public void discountClick()
	{
		discount.click();
	}
	public void priceoL()
	{
		priceHtoL.click();
	}
	public void verifyPage1()
	{
		verifyElementPresent(page1);
		if(page1.isEnabled())
		{
			Reporter.log("option 1 is presnt",true);
		}else{
			Reporter.log("option 1 is not present",true);
		}
		
	}
	public void verifyPage2()
	{
		verifyElementPresent(page2);
		
		if(page2.isEnabled())
		{
			Reporter.log("option 2 is presnt",true);
		}else{
			Reporter.log("option 2 is not present",true);
		}
		
	}
	public void verifycraftsvillaProductUrl(String url)
	{
		verifyProductUrl(url);
	}
	public void ClickOnProductToPurchase()
	{
		producttobuy.click();
	}
	public void CompareProductTitle(String act,String expected)
	{
		if(act.contains(expected))
		{
			Reporter.log("Same product selected and addded in cart",true);
		}else{
			Reporter.log("not a same product selected and addded in cart",true);
		}
		
	}
	

}
