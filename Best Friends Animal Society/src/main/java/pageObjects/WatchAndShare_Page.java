package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class WatchAndShare_Page {

	private Selenium selenium;

	public WatchAndShare_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void clickWatchAndShareLink() {
	    selenium.click("link=Watch and Share");
	    selenium.waitForPageToLoad("30000");
	}
}

