package TestNG.Listner_Complete_Code;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FullScreenshotListener implements ITestListener {

    private String timestamp() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    }

    private void captureScreenshot(String testName, WebDriver driver) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String filename = "screenshots/" + testName + "_" + timestamp() + ".png";
        try {
            FileUtils.copyFile(screenshot, new File(filename));
            System.out.println("📸 Saved screenshot: " + filename);
        } catch (IOException e) {
            System.err.println("❌ Screenshot save failed: " + e.getMessage());
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("🔷 START: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("✅ SUCCESS: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("❌ FAILURE: " + result.getName());
        Object instance = result.getInstance();
        if (instance instanceof WebDriverProvider) {
            WebDriver driver = ((WebDriverProvider) instance).getDriver();
            captureScreenshot(result.getName(), driver);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⚠️ SKIPPED: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("🟠 PARTIAL SUCCESS: " + result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("⏱️ TIMEOUT FAILURE: " + result.getName());
        onTestFailure(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("🚀 TEST SUITE STARTED: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("🏁 TEST SUITE FINISHED: " + context.getName());
    }
}