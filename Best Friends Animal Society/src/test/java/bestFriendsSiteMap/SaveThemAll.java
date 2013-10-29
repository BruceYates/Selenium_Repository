package bestFriendsSiteMap;

import static org.junit.Assert.*;
import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.WebDriver;
import testClasses.ExternalWindowHandler;
import pageObjects.OurWork_Page;
import pageObjects.SaveThemAll_Page;
import pageObjects.SimpleActions_Page;

public class SaveThemAll {
	
	private Selenium selenium;
	private WebDriver driver;

	public SaveThemAll(Selenium selenium, WebDriver driver) {
		this.selenium = selenium;
		this.driver = driver;
	}
	
	String winHandleBefore;
	
	static OurWork_Page ourWork_Page;
	static SaveThemAll_Page saveThemAll_Page;
	static SimpleActions_Page simpleActions_Page;
	static ExternalWindowHandler externalWindowHandler;
	
	public void SaveThemAll_Test() throws InterruptedException {
		
		ourWork_Page = new OurWork_Page(selenium);
	    saveThemAll_Page = new SaveThemAll_Page(selenium);
	    simpleActions_Page = new SimpleActions_Page(selenium);
		externalWindowHandler = new ExternalWindowHandler(driver);
		
		////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All
		////////////////////////////////////////////////////////
	    
		// What We Do -> Our Work : click Save Them All link
		ourWork_Page.clickSaveThemAll();
		
		// What We Do -> Our Work -> Save Them All : page content
	    System.out.println("What We Do -> Our Work -> Save Them All");
	    assertTrue(saveThemAll_Page.isSaveThemAllPresent());
	    assertTrue(saveThemAll_Page.areLinksPresent());
	    assertTrue(saveThemAll_Page.isSimpleActionsLinkPresent());
	    
		/////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Looking for more ways to help save lives
		/////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Ways to help save lives");	 
	    saveThemAll_Page.clickSimpleActionsLink();

	    assertTrue(saveThemAll_Page.isSimpleActionsSplashPresent());
	    saveThemAll_Page.closeSimpleActionsPage();
	    
		/////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Adopt -> Sanctuary Animals
		/////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Sanctuary Animals");	
		saveThemAll_Page.clickAdoptLink();
		selenium.goBack();
		
		///////////////////////////////////////////////////////
	    // What We Do -> Our Work -> Save Them All -> Donate
		///////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Donate");
		saveThemAll_Page.clickDonateLink();
		selenium.goBack();
		
		//////////////////////////////////////////////////////////
	    // What We Do -> Our Work -> Save Them All -> Volunteer
		//////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Volunteer");
		saveThemAll_Page.clickVolunteerLink();
		selenium.goBack();
		
		////////////////////////////////////////////////////////////
	    // What We Do -> Our Work -> Save Them All -> Spay/neuter
		////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spay/neuter");
		saveThemAll_Page.clickSpayNeuterLink();
		selenium.goBack();
	    
		///////////////////////////////////////////////////////////////////
	    // What We Do -> Our Work -> Save Them All -> trap/neuter/return
		///////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> trap/neuter/return");
		saveThemAll_Page.clickTrapNeuterReturnLink();
		selenium.goBack();
		
		///////////////////////////////////////////////////////////////////
	    // What We Do -> Our Work -> Save Them All -> Spread the word
		///////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread the word");
		saveThemAll_Page.clickSpreadTheWordLink();
		selenium.goBack();
		
		///////////////////////////////////////////////////////////////////////////
	    // What We Do -> Our Work -> Save Them All -> Spread the Word - Facebook
		///////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread the Word - Facebook");	
	    
	    winHandleBefore = "";
	    winHandleBefore = externalWindowHandler.savePresentWindow(winHandleBefore);
	    
	    saveThemAll_Page.clickFacebookLink();
	    
	    externalWindowHandler.restorePreviousWindow(winHandleBefore);
	    		
		//////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Spread the Word - Twitter
		//////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread the Word - Twitter");	
	    
	    winHandleBefore = "";
	    winHandleBefore = externalWindowHandler.savePresentWindow(winHandleBefore);
	    
	    saveThemAll_Page.clickTwitterLink();

	    externalWindowHandler.restorePreviousWindow(winHandleBefore);
	    
		////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Watch and share our videos
		////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Watch and share our videos");	
	    
	    winHandleBefore = "";
	    winHandleBefore = externalWindowHandler.savePresentWindow(winHandleBefore);
	    
	    saveThemAll_Page.clickWatchAndShareLink();
	    
	    externalWindowHandler.restorePreviousWindow(winHandleBefore);

	}
}
