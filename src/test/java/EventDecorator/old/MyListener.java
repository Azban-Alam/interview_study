package EventDecorator.old;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.WebDriverListener;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyListener implements WebDriverListener {

	// --- Navigation ---
	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("[BEFORE] Navigating to: " + url);
	}

	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("[AFTER] Navigated to: " + url);
	}

	// --- Element interactions ---
	@Override
	public void beforeClick(WebElement element) {
		System.out.println("[BEFORE] Clicking element: " + element);
	}

	@Override
	public void afterClick(WebElement element) {
		System.out.println("[AFTER] Clicked element: " + element);
	}

	@Override
	public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
		System.out.println("[BEFORE] Typing into element: " + element + " | Keys: " + String.join("", keysToSend));
	}

	@Override
	public void afterSendKeys(WebElement element, CharSequence... keysToSend) {
		System.out.println("[AFTER] Typed into element: " + element);
	}

	@Override
	public void afterGetText(WebElement element, String result) {
		System.out.println("[AFTER] Extracted text: " + result);
	}

	// --- Alerts ---
	@Override
	public void beforeAccept(Alert alert) {
		System.out.println("[BEFORE] Accepting alert: " + alert.getText());
	}

	@Override
	public void afterAccept(Alert alert) {
		System.out.println("[AFTER] Accepted alert");
	}

	@Override
	public void beforeDismiss(Alert alert) {
		System.out.println("[BEFORE] Dismissing alert: " + alert.getText());
	}

	@Override
	public void afterDismiss(Alert alert) {
		System.out.println("[AFTER] Dismissed alert");
	}

	// --- Window handling ---
	public void beforeSwitchToWindow(WebDriver driver, String windowName) {
		System.out.println("[BEFORE] Switching to window: " + windowName);
	}

	public void afterSwitchToWindow(WebDriver driver, String windowName) {
		System.out.println("[AFTER] Switched to window: " + windowName);
	}

	// --- Error handling with screenshot ---
	public void onError(Object target, Throwable throwable) {
		System.out.println("[ERROR] Exception occurred: " + throwable.getMessage());

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
			System.out.println("[SCREENSHOT] Saved at: " + destFile.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("[SCREENSHOT ERROR] Could not save screenshot: " + e.getMessage());
		}
	}
}
