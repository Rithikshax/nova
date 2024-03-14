package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Fbpage;
import utilities.Excelutility;

public class Fbtest extends Baseclass {
	@Test
	public void verificationwithvalidcred()
	{
		Fbpage p1=new Fbpage(driver);
		String x1="C:\\Users\\riswa\\Downloads\\book12.xlsx\\";
		String sheet="sheet1";
		int rowcount=Excelutility.getrowcount(x1, sheet);
		for(int i =1;i<=rowcount;i++)
		{
			String username=Excelutility.getcellvalues(x1, sheet, i, 0);
			System.out.println("username----"+username);
			String password=Excelutility.getcellvalues(x1, sheet, i, 1);
			System.out.println("password----"+password);
			p1.setvalues(username, password);
			p1.click();
		}
	}
	

}
