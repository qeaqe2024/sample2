import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://demo.opencart.com/");
	
		d.manage().window().maximize();
		
		// capturing
		WebElement des = d.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
		WebElement mac = d.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		
		Actions a = new Actions(d);
		
		// mouse hover
		a.moveToElement(des).moveToElement(mac).click().perform();

	}

}
