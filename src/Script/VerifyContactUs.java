package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CraftsvillaContactUsPage;

@Listeners(Generic.itest.class)
public class VerifyContactUs extends BaseTest {
@Test
public void TestVerifyContactUs() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",1,0);
	CraftsvillaContactUsPage p=new CraftsvillaContactUsPage(driver);
	p.clickcontactus();
	p.verifyContactUrl(s);
	p.clickCancellations();
	Thread.sleep(3000);
	p.verifyCancelLinks();
	


	
}
}
	
	

	

