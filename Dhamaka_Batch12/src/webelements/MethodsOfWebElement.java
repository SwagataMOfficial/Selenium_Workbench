package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class MethodsOfWebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.open("chrome");
		
		driver.get("https://www.facebook.com");
		
		WebElement login = driver.findElement(By.name("login"));
		
		System.out.println(login.getCssValue("background-color"));
		System.out.println(login.getTagName());
		System.out.println(login.getText());
		System.out.println(login.getAttribute("type"));
		System.out.println(login.getLocation().getX() + " " + login.getLocation().getY());
		System.out.println(login.getRect().getWidth() + " " + login.getRect().getHeight());
		System.out.println(login.getSize().getWidth() + " " + login.getSize().getHeight());
		
		login.submit();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
