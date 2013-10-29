package bestFriendsLevel1;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.OurNoKillMission_Page;

public class OurNoKillMissionLevel1 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static OurNoKillMission_Page ourNoKillMission_Page;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		ourNoKillMission_Page = new OurNoKillMission_Page(selenium);
		ourNoKillMission_Page.open();
	}
		
	@Test
	public void OurNoKillMissionPage(){
	    System.out.println("Our No Kill Mission Page...testing");
		ourNoKillMission_Page = new OurNoKillMission_Page(selenium);
		assertTrue(ourNoKillMission_Page.isOurNoKillMissionTheProblemLinkPresent());
		assertTrue(ourNoKillMission_Page.isOurNoKillMissionPartnerNetworkLinkPresent());
		assertTrue(ourNoKillMission_Page.isOurNoKillMissionLocalProgramsLinkPresent());
		assertTrue(ourNoKillMission_Page.isOurNoKillMissionOurEventsLinkPresent());
		assertTrue(ourNoKillMission_Page.isOurNoKillMissionOurInitiativesLinkPresent());
		assertTrue(ourNoKillMission_Page.isOurNoKillMissionOurSanctuaryLinkPresent());
	}
}
