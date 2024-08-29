
package com.myntrajio.generic.excellibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.myntrajio.generic.commonlibrary.FrameworkConstant;

public class ReadExcelFile implements FrameworkConstant {
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public Workbook wb = null;

	public String readData(String sheet, int row, int column) {

		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step 2: Open the workbook By Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step3:Fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		// Step4:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

	public void writeData(int column, int row, String sheet, int data) {
		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Step 2: Open the workbook BY Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Step3:To Write the Data
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);

		// Step4: convert data From Java type to Physical File
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Step5:Write the Excel
		try {
			wb.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Step6:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void displayData(String sheet, int row, int column) {
		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Step 2: Open the workbook By Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Step3:Fetch the Data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		// Step4:Print the Data
		System.out.println(data);

		// Step5:Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readMultipleData(String sheet, int column) {
		// Step 1: Convert physical file to java readable object By using
		// FileInputStream Class
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Step 2: Open the workbook By Creating WB-Factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// How To Fetch Multiple Data
		// Fetch The Last Row Count
		int count = wb.getSheet(sheet).getLastRowNum();

		// Fetch data of one By One Details --->
		for (int i = 1; i <= count; i++) {
			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
			System.out.println(data);
		}

		// Close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
