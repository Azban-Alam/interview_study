package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switching_Frames_using_Name_or_ID {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome",
				"D:\\Eclipse-Workspace\\Interview_Study\\src\\test\\resources\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.get("/URL having iframes/");   
		
		//Switch by Index 
		driver.switchTo().frame(0); 
		driver.quit();
		
	}

}
