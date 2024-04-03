package mainnProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class coursera {
	
	
	public static void step1(WebDriver d) throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) d;
				
		d.get("https://www.coursera.org/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		
		try {
			// closing add
			d.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div[1]/div/div[2]/div[3]/a")).click();
		}
		catch(Exception e) {
			
		}
		

		// input for search bar
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		d.findElement(By.xpath("//*[@class='react-autosuggest__input']")).sendKeys("web development courses");
		
		// search button
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement sb = d.findElement(By.xpath("//*[@class=\"nostyle search-button\"]"));
		String ss = sb.getAttribute("aria-label");
		js.executeScript("arguments[0].click();",sb);
		
		
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		// clicking on english language
		WebElement eng = d.findElement(By.xpath("//*[@data-testid=\"search-filter-group-Language\"]//*[@data-testid=\"English-false\"]"));
//		js.executeScript("arguments[0].scrollIntoView();",eng);
//		Thread.sleep(4000);
		eng.click();
		System.out.println("-----English clicked-----");
		System.out.println("");
		
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		// clicking on beginner level
		WebElement bb = d.findElement(By.xpath("//*[@data-testid=\"search-filter-group-Level\"]//*[@data-testid=\"Beginner-false\"]"));
		bb.click();
		System.out.println("-----Beginner clicked-----");
		System.out.println("");
		
		
		// //ul[@class="cds-9 css-5t8l4v cds-10"]
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		// clicking on beginner level
		List<WebElement> cl = d.findElements(By.xpath("//h3[@class=\"cds-CommonCard-title css-6ecy9b\"]"));
		int i=0;
		for(WebElement cle : cl) {
			if(i<2) {
				System.out.println("Course - "+(i+1)+" = "+cle.getText());
				i++;
			}
		}
		
		
		System.out.println("-----Elements names fetched-----");
		System.out.println("");
		
		// Top Web Development Courses Courses - Learn Web Development Courses Online
		System.out.println("----- Parent Window = "+d.getTitle()+"-----");
		System.out.println("");
	
		
		System.out.println("-----Switching starts-----");
		System.out.println("");
		
		int c = 0;
		for(WebElement cle : cl) {
			if(c<2) {
				
				
				WebElement course = cl.get(c);
				js.executeScript("arguments[0].click();",course);
				
				Thread.sleep(10000);
				Set <String> Win = d.getWindowHandles();
			    List <String> Win1 = new ArrayList<String>(Win);
				
			    d.switchTo().window(Win1.get(1));
			    System.out.println("----- Swiched window = "+d.getTitle()+"-----");
				System.out.println("");
				
				String ct = d.findElement(By.xpath("//h1[@data-e2e=\"hero-title\"]")).getText();
				System.out.println("-----"+ct+"-----");
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
				//*[@id="rendered-content"]/div/main/section[2]/div/div/div[1]/div[2]/section/div[2]/div[1]/div[1]
				//*[@id="rendered-content"]/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]
				WebElement cr;
				try {
					cr = d.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[1]/div[1]"));
				}
				
				catch(Exception e) {
					cr = d.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/main/section[2]/div/div/div[2]/section/div/div[1]/div/div/div[1]"));
				}
				
				js.executeScript("arguments[0].scrollIntoView();",cr);
				String c_rating = cr.getText();
				System.out.println("------"+"Rating= "+c_rating+"------");
				System.out.println("");
				
				
				WebElement tr = d.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/main/section[2]/div/div/div[2]/div/div/section/div[2]/div[3]/div[1]"));
				js.executeScript("arguments[0].scrollIntoView();",tr);
				String c_time = tr.getText();
				System.out.println("------"+"Time required= "+c_time+"------");
				System.out.println("");
				
				d.close();
				System.out.println("");
				d.switchTo().window(Win1.get(0));
				System.out.println("----- Swiched back to = "+d.getTitle()+"-----");
				System.out.println("");
				
				System.out.println("------------------------------------");
				System.out.println("");
				
				c++;
			}
		}
	}
	
	
	
	public static void step2(WebDriver d) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement showMore = d.findElement(By.xpath("//*[@id=\"search-results-header-wrapper\"]/div/div/div/div[2]/div[2]/button/span"));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		js.executeScript("arguments[0].click();",showMore);
		List<WebElement> lang_list = d.findElements(By.xpath("/html/body/div[7]/div[3]/div/div/div[2]/div[2]/div[2]/div"));
		System.out.println("-----Languages List-----");
		int i=1;
		for(WebElement ll : lang_list) {
			System.out.println("Language - "+i+" = "+ll.getText());
			i++;
		}
		System.out.println("");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver d = new ChromeDriver();
		
		// step - 1
		
		step1(d);
		
		// step - 2
		step2(d);
		
		
		
		System.out.println("--------Ended-------");
		
		

	}

}
