package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class DonateNow_Page {

	private Selenium selenium;

	public DonateNow_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void clickDonateNowButton() {
		selenium.click("css=div.left-navigation > ul > li > a");
		selenium.waitForPageToLoad("30000");
	}
}

