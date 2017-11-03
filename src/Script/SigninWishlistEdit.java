package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.AccountSettingsPage;
import Pom.CraftsvillaHomePage;
import Pom.SigninPage;

public class SigninWishlistEdit extends BaseTest{
	@Test
	public void testAutoSuggestionsInSearch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",5,0);
		String k=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",10,0);
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.clickWishList();
		SigninPage p=new SigninPage(driver);
		p.setEmailId("push14pa@gmail.com");
		p.clickContinuBtn();
		p.setPassword("xkqv4F");
		p.clickLoginBtn();
		Thread.sleep(3000);
		v.verifyProductUrl(s);
		String name = v.verifyAccount();
		Reporter.log(name,true);
		v.mouseOverAccount();
		v.clickAccountSettings();
		AccountSettingsPage acc=new AccountSettingsPage(driver);
		acc.verifyUrl(k);
		Thread.sleep(3000);
		acc.clickEdit();
		acc.clickCancel();
	
		}

}
