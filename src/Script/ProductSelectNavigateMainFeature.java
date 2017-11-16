package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.AccesoriesproductPage;
import Pom.CraftsvillaHomePage;
@Listeners(Generic.itest.class)
public class ProductSelectNavigateMainFeature extends BaseTest{
	@Test
	public void accessoriestest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",11,0);
		String p=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",12,0);
		String q=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",6,0);
		CraftsvillaHomePage h=new CraftsvillaHomePage(driver);
		h.clickAccessories();
		h.verifyProductUrl(s);
		AccesoriesproductPage a=new AccesoriesproductPage(driver);
		a.Clickimage();
	h.verifyProductUrl(p);
		CraftsvillaHomePage c=new CraftsvillaHomePage(driver);
		c.clickSarees();
		c.verifyProductUrl(q);
		driver.manage().window().maximize();
		driver.navigate().back();
		h.verifyProductUrl(p);
		
	}

}
