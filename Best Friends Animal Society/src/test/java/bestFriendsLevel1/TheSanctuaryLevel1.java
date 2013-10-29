package bestFriendsLevel1;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.TheSanctuary_Page;

public class TheSanctuaryLevel1 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static TheSanctuary_Page theSanctuary_Page;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		theSanctuary_Page = new TheSanctuary_Page(selenium);
		theSanctuary_Page.open();
	}
		
	@Test
	public void TheSanctuary_Page(){
	    System.out.println("The Sanctuary Page...testing");
		theSanctuary_Page = new TheSanctuary_Page(selenium);
		assertTrue(selenium.isTextPresent("Sanctuary Map"));
		assertTrue(theSanctuary_Page.isTheSanctuaryHeroImagePresent());
	}
}
