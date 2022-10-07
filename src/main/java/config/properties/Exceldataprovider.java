package config.properties;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	
	XSSFWorkbook xwb;
	public Exceldataprovider() throws Exception {
		
		String epath="C:\\Users\\shubh\\eclipse-workspace\\framework_sample\\TestdataE\\Edata_a1.xlsx";
		FileInputStream fis=new FileInputStream(epath);
		xwb=new XSSFWorkbook(fis);
	}
	
	public String getStringData(String sheetname,int row,int cell) {
			return xwb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
}
