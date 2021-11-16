package Leafground;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGTooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("age")).click();
		String text = driver.findElement(By.xpath("//div[@role='log']/div")).getText();
		System.out.println(text);
		
	}

}
