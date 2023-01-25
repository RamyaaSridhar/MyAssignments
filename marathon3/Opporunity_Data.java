package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Opporunity_Data {

	public static String[][] oppor() throws IOException {
		
		
		XSSFWorkbook wb = new XSSFWorkbook("./input-from-excel/input.xlsx");
		
		XSSFSheet sheet = wb.getSheet("Sheet3");
		int row = sheet.getLastRowNum();
		short col = sheet.getRow(1).getLastCellNum();
		
		String [] [] name_amount = new String [row][col];
		
		for (int i = 1; i<=row; i++) {
			for (int j = 0; j <col; j++) {
				
				String name = sheet.getRow(i).getCell(j).getStringCellValue();
				name_amount[i-1][j]=name;
				
			}
			
		}
		
		return name_amount;
		
	}

}
