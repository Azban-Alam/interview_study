package JS_Scroll_Down_And_Up;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorExamples {

    JavascriptExecutor js;

    public JavaScriptExecutorExamples(WebDriver driver) {
        this.js = (JavascriptExecutor) driver;
    }

    // 1. Click a button
    public void clickById() {
        js.executeScript("document.getElementById('submit').click();");
        // OR: js.executeScript("arguments[0].click();", element);
    }

    // 2. Scroll to an element
    public void scrollToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // 3. Scroll to the bottom of the page
    public void scrollToBottom() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    // 4. Scroll by specified pixels
    public void scrollByPixels() {
        js.executeScript("window.scrollBy(0, 400);");
    }

    // 5. Type in a text box without sendKeys
    public void typeUsingJS() {
        js.executeScript("document.getElementById('email').value='username@xyz.com';");
    }

    // 6. Get the page title
    public String getPageTitle() {
        return js.executeScript("return document.title;").toString();
    }

    // 7. Get the domain name
    public String getDomainName() {
        return js.executeScript("return document.domain;").toString();
    }

    // 8. Get the URL of the page
    public String getPageURL() {
        return js.executeScript("return document.URL;").toString();
    }

    // 9. Navigate to another URL
    public void goToURL() {
        js.executeScript("window.location = 'https://testgrid.io/';");
    }

    // 10. Get innerText of the webpage
    public String getPageInnerText() {
        return js.executeScript("return document.documentElement.innerText;").toString();
    }
    
 // 10. Get innerText of a specific WebElement
    public String getElementInnerText(WebElement element) {
        return js.executeScript("return arguments[0].innerText;", element).toString();
    }

    // 11. Get height and width of the page
    public String getViewportDimensions() {
        String height = js.executeScript("return window.innerHeight;").toString();
        String width = js.executeScript("return window.innerWidth;").toString();
        return "Height: " + height + ", Width: " + width;
    }

    // 12. Generate an alert
    public void showAlert() {
        js.executeScript("alert('This is an alert triggered by JSExecutor!');");
    }
}