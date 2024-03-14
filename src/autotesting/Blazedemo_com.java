package autotesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo_com {
	ChromeDriver driver;
	@Before
	public void url()
		{
		driver=new ChromeDriver();
		driver.get("http://blazedemo.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("name")).sendKeys("anv");
		driver.findElement(By.id("company")).sendKeys("hvshgs");
		driver.findElement(By.id("email")).sendKeys("gsxhgu");
		driver.findElement(By.id("password")).sendKeys("add");
		driver.findElement(By.id("password")).sendKeys("add");
		driver.findElement(By.className("btn btn-primary")).click();
		driver.quit();
		
	}

}
