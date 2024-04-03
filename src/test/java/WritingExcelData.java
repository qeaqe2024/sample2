import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// C:\Users\2318829\eclipse-workspace\seleniumkv\src\test\java\ExcelData\writing_data1.xlsx
		FileOutputStream file = new FileOutputStream("C:\\Users\\2318829\\eclipse-workspace\\seleniumkv\\src\\test\\java\\ExcelData\\data1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet();
		
		sheet.createRow(1).createCell(0).setCellValue("Vinay");
		sheet.createRow(2).createCell(0).setCellValue("Nikhila");
		sheet.createRow(3).createCell(0).setCellValue("Atchutha");
		sheet.createRow(4).createCell(0).setCellValue("Karthikeya");
		sheet.createRow(5).createCell(0).setCellValue("Venkat");
	
		workbook.write(file);
		workbook.close();
		file.close();
		
		
		System.out.println("Writing is done........");
		

	}

}
