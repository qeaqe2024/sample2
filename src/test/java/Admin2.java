import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver web1 = new ChromeDriver();
		
		web1.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F");
		web1.manage().window().maximize();
		Thread.sleep(5000);
		
		// admin username
		web1.findElement(By.name("Email")).sendKeys("");
		
		// admin password
		web1.findElement(By.name("Password")).sendKeys("admin");	// 
		
		// click
		web1.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
	
		// verification
		String act = null;
		
		try {
			act = web1.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		}
		catch(Exception e) {
			act = "";
		}
		
		if(act.equals("Dashboard")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test failed");
		}
		
		web1.quit();		
	}

}
