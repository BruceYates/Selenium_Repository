package bestFriendsLevel1;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.Home_Page;
import pageObjects.SanctuaryAnimals_Page;

public class AdoptAPetLevel1 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static Home_Page home_Page;
	static SanctuaryAnimals_Page sanctuaryAnimals_Page;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		home_Page = new Home_Page(selenium);
		home_Page.openAdoptAPet();
	}
		
	@Test
	public void AdoptAPet(){
	    System.out.println("Santuary Animals Page");
		sanctuaryAnimals_Page = new SanctuaryAnimals_Page(selenium);
		assertTrue(selenium.isTextPresent("Select an Animal"));
		assertTrue(sanctuaryAnimals_Page.isAdoptAPetHeroImagePresent());
		
		
	}
}
;