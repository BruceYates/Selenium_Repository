package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class AdoptAPet_Page {

	private Selenium selenium;

	public AdoptAPet_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void open() {
		selenium.open("/");
		selenium.click("link=Adopt A Pet");
	    selenium.waitForPageToLoad("10000");
	}
	
	public void clickAdoptButton() {
	    selenium.click("//html/body/form/div[6]/div/div[2]/div[2]/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickAdoptFromBestFriendsLA() {
	    selenium.click("xpath=(//a[contains(text(),'Adopt from Best Friends L.A.')])[3]");
		//selenium.click("//html/body/form/div[5]/div/div/div[3]/ul/li[2]/a");
		selenium.waitForPageToLoad("30000");
	}
	
	public void clickAdoptNearYou() {
	    selenium.click("xpath=(//a[contains(text(),'Adopt Near You')])[3]");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickAdoptFromUs() {
	    selenium.click("link=adopt from us");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickPetfinder() {
	    selenium.click("link=Petfinder.com");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickPetango() {
	    selenium.click("link=Petango.com");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickHowToAdopt() {
	    selenium.click("xpath=(//a[contains(text(),'How to Adopt')])[3]");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickAdoptionPromotion() {
	    selenium.click("xpath=(//a[contains(text(),'Adoption Promotion')])[3]");
	    selenium.waitForPageToLoad("30000");
	}

	public void clickRecentlyAdopted() {
	    selenium.click("xpath=(//a[contains(text(),'Recently Adopted')])[3]");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Adopt A Pet Hero Image Wrap
	public boolean isAdoptAPetHeroImagePresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.hero-image-adopt div.hero-image-wrap";
		return selenium.isElementPresent(pageElement);
	}
}

