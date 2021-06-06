package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tapnath\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

		// simple alert
		/*
		 * driver.findElement(By.id("alertButton")).click();
		 * System.out.println(driver.switchTo().alert().getText());
		 * driver.switchTo().alert().accept();
		 */
		
		// prompt alert
		WebElement element = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
		 Alert promptAlert = driver.switchTo().alert();
		 System.out.println(promptAlert.getText());
		 Thread.sleep(3000);
		 promptAlert.sendKeys("Test");
		 Thread.sleep(3000);
		 promptAlert.accept();
		
		

		driver.quit();

	}
}
