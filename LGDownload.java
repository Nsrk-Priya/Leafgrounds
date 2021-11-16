package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGDownload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Download Excel']")).click();
		
		driver.findElement(By.xpath("//a[text()='Download PDF']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Download Text']")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		

	}
	
}
