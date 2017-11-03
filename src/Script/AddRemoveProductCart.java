package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CartPage;
import Pom.CraftsvillaHomePage;
import Pom.CraftsvillaProductPage;

public class AddRemoveProductCart extends BaseTest {
	@Test
	public void testAddRemoveProductCart() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",13,0);
		String u=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",3,0);
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.selectProduct1();
		CraftsvillaProductPage c=new CraftsvillaProductPage(driver);
		c.ClickOnProductToPurchase();
		c.verifycraftsvillaProductUrl(s);
		CartPage p=new CartPage(driver);
		Thread.sleep(3000);
		p.clickAddToCart();
		CraftsvillaHomePage t=new CraftsvillaHomePage(driver);
		t.verifyProductUrl(u);
		p.clickOnRemove();
		p.removeItemButtonPop();
		
	}
		
}
