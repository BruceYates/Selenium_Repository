package bestFriendsLevel1;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import testClasses.SeleniumSimplifiedTest;
import pageObjects.GetInvolved_Page;

public class GetInvolvedLevel1 extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	static GetInvolved_Page getInvolved_Page;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		getInvolved_Page = new GetInvolved_Page(selenium);
		getInvolved_Page.open();
	}
		
	@Test
	public void GetInvolvedPage(){
	    System.out.println("Get Involved Page...testing");
		getInvolved_Page = new GetInvolved_Page(selenium);
		assertTrue(selenium.isTextPresent("Donate Now"));
		assertTrue(getInvolved_Page.isGetInvolvedHeroImagePresent());
	}
}
;