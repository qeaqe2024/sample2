package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Listener1 {
	
	@Test(priority=1)
	void fun1() {
		Assert.assertEquals(1, 1);
	}
	
	@Test(priority=2)
	void fun2() {
		Assert.assertEquals(1, 2);
	}
	
	@Test(priority=3, dependsOnMethods= {"fun2"})
	void fun3() {
		Assert.assertEquals(10, 10);
	}

}
