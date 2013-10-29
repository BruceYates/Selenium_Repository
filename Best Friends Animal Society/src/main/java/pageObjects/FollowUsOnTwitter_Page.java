package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class FollowUsOnTwitter_Page {

	private Selenium selenium;

	public FollowUsOnTwitter_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void clickFollowUsOnTwitterLink() {
	    selenium.click("link=Follow us on Twitter");
	    selenium.waitForPageToLoad("30000");
	}
}

