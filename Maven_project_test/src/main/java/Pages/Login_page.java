package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	public Login_page(WebDriver driver) {  // 
		this.driver =driver; // joins 2  drivers together to become one 
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(id="user-name")
	WebElement username;
	
   @FindBy(id="password")
   WebElement password;
   
   
   
   @FindBy(id="login-button")
	WebElement loginbutton;
   
   
   public void enterUserName(String user) {  //right way
	   username.sendKeys(user);              // right way
   }
	   
	
	
	public void enterPassword(String pword ) {       
		password.sendKeys( pword);	
		}

	public void clickOnLoginButton() {
		loginbutton.click();
	}	
	
	public void loginToSauceDemoSite(String user,  String pword) {
		username.sendKeys( user);
		password.sendKeys( pword); 
		
		loginbutton.click(); 
	}
   }
   
   
  

   
   
   
