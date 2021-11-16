package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\seleniumsoftware\\selenium\\src\\main\\java\\Leafground\\LGUpload.java");
	    driver.close();
	}

}
