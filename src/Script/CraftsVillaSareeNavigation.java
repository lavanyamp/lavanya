package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CraftsvillaHomePage;
import Pom.CraftsvillaProductPage;



@Listeners(Generic.itest.class)
public class CraftsVillaSareeNavigation extends BaseTest {
	@Test
	public void testCraftsVillaSareeNavigation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",0,0);
		CraftsvillaHomePage c=new CraftsvillaHomePage(driver);
		c.clickCraftsVilla();
		CraftsvillaProductPage v=new CraftsvillaProductPage(driver);
		
		v.verifycraftsvillaProductUrl(s);
		
		v.discountClick();
		Thread.sleep(5000);
		c.clickSarees();
		driver.navigate().back();
		v.verifycraftsvillaProductUrl(s);
		Thread.sleep(5000);
		driver.quit();
		
	}

}
