package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(practiceTestNG.ListenerMain2.class)
public class Listener2 {

WebDriver d;
	
	@BeforeClass
	void setUp() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		
	}
	
	@Test
	void logIn() {
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String act_title = "OrangeHRM";
		String exp_title = d.getTitle();
		
		Assert.assertEquals(act_title, exp_title);
	}
	
	@Test(dependsOnMethods= {"logIn"})
	void logOut() {
		d.findElement(By.className("oxd-userdropdown-name")).click();
		d.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
	}
	
	@Test(priority=1,dependsOnMethods= {"logOut"})
	void fun1() {
		Assert.assertEquals(1, 1);
	}
	
	@Test(priority=2, dependsOnMethods= {"fun1"})
	void fun2() {
		Assert.assertEquals(1, 2);
	}
	
	@Test(priority=3, dependsOnMethods= {"fun2"})
	void fun3() {
		Assert.assertEquals(10, 10);
	}
	
	@AfterClass
	void tearDown() {
		d.close();
	}
	
//	@DataProvider(name="dp")
//	String[][] loginData() {
//		String[][] data = {
//				{"admin","admin123"},
//				{"Admin","Admin123"},
//				{"Admin","admin123"}
//				
//		};
//		return data;
	//}
}
