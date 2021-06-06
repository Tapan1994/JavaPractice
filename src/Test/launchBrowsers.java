package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launchBrowsers {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\tapnath\\Documents\\Drivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\tapnath\\Documents\\Drivers\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tapnath\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Google")) {
			System.out.println("google is opened");
		} else {
			System.out.println("google not opened");
		}

		driver.quit();

	}

}
