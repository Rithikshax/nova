package autotesting;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_xpath {
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
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("gvhg");
	}
	

}
