package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class MechanismOfFindElements {

	public static void main(String[] args) {

		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		
		for(WebElement e : elements) {
			System.out.println(e.getText());
		}
		
		System.out.println("\n================================================================\n");
		
		for (WebElement e : elements) {
			System.out.println(e.getAttribute("href"));
		}

		driver.quit();
	}

}
