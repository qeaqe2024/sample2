import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopify1 {
	
	static String fname;
	static WebDriver web ;
	
	public static WebDriver getDriver() {
		web = new ChromeDriver();
		web.get("http://webapps.tekstac.com/Shopify/");
		return web;
		
	}
	
	public static String getName() {
		String op = web.findElement(By.name("fname")).getAttribute("placeholder");
		web.findElement(By.id(""));
		return op;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver test = getDriver();
		test.manage().window().maximize();
		String f = getName();
		System.out.println(f);
		

	}

}
