package Leafground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGMouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html");
		driver.manage().window().maximize();
		WebElement mouse = driver.findElement(By.className("btnMouse"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mouse).perform();
		System.out.println(driver.findElement(By.xpath("(//li/a)[3]")).getText());
		System.out.println(driver.findElement(By.xpath("(//li/a)[4]")).getText());
		System.out.println(driver.findElement(By.xpath("(//li/a)[5]")).getText());
		driver.findElement(By.xpath("(//li/a)[3]")).click();
		Alert A = driver.switchTo().alert();
		A.accept();
		
	}

}
