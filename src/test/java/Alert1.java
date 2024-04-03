import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		d.manage().window().maximize();
		
		
		/*
		
		// alert window -> ok & cancel without input
		
		//  //*[@id="content"]/div/ul/li[1]/button
		d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		
		Alert a = d.switchTo().alert();
		
		System.out.println(a.getText());
		//a.accept();
		a.dismiss();
		
		*/
		
		// alert window -> ok & cancel with input
		d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert a = d.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("This is Vinay");
		a.accept();
		
		// validation -> You entered:
		String exp_text = d.findElement(By.id("result")).getText();
		String act_text = "You entered:" + " This is Vinay";
		
		if(exp_text.equals(act_text)) {
			System.out.println("validation successful");
		}
		else {
			System.out.println("validation unsuccessful");
		}
		
		d.quit();
	}

}
