package ShadowRoot_Handling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example.com"); // Replace with the actual site

		String shadowPath = "document.querySelector('#dTest').shadowRoot" + ".querySelector('#data').shadowRoot"
				+ ".querySelector('data-dom-ele#data-ele')";

		WebElement deepShadowElement = ShadowDomUtils.getShadowElement(driver, shadowPath);

		// Interact with the element (example: click)
		deepShadowElement.click();

		driver.quit();
	}
}