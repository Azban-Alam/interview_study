package SVG_Element_Handling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SvgInteractor {
    private WebDriver driver;

    public SvgInteractor(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSvgElement() {
        return driver.findElement(By.xpath("//*[local-name()='svg']"));
    }

    public WebElement getCircleElement() {
        return driver.findElement(By.xpath("//*[local-name()='circle']"));
    }

    public WebElement getRectInsideSvg() {
        return driver.findElement(By.xpath("//*[name()='svg']/*[name()='rect']"));
    }

    public void clickSvgElement(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            // Fallback to Actions if .click() fails
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
        }
    }

    // Example usage
    public void clickCircle() {
        WebElement circle = getCircleElement();
        clickSvgElement(circle);
    }
}