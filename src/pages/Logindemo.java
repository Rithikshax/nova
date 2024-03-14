package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logindemo {
	WebDriver driver;
	By name=By.id("name");
	By cmpy=By.name("company");
	By email=By.xpath("//*[@id=\"email\"]");
	By password=By.name("password");
	By cnmfpas=By.xpath("//*[@id=\"password-confirm\"]");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Logindemo(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String nam,String camp,String abc,String rrr,String rrru)
	{
		driver.findElement(name).sendKeys(nam);
		driver.findElement(cmpy).sendKeys(camp);
		driver.findElement(email).sendKeys(abc);
		driver.findElement(password).sendKeys(rrr);
		driver.findElement(cnmfpas).sendKeys(rrru);
	}
	public void reg()
	{
		driver.findElement(register).click();
	}

}
