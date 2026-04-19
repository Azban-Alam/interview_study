package Dymanic_Element_Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XPathBuilder {
    private WebDriver driver;

    public XPathBuilder(WebDriver driver) {
        this.driver = driver;
    }

    // 01. Absolute XPath
    public WebElement findByAbsoluteXPath() {
        return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]"));
    }

    // 02. Relative XPath
    public WebElement findByRelativeXPath() {
        return driver.findElement(By.xpath("//input[1]"));
    }

    // 03. Single Attribute  //tag[@attribute='value']
    public WebElement findBySingleAttribute(String attr, String value) {
        return driver.findElement(By.xpath("//*[@"+attr+"='"+value+"']"));
    }

    // 04. Multiple Attributes  //tag[@attribute_name1='attribute_value1'][@attribute_name2='attribute_value2]
    public WebElement findByMultipleAttributes(String tag, String attr1, String val1, String attr2, String val2) {
        return driver.findElement(By.xpath("//" + tag + "[@" + attr1 + "='" + val1 + "'][@" + attr2 + "='" + val2 + "']"));
    }

    // 05. Using AND //tag[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]
    public WebElement findByAnd(String tag, String attr1, String val1, String attr2, String val2) {
        return driver.findElement(By.xpath("//" + tag + "[@" + attr1 + "='" + val1 + "' and @" + attr2 + "='" + val2 + "']"));
    }

    // 06. Using OR //tag[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]
    public WebElement findByOr(String tag, String attr1, String val1, String attr2, String val2) {
        return driver.findElement(By.xpath("//" + tag + "[@" + attr1 + "='" + val1 + "' or @" + attr2 + "='" + val2 + "']"));
    }

    // 07. Using contains()  //*[contains(@attribute,'value')]
    public WebElement findByContains(String tag, String attr, String partialValue) {
        return driver.findElement(By.xpath("//" + tag + "[contains(@" + attr + ", '" + partialValue + "')]"));
    }

    // 08. Using text() //tag[text()='New look for sign-in coming soon']
    public WebElement findByText(String visibleText) {
        return driver.findElement(By.xpath("//*[text()='" + visibleText + "']"));
    }

    // 09. Using position()  findElement(By.xpath("(//input[@type='text'])[2]"))
    public WebElement findByPosition(String tag, int position) {
        return driver.findElement(By.xpath("(//" + tag + ")[" + position + "]"));
    }

    // 10. Using index
    public WebElement findByIndex(String tag, int index) {
        return driver.findElement(By.xpath("//" + tag + "[" + index + "]"));
    }

    // 11. Using XPath axes
    public WebElement findUsingFollowingSibling(String baseTag, String baseText, String targetTag) {
        return driver.findElement(By.xpath("//" + baseTag + "[text()='" + baseText + "']/following-sibling::" + targetTag));
    }
}