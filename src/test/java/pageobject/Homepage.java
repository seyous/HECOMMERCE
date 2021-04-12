package pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Waitforelement;

public class Homepage {

	WebDriver driver;

	// Constructor for the webdriver
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	//method declaration for web elements
	@FindBy(how = How.XPATH, using = "//*[@id='header-info']/ul/li[2]/a/span")
	private WebElement loginbutton;

	@FindBy(how = How.XPATH, using = "//*[@id='header-info']/ul/li[3]/a")
	private WebElement logoutbutton;

	// Collection of web element
	@FindBy(how = How.XPATH, using = "//*[@id='CybotCookiebotDialogBodyButtonAccept']")
	private WebElement cookiesalert;

	@FindBy(how = How.XPATH, using = "//*[@id='shopmenu']/div[1]/ul/li[5]/a")
	private WebElement printermenu;

	@FindBy(how = How.XPATH, using = "//*[@id='shopmenu']/div[2]/div[4]/div/ul/li[1]/a")
	private WebElement inkjetprinter;

	@FindBy(how = How.XPATH, using = "//div[@class='printers dropdown-menu']//a")
	private List<WebElement> listofprinters;

	@FindBy(how = How.XPATH, using = "//*[@id='shopmenu']/div[2]/div[4]/div")
	private WebElement submenu;

	// method declaration
	public void clickcookiesbutton() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(cookiesalert)).click();
	}

	// Method call for twitter
	public void clicklogin() {
		loginbutton.click();
	}
	
//method print and click Inkjet printer from the list of submenus under the printer
	public void MouseoverPrinterMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(printermenu).perform();
		List<WebElement> lists = listofprinters;
		int count = lists.size();

		for (int i = 0; i < count; ++i) {
			WebElement element = lists.get(i);

			String text = element.getAttribute("innerHTML");
			System.out.println("Link name is " + text);

			if (text.equalsIgnoreCase("Inkjet Printers"))
				;
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(element)).click();
			break;
		}

	}

//method to log out of page
	public void Clicklogout() {
		new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(logoutbutton)).click();
	}
}