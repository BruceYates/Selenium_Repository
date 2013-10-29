package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class SanctuaryAnimals_Page {

	private Selenium selenium;

	public SanctuaryAnimals_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void clickAllLink() {
	    selenium.click("link=All");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickBarnyardLink() {
	    selenium.click("link=Barnyard");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickBirdLink() {
	    selenium.click("link=Bird");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickCatLink() {
	    selenium.click("link=Cat");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickDogLink() {
	    selenium.click("link=Dog");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickHorseLink() {
	    selenium.click("link=Horse");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickPigLink() {
	    selenium.click("link=Pig");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickRabbitLink() {
	    selenium.click("link=Rabbit");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void clickSmallAndFurryLink() {
	    selenium.click("link=Small & Furry");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Adopt A Pet Hero Image Wrap
	public boolean isAdoptAPetHeroImagePresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.main-content div.hero-image-adopt div.hero-image-wrap";
		return selenium.isElementPresent(pageElement);
	}
}

