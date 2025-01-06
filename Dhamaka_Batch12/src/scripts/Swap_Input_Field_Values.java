package scripts;

import java.util.List;

/*

HTML SOURCE CODE
*****************************************

<html>
<head>
    <title>Check input field and pass data</title>
</head>
<body>

    <nav></nav>
    <header></header>
    <main></main>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text"><input type="text">
    <a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a><a href=""></a>
    <button type="submit">Btn-1</button><button type="submit">Btn-2</button><button type="submit">Btn-3</button><button type="submit">Btn-4</button><button type="submit">Btn-5</button><button type="submit">Btn-6</button><button type="submit">Btn-7</button><button type="submit">Btn-8</button><button type="submit">Btn-9</button><button type="submit">Btn-10</button><button type="submit">Btn-11</button><button type="submit">Btn-12</button><button type="submit">Btn-13</button><button type="submit">Btn-14</button><button type="submit">Btn-15</button><button type="submit">Btn-16</button><button type="submit">Btn-17</button><button type="submit">Btn-18</button><button type="submit">Btn-19</button><button type="submit">Btn-20</button><button type="submit">Btn-21</button><button type="submit">Btn-22</button><button type="submit">Btn-23</button><button type="submit">Btn-24</button><button type="submit">Btn-25</button>
    <br>
    <hr>
    <form action="get">
        <input type="submit" value="submit">
    </form>
</body>
</html>

*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Browser;

public class Swap_Input_Field_Values {

	public static void main(String[] args) throws InterruptedException {
		// get count of all buttons using xpath as //*

		WebDriver driver = Browser.open("chrome");

		driver.get("file:///D:/app.html");

		int count = 0;
		List<WebElement> elements = driver.findElements(By.xpath("//*"));

		for (WebElement webElement : elements) {
			if (webElement.getTagName().toLowerCase().equals("button")) {
				count++;
			}
		}
		System.out.println("Count of Buttons: " + count);

		Thread.sleep(2000);
		driver.quit();

	}

}
