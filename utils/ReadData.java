package utils;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.BaseClass;

public class ReadData {


	public static String[][] readData(String excelworkbook) throws IOException {
    XSSFWorkbook workbook = new XSSFWorkbook("./data/"+excelworkbook+".xlsx");
    XSSFSheet wsheet = workbook.getSheetAt(0);
    int totalrow = wsheet.getLastRowNum();
    int totalcoloumn = wsheet.getRow(0).getLastCellNum();
    String[][] data = new String[totalrow][totalcoloumn];
    for (int i = 1; i <= totalrow; i++) {
		XSSFRow row = wsheet.getRow(i);
		for (int j = 0; j < totalcoloumn; j++) {
			String stringcellvalue = row.getCell(j).getStringCellValue();
			data[i-1][j] = stringcellvalue;
		}
	}
    workbook.close();
    return data;
	}
}
