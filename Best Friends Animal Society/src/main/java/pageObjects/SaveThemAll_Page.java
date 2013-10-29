package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class SaveThemAll_Page {

	private Selenium selenium;

	public SaveThemAll_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	// Click the Simple Actions link
	public void clickSimpleActionsLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	public void closeSimpleActionsPage() {
	    selenium.click("id=fancybox-close");
	    selenium.waitForPageToLoad("30000");
	}
	
	public boolean isSimpleActionsSplashPresent() {
		String pageElement = "//*[@id='moreways']";
		return selenium.isElementPresent(pageElement);
	}
	

	
	// Click on Adopt link
	public void clickAdoptLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click on Donate link
	public void clickDonateLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[2]/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click on Volunteer link
	public void clickVolunteerLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[3]/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click on Spay/neuter link
	public void clickSpayNeuterLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[4]/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click on trap/neuter/return link
	public void clickTrapNeuterReturnLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[4]/a[2]");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click on Spread the word link
	public void clickSpreadTheWordLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[5]/a[1]");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click the Facebook link
	public void clickFacebookLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[5]/a[2]");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click the Twitter link
	public void clickTwitterLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[5]/a[3]");
	    selenium.waitForPageToLoad("30000");
	}
	
	// Click the Watch and share our videos link
	public void clickWatchAndShareLink() {
	    selenium.click("//html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p[6]/a");
	    selenium.waitForPageToLoad("30000");
	}
	
	// SAVE THEM ALL is present
	public boolean isSaveThemAllPresent() {
		String pageElement = "css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.content div.main-content div.text-content";
		return selenium.isElementPresent(pageElement); 
	}
	
	// Spread The Word - Share on Facebook is present
	//public boolean isShareOnFacebookPresent() {
	//	String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[3]";
	//	return selenium.isElementPresent(pageElement);
	//}
	
	// Spread The Word - Tweet This is present
	//public boolean isTweetThisPresent() {
	//	String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[4]";
	//	return selenium.isElementPresent(pageElement);
	//}
	
	// Spread The Word - Watch and Share is present
	//public boolean isWatchAndSharePresent() {
	//	String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[5]";
	//	return selenium.isElementPresent(pageElement);
	//}

	// Page links are present
	public boolean areLinksPresent() {
		String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[2]/p/a";
		return selenium.isElementPresent(pageElement);
	}
	
	// Simple actions to Save Them All link is present
	public boolean isSimpleActionsLinkPresent() {
		String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div/a";
		return selenium.isElementPresent(pageElement);
	}

	// Help Us Save Them All - Make a Donation is present
	//public boolean isMakeADonationPresent() {
	//	String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[11]";
	//	return selenium.isElementPresent(pageElement);
	//}
	
	// Help Us Save Them All - Volunteer is present
	//public boolean isVolunteerPresent() {
	//	String pageElement = "xpath=/html/body/form/div[5]/div/div/div/div[5]/div/div[2]/div[12]";
	//	return selenium.isElementPresent(pageElement);
	//}
}

