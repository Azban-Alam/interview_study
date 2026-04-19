package Window_Handles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();

		String cw = driver.getWindowHandle();
		System.out.println("Current Window ID " + cw);

		// Approach 1
		Set<String> mw = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(mw); // Converted Set To List
		String pw = list.get(0);
		String cw1 = list.get(1);

		driver.switchTo().window(cw1);
		System.out.println("Child Window :" + driver.getTitle());

		driver.switchTo().window(pw);
		System.out.println("Parent Window :" + driver.getTitle());

		// Approach 2

		for (String w : list) {
			String s = driver.switchTo().window(w).getTitle();
			if (s.equals("google")) {
				System.out.println("Parent Window");
			} else {
				System.out.println("Child Window");
			}

		}
		driver.quit();
	}

}