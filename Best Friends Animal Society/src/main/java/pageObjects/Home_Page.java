package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class Home_Page {

	private Selenium selenium;

	public Home_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void openHome() {
		selenium.open("/");
		selenium.click("link=Home");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickWhatWeDo() {
		selenium.open("/");
	    //selenium.waitForPageToLoad("30000");
		selenium.click("link=What We Do");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void openAdoptAPet() {
		selenium.open("/");
		selenium.click("link=Adopt A Pet");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Home page slider
	public boolean isHomePageSliderPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.flex-container div#main-slider.flexslider";
		return selenium.isElementPresent(pageElement);
	}
	
	// Home CTA Component Panel - Donate; Adopt; Volunteer
	public boolean isHomePageCTAComponentPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.cta-component-container div.cta-component div.panel";
		return selenium.isElementPresent(pageElement);
	}
	
	// Home Sub Panel - Latest News; Best Friends Blog; Featured Video
	public boolean isHomePageSubPanelPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content";
		return selenium.isElementPresent(pageElement); 
	}
}

