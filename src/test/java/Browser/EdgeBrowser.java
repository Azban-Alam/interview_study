package Browser;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.msedge.driver",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("www.w3schools.com");
		

	}

}
