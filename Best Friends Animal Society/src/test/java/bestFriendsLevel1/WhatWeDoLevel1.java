package bestFriendsLevel1;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.OurWork_Page;

public class WhatWeDoLevel1 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static OurWork_Page ourWork_Page;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		ourWork_Page = new OurWork_Page(selenium);
		ourWork_Page.openOurWork();
	}
		
	@Test
	public void WhatWeDo_OurWork(){
	    System.out.println("What We Do Page -> Our Work...testing");
		ourWork_Page = new OurWork_Page(selenium);
		assertTrue(ourWork_Page.isOurWork_SubPanelPresent());
		assertTrue(ourWork_Page.isOurWork_ButtonsPresent());
		assertTrue(ourWork_Page.isOurWork_LeftLinksPresent());
		assertTrue(ourWork_Page.isOurWork_TextLinksPresent());
	}
}
