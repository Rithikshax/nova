package autotesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title_verificatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actualtitle=driver.getTitle();
		String expectedtitle="google123";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
