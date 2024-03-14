package autotesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class juniti_basic {
     @Before
     public void openurl()
     {
    	 System.out.println("open url");
     }
     @Test
     public void test() 
     {
    	System.out.println("testing code"); 
     }
     @After
     public void closeurl()
     {
    	System.out.println("url close"); 
     }
}
