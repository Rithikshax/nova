package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.demzlogin;

public class demzlo {
	WebDriver driver;
	@BeforeTest
	public void seet()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/login");
	}
	@Test
	public void test()
	{
		demzlogin ob=new demzlogin(driver);
		ob.sendvalues("tegb@123", "yrhb");
		ob.login();
	}
	

}
