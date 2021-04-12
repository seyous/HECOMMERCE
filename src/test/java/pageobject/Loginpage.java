package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class Loginpage {

	WebDriver driver;

	// Constructor for the webdriver
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}

	// Collection of web element
	@FindBy(how = How.CSS, using = "#emailAddress")
	private WebElement emailaddress;

	@FindBy(how = How.XPATH, using = "//*[@id='account-container']/h1")
	private WebElement logincontainer;

	@FindBy(how = How.XPATH, using = "//*[@id='homemast']/div/div[2]/div/div/h2")
	private WebElement loginmessage;

	@FindBy(how = How.ID, using = "registerRadio")
	private WebElement registeradiobutton;

	@FindBy(how = How.ID, using = "submit")
	private WebElement submitbutton;

	@FindBy(how = How.XPATH, using = "//*[@id='account-container']/h1")
	private WebElement register;

	@FindBy(how = How.XPATH, using = "//*[@id='password']")
	private WebElement passwordbox;

	@FindBy(how = How.XPATH, using = "//*[@id='registerLink']")
	private WebElement registerbutton;

	@FindBy(how = How.XPATH, using = "//*[@id='FullName']")
	private WebElement fullnametextbox;

	@FindBy(how = How.XPATH, using = "//*[@id='account-container']/form/button")
	private WebElement continuebutton;

	// Create different emails for log in
	public void Enteremail() {
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "User" + userName + "@yahoo.com";
		emailaddress.sendKeys(emailID);
	}

	// Enter the user name
	public void Enterfullname() {
		fullnametextbox.sendKeys("OLUSEYI OJO");
	}

	// Click continue to log new user
	public void Clickcontinuebutton() {
		continuebutton.click();
	}

	// Click on the submit button
	public void Clicksubmitbutton() {
		submitbutton.click();
	}

	// Select the radio button
	public void SelectRadiobutton() {
		registeradiobutton.click();
	}

	// Enter the password
	public void Enterpassword() {
		passwordbox.sendKeys("Obasanjo123");
	}

	// Click the register button
	public void Clickregisterbutton() {
		registerbutton.click();
	}

	// Assert login
	public void Verifylogin() {
		String loginText = logincontainer.getText();
		Assert.assertEquals(loginText, "Sign in... or Sign up");
	}

	// Assert the to verify registration
	public void Verifyregistration() {
		String registerText = register.getText();
		Assert.assertEquals(registerText, "Register");
	}

	// Assert the the log in
	public void LoginInfo() {
		String loginText = loginmessage.getText();
		Assert.assertEquals(loginText, "LOOKING FOR A NEW PRINTER?");
	}

}
