package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class CartPage extends BasePage{

	@FindBy(xpath="//div[.='Your cart is Empty']")
    private WebElement cartempty;
	@FindBy(xpath="//button[@id='js-continue-shopping']")
	private WebElement continueshop;
	@FindBy(xpath="//button[@id='addtocart']")
    private WebElement addcart;
	@FindBy(id="open-remove-item-modal")
	 private WebElement remove;
	@FindBy(id="remove-item-btn")
	 private WebElement removeButton;
			
	public CartPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public String verifytextinCart()
	{
		String text = cartempty.getText();
		return text;
	}
	public void clickAddToCart()
	{
		verifyElementPresent(addcart);
		addcart.click();
	}
	public void removeItemButtonPop()
	{
		
		removeButton.click();
	}
	public void clickOnRemove()
	{
		verifyElementPresent(remove);
		remove.click();
	}
	public void verifycontinueShoppingButton()
	{
		if(continueshop.isDisplayed())
		{
			Reporter.log("ContinueShopping Button Displayed",true);
			}
	}
}
