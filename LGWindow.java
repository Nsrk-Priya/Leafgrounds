package Leafground;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("home")).click();
		Set<String> handles = driver.getWindowHandles();
		List<String> Link1 = new ArrayList<String>(handles);

		driver.switchTo().window(Link1.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a/img[@alt='Windows']")).click();
		driver.close();

		driver.switchTo().window(Link1.get(0)); 

		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		Set<String> handles2 = driver.getWindowHandles();
		List<String> link2 = new ArrayList<String>(handles2);
		int size = link2.size();
		System.out.println(size);
		Thread.sleep(1000);
		for(int i=1; i<size; i++)
		{
			driver.switchTo().window(link2.get(i));
			driver.close();
		}
		
		driver.switchTo().window(Link1.get(0));

	  driver.findElement(By.xpath("(//button[@id='color'])[1]")).click();
	  Set<String> handles3 = driver.getWindowHandles();
		List<String> link3 = new ArrayList<String>(handles3);
		int size2 = link3.size();
		System.out.println(size2);
		for(int j=1;j<size2;j++)
		{
			driver.switchTo().window(link3.get(j));
			driver.close();
		}
		driver.switchTo().window(link3.get(0));
		driver.findElement(By.xpath("(//button[@id='color'])[2]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

	}
		
		
		



	
