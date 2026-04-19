package JS_Scroll_Down_And_Up;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3_To_Handle_Checkbox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('enter element id').checked=false;");
	}

}
