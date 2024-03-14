package autotesting;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Rediff_optionsvaluse {
	ChromeDriver driver;
	@Before
	public void url()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(e);
		List<WebElement> y = day.getOptions();
		System.out.println(y.size());
		WebElement f = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select mth=new Select(f);
		List<WebElement> k = mth.getOptions();
		System.out.println(k.size());
		WebElement d = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select yr=new Select(d);
		List<WebElement> u = yr.getOptions();
		System.out.println(u.size());
		
	}

}
