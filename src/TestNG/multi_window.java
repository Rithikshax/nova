package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class multi_window {
	WebDriver driver;

	@BeforeTest
	public void setip()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test1()
	{
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window tittle"+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		 Set<String> allwindowhandles = driver.getWindowHandles();
	
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abz@123");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
	}
}
//WebDriver driver=driver.switchTo().newWindow(WindowType=TAB);
//WebDriver driver=driver.switchTo().newWindow(WindowType=WINDOW);
//date 20/21/22