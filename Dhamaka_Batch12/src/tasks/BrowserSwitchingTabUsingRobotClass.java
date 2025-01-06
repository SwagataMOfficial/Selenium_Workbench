package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import generic.Browser;

public class BrowserSwitchingTabUsingRobotClass {
	public static Robot r;

	public static void switchTab() throws InterruptedException {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1500);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void openNewTab() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = Browser.open("chrome");
		r = new Robot();

		int count = 4;
		for (int i = 1; i <= count; i++) {
			openNewTab();
		}

		switchTab();

		Thread.sleep(5000);
		driver.quit();
	}

}
