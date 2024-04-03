package mainnProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class oneCog {

	public static void main(String[] args) {
		
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		d.get("https://onecognizant.cognizant.com/Home");
		
		d.findElement(By.xpath("//*[@class='searchTopBar']")).click();
		
		d.findElement(By.xpath("//*[@id='oneCSearchTop']")).sendKeys("timesheet");
		
		d.findElement(By.xpath("//*[@id='newSearchQALST']//div[contains(text(),'Submit Timesheet')]")).click();
		
		
		
		
	}
	
	
}
