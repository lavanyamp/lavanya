package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class CraftsvillaContactUsPage extends BasePage{

	
		@FindBy(xpath="//i[@class='icon cv-customer-review']")
         private WebElement contactus;
		@FindBy(xpath="//a[.='Where is my order?']")
        private WebElement order;
		@FindBy(xpath="(//a[.='My Orders'])[1]")
		 private WebElement myorderlink;
		@FindBy(xpath="//span[.='Cancellations']")
		private WebElement cancel;
		@FindBy(xpath="//a[.='I want to cancel my order.']|//span[.='I am unable to cancel my order.']")
		private WebElement cancelinks;
		
		
		public CraftsvillaContactUsPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver,this);
		}
		public void clickcontactus()
		{ 
			
			contactus.click();
		}
		public void clickorder()
		{
			
			 order.click();
		}
		public void clickMyOrderLink()
		{
			myorderlink.click();
		}
		public void verifyMyOrdersLink(String etitle)
		{
			verifyTitle(etitle);
		}
		public void verifyContactUrl(String ur)
		{
			verifyProductUrl(ur);
		}
		public void clickCancellations()
		{
			verifyElementPresent(cancel);
			cancel.click();
		}
		public void verifyCancelLinks()
		{
			verifyElementPresent(cancelinks);
			
			if(cancelinks.isDisplayed())
			{
				Reporter.log("Under cancellations links are displayed correctly",true);
			}else{
				Reporter.log("Under cancellations links are displayed correctly",true);
			}
		}
		
}
