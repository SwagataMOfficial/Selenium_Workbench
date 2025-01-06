package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	static String default_path = "D:\\Selenium\\testData.xlsx";
	static String value;

	public static String fetch(String path, String sheet, int row, int cell) {

		try {
			Row row2 = WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(row);
			if (row2 == null) {
				return null;
			} else {
				Cell v = row2.getCell(cell);
				if (v != null) {
					value = v.toString();
				} else {
					value = null;
				}
			}
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

	public static String fetch(String sheet, int row, int cell) {

		try {
			Row row2 = WorkbookFactory.create(new FileInputStream(default_path)).getSheet(sheet).getRow(row);
			if (row2 == null) {
				return null;
			} else {
				Cell v = row2.getCell(cell);
				if (v != null) {
					value = v.toString();
				} else {
					value = null;
				}
			}
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}

	public static int getColCount(String sheet) {
		int count = 0;
		try {
			count = WorkbookFactory.create(new FileInputStream(default_path)).getSheet(sheet).getRow(0)
					.getLastCellNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public static int getColCount(String path, String sheet) {
		int count = 0;
		try {
			count = WorkbookFactory.create(new FileInputStream(default_path)).getSheet(sheet).getRow(0)
					.getLastCellNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	public static int getRowCount(String sheet) {
		int count = 0;
		try {
			count = WorkbookFactory.create(new FileInputStream(default_path)).getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count + 1;
	}

	public static int getRowCount(String path, String sheet) {
		int count = 0;
		try {
			count = WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getLastRowNum();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
