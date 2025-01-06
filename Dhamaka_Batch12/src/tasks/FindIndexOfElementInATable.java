package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class FindIndexOfElementInATable {

	public static void main(String[] args) throws InterruptedException {
//		 TODO: from a table fetch one element location in the form of ratio.
		/*
		 * suppose if the element is present in 3rd column 2nd row, then the outout will
		 * be text=2:3
		 */

		String search_text = "Magazzini Alimentari Riuniti";

		WebDriver driver = Browser.open("firefox");
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("file:///D:/app.html");

		List<WebElement> elements = driver.findElements(By.xpath("//table[@id='customers']//tr"));

		int size = elements.size();
		
		for (int i = 2; i <= size; i++) {
			for (int j = 1; j <= 3; j++) {				
				String text = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText().toLowerCase();
				
				if(text.equals(search_text.toLowerCase()))
				{
					System.out.println("'" + search_text + "'" + " is present at " + (i-1) + ":" + j);
					break;
				}
			}
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
