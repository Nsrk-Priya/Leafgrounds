package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQuerySortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item6= driver.findElement(By.xpath("//li[text()='Item 6']"));
		
		
		int x = item4.getLocation().getX();
		int y = item4.getLocation().getY();
		System.out.println(x+","+y);
	   builder.dragAndDropBy(item1, x, y).perform();
		
		
		int x1 = item6.getLocation().getX();
		int y1= item6.getLocation().getY();
		System.out.println(x1+","+y1);
		builder.dragAndDropBy(item3, x1, y1).perform();
		
		int x2 = item3.getLocation().getX();
		int y2= item3.getLocation().getY();
		System.out.println(x2+","+y2);
	//	builder.dragAndDropBy(item5, x1, 200).perform();
		
		
		//builder.clickAndHold(item5).moveByOffset(x1, y1).perform();
	}
}
