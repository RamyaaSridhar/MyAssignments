package marathon3;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class QuestionAsk {

	public static String[][] questionaskTC() throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook("./input-from-excel/input.xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		int rowSize = sheet.getLastRowNum();
		short col = sheet.getRow(1).getLastCellNum();
		String [] [] input = new String [rowSize] [col];
		
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=0;j<col;j++) {
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				input[i-1][j]=data;
			}
		}
		
		wb.close();
		return input;

	}

}
