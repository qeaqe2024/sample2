import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		// https://www.opencart.com/index.php?route=account/register
		WebDriver d = new ChromeDriver();
		
		d.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement ele = d.findElement(By.id("country-list"));
		
		Select drop = new Select(ele);
		
		//drop.selectByVisibleText("India");
		drop.selectByValue("3");
		
		List<WebElement> l = drop.getOptions();
		System.out.println(l.size());
		
		for(WebElement w : l) {
			System.out.println(w.getText());
		}
		
	}

}
