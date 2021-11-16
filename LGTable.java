package Leafground;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		// driver.findElement(By.id("//table[@id='table_id']")).click();
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int colcount = column.size();
		System.out.println("column count is " + colcount);

		List<WebElement> Row = driver.findElements(By.tagName("tr"));
		int rowcount = Row.size();
		System.out.println("Row count is " + rowcount);
		WebElement findElement = driver.findElement(By.xpath("//table[@id='table_id']//tr[3]/td[2]"));
		System.out.println(findElement.getText());

		
		List<WebElement> find1 = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		for (WebElement webElement : find1) {
			System.out.println(webElement.getText());
		}
		
		
	}

}
