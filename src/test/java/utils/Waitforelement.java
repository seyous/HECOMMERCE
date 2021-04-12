package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforelement {

	// wait driver for web element
	public static void Driverwait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 40);

	}

	//wait method
	public static void wait(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
	}

}
