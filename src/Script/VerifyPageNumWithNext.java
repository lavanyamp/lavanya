package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CraftsvillaHomePage;
import Pom.CraftsvillaProductPage;

public class VerifyPageNumWithNext extends BaseTest{
	@Test
	public void testVerifyPageNumWithNext() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",6,0);
		String u=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",7,0);
	
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.clickSarees();
		v.verifyProductUrl(s);
		JavascriptExecutor e=(JavascriptExecutor)driver;
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
		e.executeScript("window.scrollBy(0,500)");
	}
		CraftsvillaProductPage p=new CraftsvillaProductPage(driver);
		
		p.verifyPage1();
		p.clickNext();
		Thread.sleep(3000);
		p.verifycraftsvillaProductUrl(u);
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
		e.executeScript("window.scrollBy(0,500)");
	}
		p.verifyPage2();
		
		
	}
		
}
