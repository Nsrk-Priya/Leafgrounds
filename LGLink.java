package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@link='blue']")).click();
		driver.navigate().back();
		
	    String attribute = driver.findElement(By.xpath("//a[contains(text(),'clicking me')]")).getAttribute("href");
	    System.out.println(attribute);
	    
	   driver.navigate().to(attribute);
	   Thread.sleep(1000);
	   driver.navigate().back();
	    
	    String attribute2 = driver.findElement(By.xpath("//a[text()=\"Verify am I broken?\"]")).getAttribute("href");
	    System.out.println(attribute2);
	   
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("The number of links is "  + links.size());
	    
	  
	}

}