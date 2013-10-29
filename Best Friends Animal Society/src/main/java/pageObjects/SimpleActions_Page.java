package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class SimpleActions_Page {

	private Selenium selenium;

	public SimpleActions_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public boolean isSimpleActionsSplashContentPresent() {
		String pageElement = "//*[@id='moreways']";
		return selenium.isElementPresent(pageElement);
	}
}

