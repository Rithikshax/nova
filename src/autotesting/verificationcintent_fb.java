package autotesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class verificationcintent_fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String ao=driver.getPageSource();
		if(ao.contains("create new accound"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
