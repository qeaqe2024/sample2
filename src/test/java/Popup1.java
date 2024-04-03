import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		// injecting username:password
		d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	
		d.manage().window().maximize();
		
		// //*[@id="content"]/div/p
		String text = d.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		if(text.contains("Congratulations")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Login unsuccessful");
		}
		
		
		d.quit();

	}

}
