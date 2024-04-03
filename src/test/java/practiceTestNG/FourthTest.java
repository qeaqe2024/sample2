package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;



public class FourthTest {
	@Test
	void open() {
		Assert.assertTrue(true);
		System.out.println("Opening app....");
	}

	@Test(priority=1, dependsOnMethods= {"open"})
	void login() {
		Assert.assertTrue(true);
		System.out.println("Logged in....");
	}
	
	@Test(priority=2, dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);
		System.out.println("Searching starts....");
	}
	
	@Test(priority=3, dependsOnMethods= {"login","search"})
	void advSearch() {
		System.out.println("Advanced searching starts....");
	}
	
	@Test(priority=4, dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
		System.out.println("Logging out....");
	}
	
	@Test(priority=5, dependsOnMethods= {"open"})
	void close() {
		System.out.println("Closing app....");
	}
	
}
