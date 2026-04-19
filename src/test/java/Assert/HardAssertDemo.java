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

public class HardAssertDemo {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized", "--incognito");

        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
    }

    @Test
    public void testGoogleHomePage() {
        // Hard assertion: Title must be "Google"
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "Google", "Page title mismatch");

        // Hard assertion: Search box must be present and displayed
        WebElement searchBox = driver.findElement(By.name("q"));
        Assert.assertNotNull(searchBox, "Search box is null");
        Assert.assertTrue(searchBox.isDisplayed(), "Search box is not visible");

        // Hard assertion: Search box should not be pre-filled
        Assert.assertEquals(searchBox.getAttribute("value"), "", "Search box is not empty");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}