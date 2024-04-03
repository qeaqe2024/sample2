package mainnProject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class beCog {
	
	public static WebDriver createDriver() {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://cognizantonline.sharepoint.com/sites/Be.Cognizant/SitePages/Home.aspx");
		return d;
	}
	
	public static void beCogUserClick(WebDriver d) throws InterruptedException {
		WebElement ele = d.findElement(By.xpath("//*[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']"));
//		Thread.sleep(4000);
//		Actions a = new Actions(d);
//		a.moveToElement(ele).click().perform();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollIntoView();",ele);
		Thread.sleep(4000);
		ele.click();
		
		System.out.println(d.findElement(By.xpath("//*[@class='_8ZYZKvxC8bvw1xgQGSkvvA==']")).getAttribute("class"));
	}
	
	public static String beCogUserName(WebDriver d) {
		////*[@class="mectrl_name mectrl_truncate"]
		String name = d.findElement(By.xpath("//*[@id='mectrl_currentAccount_primary']")).getText();
		return name;
	}
	
	public static String beCogUserMail(WebDriver d) {
		// //*[@id="mectrl_currentAccount_secondary"]
		String mailId = d.findElement(By.xpath("//*[@id='mectrl_currentAccount_secondary']")).getText();
		return mailId;
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver d = createDriver();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		beCogUserClick(d);
	
		Thread.sleep(10000);
		String name = beCogUserName(d);
		
		Thread.sleep(4000);
		String mailId = beCogUserMail(d);
		
		System.out.println(name);
		System.out.println(mailId);
		
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\2318829\\eclipse-workspace\\seleniumkv\\src\\test\\java\\mainnProject\\mainnData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet s = wb.createSheet("sheet-1");
		
		XSSFRow r = s.createRow(0);
		
		XSSFCell c1 = r.createCell(0);
		c1.setCellValue(name);
		
		XSSFCell c2 = r.createCell(1);
		c2.setCellValue(mailId);
		
		wb.write(file);
		wb.close();
		file.close();

		
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='mectrl_headerPicture']")).click();
		
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@title='OneCognizant']")).click();
		
		//d.quit();
		
		//System.out.println("done......");
		
		
		String currWin = d.getWindowHandle();
		Set<String> winSet = d.getWindowHandles();
		List<String> winList = new ArrayList(winSet);
		for(String ll : winList) {
			if(!ll.equals(currWin)) {
				Thread.sleep(20000);
				d.switchTo().window(ll);
			}
		}
		
		System.out.println(d.getTitle());
		System.out.println("done......");
		
	}

	
	
	
	
}
