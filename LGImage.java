package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LGImage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
		String findElement = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']")).getAttribute("for");
		System.out.println(findElement);
		
		WebElement element = driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		Actions builder= new Actions(driver);
		builder.click(element).perform();
	}

}
