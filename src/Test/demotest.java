package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Logindemo;

public class demotest {
	WebDriver driver;
	@BeforeTest
     public void set()
     {
		driver=new ChromeDriver();
     }
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		Logindemo ob=new Logindemo(driver);
		ob.setvalues("abd", "bdb", "null", "jjj", "uuu");
		ob.reg();
	}
	

}
