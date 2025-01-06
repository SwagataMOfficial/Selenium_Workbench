package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa_Submitting_Form {

	public static void main(String[] args) throws InterruptedException {
//		TODO: submitting form in demoqa
		
		String url = "https://demoqa.com";
//		_____________________initial setup_______________________
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

//		_____________________opening form_______________________
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div")).click();

//		_____________________entering data in the form_______________________
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("efgh");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("email@e.com");
		driver.findElement(By.xpath("//label[text()='Male']")).click();	// radio button
		Thread.sleep(1500);	
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'subjectsInput')]")).sendKeys("Eng");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'English')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'subjectsInput')]")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click(); // checkbox
		driver.findElement(By.id("currentAddress")).sendKeys("278, sfbjs, sbfksb s, scusb");
//		driver.findElement(By.xpath("//button[@id='submit']")).click();

//		_____________________termination_______________________
		Thread.sleep(5000);
		driver.quit();

	}

}


/*
package tasks;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]")).click();
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys("Soumyadip");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Paul");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("soumyadippUL914@gmail.com");
		
		driver.findElement(By.cssSelector("input[id='userNumber']")).sendKeys("9903889600");
		driver.findElement(By.xpath("//label[contains(text(),'Reading')]")).click();
		driver.findElement(By.tagName("textarea")).sendKeys("hiiiiii");	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[11]/div/button")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}

*/


