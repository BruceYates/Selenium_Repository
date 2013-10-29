package bestFriendsSiteMap;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.Selenium;
import pageObjects.OurWork_Page;

public class OurWork {
	
	private Selenium selenium;

	public OurWork(Selenium selenium) {
		this.selenium = selenium;
	}
	
	static OurWork_Page ourWork_Page;

	public void OurWork_Test() throws InterruptedException {
		
		ourWork_Page = new OurWork_Page(selenium);
		
	    // What We Do -> Our Work : page content
	    System.out.println("What We Do -> Our Work");

		assertTrue(ourWork_Page.isOurWork_SubPanelPresent());
		assertTrue(ourWork_Page.isOurWork_ButtonsPresent());
		assertTrue(ourWork_Page.isOurWork_LeftLinksPresent());
		assertTrue(ourWork_Page.isOurWork_TextLinksPresent());

	}
}
