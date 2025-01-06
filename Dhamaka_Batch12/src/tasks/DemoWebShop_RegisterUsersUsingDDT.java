package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import generic.Browser;
import generic.Excel;
import generic.Urls;

public class DemoWebShop_RegisterUsersUsingDDT {

	public static void main(String[] args) throws InterruptedException {
//		TODO: open demo web shop, register users using test data from excel.
		
		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.DEMOWEBSHOP);
		
		driver.findElement(By.xpath("//a[.='Register']")).click();

		int row_count = Excel.getRowCount("D:\\Selenium\\testData.xlsx", "DemoWebShop");
		int col_count = Excel.getColCount("D:\\Selenium\\testData.xlsx", "DemoWebShop");
		for (int row = 1; row < row_count; row++) {
			for (int col = 1; col < col_count; col++) {
				String data = Excel.fetch("D:\\Selenium\\testData.xlsx", "DemoWebShop", row, col);
				
				switch (col) {
				case 1:
//					_______________Gender_______________
					driver.findElement(By.xpath("//label[.='Gender:']/..//input[@value='" + data +"']")).click();
					break;
				case 2:
//					_______________First Name_______________
					driver.findElement(By.id("FirstName")).sendKeys(data);
					break;
				case 3:
//					_______________last Name_______________
					driver.findElement(By.id("LastName")).sendKeys(data);
					break;
				case 4:
//					_______________email_______________
					driver.findElement(By.id("Email")).sendKeys(data);
					break;
				case 5:
//					_______________password and confirm password_______________
					driver.findElement(By.id("Password")).sendKeys(data);
					driver.findElement(By.id("ConfirmPassword")).sendKeys(data);
					break;
				default:
					System.out.println("Error occured with value: " + row + " : " + col);
					break;
				}				
			}
			driver.navigate().refresh();
		}
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}

