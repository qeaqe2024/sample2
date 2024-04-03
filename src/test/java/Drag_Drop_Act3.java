import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_Drop_Act3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/drag_drop.html");
	
		d.manage().window().maximize();

	}

}
