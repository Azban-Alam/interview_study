package Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
    WebDriver driver;
    SoftAssert softAssert = new SoftAssert();

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--disable-notifications", "--incognito");

        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

    @Test
    public void hardAssertionsExample() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google", "Title should be Google");
        Assert.assertNotEquals(title, "Google", "Title should be Google");
        Assert.assertTrue(title.contains("Google"));
        Assert.assertFalse(title.contains("Bing"));
        Assert.assertNotNull(title);
    }

    @Test
    public void softAssertionsExample() {
        WebElement searchBox = driver.findElement(By.name("q"));
        softAssert.assertNotNull(searchBox, "Search box should be present");
        softAssert.assertTrue(searchBox.isDisplayed(), "Search box should be visible");
        softAssert.assertEquals(searchBox.getDomAttribute("title"), "Search", "Title attribute mismatch");

        // Final assertion check
        softAssert.assertAll();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}