package autotesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_content {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		 String st=driver.getPageSource();
		 if(st.contains("Gmail"))
		 {
			 System.out.println("pass");
			 
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 driver.close();

	}

}
