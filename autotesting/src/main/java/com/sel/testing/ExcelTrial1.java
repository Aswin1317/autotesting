package com.sel.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelTrial1 {
	
	
	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub

		WebDriver 	driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		FileInputStream file =new FileInputStream("E:\\selenium\\exceltrial.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("page");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		System.out.println(sheet.getRow(1).getCell(0));
		
		
		
		
		
	}
	


}
