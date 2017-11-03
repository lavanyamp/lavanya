package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CartPage;
import Pom.CraftsvillaHomePage;

public class VerifyEmptyCart extends BaseTest{
	@Test
	public void testVerifyEmptyCart() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",0,3);
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.clickCart();
		v.verifyProductUrl(s);
	
		CartPage c=new CartPage(driver);
		String cartText = c.verifytextinCart();
		if(cartText.equals("Your cart is Empty Text is Displayed"))
		{
			Reporter.log("Your Cart is Empty",true);
		}
		c.verifycontinueShoppingButton();
	}
		
}
