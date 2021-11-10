package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\\\www.google.com");
		driver.get("https://dev113175.service-now.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");

		// driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Vidya12#");
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("filter")).sendKeys("Incidents", Keys.ENTER);

		// driver.findElement(By.className("sn-widget-list-title")).click();
		driver.findElement(By.xpath("(//div[@class='sn-widget-list-title'])[8]")).click();
		WebElement element = driver.findElement(By.id("gsft_main"));

		// switch to frame
		driver.switchTo().frame(element);
		Thread.sleep(3000);
		driver.findElement(By.id("sysverb_new")).click(); // to click new button

		String mytext = driver.findElement(By.xpath("//input[@name='incident.number']")).getAttribute("value"); 
		System.out.println(mytext);

		driver.findElement(By.id("incident.short_description")).sendKeys("new incident");

		driver.findElement(By.id("sysverb_insert_bottom")).click();
		driver.findElement(By.id("incident_table_header_search_control")).sendKeys(mytext, Keys.ENTER);
		String text = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		System.out.println(text);

		if (text.equals(mytext)) {

			System.out.println("Inicident created successfully");
		}

		else {

			System.out.println("incident is not found");
		}

		driver.close();

	}
}
