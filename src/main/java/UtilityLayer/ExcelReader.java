package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static XSSFWorkbook workbook;
	
	public ExcelReader (String path) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		 workbook = new XSSFWorkbook(fis);
		
		
	}
	
	public int totalRowCount(int sheetindex) {
		
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		
		return sheet.getLastRowNum()+1;
		
	}
	
	
	public int totalcolumnCount (int sheetindex) {
		XSSFSheet sheet =workbook.getSheetAt(sheetindex);
		
		return sheet.getRow(0).getLastCellNum();
	}
	
	public Object getSpecificSheetdata(int sheetindex,int row,int cell) {
		
		XSSFSheet sheet =workbook.getSheetAt(sheetindex);
		
		XSSFCell cells = sheet.getRow(row).getCell(cell);
		
		if(cells==null) {
			return "";
		}else 
		{
			if(cells.getCellType()==XSSFCell.CELL_TYPE_STRING) {
				return cells.getStringCellValue();
				}else if (cells.getCellType()==XSSFCell.CELL_TYPE_NUMERIC){
					return cells.getRawValue();					
				}
			
		}
		return null;
		
	}
	
	public Object[][] getAllShetData(int sheetindex){
		
		
		int row = totalRowCount(sheetindex);
		int cell = totalcolumnCount(sheetindex);
		
		Object[][] obj = new Object[row][cell];
		for(int i=0; i<row;i++) {
			for(int j=0;j<cell;j++) {
				obj[i][j]= getSpecificSheetdata(sheetindex,i,j);
			}
		}
		
		return obj;
		
	}
	
	

}
