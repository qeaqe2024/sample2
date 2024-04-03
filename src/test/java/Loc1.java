import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver web1 = new ChromeDriver();
		
		//
		web1.get("http://www.automationpractice.pl/index.php");
		web1.manage().window().maximize();
		
		// finding no of sliders
		List<WebElement> sliders = web1.findElements(By.className("homeslider-container"));
		System.out.println("No of pics in sliders = " + sliders.size());
		
		// total no of images in homepage
		List<WebElement> img = web1.findElements(By.tagName("img"));
		System.out.println("Images in homepage = " + img.size());
		
		
		// total no of links in homepage
		List<WebElement> links = web1.findElements(By.tagName("a"));
		System.out.println("Total no of links in homepage = " + links.size());

		//
		web1.quit();
	}

}
