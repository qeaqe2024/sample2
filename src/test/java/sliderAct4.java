import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderAct4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	
		d.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// min price, max price
		WebElement min_slider = d.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		WebElement max_slider = d.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		
		
		
		System.out.println("Current location of min slider: "+ min_slider.getLocation());
		System.out.println("Current location of max slider: "+ max_slider.getLocation());
		
		Actions a = new Actions(d);
		a.dragAndDropBy(min_slider, 100, 125).perform();
		System.out.println("New location of min slider: "+ min_slider.getLocation());
		
		
		a.dragAndDropBy(max_slider, -100, 125).perform();
		System.out.println("New location of max slider: "+ max_slider.getLocation());
		
		

	}

}
