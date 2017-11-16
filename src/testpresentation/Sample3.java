package testpresentation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	@Test(groups={"regression"})
	public void test1()
	{
		Reporter.log("regression group",true);
		
	}
	@Test(groups={"regression"})
	public void test2()
	{
		Reporter.log("regression group",true);
		
	}
	@Test(groups={"smoke"})
	public void test3()
	{
		Reporter.log("smoke group",true);
		
	}
	@Test(groups={"smoke"})
	public void test4()
	{
		Reporter.log("smoke group",true);
		
	}
}
