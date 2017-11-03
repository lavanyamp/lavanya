package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class AccesoriesproductPage extends BasePage {
	@FindBy(xpath="(//img[@class='product-image'])[1]")
    private WebElement image;
	@FindBy(xpath="//i[@class='icon cv-wishlist-icon']")
   private WebElement wish;
	@FindBy(id="continueBtn")
	 private WebElement continu;
	@FindBy(xpath="//div[.='Email Id is required']")
	private WebElement errmsg;
	@FindBy(xpath="(//button[@class='icon model-close'])[1]")
	private WebElement close;
	
	public AccesoriesproductPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	public void Clickimage()
	{
		verifyElementPresent(image);
		image.click();
	}
	public void Clickwish()
	{
		wish.click();
	}
	public void Clickcontinu()
	{
		continu.click();
	}
	public void verifyErrorMsg()
	{
		verifyElementPresent(errmsg);
	}
	public void Clickclose()
	{
		close.click();
	}
	
	
}
