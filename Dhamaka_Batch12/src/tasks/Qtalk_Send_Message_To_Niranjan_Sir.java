package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qtalk_Send_Message_To_Niranjan_Sir {

	public static void main(String[] args) throws InterruptedException {
		String url = "https://chat.qspiders.com/";
		String id = "";
		String pass = "";
		
//		_____________________initial setup_______________________
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
//		_____________________login_______________________
		driver.findElement(By.cssSelector("button[class='_auth_SwitchStudent__nHctW']")).click();
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(id);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pass);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

//		_____________________chat opening_______________________
		Thread.sleep(5000);
		driver.findElement(By.name("search")).sendKeys("Niranjan");
		driver.findElement(By.cssSelector("div[class='_chat_listUser__7px9Q']")).click();

//		__________________sending message___________________
//		driver.findElement(By.id("message")).sendKeys("Hi sir (automated message)");
//		driver.findElement(By.cssSelector("button[class='chatSubmitButton']")).click();
		
//		___________________logout______________________
		driver.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-i29csa']")).click();
		driver.findElement(By.cssSelector("li[tabindex='-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedWarning MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-root MuiButton-contained MuiButton-containedWarning MuiButton-sizeSmall MuiButton-containedSizeSmall css-10zay8b']")).click();		
		
		Thread.sleep(2000);
		driver.quit();

	}

}



