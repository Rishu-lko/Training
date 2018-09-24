package com.tests;

import com.framework.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteXLFile extends BaseClass {

	public void ReadXL() throws IOException {
		String filename = "SampleExport.xlsx";
		Workbook workbook = null;
		File file = new File(System.getProperty("user.dir") + "\\" + filename);
		FileInputStream inputStream = new FileInputStream(file);
		if (filename.substring(filename.indexOf(".")).equals(".xls")) {
			workbook = new HSSFWorkbook(inputStream);

		} else {
			workbook = new XSSFWorkbook(inputStream);
		}
		Sheet sheet = workbook.getSheet("ExcelGuru99Demo");
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 0; i < rowCount + 1; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue() + " || ");

			}
			System.out.println();

		}

	}

	public void writeNewXL() throws IOException {
		
		
		String writefilename = "SampleWrite.xlsx";
		Workbook writeWorkbook = null;
		
		File file = new File(System.getProperty("user.dir")+"\\"+writefilename);
		FileOutputStream outputStream = new FileOutputStream(file);
        if(writefilename.substring(writefilename.indexOf(".")).equals(".xls")) {
        	writeWorkbook = new HSSFWorkbook();
        }
        else {
        	writeWorkbook = new XSSFWorkbook();
        	
        }
        Sheet writeSheet = writeWorkbook.createSheet("Ratnesh");
        Row writeRow = writeSheet.createRow(0);
        for (int j = 0; j <4;j++) {
        Cell writeCell = writeRow.createCell(j);
        writeCell.setCellValue("Ratnesh");
        }
        writeWorkbook.write(outputStream);
        
        outputStream.close();
        writeWorkbook.close();
   		
	}

	public static void main(String arg[]) throws IOException {
		ReadWriteXLFile a = new ReadWriteXLFile();
		a.ReadXL();
		a.writeNewXL();

	}

}
