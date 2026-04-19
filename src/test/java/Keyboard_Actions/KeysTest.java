package Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeysTest {
	
	System.setProperty("webdriver.driver.chrome",
			"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    @Test
    public void keyDown() {
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        WebElement inputBox = driver.findElement(By.id("myInput")); // locate your element

        Actions actions = new Actions(driver);
        actions
            .click(inputBox)                  // click to focus on the input box
            .keyDown(Keys.SHIFT)             // press and hold SHIFT
            .sendKeys("hello")               // type "hello" with SHIFT => "HELLO"
            .keyUp(Keys.SHIFT)               // release SHIFT
            .perform();                      // perform the action
       
    }

    @Test
    public void keyUp() {
    
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
        
        WebElement inputBox = driver.findElement(By.id("myInput")); // locate your element
        new Actions(driver)
        .sendKeys(inputBox,"Selenium!")  // Type
        .keyDown(Keys.CONTROL)
        .sendKeys("a")          // Ctrl + A (Select All)
        .sendKeys("c")          // Ctrl + C (Copy)
        .keyUp(Keys.CONTROL)
        .perform();
        
    }

    @Test
    public void sendKeysToActiveElement() {
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        new Actions(driver)
                .sendKeys("abc")
                .perform();

        WebElement textField = driver.findElement(By.id("textInput"));
      
    }

    @Test
    public void sendKeysToDesignatedElement() {
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");
        driver.findElement(By.tagName("body")).click();

        WebElement textField = driver.findElement(By.id("textInput"));
        new Actions(driver)
                .sendKeys(textField, "Selenium!")
                .perform();

        
    }

    @Test
    public void copyAndPaste() {
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

        WebElement textField = driver.findElement(By.id("textInput"));
        new Actions(driver)
                .sendKeys(textField, "Selenium!")
                .sendKeys(Keys.ARROW_LEFT)
                .keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_UP)
                .keyUp(Keys.SHIFT)
                .keyDown(cmdCtrl)
                .sendKeys("xvv")
                .keyUp(cmdCtrl)
                .perform();

       
    }
}
