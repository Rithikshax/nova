package autotesting;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_locator {
	ChromeDriver driver;
    @Before
    public void url()
    {
    	driver=new ChromeDriver();
    	driver.get("http://facebook.com");   	
    }
    @Test
    public void test() {
    	
    	driver.findElement(By.id("email")).sendKeys("abc@123");
    	driver.findElement(By.id("pass")).sendKeys("123ee");
    	driver.findElement(By.name("login")).click();
    }
}
