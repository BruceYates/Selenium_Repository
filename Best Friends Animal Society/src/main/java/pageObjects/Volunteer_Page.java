package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class Volunteer_Page {

	private Selenium selenium;

	public Volunteer_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	//public void open() {
	//	selenium.open("/");
	//	selenium.click("link=Adopt A Pet");
	//  selenium.waitForPageToLoad("10000");
	//}
	
	public void clickVolunteerButton() {
	    selenium.click("//html/body/form/div[6]/div/div[3]/div[2]/a");
	    selenium.waitForPageToLoad("30000");
	}
    
	// Adopt A Pet Hero Image Wrap
	//public boolean isAdoptAPetHeroImagePresent() {
	//	String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.hero-image-adopt div.hero-image-wrap";
	//	return selenium.isElementPresent(pageElement);
	//}
}

