package com.clientName.vtiger.generic.excelUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericExcelUtility {
	public String getDatafromExcel() throws Throwable, IOException
	{
		FileInputStream fis=new FileInputStream("./TestData/ExcelData.xlsx");		
		Workbook wb=WorkbookFactory.create(fis);		
		Sheet st=wb.getSheet("org");
		Row rw=st.getRow(1);
		Cell cl=rw.getCell(2);
		String data=cl.toString();		
		return data;
	}
}
