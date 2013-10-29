package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class OurWork_Page {

	private Selenium selenium;

	public OurWork_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void openOurWork() {
		selenium.open("/");
		selenium.click("link=What We Do");
	    selenium.waitForPageToLoad("10000");
	}
    
	// Sub-panel jpg is present
	public boolean isOurWork_SubPanelPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.hero-image img";
		return selenium.isElementPresent(pageElement); 
	}
	
	// Donate - Volunteer - Adopt buttons are present
	public boolean isOurWork_ButtonsPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.left-navigation div#ctl00_ctl00_cphMainContent_cphInnerContent_cbLeftMetaContent div div.related-article-compnonent a.article-title img.article-img";
		return selenium.isElementPresent(pageElement);
	}
	
	// Left links are present
	public boolean isOurWork_LeftLinksPresent(){
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.left-navigation ul li a";
		return selenium.isElementPresent(pageElement);
	}
	
	// Text links are present
	public boolean isOurWork_TextLinksPresent(){
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content p description a";
		return selenium.isElementPresent(pageElement);
	}
	
	// Save Them All link
	public void clickSaveThemAll() {
		selenium.click("link=Save Them All");
		selenium.waitForPageToLoad("30000");
	}
}

