package testcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobject.Homepage;
import pageobject.Loginpage;
import pageobject.Productpage;
import pageobject.Shippingpage;
import utils.Browserdriver;
import utils.Waitforelement;

public class PurchaseproductTest {

	@Test
	public void Purchaseproduct() throws Exception {

		WebDriver driver = Browserdriver.getDriver();
		Homepage Homepage = PageFactory.initElements(driver, Homepage.class);
		Loginpage Loginpage = PageFactory.initElements(driver, Loginpage.class);
		Productpage Productpage = PageFactory.initElements(driver, Productpage.class);
		Shippingpage Shippingpage = PageFactory.initElements(driver, Shippingpage.class);
		Waitforelement.wait(driver);
		Homepage.clickcookiesbutton();
		Homepage.clicklogin();
		Waitforelement.wait(driver);
		Loginpage.Verifylogin();
		Loginpage.Enteremail();
		Loginpage.SelectRadiobutton();
		Loginpage.Clickregisterbutton();
		Loginpage.Verifyregistration();
		Waitforelement.wait(driver);
		Loginpage.Enterfullname();
		Loginpage.Enterpassword();
		Loginpage.Clickcontinuebutton();
		Waitforelement.wait(driver);
		Homepage.MouseoverPrinterMenu();
		Waitforelement.wait(driver);
		Productpage.Productlistcontent();
		Productpage.Clickproductlisting();
		Productpage.Ordermessage();
		Productpage.Addordertobasket();
		PurchaseproductTest.Windowhandle(driver);
		Productpage.Clickaddproducttobacket();
		Productpage.Clickcheckout();
		Productpage.Checkoutmessage();
		Productpage.Clickcheckoutsecurelybutton();
		Waitforelement.Driverwait(driver);
		Shippingpage.Verifyshippingmessage();
		Shippingpage.Selecttitle();
		Waitforelement.Driverwait(driver);
		Shippingpage.Enterfullname();
		Shippingpage.Enterpostcode();
		Shippingpage.Enterstreetname();
		Waitforelement.Driverwait(driver);
		Shippingpage.Enteraddresscity();
		Shippingpage.Enterextendeddress();
		Waitforelement.Driverwait(driver);
		Shippingpage.Entercompanyname();
		Shippingpage.Entercountryaddresscode();
		Waitforelement.Driverwait(driver);
		Shippingpage.Entercounty();
		Shippingpage.Enteraddressphone();
		Waitforelement.Driverwait(driver);
		Shippingpage.Enteraddressmobile();
		Waitforelement.Driverwait(driver);
		Shippingpage.Clicksubmitbutton();
		Waitforelement.Driverwait(driver);
		Shippingpage.Verifypaymentpage();
		Waitforelement.Driverwait(driver);
		Browserdriver.quitDriver(driver);
	}

	// method to switch between the parent window and child window
	public static void Windowhandle(WebDriver driver) {
		String originalwindow = driver.getWindowHandle();
	for (String childWindowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(childWindowHandle);

		}
	}

}
