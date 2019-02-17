package com.arun.fileinout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteClass {
	
	public static void main(String[] args) 
	{
		readWriteExcel(5);
	}
	
	public static void readWriteExcel(int rowCount) 
	{
		try{
		//File file= new File(System.getProperty("user.dir")+"\\resources\\TestData.xlsx"); 
		File file= new File("D:\\Selenium\\POM_Project\\resources\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh= wb.getSheet("Transactions");
		
		for(int i = 1; i < rowCount ; i++) {
		    sh.createRow(i);
		    for(int j = 0; j < 3; j++) { 
		        sh.getRow(i).createCell(j); 
		        sh.getRow(i).createCell(j).setCellValue("Test1");
		    }                
		}     
			
		fis.close();
		FileOutputStream fos= new FileOutputStream(file);
		wb.write(fos);
		fos.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
