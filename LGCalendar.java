package Leafground;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGCalendar {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		//int i=1;
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//table//tr[2]/td[]")).click();
		
		
	}

}
