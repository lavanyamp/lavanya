package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CartPage;
import Pom.CraftsvillaHomePage;
import Pom.CraftsvillaProductPage;
@Listeners(Generic.itest.class)
public class SameProductAddedToCart extends BaseTest{
	@Test
	public void testSameProductAddedToCart() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String u=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",3,0);
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",13,0);
		String k=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",14,0);
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.selectProduct1();
		CraftsvillaProductPage c=new CraftsvillaProductPage(driver);
		c.ClickOnProductToPurchase();
		c.verifycraftsvillaProductUrl(s);
		CartPage p=new CartPage(driver);
		Thread.sleep(3000);
		String actual = c.verifyTextOfProduct();
		Reporter.log(actual,true);
		p.clickAddToCart();
		CraftsvillaHomePage t=new CraftsvillaHomePage(driver);
		t.verifyProductUrl(u);
		//String expected = c.verifyExpectedTextOfProduct();
		c.verifyExpectedTextOfProduct(k);
		//Reporter.log(expected,true);
		
	
			//c.CompareProductTitle(actual, expected);
	
	}

}
