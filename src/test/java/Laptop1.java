import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Laptop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webapps.tekstac.com/LaptopDetails/");
		System.out.println(driver.getCurrentUrl());
		
		String link = driver.findElement(By.className("dropdown-item")).getAttribute("href");
		System.out.println(link);
		driver.navigate().to(link);
		System.out.println(driver.getCurrentUrl());

	}

}
