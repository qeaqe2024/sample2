import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\2318829\\eclipse-workspace\\seleniumkv\\src\\test\\java\\ExcelData\\MiniProjectData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell value = row.getCell(0);
		
		String data = value.toString();
		
		System.out.println(data);
		
		System.out.println(System.getProperty("user.dir"));
		
	
	}

}
