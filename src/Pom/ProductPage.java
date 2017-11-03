package Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import Generic.BasePage;

public class ProductPage extends BasePage{
	@FindBys({@FindBy(xpath="//b[.='Sold by:']/ancestor::p//span")})
	private List<WebElement> soldby;
	@FindBys({@FindBy(xpath="(//b[.='Details:']/../..//li)[position()<last()]")})
	private List<WebElement> details;
	@FindBys({@FindBy(xpath="(//b[.='Price:']/../..//li)[position()<last()-7]")})
	private List<WebElement> price;
	@FindBys({@FindBy(xpath="(//b[.='Sold by:']/../..//span)[position()<last()-3]")})
	private List<WebElement> Qsoldby;
	@FindBys({@FindBy(xpath="(//b[.='Details:']/../..//li)[position()<last()]")})
	private List<WebElement> Qdetails;
	//ArrayList<String> s=new ArrayList<String>();
	//ArrayList<String> p=new ArrayList<String>();
	//ArrayList<String> qs=new ArrayList<String>();
	//ArrayList<String> qp=new ArrayList<String>();
	public ProductPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	public void getSoldByCredentials()
	{
		for(WebElement i:soldby)
		{
			String text = i.getText();
			//s.add(text);
			 
			Reporter.log(text,true);
		}
	}
	public void getPriceCredentials()
	{
		for(WebElement i:price)
		{
			String text = i.getText();
			//p.add(text);
			Reporter.log(text,true);
		}
	}
	public void getDetailsCredentials()
	{
		System.out.println(details.size());
		for(int i=0;i<2;i++)
		{
			String text =details.get(i).getText();
			Reporter.log(text,true);
		}
	}
	
	public void compareQuickSoldBy() throws InterruptedException
	{
		Reporter.log("Credentials we are getting on QuickView");
		for(int i=0;i<Qsoldby.size();i++)
{
			Thread.sleep(3000);
		String text =Qsoldby.get(i).getText();
		//qs.add(text);
		Reporter.log(text,true);
	}

}
	public void compareQuickDetails() throws InterruptedException
	{
		
			for(int i=0;i<2;i++)
			{
				String text =details.get(i).getText();
				Reporter.log(text,true);
			}

}
	public void compareWithQuick()
	{
		String text = soldby.get(1).getText();
		String qtext = Qsoldby.get(1).getText();
		if(text.equals(qtext))
		{
			Reporter.log("Same credentials we are getting when we click on QUICKVIEW & PRODUCT",true);
		}
		
	}
	
}
