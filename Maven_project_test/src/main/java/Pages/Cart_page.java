package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {

	WebDriver driver;
	
	public Cart_page(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "checkout")
	WebElement checkout;
	
	public void clickcheckout() {
		checkout.click();
	}
}
