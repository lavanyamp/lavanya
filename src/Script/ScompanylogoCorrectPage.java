package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CraftsvillaHomePage;
@Listeners(Generic.itest.class)
public class ScompanylogoCorrectPage  extends BaseTest {
	@Test
	public void testCompanylogoCorrectPage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
v.vrifyCompanyLogo();
v.clickOnCompanyLogo();
String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",5,0);
v.verifyProductUrl(s);
	}
}
