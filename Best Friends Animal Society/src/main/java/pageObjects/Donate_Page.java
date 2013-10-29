package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class Donate_Page {

	private Selenium selenium;

	public Donate_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void clickDonateButton() {
	    selenium.click("css=html.gt-ie8 body.large-screen form#aspnetForm div.cta-component-container div.cta-component div.panel div.panel-content div.donation a#ctl00_cphMainContent_DonateControl_LinkButtonDonate.btn");
	    selenium.waitForPageToLoad("30000");
	}
}

