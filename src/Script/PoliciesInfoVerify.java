package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CraftsvillaHomePage;

public class PoliciesInfoVerify extends BaseTest{
	@Test
	public void testPoliciesInfoVerify() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",8,0);
	
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.clickPoliciesInfo();
		v.getLinksTextUnderPoliciesInfo();
		v.clickTermsConditions();
		v.verifyProductUrl(s);

}
}
