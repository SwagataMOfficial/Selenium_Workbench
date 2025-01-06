package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import generic.Browser;
import generic.Dropdown;
import generic.Urls;

public class Facebook_HandleHiddenElementUnderCustomRadioButton {

	public static void main(String[] args) throws InterruptedException {
//		TODO: open facebook, go to create account page, if you select custom radio button, you will see some text fields
//			  handle those textfields without clicking on the custom radio button.
		
		WebDriver driver = Browser.open("chrome");
		driver.get(Urls.FACEBOOK);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Swagata");
		driver.findElement(By.name("lastname")).sendKeys("Mukherjee");
		driver.findElement(By.name("reg_email__")).sendKeys("9898989898");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcd1234");
		Dropdown.create(driver.findElement(By.id("day"))).selectByValue("1");
		Dropdown.create(driver.findElement(By.id("month"))).selectByValue("1");
		Dropdown.create(driver.findElement(By.id("year"))).selectByValue("2004");
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='Sigma Male'", driver.findElement(By.name("custom_gender")));
		js.executeScript("document.getElementById('preferred_pronoun').value='6';");
//		driver.findElement(By.xpath("//label[.='Custom']")).click();
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
