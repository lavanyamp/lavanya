package Script;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CraftsvillaHomePage;
import Pom.SigninPage;
@Listeners(Generic.itest.class)
public class VerifySignIn extends BaseTest{
	@Test
	public void testVerifySignIn ()
	{
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		v.verifySignIn();
		v.clickSignIn();
		SigninPage p=new SigninPage(driver);
		String actual = p.verifyTextSignInTitle();
		Reporter.log(actual);
		if(actual.contains("Login"))
		{
			Reporter.log("SignIn Page is displayed");
		}else{
			Reporter.log("SignIn Page is not displayed");
		}
		
		
	}

}
