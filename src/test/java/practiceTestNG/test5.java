package practiceTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class test5 {

	@Test(priority=1)
	void softAssert() {
		
		System.out.println("Testing with Soft Assertion....");
		System.out.println("Testing....");
		System.out.println("Testing....");
		System.out.println("Testing....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);	// false assertion
		
		System.out.println("Still Testing without any break even after false assertion....\n");
		
	}
	
	@Test(priority=2)
	void hardAssert() {
		System.out.println("Testing with Hard Assertion....");
		System.out.println("Testing....");
		System.out.println("Testing....");
		System.out.println("If this method fails after condition....");
		System.out.println("Then further lines won't be executed....\n");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("Still Testing without any break even after false assertion....\n");
	}
	
	
}
