package com.sel.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTrial {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("E:\\selenium\\exceltest.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("data");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		System.out.println(sheet.getRow(1).getCell(0));
		
		
	}

}
