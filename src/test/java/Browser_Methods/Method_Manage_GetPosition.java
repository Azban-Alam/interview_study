package Browser_Methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Manage_GetPosition {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(5000);
		Point p = driver.manage().window().getPosition();
		int x = p.getX();
		int y = p.getY();
		System.out.println("x cordinate :" + p.getX());
		System.out.println("y cordinate :" + p.getY());
		
		driver.close();
	}
}
