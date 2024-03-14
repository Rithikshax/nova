package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblagin {
	WebDriver driver;
	@FindBy(id="email")
	WebElement Fbemail;
	@FindBy(id="pass")
	WebElement Fbpassword;
	@FindBy(name="login")
	WebElement Fblogin;
	
	public Fblagin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String email,String password)
	{
		Fbemail.sendKeys(email);
		Fbpassword.sendKeys(password);
	}
	public void login()
	{
		Fblogin.click();
	}

}
