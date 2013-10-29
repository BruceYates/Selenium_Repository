package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class WatchOtherVideos_Page {

	private Selenium selenium;

	public WatchOtherVideos_Page(Selenium selenium) {
		this.selenium = selenium;
	}
	
	public void clickWatchOtherVideosLink() {
	    selenium.click("link=Watch other videos");
	    selenium.waitForPageToLoad("30000");
	}
}

