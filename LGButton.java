package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    Point location = driver.findElement(By.id("position")).getLocation();
	    System.out.println(location);
	  
	    int x = driver.findElement(By.id("position")).getLocation().getX();
	    int y = driver.findElement(By.id("position")).getLocation().getY();
	    System.out.println(x+ " " +y); 
		
		String attribute = driver.findElement(By.id("color")).getAttribute("style");
		System.out.println(attribute);
		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);
		
		int height = driver.findElement(By.id("size")).getSize().getHeight();
        int width = driver.findElement(By.id("size")).getSize().getWidth();
        System.out.println(+height);
        System.out.println(+width);

 

	}

}
	    
		
		
		
		
		
		
	
	    
