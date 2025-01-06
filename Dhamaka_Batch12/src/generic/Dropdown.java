package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static Select create(WebElement arg0)
	{
		Select s = new Select(arg0);
		return s;
	}
	
}
