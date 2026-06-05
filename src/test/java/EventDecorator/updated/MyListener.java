package EventDecorator.updated;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.Reporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyListener implements WebDriverListener {

	private final String logFilePath = "./logs/execution.log";

	private void writeLog(String message) {
		System.out.println(message); // console
		Reporter.log(message, true); // TestNG report
		try (FileWriter fw = new FileWriter(logFilePath, true)) {
			fw.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + " " + message
					+ System.lineSeparator());
		} catch (IOException e) {
			System.out.println("[LOG ERROR] Could not write to log file: " + e.getMessage());
		}
	}

	// Navigation
	@Override
	public void beforeGet(WebDriver driver, String url) {
		writeLog("[BEFORE] Navigating to: " + url);
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		writeLog("[AFTER] Navigated to: " + url);
	}

	// Element interactions
	@Override
	public void beforeClick(WebElement element) {
		writeLog("[BEFORE] Clicking element: " + element);
	}

	@Override
	public void afterClick(WebElement element) {
		writeLog("[AFTER] Clicked element: " + element);
	}

	@Override
	public void afterGetText(WebElement element, String result) {
		writeLog("[AFTER] Extracted text: " + result);
	}

	// Error handling with screenshot
	public void onError(Object target, Throwable throwable) {
		writeLog("[ERROR] Exception occurred: " + throwable.getMessage());
		if (target instanceof WebDriver) {
			WebDriver driver = (WebDriver) target;
			takeScreenshot(driver);
		}
	}

	private void takeScreenshot(WebDriver driver) {
		try {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			File destFile = new File("./screenshots/error_" + timestamp + ".png");
			FileHandler.copy(srcFile, destFile);
			writeLog("[SCREENSHOT] Saved at: " + destFile.getAbsolutePath());

			// Embed screenshot in TestNG report (HTML link)
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "' target='_blank'>Screenshot</a>");
		} catch (IOException e) {
			writeLog("[SCREENSHOT ERROR] Could not save screenshot: " + e.getMessage());
		}
	}
}
