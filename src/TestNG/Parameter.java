package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters("a")
	@Test
	public void setup(String v)
	{
		System.out.println("the value:"+v);
	}

}
