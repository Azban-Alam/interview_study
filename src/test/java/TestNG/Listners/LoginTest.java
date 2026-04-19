package TestNG.Listners;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(ScreenshotListener.class)
public class LoginTest implements WebDriverProvider {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(); // Add WebDriverManager or set chromedriver path
    }

    @Test
    public void validLoginTest() {
        driver.get("https://example.com");
        // Intentionally failing this test
        throw new RuntimeException("Simulated Failure!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Override
    public WebDriver getDriver() {
        return driver;
    }
}