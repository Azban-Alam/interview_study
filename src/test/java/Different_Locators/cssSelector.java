package Different_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		/*
		 * <input type="text" class="search-box-text ui-autocomplete-input"
		 * id="small-searchterms" autocomplete="off" name="q" placeholder="Search store"
		 * aria-label="Search store" fdprocessedid="j8sng">
		 * 
		 */
		
		// Different Combination Of cssSelectors
		// tag#id
		WebElement e1 = driver.findElement(By.cssSelector("input#small-searchterms"));
		e1.sendKeys("Desktop");
		
		// tag.classname
		WebElement e2 = driver.findElement(By.cssSelector("input.search-box-text"));
		e2.sendKeys("T-Shirt");
		
		// tag[attribute='value']
		WebElement e3 = driver.findElement(By.cssSelector("input[name='q'"));
		e3.sendKeys("Book");
		
		// tag.classname[attribute='value']
		WebElement e4 = driver.findElement(By.cssSelector("input.small-searchterms[name='q']"));
		e4.sendKeys("Book3");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
