package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import generic.Browser;
import generic.Urls;

public class ImplicitWaitUsingWhile {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = Browser.open("chrome");
		try
		{
			driver.get(Urls.SHOPPERSSTACK);
			try {
				while(!driver.findElement(By.id("home")).isDisplayed())
				{
					System.out.println("Waiting!");
					Thread.sleep(1500);
				}
				System.out.println("Rendered!");
			} catch (Exception e)
			{
				;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{			
			driver.quit();
		}
	}

}
