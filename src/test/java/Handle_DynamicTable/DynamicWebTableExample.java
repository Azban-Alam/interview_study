package Handle_DynamicTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableExample {
	public static void main(String[] args) {
		// Set up ChromeDriver path
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		// Create ChromeDriver instance
		WebDriver driver = new ChromeDriver();

		// Open the web-page
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		// Locate the table element
		WebElement table = driver.findElement(
				By.xpath("//*[@id='post-body-1325137018292710854']/div[1]/div[1]/div[5]/table/thead/tr/th[1]"));

		// Find all rows in the table
		List<WebElement> rows = table.findElements(By.xpath(".//tr"));

		// Iterate through each row and print cell values
		for (WebElement row : rows) {
			List<WebElement> cells = row.findElements(By.xpath(".//td"));
			for (WebElement cell : cells) {
				String cellText = cell.getText();
				System.out.println(cellText);
			}
		}

		// Close the browser
		driver.quit();
	}
}