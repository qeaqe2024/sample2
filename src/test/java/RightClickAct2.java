import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAct2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
		d.manage().window().maximize();
		
		// /html/body/div/section/div/div/div/p/span
		WebElement button = d.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		
		// Right click action
		Actions a = new Actions(d);
		
		a.contextClick(button).perform();
		
		// click on copy option
		d.findElement(By.xpath("/html/body/ul/li[3]")).click();
		Thread.sleep(2000);
		
		// accepting alert box
		d.switchTo().alert().accept();
		
		// switching back to webpage
		d.switchTo().defaultContent();
		

	}

}
