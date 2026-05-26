package BrokenLinks;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksChecker {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://bstackdemo.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {
            String href = link.getDomAttribute("href"); // Replaces getAttribute("href")
            if (href != null && !href.isEmpty()) {
                checkLink(href);
            }
        }

        driver.quit();
    }

    public static void checkLink(String url) {
        try {
            URL link = new URI(url).toURL(); // Replaces new URL(url)
            HttpURLConnection conn = (HttpURLConnection) link.openConnection();
            conn.setConnectTimeout(3000);
            conn.connect();

            int status = conn.getResponseCode();
            String message = conn.getResponseMessage();

            if (status == 200) {
                System.out.println(url + " - OK");
            } else {
                System.out.println(url + " - " + message + " - Broken");
            }

        } catch (Exception e) {
            System.out.println(url + " - Broken or Invalid");
        }
    }
}