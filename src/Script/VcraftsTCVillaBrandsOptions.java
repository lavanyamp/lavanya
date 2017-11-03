package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Pom.CraftsvillaHomePage;

public class VcraftsTCVillaBrandsOptions extends BaseTest {	
	@Test
	public void testCraftsTCVillaBrandsOptions() throws InterruptedException
	{
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
	v.verifyCraftsvillaBrandMouseOver();
	Thread.sleep(3000);
	v.verifyCraftsBrandsMouseOverOptions1();
	v.verifyCraftsBrandsMouseOverOptions2();
	v.verifyCraftsBrandsMouseOverOptions3();

}
}
