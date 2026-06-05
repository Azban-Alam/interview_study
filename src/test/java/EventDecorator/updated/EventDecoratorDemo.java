package EventDecorator.updated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EventDecoratorDemo {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
        WebDriver originalDriver = new ChromeDriver();
        driver = new EventFiringDecorator<>(new MyListener()).decorate(originalDriver);
    }

    @Test
    public void testNavigation() {
        driver.get("https://www.selenium.dev/");
        driver.findElement(By.linkText("Downloads")).click();
        String heading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Page heading: " + heading);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
