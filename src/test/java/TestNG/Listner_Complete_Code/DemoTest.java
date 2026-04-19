package TestNG.Listner_Complete_Code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(FullScreenshotListener.class)
public class DemoTest implements WebDriverProvider {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        System.out.println("🧰 WebDriver initialized");
    }

    @Test
    public void passingTest() {
        driver.get("https://example.com");
        System.out.println("Page title (pass): " + driver.getTitle());
    }

    @Test
    public void failingTest() {
        driver.get("https://example.com");
        System.out.println("Page title (fail): " + driver.getTitle());
        throw new RuntimeException("💥 Boom! Forced failure for screenshot capture.");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🧹 WebDriver closed");
        }
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }
}