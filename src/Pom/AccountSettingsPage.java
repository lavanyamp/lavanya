package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class AccountSettingsPage extends BasePage{
	@FindBy(id="changePersonalinfo")
	private WebElement edit;
	@FindBy(xpath="//input[@name='firstname' and @placeholder='First Name']")
	private WebElement firstName;
	@FindBy(xpath="//div[.='CANCEL']")
	private WebElement cancel;
	 public AccountSettingsPage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver,this);
			
		}
public void clickEdit()
{
	verifyElementPresent(edit);
	edit.click();
}
public void clickCancel()
{
	verifyElementPresent(cancel);
	cancel.click();
}
public void setFirstName(String a) throws InterruptedException
{
	firstName.clear();
	Thread.sleep(3000);
	firstName.sendKeys(a);
}
public void verifyUrl(String st)
{
	verifyProductUrl(st);
}
}
