package Script;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Ecxeldata;
import Pom.CraftsvillaHomePage;
import Pom.CraftsvillaProductPage;
import Pom.ProductPage;
@Listeners(Generic.itest.class)
public class CompareQuickProduct extends BaseTest{
	/*@DataProvider(name="getData")
	public Object[][] dataFetch() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj=new Object[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				obj[i][j]=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",i,j);
			}
		}
		return obj;
	}*/
	@Test(dataProvider="getData")
	public void testCompareQuickProduct(/*value should be passed*/) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String s=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",9,0);
		String u=Ecxeldata.retrievedata(PATH,"crsftsvillaModule",13,0);
		CraftsvillaHomePage v=new CraftsvillaHomePage(driver);
		
		v.selectOneProduct();
		CraftsvillaProductPage p=new CraftsvillaProductPage(driver);
		p.verifyProductUrl(s);
		p.ClickOnProductToPurchase();
		p.verifyProductUrl(u);
		ProductPage d=new ProductPage(driver);
		d.getSoldByCredentials();
		d.getDetailsCredentials();
		d.getPriceCredentials();
		Thread.sleep(3000);
		driver.navigate().back();
		p.verifyProductUrl(s);
		Thread.sleep(3000);
		p.clickQuickView();
		Thread.sleep(3000);
		d.compareQuickSoldBy();
		d.compareQuickDetails();
		d.compareWithQuick();
		
	}
}
