package generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	static String path = "D:\\Selenium\\screenshots\\";
	static String format = ".jpg";

	public static void capture(WebDriver driver) {
		TakesScreenshot tcs = (TakesScreenshot) driver;
		Date d = new Date();
		File src = tcs.getScreenshotAs(OutputType.FILE);
		
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MMMM_yyyy");
        String formattedDate = formatter.format(d);
        
        File f = new File(path + formattedDate);
        if (!f.exists() && !f.isDirectory()) {        	
        	f.mkdir();
        }
		File target = new File(path + formattedDate + "\\defect" + d.getTime() + format);

		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void capture(WebElement el) {
		Date d = new Date();
		
		File src = el.getScreenshotAs(OutputType.FILE);
		String product_name = el.findElement(By.tagName("h2")).getText();
		
        SimpleDateFormat formatter = new SimpleDateFormat("dd_MMMM_yyyy");
        String formattedDate = formatter.format(d);
        
        File f = new File(path + formattedDate);
        if (!f.exists() && !f.isDirectory()) 
        {
        	f.mkdir();
        }
        
        File f1 = new File(path + formattedDate + "\\elements");
        if (!f1.exists() && !f1.isDirectory()) {
        	f1.mkdir();
        }
        
		File target = new File(path + formattedDate + "\\elements" + "\\defect_on_" + product_name + "_" + d.getTime() + format);

		try {
			FileHandler.copy(src, target);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
