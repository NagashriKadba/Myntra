package com.myntra.generic;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Library {

	public static String readData(String sheetName, int rowNum, int cellNum) {
		String data = null;
		
		try{
		File file = new File(Constant.filepath);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
	}catch(Exception e){
		
	}
		return data;
	}
	
}
