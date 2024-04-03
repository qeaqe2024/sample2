import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Admin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launching chrome driver
		WebDriver web1 = new ChromeDriver();
		
		// Opening url on browser
		web1.get("https://opensource-demo.orangehrmlive.com");
		// full screen
		web1.manage().window().maximize();
		// setting time 
		Thread.sleep(5000);
		
		// Provide username - admin 
		WebElement user = web1.findElement(By.name("username"));
		
		user.sendKeys("Admin");
		
		// Provide password - admin123
		web1.findElement(By.name("password")).sendKeys("admin12");
		
		// click on LogIn 
		web1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		// verification of title of dashboard page
		/*
		String actualTitle = web1.getTitle();
		
		
		if(actualTitle.equals(expTitle)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		*/
		
		// dashboard title capturing
		String act = null;
		try {
			act = web1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(Exception e) {
			act="";
		}
		
		
		
		// closing browser - close or quit
		//web1.quit();
	}

}
