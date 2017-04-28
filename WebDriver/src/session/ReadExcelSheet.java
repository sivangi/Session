package session;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public void readExcel() throws IOException {

		FileInputStream fs = new FileInputStream("C:\\Users\\Shivangi\\Desktop\\Names.xlsx");
		// create instance of Workbook
		Workbook workbook = new XSSFWorkbook(fs);

		// getSheet
		Sheet sheet = workbook.getSheet("Sheet1");

		// get total number of rows
		int totalNumOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < totalNumOfRows; i++) {
			// getRow(i) fetches ith row from the sheet
			Row row = sheet.getRow(i); // row=sheet.getRow(0)
			// get Total Number of Columns
			int totalNumOfCols = row.getLastCellNum();

			for (int j = 0; j < totalNumOfCols; j++) {
				System.out.print(row.getCell(j).getStringCellValue() + "||");
			}
			System.out.println();
		}
		workbook.close();
	}

	public static void main(String[] args) throws IOException {
		ReadExcelSheet e = new ReadExcelSheet();
		e.readExcel();
	}
}