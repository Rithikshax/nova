package autotesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit_pgm {
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void titltverification()
	{
		String title=driver.getTitle();
		//System.out.println("title");
		String expectedresult="google";
		if(title.equals(expectedresult))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	@Test
	public void cnt() 
	{
	 String st=driver.getPageSource();
	 if(st.contains("Gmail"))
{
	System.out.println("pass");	 
}
	 else
	 {
		 System.out.println("fail");
	 }
	}
	@After
	public void close()
	{
		driver.close();
	}

}
