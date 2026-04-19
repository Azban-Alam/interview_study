package Dymanic_Element_Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPathAxesUtil {
    private WebDriver driver;

    public XPathAxesUtil(WebDriver driver) {
        this.driver = driver;
    }

    // 1. Ancestor axis
    public WebElement findAncestor(String tag, String id) {
        return driver.findElement(By.xpath("//" + tag + "[@id='" + id + "']/ancestor::form"));
    }

    // 2. Descendant axis
    public WebElement findDescendant(String tag, String parentId, String childTag) {
        return driver.findElement(By.xpath("//" + tag + "[@id='" + parentId + "']/descendant::" + childTag));
    }

    // 3. Following-sibling axis
    public WebElement findFollowingSibling(String baseTag, String text, String siblingTag) {
        return driver.findElement(By.xpath("//" + baseTag + "[text()='" + text + "']/following-sibling::" + siblingTag));
    }

    // 4. Preceding-sibling axis
    public WebElement findPrecedingSibling(String tag, String attribute, String value, String siblingTag) {
        return driver.findElement(By.xpath("//" + tag + "[@" + attribute + "='" + value + "']/preceding-sibling::" + siblingTag));
    }

    // 5. Parent axis
    public WebElement findParent(String tag, String attr, String val) {
        return driver.findElement(By.xpath("//" + tag + "[@" + attr + "='" + val + "']/parent::*"));
    }

    // 6. Child axis
    public WebElement findChild(String parentTag, String attr, String val, String childTag) {
        return driver.findElement(By.xpath("//" + parentTag + "[@" + attr + "='" + val + "']/child::" + childTag));
    }

    // 7. Self axis
    public WebElement findSelf(String tag, String attr, String val) {
        return driver.findElement(By.xpath("//" + tag + "[@" + attr + "='" + val + "']/self::" + tag));
    }
}