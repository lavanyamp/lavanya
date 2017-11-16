package Generic;

import java.io.File;

import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public abstract class BaseTest implements Autoconst {
	public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentTest test;
	@BeforeSuite
public void report()
{
	extent=new ExtentReports("./test-output/extentreport.html",true);
	extent.addSystemInfo("HostName","lavanya").addSystemInfo("environment","Tyss").addSystemInfo("UserName","lavanya");
	extent.loadConfig(new File("./extent-config.xml"));
}
	
		
		@BeforeMethod
		@Parameters("browser")
		public void openapp(String browser)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
			System.setProperty(chrome_key,chrome_value);
		    driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty(gecko_key,gecko_value);
			    driver=new FirefoxDriver();
			}
			
			driver.get("http://www.craftsvilla.com");
			driver.manage().window().maximize();
		}
		@AfterMethod
		public void closeapp() throws InterruptedException
		{
	Thread.sleep(9000);		
	driver.quit();	
		}
		@AfterSuite
		public void reportclose()
		{
			extent.flush();
		}
	}


