package bestFriendsSiteMap;

import testClasses.SeleniumSimplifiedTest;
import java.io.IOException;
import org.junit.*;
import org.junit.runners.MethodSorters;
import pageObjects.Home_Page;
import bestFriendsSiteMap.OurWork;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class WhatWeDo extends SeleniumSimplifiedTest{
	
	static Home_Page home_Page;	
	static OurWork ourWork;
	static SaveThemAll saveThemAll;
	
	@BeforeClass
	public static void setUpBefore() throws IOException {
		///////////////////////////////////////
	    // What We Do -> Our Work 
		///////////////////////////////////////
		home_Page = new Home_Page(selenium);
		home_Page.clickWhatWeDo();
	}
	
	@Test
	public void WhatWeDo_Test() throws InterruptedException{
		
		ourWork = new OurWork(selenium);
		saveThemAll = new SaveThemAll(selenium, driver);
		
	    // What We Do -> Our Work : page content
		ourWork.OurWork_Test();
		
		// What We Do -> Our Work -> Save Them All
		saveThemAll.SaveThemAll_Test();
		
	}

}
