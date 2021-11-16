package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGDrag {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.id("draggable"));
		Actions builder= new Actions (driver);
		builder.dragAndDropBy(drag, 70, 80).perform();
		
	}

}
