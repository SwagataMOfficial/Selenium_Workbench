package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import generic.Browser;

public class FetchAllSelectedOptionText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.open("chrome");
		
		driver.get("file:///D:/app.html");
		
		WebElement dp = driver.findElement(By.id("a1"));
		
		Select s = new Select(dp);
		
		s.selectByIndex(0);
		
		s.selectByValue("3");
		
		s.selectByVisibleText("Teacher's");
		
		List<WebElement> selected_opts = s.getAllSelectedOptions();
		
//		for (WebElement opt : selected_opts) {
//			System.out.println(opt.getText());
//		}
		
		for (WebElement opt : selected_opts) {
			if(opt.isSelected())
			{				
				System.out.println(opt.getText());
			}
		}
		
		
		driver.quit();

	}

}