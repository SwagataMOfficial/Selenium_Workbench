package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import generic.Browser;

public class PrintMonthDropdownTextReverse {

	public static void main(String[] args) throws InterruptedException {
//		TODO: fetch the facebook month dropdown texts and print them in reverse order
		
		WebDriver driver = Browser.open("chrome");
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		WebElement dp = driver.findElement(By.id("month"));
		
		Select s = new Select(dp);
		
		List<WebElement> all_months = s.getOptions();
		ArrayList<String> month_texts = new ArrayList<String>();

		for (WebElement months : all_months) {
			month_texts.add(months.getText());
		}
		
		Collections.sort(month_texts,Collections.reverseOrder());
		//Collections.reverse(month_texts);

		for (String text : month_texts) {
			System.out.println(text);
		}
		
		Thread.sleep(2000);
		driver.quit();

	}

}
