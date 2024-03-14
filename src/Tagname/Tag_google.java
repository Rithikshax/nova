package Tagname;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tag_google {
	ChromeDriver driver;
	@Before
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
	   List<WebElement> lst = driver.findElements(By.tagName("a"));
	   System.out.println(lst.size());
	
	
	for(WebElement s:lst)
	{
		String link=s.getAttribute("href");
		String text=s.getText();
		System.out.println(link+"---"+text);
	}
	}

}
