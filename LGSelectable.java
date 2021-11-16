package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGSelectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement item1 = driver.findElement(By.xpath("//div[@id='mydiv']//li[1]"));
		WebElement item2 = driver.findElement(By.xpath("//div[@id='mydiv']//li[2]"));
		WebElement item4 = driver.findElement(By.xpath("//div[@id='mydiv']//li[4]"));
		WebElement item7 = driver.findElement(By.xpath("//div[@id='mydiv']//li[7]"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(item4).moveToElement(item7).release().perform();
		builder.click(item1).release().perform();
		builder.click(item2).release().perform();
		
		

	}

}
