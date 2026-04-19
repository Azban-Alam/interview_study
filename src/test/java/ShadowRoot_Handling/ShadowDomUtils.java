package ShadowRoot_Handling;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShadowDomUtils {

    /**
     * Executes a shadow DOM JavaScript chain and returns the target WebElement.
     * @param driver         WebDriver instance
     * @param jsShadowQuery  JavaScript shadow root chain as a String
     * @return               WebElement from shadow DOM
     */
    public static WebElement getShadowElement(WebDriver driver, String jsShadowQuery) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (WebElement) js.executeScript("return " + jsShadowQuery + ";");
    }
}