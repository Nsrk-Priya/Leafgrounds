package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGAutocomplete {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("tags"));
		element.click();
		element.sendKeys("sel");
		Thread.sleep(2000);
		element.sendKeys(Keys.DOWN, Keys.ENTER);

	}
}

		
