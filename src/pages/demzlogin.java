package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class demzlogin {
   WebDriver driver;
   By email=By.xpath("//*[@id=\"email\"]");
   By password=By.xpath("//*[@id=\"password\"]");
   By login=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
   
   public demzlogin(WebDriver driver)
   {
	   this.driver=driver;
   }
   public void sendvalues(String uuuu,String yyy)
   {
	   driver.findElement(email).sendKeys(uuuu);
	   driver.findElement(password).sendKeys(yyy);
   }
   public void login() {
	   driver.findElement(login).click();
   }
}

