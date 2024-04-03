import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class win1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new TreeSet<String>();
		
		
		
		WebDriver d = new ChromeDriver();
		d.get("https://webapps.tekstac.com/MultipleWindow/");
		String pw = d.getWindowHandle();
		String cw = null;

		d.findElement(By.xpath("/html/body/p/a")).click();
		s = d.getWindowHandles();
		for(String ss : s) {
			String t = d.switchTo().window(ss).getTitle();
			if(t.equals("EMI Calculator")) {
				cw = ss;
			}
		}
		
		System.out.println(pw);
		System.out.println(cw);
		d.quit();

	}

}
