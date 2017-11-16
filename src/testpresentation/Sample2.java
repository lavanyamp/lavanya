package testpresentation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	
		@Test(priority=2)
			public void Prioritytest1()
			{
				Reporter.log("test1",true);
				
			}
		
		@Test(priority=3)
		public void Prioritytest2()
		{
			Reporter.log("test2",true);
			
		}
		
		@Test(priority=1)
		public void Prioritytest3()
		{
			Reporter.log("test3",true);
			
		}


	}


