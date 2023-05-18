package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	
	public static WebDriver launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome"))  {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		
		} else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver(); 			
		} else if(browser.equalsIgnoreCase("Edge")) {
		    return new EdgeDriver(); 
		} else if(browser.equalsIgnoreCase("Opera")) {
		    return new OperaDriver ();
		} else {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
			
		}
			

	}

}
