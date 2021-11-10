package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		WebElement first = driver.findElement(By.id("dropdown1"));
		Select option = new Select(first);
		option.selectByIndex(3);

		WebElement second = driver.findElement(By.name("dropdown2"));
		Select option1 = new Select(second);
		option1.selectByVisibleText("Appium");

		WebElement third = driver.findElement(By.id("dropdown3"));
		Select option2 = new Select(third);
		option2.selectByValue("4");

		WebElement fourth = driver.findElement(By.className("dropdown"));
		Select options = new Select(fourth);
		List<WebElement> getoption = options.getOptions();
		System.out.println(getoption.size());
		
		//WebElement fifth = driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Appium");
		
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select multi = new Select(multiple);
		List<WebElement> opt= multi.getOptions();
	//	System.out.println(opt);
		
		int size= opt.size();
		
		for(int i =0 ; i<size; i++)
		{
			multi.selectByIndex(i);
			System.out.println(multi);
		}
		
 
	}

}
