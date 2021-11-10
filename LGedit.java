package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGedit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Priya@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(("Edit"),Keys.TAB);
		String text = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean enabled = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		System.out.println(enabled);
}
}