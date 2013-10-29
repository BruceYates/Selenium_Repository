package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class ShareOnFacebook_Page {

	private Selenium selenium;

	public ShareOnFacebook_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void clickShareOnFacebookLink() {
	    selenium.click("link=Share on Facebook");
	    selenium.waitForPageToLoad("30000");
	}
}

