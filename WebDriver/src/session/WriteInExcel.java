package session;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
	public static void main(String[] args) throws IOException {
		// Create blank workbook
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook();
		// Create a blank sheet
		XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");
		// Create row object
		XSSFRow row;
		// This data needs to be written (Object[])
		Map<String, Object[]> empInfo = new TreeMap<String, Object[]>();
		empInfo.put("ID1", new Object[] { "EMP ID", "EMP NAME", "DESIGNATION" });
		empInfo.put("ID2", new Object[] { "1", "AnnaBelle", "Technical Manager" });
		empInfo.put("ID3", new Object[] { "2", "Amber", "Developer" });

		// Iterate over data and write to sheet
		Set<String> keyid = empInfo.keySet();
		int rowId = 0;
		for (String key : keyid) {
			row = spreadsheet.createRow(rowId++);
			Object[] objectArr = empInfo.get(key);
			int cellId = 0;
			for (Object obj : objectArr) {
				Cell cell = row.createCell(cellId++);
				cell.setCellValue((String) obj);
			}
		}
		// Write the workbook in file system
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Shivangi\\Desktop\\Names.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("Writesheet.xlsx written successfully");
	}
}