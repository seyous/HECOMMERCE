package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Shippingpage {

	WebDriver driver;

	// Constructor for the webdriver
	public Shippingpage(WebDriver driver) {
		this.driver = driver;
	}

	// Collection of web element
	@FindBy(how = How.ID, using = "Address_TitleId")
	private WebElement titltField;

	// Collection of web element
	@FindBy(how = How.ID, using = "Address_CustomerNameFull")
	private WebElement fullName;

	@FindBy(how = How.ID, using = "Address_Postcode")
	private WebElement addressPostcode;

	@FindBy(how = How.ID, using = "Address_CompanyName")
	private WebElement companyName;

	@FindBy(how = How.ID, using = "Address_StreetAddress")
	private WebElement streetAddress;

	@FindBy(how = How.ID, using = "Address_ExtendedAddress")
	private WebElement extendedAddress;

	@FindBy(how = How.ID, using = "Address_City")
	private WebElement addressCity;

	@FindBy(how = How.ID, using = "Address_County")
	private WebElement addressCounty;

	@FindBy(how = How.ID, using = "Address_CountryCode")
	private WebElement addressCountrycode;

	@FindBy(how = How.ID, using = "Address_Phone")
	private WebElement addressPhone;

	@FindBy(how = How.ID, using = "Address_Mobile")
	private WebElement addressMobile;

	@FindBy(how = How.ID, using = "Next-Button")
	private WebElement submitButton;

	@FindBy(how = How.XPATH, using = "//*[@id='checkoutmast']/div/h1/span")
	private WebElement ShippingAddressMessage;

	@FindBy(how = How.XPATH, using = "//*[@id='pay-by-card']/div/h3")
	private WebElement selectPayment;

	// method declaration
	public void Selecttitle() {
		Select drpTitle = new Select(titltField);
		drpTitle.selectByVisibleText("Mr");
	}

	// Enter country info
	public void Entercounty() {
		addressCounty.sendKeys("");
	}

	// Click the submit button
	public void Clicksubmitbutton() {
		submitButton.click();
	}

	// Enter the address info
	public void Enteraddressmobile() {
		addressMobile.sendKeys("07865555678");
	}

	// Enter phone number
	public void Enteraddressphone() {
		addressPhone.sendKeys("07865555678");
	}

	// Enter country address code
	public void Entercountryaddresscode() {
		addressCountrycode.sendKeys("United Kingdom");
	}

	// Enter street name
	public void Enterstreetname() {
		int n = 20;
		for (int i = 0; i <= n; i++) {
			streetAddress.sendKeys("Flat" + i, "Devonshire Court, 19, Manor Gardens");
			break;
		}

	}

	public void Enterextendeddress() {
		extendedAddress.sendKeys("");
	}

	public void Enteraddresscity() {
		addressCity.sendKeys("London");
	}

	// Enter the full name
	public void Enterfullname() {
		fullName.sendKeys("OLUSEYI OJO");
	}

	// Enter your post code
	public void Enterpostcode() {
		addressPostcode.sendKeys("N7 6GR");
	}

	// Enter your company name
	public void Entercompanyname() {
		companyName.sendKeys("Pure String Solutions");
	}

	// Assert the shipping page
	public void Verifyshippingmessage() {
		String shippingTextMessage = ShippingAddressMessage.getText();
		Assert.assertEquals(shippingTextMessage, "Please enter your shipping address.");
	}

	// Assert the payment page
	public void Verifypaymentpage() {
		String paymentMessage = selectPayment.getText();
		Assert.assertEquals(paymentMessage, "Select a Payment Method");
	}
}
