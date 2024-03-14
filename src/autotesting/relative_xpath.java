package autotesting;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class relative_xpath {
	ChromeDriver driver;
	@Before
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vfff");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("hjv");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
		
	}
}
