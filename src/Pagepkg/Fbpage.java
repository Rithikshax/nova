package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbpage {
	WebDriver driver;
	By fbemail=By.xpath("//*[@id=\"email\"]");
	By fbpassword=By.xpath("//*[@id=\"pass\"]");
	By fblogin=By.name("login");
	
	public Fbpage(WebDriver driver)
		{
		this.driver=driver;	
		}
	public void setvalues(String email,String password)
	{
		driver.findElement(fbemail).clear();
		driver.findElement(fbemail).sendKeys(email);
		driver.findElement(fbpassword).clear();
		driver.findElement(fbpassword).sendKeys(password);
	}
	public void click()
	{
		driver.findElement(fblogin).click();
	}
	

}
