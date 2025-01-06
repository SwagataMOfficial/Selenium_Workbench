package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Login_Search_And_Follow_Niranjan_Sir {

	public static void main(String[] args) throws InterruptedException {
//		 TODO: write end to end scenario for instagram

		String url = "https://www.instagram.com/";
		String id = "";
		String pass = "";
		
//		_____________________initial setup_______________________
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
//		_____________________login_______________________
		driver.findElement(By.name("username")).sendKeys(id);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[role='button']")).click();	// not now button/link
//		driver.findElement(By.cssSelector("a[tabindex='0']")).click();
		
//		_____________________searching Niranjan sir account_______________________
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("a[href='#']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("niranjan_ka_18");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/niranjan_ka_18/']")).click();
		Thread.sleep(2000);
				
//		_____________________following sir_______________________
		driver.findElement(By.cssSelector("button[class=\" _acan _acap _acas _aj1- _ap30\"]")).click();
		
//		_____________________logout_______________________
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div[3]/span/div/a")).click(); // hamburger button
		Thread.sleep(1500);
		driver.findElement(By.xpath("html/body/div[2]/div/div/div/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[8]")).click(); // logout button	
		
//		_____________________termination_______________________
		Thread.sleep(2500);
		driver.quit();
	}

}