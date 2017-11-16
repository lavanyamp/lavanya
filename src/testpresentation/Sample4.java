package testpresentation;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4 {
	@Test(dependsOnMethods="method2",alwaysRun=true)
	public void method1()
	{
		Reporter.log("method1 is executing only after method2",true);
		
	}
	@Test()
	public void method2()
	{
		//Assert.fail();
		Reporter.log("method2 executed",true);
		
	}
}
