package bestFriendsSiteMap;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.Home_Page;

public class Home_Volunteer_AtTheSanctuary extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static Home_Page homePage;
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		selenium.open("/");
//		selenium.click("link=Home");
//	    selenium.waitForPageToLoad("10000");
//	}
	
	@Before
	public void setUpBefore() throws IOException {
		selenium.open("/");
		selenium.click("link=Home");
	    selenium.waitForPageToLoad("30000");
	}
		
	@Test
	public void Volunteer(){
	    System.out.println("Home->Volunteer Page...testing");
	    selenium.click("//html/body/form/div[6]/div/div[3]/div[2]/a");
	    selenium.waitForPageToLoad("30000");
	    assertTrue(selenium.isTextPresent("Volunteer with Best Friends"));
	    selenium.click("link=At the Sanctuary");
	    selenium.waitForPageToLoad("30000");
	    assertTrue(selenium.isTextPresent("Volunteer at the Sanctuary"));
	}
}
