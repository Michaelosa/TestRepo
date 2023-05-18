package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_details_page {
  WebDriver driver;
	
	public Order_details_page(WebDriver driver) {  // 
		this.driver =driver; // joins 2  drivers together to become one 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "finish")
	WebElement FinishButton;
	
	public void clickOnFinsihButton() {
		FinishButton.click();
	}
		
	
}
