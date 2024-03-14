package autotesting;

import org.openqa.selenium.chrome.ChromeDriver;


public class google_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);

	}

}
