package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CraftsvillaHomePage;
import Pom.SigninPage;

public class VerifyErrorSignIn extends BaseTest{
	@Test
	public void testVerifyErrorSignIn() throws InterruptedException
	{
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.verifySignIn();
		v.clickSignIn();
		SigninPage p=new SigninPage(driver);
		p.setEmailId("la");
		p.clickContinuBtn();
		Thread.sleep(3000);
		p.verifyErrorInEmailId();
	}

}
