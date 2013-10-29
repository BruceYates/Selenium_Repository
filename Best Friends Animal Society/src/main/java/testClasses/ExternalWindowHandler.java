package testClasses;

//import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;

public class ExternalWindowHandler {

	//Selenium selenium;
	WebDriver driver;
	//private WebDriver driver;
	String winHandleBefore = "";

	//public ExternalWindowHandler(Selenium selenium) {
		//this.selenium = selenium;
	//}
	
	public ExternalWindowHandler(WebDriver driver) {
		this.driver = driver;
	}
	
	public String savePresentWindow(String winHandleBefore) {
	    return winHandleBefore = driver.getWindowHandle();
	}
	
	public void restorePreviousWindow(String winHandleBefore) {
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	}
}

