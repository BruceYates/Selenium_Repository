package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class OurNoKillMission_Page {

	private Selenium selenium;

	public OurNoKillMission_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void open() {
		selenium.open("/");
		selenium.click("link=Our No Kill Mission");
	    selenium.waitForPageToLoad("10000");
	}
	
	// The Problem link
	public boolean isOurNoKillMissionTheProblemLinkPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content div.NoKillMission div#wrapper header#header nav#nav ul li.btn-problem";
		return selenium.isElementPresent(pageElement);
	}
	
	// Partner Network link
	public boolean isOurNoKillMissionPartnerNetworkLinkPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content div.NoKillMission div#wrapper header#header nav#nav ul li.btn-partner-network";
		return selenium.isElementPresent(pageElement);
			
	}
	
	// Local Programs link
	public boolean isOurNoKillMissionLocalProgramsLinkPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content div.NoKillMission div#wrapper header#header nav#nav ul li.btn-local-programs";
		return selenium.isElementPresent(pageElement); 
			
	}
	
	// Our Events link
	public boolean isOurNoKillMissionOurEventsLinkPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content div.NoKillMission div#wrapper header#header nav#nav ul li.btn-our-events";
		return selenium.isElementPresent(pageElement); 
			
	}
	
	// Our Initiatives link
	public boolean isOurNoKillMissionOurInitiativesLinkPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content div.NoKillMission div#wrapper header#header nav#nav ul li.btn-our-initiatives";
		return selenium.isElementPresent(pageElement); 
			
	}
	
	// Our Sanctuary link
	public boolean isOurNoKillMissionOurSanctuaryLinkPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.text-content div.NoKillMission div#wrapper header#header nav#nav ul li.btn-our-sanctuary";
		return selenium.isElementPresent(pageElement); 
			
	}
}