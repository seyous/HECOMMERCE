package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Productpage {

	WebDriver driver;

	// Constructor for the webdriver
	public Productpage(WebDriver driver) {
		this.driver = driver;
	}

	// Collection of web element
	@FindBy(how = How.XPATH, using = "//*[@id='product-list-content']/ul/li[2]/div/div/div[1]/div[1]/h2/a")
	private WebElement productlisting;

	// Collection of web element
	@FindBy(how = How.XPATH, using = "//*[@id='product-list-mast-content']/div/div/h1")
	private WebElement productlistingcontent;

	@FindBy(how = How.XPATH, using = "//*[@id='product-lead']/div[2]/div/div/form/button")
	private WebElement addtobasket;

	@FindBy(how = How.XPATH, using = "//*[@id='product-lead']/div[2]/div/div/div[2]/div/span")
	private WebElement ordermessage;

	@FindBy(how = How.XPATH, using = "//*[@id='basket-prompt-cross-sell-product-list']/li[1]/div/form/button")
	private WebElement addproducttobasket;

	@FindBy(how = How.XPATH, using = "//*[@id='add-to-basket-prompt']/div/div/div[3]/div[2]/a")
	private WebElement checkout;

	@FindBy(how = How.XPATH, using = "//*[@id='basket-checkout-links']/div/a[1]")
	private WebElement checkoutSecurely;

	
	//method declaration for web element
	public void Clickaddproducttobacket() {
		new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(addproducttobasket)).click();

	}

	//Click the check secure out button
	public void Clickcheckoutsecurelybutton() {
		checkoutSecurely.click();
	}

	//Click the product list
	public void Clickproductlisting() {
		new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(productlisting)).click();

	}

	//Click the checkout button
	public void Clickcheckout() {
		checkout.click();
	}

	//Click the add to basket button
	public void Addordertobasket() {
		new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(addtobasket)).click();

	}

	public void Productlistcontent() {
		String Productcontent = productlistingcontent.getText();
		Assert.assertEquals(Productcontent, "Inkjet Printers");
	}

	public void Ordermessage() {
		String Addproducttobacket = addtobasket.getText();
		Assert.assertEquals(Addproducttobacket, "ADD TO BASKET");
	}

	public void Checkoutmessage() {
		String Checkouttobacket = checkoutSecurely.getText();
		Assert.assertEquals(Checkouttobacket, "SECURE:CHECKOUT SECURELY");
	}

}
