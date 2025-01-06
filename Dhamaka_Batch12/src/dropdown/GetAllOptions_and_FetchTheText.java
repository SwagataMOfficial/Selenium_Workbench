package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import generic.Browser;

public class GetAllOptions_and_FetchTheText {

	public static void main(String[] args) {
		WebDriver driver = Browser.open("chrome");
		
		driver.get("file:///D:/app.html");
		
		WebElement dp = driver.findElement(By.id("a1"));
		
		Select s = new Select(dp);
		
		List<WebElement> all_opts = s.getOptions();
		ArrayList<String> opt_texts = new ArrayList<String>();
		
		for (WebElement opt : all_opts) {
			opt_texts.add(opt.getText());
		}
		TreeSet<String> sorted_texts = new TreeSet<String>(opt_texts);
		
		for (String text : sorted_texts) {
			System.out.println(text);
		}
		
		driver.quit();
	}

}
