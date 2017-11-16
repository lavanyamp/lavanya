package testpresentation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test(invocationCount=2)
		public void display()
		{
			Reporter.log("JAVA",true);
			
		}

}

