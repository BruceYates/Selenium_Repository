package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class GetInvolved_Page {

	private Selenium selenium;

	public GetInvolved_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void open() {
		selenium.open("/");
		selenium.click("link=Get Involved");
	    selenium.waitForPageToLoad("10000");
	}
	
	// Get Involved Hero Image
	public boolean isGetInvolvedHeroImagePresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.hero-image";
		return selenium.isElementPresent(pageElement);
	}
}

