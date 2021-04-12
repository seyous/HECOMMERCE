package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Executescript {
	
	WebDriver driver;
	
	//method to scroll inside page
	public static void JavascriptexecutorCoordinate(WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300)");
	}

}
