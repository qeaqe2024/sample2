package practiceTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThirdTest {
	
	@BeforeClass
	void open() {
		System.out.println("Opening app....");
	}
	
	@AfterClass
	void close() {
		System.out.println("Clsoing app....");
	}

	@BeforeMethod
	void login() {
		System.out.println("Logged in....");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("Logging out....");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("Searching starts....");
	}
	
	@Test(priority=2)
	void advSearch() {
		System.out.println("Advanced searching starts....");
	}
	
}
