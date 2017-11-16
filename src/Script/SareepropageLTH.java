package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CraftsvillaHomePage;
import Pom.SareeProductPage;
@Listeners(Generic.itest.class)
public class SareepropageLTH extends BaseTest{
	@Test
	public void testSareepropageLTH() throws InterruptedException 
	{
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.clickSarees();
		SareeProductPage p=new SareeProductPage(driver);
		p.verifySortBy();
		p.verifyPriceLTH();
		p.verifyPriceHTL();
		p.verifyDiscount();
		p.clickLowToHigh();
		Thread.sleep(2000);
		p.productLowToHighDisplayed();
		
	}
	

}
