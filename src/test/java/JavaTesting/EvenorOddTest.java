package JavaTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EvenorOddTest {

	@Test
	public void testEven(){
		int num = 2;
		EvenorOdd test = new EvenorOdd();
		System.out.println("test");
		Assert.assertEquals (test.evenorOdd(num), num + " Is Even", "Checking even number");
		
	}
	@Test
	public void testOdd(){
		int num = 1;
		EvenorOdd test = new EvenorOdd();
		System.out.println("test");
		Assert.assertEquals (test.evenorOdd(num), num + " Is odd", "Checking odd number");
		
	}
	/*@Test
	public void testzero(){
		int num = 0;
		EvenorOdd test = new EvenorOdd();
		System.out.println("test");
		Assert.assertEquals("Checking even number", num + " Is neither even nor odd", test.evenorOdd(num));
		
	}*/
}
