import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopDetails {
	
	static WebDriver driver;
	static WebElement element;
	
	public static WebDriver getDriver() {
		driver = new ChromeDriver();
		driver.get("https://webapps.tekstac.com/LaptopDetails/addProduct.html");
		return driver;
	}
	
	public static void addDetails(String prodId, String prodName, String prodDesc, String prodModel , String price) {
		driver.findElement(By.id("productId")).sendKeys(prodId);
		driver.findElement(By.id("productName")).sendKeys(prodName);
		driver.findElement(By.id("productDesc")).sendKeys(prodDesc);
		driver.findElement(By.id("productModel")).sendKeys(prodModel);
		driver.findElement(By.id("productPrice")).sendKeys(price);
		driver.findElement(By.id("productBtn")).click();
	}
	
	public static String getName() {
		String name = driver.findElement(By.className("card-title")).getText();
		return name;
	}

	
	public static String getid() {
		String id = driver.findElement(By.xpath("//*[@id=\"dataRow\"]/div/div/div/div[2]/a")).getText();
		return id;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver web1 = getDriver();
		addDetails("102","HP","HP OMEN", "HP OMEN" , "50000");
		Thread.sleep(5000);
		web1.manage().window().maximize();
		String n = getName();
		String i = getid();
		
		System.out.println(n);
		System.out.println(i);
		
		
		
		
		

	}

}
