import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverFinder;


public class snapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Initiating and declaring driver
		WebDriver driver = new ChromeDriver();
		
		//	Giving URL
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		// search box - id -> inputValEnter
		driver.findElement(By.id("inputValEnter")).sendKeys("Bluetooth headphone");
		
		// search icon - class -> searchTextSpan
		driver.findElement(By.className("searchTextSpan")).click();
		
		
		
		
		// sort by - click on dropdown
		// after visibility of all elements in dropdown, append to list

		driver.findElement(By.className("sort-selected")).click();
		List<WebElement> sort_list = driver.findElements(By.className("search-li"));
		
		
		for(WebElement sort_element : sort_list) {
			//System.out.println(ww.getText());
			//System.out.println(ww.getAttribute("class"));
			// if any element in list equals to Popularity
			if(sort_element.getText().equals("Popularity"))
			{
				sort_element.click();
				
			}
		}
		
		// price range
		// first clear existing values
		// then give required values
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("700");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1400");
		// then click go button
		driver.findElement(By.cssSelector("div[class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		
		// waiting for sometime for browser loading
		Thread.sleep(5000);
		
		// after sorting & waiting, appending all elements to names using common classname -> product-title
		List<WebElement> names = driver.findElements(By.className("product-title"));
		
		// printing first 5 elements title
		int i = 0;
		for(WebElement name : names) {
			if(i<5) {
				System.out.println(name.getAttribute("title"));
				i++;
			}
		}
		
		
		// waiting for sometime for browser loading
		Thread.sleep(5000);
		
		// after sorting & waiting, appending all elements to prices using common classname and id 
		// used both because classname is space separated
		// for finding all common elements, this is common relation between them
		List<WebElement> prices = driver.findElements(By.cssSelector(".product-price[id*='display-price']"));
		
		// printing first 5 elements price
		int j = 0;
		for(WebElement price : prices) {
			if(j<5) {
				System.out.println(price.getText());
				j++;
			}
		}
		
	}

}


