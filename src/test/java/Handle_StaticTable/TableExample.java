package Handle_StaticTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {
	
	/*
	 * <table> - It defines a table 
	 * <th> - It defines a header cell 
	 * <tr> - It defines a row in a table. 
	 * <td> - It defines a cell in a table. 
	 * the <td> tag always lies inside the <tr> tag.
	 */
   public static void main(String[] args) {
		   
      // Set up WebDriver (Assuming ChromeDriver here)
      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
      WebDriver driver = new ChromeDriver();

      // Navigate to the desired webpage
      driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

      // Find the table element
      WebElement tableElement = driver.findElement(By.tagName("table"));
      
      // Count Number Of Rows
      List<WebElement> rows = tableElement.findElements(By.tagName("tr"));

      // Iterate through each row
      for (WebElement rowElement : rows) {
    	  
         List<WebElement> cells = rowElement.findElements(By.tagName("td"));

         // Iterate through each cell in the row
         for (WebElement cellElement : cells) {
            String cellData = cellElement.getText();
            
            // Process the cell data as needed
            System.out.print(cellData + "\t");
         }

         // Move to the next line after processing each row
         System.out.println();
      }

      // Close the browser
      driver.quit();
   }
}