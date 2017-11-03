package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst {

	
		public static WebDriver driver;
		@BeforeMethod
		public void openapp()
		{
			System.setProperty(chrome_key,chrome_value);
		    driver=new ChromeDriver();
			driver.get("http://www.craftsvilla.com");
			driver.manage().window().maximize();
		}
		@AfterMethod
		public void closeapp() throws InterruptedException
		{
	Thread.sleep(9000);		
	driver.quit();	
		}
	}


