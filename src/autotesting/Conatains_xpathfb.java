package autotesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conatains_xpathfb {
	ChromeDriver driver;
	@Before
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
	}
	
}
