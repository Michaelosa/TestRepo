package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventory_Page {
	
WebDriver driver;
	
	public Inventory_Page(WebDriver driver) {  // 
		this.driver =driver; // joins 2  drivers together to become one 
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="add-to-cart-sauce-labs-onesie")
	WebElement onsie; // adds onsie to cart// 
	
   @FindBy(id="shopping_cart_container")
   WebElement basket;

   public void addItemToCart() {
	onsie.click();
   }
	   
   public void openbasket() {
	basket.click();
}
}