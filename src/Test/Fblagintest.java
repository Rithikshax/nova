package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Fblagin;

public class Fblagintest {
	WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url ()
	{
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void test()
	{
		Fblagin ob= new Fblagin(driver);
		ob.setvalues("abc@12", "jhwh");
		ob.login();
	}
	

}
