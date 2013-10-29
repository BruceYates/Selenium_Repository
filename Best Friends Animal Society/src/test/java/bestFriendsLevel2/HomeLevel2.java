package bestFriendsLevel2;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.Home_Page;
import pageObjects.Donate_Page;
import pageObjects.AdoptAPet_Page;
import pageObjects.Volunteer_Page;

public class HomeLevel2 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static Home_Page home_Page;
	static Donate_Page donate_Page;
	static AdoptAPet_Page adoptAPet_Page;
	static Volunteer_Page volunteer_Page;
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		selenium.open("/");
//		selenium.click("link=Home");
//	    selenium.waitForPageToLoad("10000");
//	}
	
	@Before
	public void setUpBefore() throws IOException {
		home_Page = new Home_Page(selenium);
		home_Page.openHome();
	}
		
	@Test
	public void Donate(){
	    System.out.println("Home->Donate Page...testing");
	    donate_Page = new Donate_Page(selenium);
        donate_Page.clickDonateButton();
	    assertTrue(selenium.isTextPresent("Make a Gift"));
	}
	
	@Test
	public void Adopt(){
	    System.out.println("Home->Adopt Page...testing");
	    adoptAPet_Page = new AdoptAPet_Page(selenium);
	    adoptAPet_Page.clickAdoptButton();
	    assertTrue(selenium.isTextPresent("Sanctuary Animals"));
	}
	
	@Test
	public void Volunteer(){
	    System.out.println("Home->Volunteer Page...testing");
	    volunteer_Page = new Volunteer_Page(selenium);
	    volunteer_Page.clickVolunteerButton();
	    assertTrue(selenium.isTextPresent("Volunteer with Best Friends"));
	}
}
