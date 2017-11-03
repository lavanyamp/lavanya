package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.BasePage;

public class SareeProductPage extends BasePage{
	@FindBy(xpath="//strong[.='Sort By:']")
	private WebElement sortby;
	@FindBy(id="priceOrder_ASC")
	private WebElement priceLTH;
	@FindBy(xpath="//span[.='Price : High to Low']")
	private WebElement priceHTL;
	@FindBy(xpath="(//span[@class='product-offer-price'])[1]")
	private WebElement lowprice;
	@FindBy(xpath="(//span[@class='product-offer-price'])[last()]")
	private WebElement highprice;
	@FindBy(xpath="//span[@id='discountedPriceOrder_DESC']")
	private WebElement discount;
	public SareeProductPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	public void verifySortBy()
	{verifyElementPresent(sortby);
		if(sortby.isEnabled())
		{
			String text = sortby.getText();
			Reporter.log(text,true);
		}
	}
	public void verifyPriceLTH()
	{verifyElementPresent(priceLTH);
		if(priceLTH.isEnabled())
		{
			String text1 = priceLTH.getText();
			Reporter.log(text1,true);
		}
	}
	public void verifyPriceHTL()
	{
		verifyElementPresent(priceHTL);
		if(priceHTL.isEnabled())
		{
			String text2 = priceHTL.getText();
			Reporter.log(text2,true);
		}
	}
	public void verifyDiscount()
	{
		verifyElementPresent(discount);
		if(discount.isEnabled())
		{
			String text3 = discount.getText();
			Reporter.log(text3,true);
		}
	}
	public void clickLowToHigh()
	{
		verifyElementPresent(priceLTH);
		priceLTH.click();
	}
	public void productLowToHighDisplayed() throws InterruptedException
	{
		verifyElementPresent(lowprice);
		String low = lowprice.getText();
		Reporter.log(low,true);
		verifyElementPresent(highprice);
		
		String high = highprice.getText();
		Reporter.log(high,true);
		String digit = "";
		for(int i=0;i<low.length();i++){
			
		
		char c=low.charAt(i);
		if(Character.isDigit(c))
		{
			digit=digit+c;
			
		}
		
		}
		String digit1="";
		for(int i=0;i<high.length();i++){
			
			
			char ch=high.charAt(i);
			if(Character.isDigit(ch))
			{
				digit1=digit1+ch;
				
			}
				
		}
		
	int n = Integer.parseInt(digit);
		System.out.println(n);
		int m = Integer.parseInt(digit1);
		System.out.println(m);
		Thread.sleep(5000);
		if(n<m)
		{
			Reporter.log("Product displayed from low to high",true);
		}
		else{
			Reporter.log("not displayed",true);
			Assert.fail();
		}
		
	}
	
}
