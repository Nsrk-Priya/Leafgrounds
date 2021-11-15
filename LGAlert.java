package Leafground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("btn")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

	}

}
