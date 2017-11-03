package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class SigninPage extends BasePage {
	@FindBy(xpath="//h3[.='Login / Sign Up']")
	private WebElement Signintitle;
	
	@FindBy(id="emailId")
	private WebElement email;
	@FindBy(id="continueBtn")
	private WebElement continuebtn;
	@FindBy(id="userPassword")
	private WebElement password;
	@FindBy(xpath="//div[.='Email Id is not valid']")
	private WebElement emailerror;
	@FindBy(id="loginCheck")
	private WebElement login;
	public SigninPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	public String verifyTextSignInTitle()
	{
		verifyElementPresent(Signintitle);
		String text = Signintitle.getText();
		return text;
	}
	public void setEmailId(String a)
	{
		verifyElementPresent(email);
		email.sendKeys(a);
	}
	public void setPassword(String b)
	{
		verifyElementPresent(password);
		password.sendKeys(b);
	}
	public void verifyErrorInEmailId()
	{
		verifyElementPresent(emailerror);
		Reporter.log("ErrorMessage displayed");
		
	}
	public void clickContinuBtn()
	{
		continuebtn.click();
		
	}
	public void clickLoginBtn()
	{
		login.click();
		
	}
}
