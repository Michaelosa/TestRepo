package Tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Library.Constants;
import Pages.Cart_page;
import Pages.Checkout_info_page;
import Pages.Inventory_Page;
import Pages.Login_page;
import Pages.Order_details_page;

public class Login_Tests {

	WebDriver Driver;

	@Test  // Tests to login, process and order and complete in Firefox
	public void login_Test_1() {
	Driver = Library.Browsers.launchBrowser("firefox"); 
	Driver.get(Constants.URL);
	
    Login_page login = new Login_page(Driver); 
    login.enterUserName(Constants.STANDARD_USER);
    login.enterPassword(Constants.Password);
    login.clickOnLoginButton();
    Inventory_Page inventory = new Inventory_Page(Driver);
	inventory.addItemToCart();
	inventory.openbasket();
	Cart_page Cart = new Cart_page(Driver); 
	Cart.clickcheckout();
		//Driver.quit();
	Checkout_info_page checkoutinfo = new Checkout_info_page(Driver);
	checkoutinfo.enterFirstname(Constants.First_name);
	checkoutinfo.enterlastname(Constants.Last_Name);
	checkoutinfo.enterPostcode(Constants.Post_code);
	checkoutinfo.clickOnContinueButton();
	
	Order_details_page details = new Order_details_page(Driver);
	details.clickOnFinsihButton();
	}
	
	@Test  //Tests to check if the account can be logged into with incorrect details. In chrome. 
	public void login_Test_2() {  
	Driver = Library.Browsers.launchBrowser("chrome"); 
	Driver.get(Constants.URL);
	
	 
	 Login_page Login =  new Login_page(Driver);
	 Login.loginToSauceDemoSite(Constants.LOCKED_OUT_USER, Constants.Password);
	
	    
	    
	//Driver.quit();
	}
	
}	
