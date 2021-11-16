package Leafground;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
	
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe'][2]/iframe[1]"));
		driver.switchTo().frame(frame1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
	    driver.switchTo().defaultContent();
	    List <WebElement> element = driver.findElements(By.tagName("iframe"));
	    int size = element.size();
	    System.out.println("number of frames "+size);
		
		
	}

}
