package ExplicitWait_Examples.Elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IMP_EC_elementSelectionStateToBe {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		String url = "http://www.web-source.net/web_design_tips/alert_message_web_page_load.htm";
		driver.get(url);

		WebElement hondaCheckbox = driver.findElement(By.id("hondacheck"));
		hondaCheckbox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean until2 = wait.until(ExpectedConditions.elementSelectionStateToBe(hondaCheckbox, true));

		// Scenario :2
		WebElement multiComboBox = driver.findElement(By.id("multiple-select-example"));
		Select select = new Select(multiComboBox);
		select.selectByIndex(1);

		Boolean until = wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//option[@value=\"orange\"]"), true));
		select.selectByIndex(0);

	}

}

/*
 * An expectation : checking if the given element is selected.
 * Parameters: WebElement 
 * Returns:true once the element's selection stated is selected
 */