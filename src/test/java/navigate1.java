import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		// /html/body/div[2]/div[1]/div[2]/form/table/tbody/tr[5]/td[2]/select/option[1]
		
		///html/body/div[2]/div[1]/div[2]/form/table/tbody/tr[5]/td[2]/select/option[3]
		
		////*[@id="selectcity"]/option[3]
		
		// /html/body/form/div[6]/input[2]/
		
		driver.quit();
		
		
	}

}
