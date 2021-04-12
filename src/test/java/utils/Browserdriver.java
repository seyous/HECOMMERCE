package utils;

import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserdriver {

	// method opens the browser returns the webdriver instance
	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aka_s\\eclipse-workspace\\hecommerce\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cartridgepeople.com/");
		driver.manage().window().maximize();
		return driver;
	}

	// close the browser
	public static void quitDriver(WebDriver driver) {
		driver.quit();
	}

}
