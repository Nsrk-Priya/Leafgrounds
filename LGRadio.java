package Leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGRadio {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='yes']")).click();
      //boolean enabled = driver.findElement(By.xpath("//label[@for='Unchecked']")).isSelected();
       
       boolean selected = driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).isSelected();
       System.out.println(selected);
      
       boolean enabled2 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[4]")).isSelected();
       System.out.println(enabled2);
       
      
       boolean selected2 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[6]")).isSelected();
       System.out.println(selected2);
       if(selected2=true)
       {
    	   driver.findElement(By.xpath("(//input[@type=\"radio\"])[7]")).click();
       }
       
      // driver.findElement(By.xpath("(//input[@type=\"radio\"])[6]")).click();
	}



}
