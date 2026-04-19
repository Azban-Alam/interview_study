package Handling_DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByStoringOptionsListIterating {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bstackdemo.com/");
		driver.findElement(By.xpath("//select")).click();
		
		//Store all the options as WebElements in a List.
		List<WebElement> allOptions = driver.findElements(By.cssSelector("select option"));
		String option = "Highest to lowest";
		for (int i = 0; i < allOptions.size(); i++) {
			if (allOptions.get(i).getText().contains(option)) {
				allOptions.get(i).click();
				System.out.println("clicked");
				break;
			}

		}
		
		// Another Loop
		for (WebElement e : allOptions) {
			if(e.getText().contains("option")) {
				e.click();
			}	
		}
		
		
		
	}
}