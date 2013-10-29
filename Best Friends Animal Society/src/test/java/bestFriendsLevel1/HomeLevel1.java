package bestFriendsLevel1;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.Home_Page;

public class HomeLevel1 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static Home_Page home_Page;
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		home_Page = new Home_Page(selenium);
		home_Page.openHome();
	}
		
	@Test
	public void HomePage(){
		home_Page = new Home_Page(selenium);
	    System.out.println("Home Page...testing");
	    assertTrue(home_Page.isHomePageSliderPresent());
		assertTrue(home_Page.isHomePageCTAComponentPresent());
		assertTrue(home_Page.isHomePageSubPanelPresent());
	}
}
