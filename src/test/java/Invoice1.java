import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invoice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/InvoiceUpdates/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Vinay");
		driver.findElement(By.id("number")).sendKeys("123");
		driver.findElement(By.id("newUser")).click();
		//driver.findElement(By.cssSelector("option[value= 'utility invoice']")).sendKeys("Utility Invoice");
		driver.findElement(By.name("amount")).sendKeys("1000");
		driver.findElement(By.name("phone")).sendKeys("9701016290");
		driver.findElement(By.name("comments")).sendKeys("New User Invoice");

	}

}
