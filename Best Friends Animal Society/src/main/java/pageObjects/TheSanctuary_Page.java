package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class TheSanctuary_Page {

	private Selenium selenium;

	public TheSanctuary_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void open() {
		selenium.open("/");
		selenium.click("link=The Sanctuary");
		selenium.waitForPageToLoad("10000");
	}
    
	// The Sanctuary Hero Image
	public boolean isTheSanctuaryHeroImagePresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.hero-image";
		return selenium.isElementPresent(pageElement); 
			
	}
}

