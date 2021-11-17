package Leafground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGAvanceTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/sorttable.html");
		driver.manage().window().maximize();
        List<String> empty = new ArrayList<String>();
        List<String> data = new ArrayList<String>();

		List<WebElement> name = driver.findElements(By.xpath("(//table[@id='table_id'])//td[2]"));

		for (WebElement webElement : name) {
			 String text = webElement.getText();
			//System.out.println(text);
			empty.add(text);
			data.add(text);
		}
		Collections.sort(empty);
		System.out.println(empty);
		driver.findElement(By.xpath("//th[text()='Name']")).click();
		
		if(data.equals(empty))
		{
			System.out.println(data);
		}
		else
		{
			System.out.println("It is not equal");
		}

		} 
		}
		
	


			
			
		