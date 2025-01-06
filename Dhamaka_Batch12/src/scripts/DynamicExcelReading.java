package scripts;

import generic.Excel;

public class DynamicExcelReading {

	public static int getRowCount() {
		int row = 0;
		String v = "";
		while(v != null)
		{
			v = Excel.fetch("DemoWebShop", row, 0);
			if (v != null) {				
				row++;
			}
		}
		return row;
	}

	public static void main(String[] args) {

		System.out.println(Excel.fetch("DemoWebShop", 6, 0));
		
	}

}
