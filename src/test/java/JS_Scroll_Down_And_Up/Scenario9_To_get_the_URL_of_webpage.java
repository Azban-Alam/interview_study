package JS_Scroll_Down_And_Up;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario9_To_get_the_URL_of_webpage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String sText =  js.executeScript("return document.URL;").toString();
		System.out.println(sText);
	}

}
