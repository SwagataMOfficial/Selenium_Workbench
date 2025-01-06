package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test__Dropdown {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://demoqa.com/select-menu";
//		_____________________initial setup_______________________
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
//		_____________________entering data in the form (dropdown test)_______________________
		
		Select s = new Select(driver.findElement(By.id("oldSelectMenu")));
		s.selectByIndex(2);
		Thread.sleep(2500);
//		s.deselectByIndex(2);
//		Thread.sleep(1500);
		
		s.selectByValue("9");
		Thread.sleep(2500);
//		s.deselectByValue("9");
//		Thread.sleep(1500);
		
		s.selectByVisibleText("Purple");
		Thread.sleep(2500);
//		s.deselectByVisibleText("Purple");
//		Thread.sleep(1500);
		
		s.selectByIndex(7);
//		Thread.sleep(1500);
//		s.deselectAll();
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
