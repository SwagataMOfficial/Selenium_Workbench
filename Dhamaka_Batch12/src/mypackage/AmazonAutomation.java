package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("best laptop of 2024");
		
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		searchButton.click();

		List<WebElement> priceList = driver.findElements(By.cssSelector("span[class='a-price-whole']"));
		ArrayList<Integer> prices = new ArrayList<Integer>();
		priceList.forEach(el -> prices.add(Integer.parseInt(el.getText().replace(",", ""))));

		Collections.sort(prices);
		
		System.out.println("Most expensive Laptop of the list is : " + prices.get(prices.size()-1));
		driver.quit();

	}

}
