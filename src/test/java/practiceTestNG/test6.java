package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class test6 {
	
	WebDriver d;
	
	@BeforeClass
	void setUp() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		
	}
	
	@Test(dataProvider="dp")
	void logIn(String username, String pwd) {
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(pwd);
		d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		String act_title = "OrangeHRM";
		String exp_title = d.getTitle();
		
		Assert.assertEquals(act_title, exp_title);
	}
	
	@AfterClass
	void tearDown() {
		d.close();
	}
	
	@DataProvider(name="dp")
	String[][] loginData() {
		String[][] data = {
				{"Admin","admin123"},
				{"Admin","admin123"},
				{"Admin","Admin123"},
				{"admin","admin123"}
				
		};
		return data;
	}
	
	

}
