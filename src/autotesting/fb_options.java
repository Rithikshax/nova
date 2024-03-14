package autotesting;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb_options {
	ChromeDriver driver;
	@Before
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select e=new Select(day);
		List<WebElement> t = e.getOptions();
		System.out.println(t.size());
		WebElement mth = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select h=new Select(mth);
		List<WebElement> u = h.getOptions();
		System.out.println(u.size());
		WebElement yr = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select o=new Select(yr);
		List<WebElement> k = o.getOptions();
		System.out.println(k.size());
				
	}
	@After
	public void close()
	{
		driver.close();
	}


}
