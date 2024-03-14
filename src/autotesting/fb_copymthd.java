package autotesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_copymthd {
	ChromeDriver driver;
	@Before
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("arjunvazha");
	}

}
