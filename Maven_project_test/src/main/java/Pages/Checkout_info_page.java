package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_info_page {
	WebDriver driver;
	
	public Checkout_info_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	 
	@FindBy(id ="first-name")
	WebElement firstname;
	
	
	@FindBy(id ="last-name")
	WebElement lastname;
	
	@FindBy(id ="postal-code")
	WebElement postcode;
	
	@FindBy(id = "continue")
	WebElement Continue;
	
	public void enterFirstname(String First_name) {
		firstname.sendKeys( First_name);
	}
	
	public void enterlastname(String Last_name) {
		lastname.sendKeys( Last_name);
	}
		
	public void enterPostcode(String Post_code) {
		postcode.sendKeys( Post_code);
	}
	
	public void clickOnContinueButton() {
		Continue.click();
		
	}
	
	
	}
	
