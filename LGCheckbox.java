package Leafground;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LGCheckbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
	   
	    WebElement element = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
	    boolean selected = element.isSelected();
	    System.out.println(selected);
	    if(selected= true)
	    {
	    	System.out.println("Selenium is checked");
	    }
	    boolean selected2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).isSelected();
	    System.out.println(selected2);
	    if(selected2= true)
	    {
	    	driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		  
	    }
	    List<WebElement> option = driver.findElements(By.xpath("((//label[@for=\"java\"])[4])/following::div/input"));
	    int size=option.size();
	    System.out.println(size);
	    
	    		
	    	for(int i=1; i<=size;i++)
	    {
	    	driver.findElement(By.xpath("//div[text()='Option "+i+"']/input")).click();
	    }
	}
}

