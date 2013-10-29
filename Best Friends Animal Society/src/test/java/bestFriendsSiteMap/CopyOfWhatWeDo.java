package bestFriendsSiteMap;

import static org.junit.Assert.*;
import testClasses.SeleniumSimplifiedTest;
import java.io.IOException;
import org.junit.*;
import org.junit.runners.MethodSorters;
import testClasses.ExternalWindowHandler;
import pageObjects.Home_Page;
import pageObjects.OurWork_Page;
import pageObjects.SaveThemAll_Page;
import pageObjects.SimpleActions_Page;
import pageObjects.AdoptAPet_Page;
import pageObjects.ShareOnFacebook_Page;
import pageObjects.FollowUsOnTwitter_Page;
import pageObjects.WatchAndShare_Page;
import pageObjects.WatchOtherVideos_Page;
import pageObjects.SanctuaryAnimals_Page;
import pageObjects.DonateNow_Page;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CopyOfWhatWeDo extends SeleniumSimplifiedTest{
	
	String winHandleBefore;
	
	static ExternalWindowHandler externalWindowHandler;
	static OurWork_Page ourWork_Page;
	static Home_Page home_Page;
	static SaveThemAll_Page saveThemAll_Page;
	static SimpleActions_Page simpleActions_Page;
	static AdoptAPet_Page adoptAPet_Page;
	static ShareOnFacebook_Page shareOnFacebook_Page;
	static FollowUsOnTwitter_Page followUsOnTwitter_Page;
	static WatchAndShare_Page watchAndShare_Page;
	static WatchOtherVideos_Page watchOtherVideos_Page;
	static SanctuaryAnimals_Page sanctuaryAnimals_Page;
	static DonateNow_Page donateNow_Page;
	
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
		
		ourWork_Page = new OurWork_Page(selenium);
	    saveThemAll_Page = new SaveThemAll_Page(selenium);
	    simpleActions_Page = new SimpleActions_Page(selenium);
	    shareOnFacebook_Page = new ShareOnFacebook_Page(selenium);
	    followUsOnTwitter_Page = new FollowUsOnTwitter_Page(selenium);
	    watchAndShare_Page = new WatchAndShare_Page(selenium);
	    watchOtherVideos_Page = new WatchOtherVideos_Page(selenium);
	    adoptAPet_Page = new AdoptAPet_Page(selenium);
		externalWindowHandler = new ExternalWindowHandler(driver);
		
	    // What We Do -> Our Work : page content
	    System.out.println("What We Do -> Our Work");

		assertTrue(ourWork_Page.isOurWork_SubPanelPresent());
		assertTrue(ourWork_Page.isOurWork_ButtonsPresent());
		assertTrue(ourWork_Page.isOurWork_LeftLinksPresent());
		assertTrue(ourWork_Page.isOurWork_TextLinksPresent());
		
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
	    //assertTrue(saveThemAll_Page.isTheProblemPresent());
	    //assertTrue(saveThemAll_Page.isTweetThisPresent());
	    //assertTrue(saveThemAll_Page.isVolunteerPresent());
	    //assertTrue(saveThemAll_Page.isWatchAndSharePresent());
	    
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
		
	    //sanctuaryAnimals_Page = new SanctuaryAnimals_Page(selenium);
	    //sanctuaryAnimals_Page.clickAllLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickBarnyardLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickBirdLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickCatLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickDogLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickHorseLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickPigLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickRabbitLink();
	    //selenium.goBack();
	    //sanctuaryAnimals_Page.clickSmallAndFurryLink();
	    //selenium.goBack();
	    
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
	    
	    

/*	    
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt from Best Friends L.A.
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Adopt from Best Friends L.A.");
	    
	    winHandleBefore = "";
	    winHandleBefore = externalWindowHandler.savePresentWindow(winHandleBefore);
	    
	    adoptAPet_Page.clickAdoptFromBestFriendsLA();
	    
	    externalWindowHandler.restorePreviousWindow(winHandleBefore);

		//////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt Near You
		//////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Adopt Near You");
	    
	    adoptAPet_Page.clickAdoptNearYou();
	    
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt Near You -> Adopt From Us
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Adopt Near You -> Adopt From Us");
	    
	    adoptAPet_Page.clickAdoptFromUs();
	    
	    selenium.goBack();
	    
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt Near You -> Petfinder.com
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Adopt Near You -> Petfinder.com");
	    
	    winHandleBefore = "";
	    winHandleBefore = externalWindowHandler.savePresentWindow(winHandleBefore);
	    
	    adoptAPet_Page.clickPetfinder();

	    externalWindowHandler.restorePreviousWindow(winHandleBefore);
	    
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt Near You -> Petango.com
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Adopt Near You -> Petango.com");

	    winHandleBefore = "";
	    winHandleBefore = externalWindowHandler.savePresentWindow(winHandleBefore);
	    
	    adoptAPet_Page.clickPetango();

	    externalWindowHandler.restorePreviousWindow(winHandleBefore);
	    
		////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> How to Adopt
		////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> How to Adopt");
	    
	    adoptAPet_Page.clickHowToAdopt();
	    
		//////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adoption Promotion 
		//////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Adoption Promotion");
	    
	    adoptAPet_Page.clickAdoptionPromotion();
	    
		/////////////////////////////////////////////////////////////////////////////////////////////////
		// What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Recently Adopted 
		/////////////////////////////////////////////////////////////////////////////////////////////////
	    System.out.println("What We Do -> Our Work -> Save Them All -> Adopt -> Recently Adopted");
	    
	    adoptAPet_Page.clickRecentlyAdopted();
*/
	}

	
/*

	@Test
	public void HelpUsSaveThemAll_MakeADonation(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Make a Donation...testing");
	    selenium.click("link=Donate to Save Them All");
	    selenium.waitForPageToLoad("30000");
	    
	    // Donate Now
		donateNow_Page = new DonateNow_Page(selenium);
	    //selenium.click("css=div.left-navigation > ul > li > a");
	    //selenium.waitForPageToLoad("30000");
		donateNow_Page.clickDonateNowButton();
	    selenium.goBack();
	    selenium.click("link=Monthly Giving");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Sponsor an Animal");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Golden Circle Society");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Give a Tribute Gift");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Create a Fundraiser");
	    selenium.waitForPageToLoad("30000");
	    selenium.goBack();
	    selenium.click("link=Planned Giving");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Workplace Giving");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Partners & Affiliates");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Wish List");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Other Ways to Give");
	    selenium.waitForPageToLoad("30000");
	}

	@Test
	public void HelpUsSaveThemAll_MakeADonation_BecomeAGuardianAngel(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Make a Donation -> Become a Guardian Angel...testing");
	    selenium.click("link=Donate to Save Them All");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'Become a Guardian Angel')])[3]");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void HelpUsSaveThemAll_MakeADonation_ActionAlertSignUp(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Make a Donation -> Action Alert Sign Up...testing");
	    selenium.click("link=Donate to Save Them All");
	    selenium.waitForPageToLoad("30000");
	    
	    String winHandleBefore = driver.getWindowHandle();
	    
	    selenium.click("xpath=(//a[contains(text(),'Action Alert Sign Up')])[3]");
	    selenium.waitForPageToLoad("30000");
	    
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	}
	
	@Test
	public void HelpUsSaveThemAll_MakeADonation_ConnectWithUs(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Make a Donation -> Connect with Us...testing");
	    selenium.click("link=Donate to Save Them All");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'Connect with Us')])[3]");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void HelpUsSaveThemAll_Volunteer_Volunteer_AtTheSanctuary(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Volunteer -> Volunteer -> At the Sanctuary...testing");
	    selenium.click("link=Get started");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=At the Sanctuary");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Dogtown");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Cat World");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Horse Haven");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Marshall's Piggy Paradise");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Bunny House");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Rescue Village");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Parrot Garden");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Wild Friends");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=FAQs");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Internships");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Veterinary Externships");
	    selenium.waitForPageToLoad("30000");
	}

	@Test
	public void HelpUsSaveThemAll_Volunteer_Volunteer_AcrossTheCountry(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Volunteer -> Volunteer -> Across The Country...testing");
	    selenium.click("link=Get started");
	    selenium.waitForPageToLoad("30000");
	    
	    selenium.click("link=Across the Country");
	    selenium.waitForPageToLoad("30000");
	    String winHandleBefore = driver.getWindowHandle();
	    
	    selenium.click("link=Best Friends Animal Society Utah - Salt Lake City");
	    selenium.waitForPageToLoad("30000");
	    
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	    
	    //selenium.click("link=utahvolunteer@bestfriends.org");
	    //selenium.waitForPageToLoad("30000");
	    
	    selenium.click("link=Best Friends Animal Society - Los Angeles Programs");
	    selenium.waitForPageToLoad("30000");
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);

	    //selenium.click("link=volunteerLA@bestfriends.org");
	    //selenium.waitForPageToLoad("30000");

	    selenium.click("link=Best Friends Animal Society - New York");
	    selenium.waitForPageToLoad("30000");
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);

	    //selenium.click("link=tammyh@bestfriends.org");
	    //selenium.waitForPageToLoad("30000");
    
	    selenium.click("link=Strut Your Mutt");
	    selenium.waitForPageToLoad("30000");
	    selenium.goBack();	   
	    selenium.click("link=Super Adoptions");
	    selenium.waitForPageToLoad("30000");
	    selenium.goBack();	   
	    selenium.click("link=No More Homeless Pets Conference");
	    selenium.waitForPageToLoad("30000");
	    selenium.goBack();	   
	    selenium.click("link=Best Friends events page");
	    selenium.waitForPageToLoad("30000");
	    selenium.goBack();	   
	    selenium.click("link=Virtual Volunteer Opportunites");
	    selenium.waitForPageToLoad("30000");
	}

	@Test
	public void HelpUsSaveThemAll_Volunteer_Volunteer_FeaturedOpportunities(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Volunteer -> Volunteer -> Featured Opportunities...testing");
	    selenium.click("link=Get started");
	    selenium.waitForPageToLoad("30000");
	    
	    selenium.click("link=Featured Opportunities");
	    selenium.waitForPageToLoad("30000");
	    
	    selenium.click("link=Strut Your Mutt");
	    selenium.waitForPageToLoad("30000");
	    
	    selenium.click("link=Virtual Volunteer Opportunities");
	    selenium.waitForPageToLoad("30000");
	    
	    String winHandleBefore = driver.getWindowHandle();
	    
	    selenium.click("link=No More Homeless Pets Conference");
	    selenium.waitForPageToLoad("30000");
	    
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	    
	    selenium.click("link=Become a Foster Parent");
	    selenium.waitForPageToLoad("30000");
	    
	    selenium.click("link=Community Cats");
	    selenium.waitForPageToLoad("30000");
	}
		
	@Test
	public void HelpUsSaveThemAll_Volunteer_Volunteer_SearchOpportunities(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Volunteer -> Volunteer -> Search Opportunities...testing");
	    selenium.click("link=Get started");
	    selenium.waitForPageToLoad("30000");
	    
	    String winHandleBefore = driver.getWindowHandle();
	    
	    selenium.click("link=Search Opportunities");
	    selenium.waitForPageToLoad("30000");
	    
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	}
	
	@Test
	public void HelpUsSaveThemAll_Volunteer_Volunteer_LogInToVolunteer(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Volunteer -> Volunteer -> Log In to Volunteer...testing");
	    selenium.click("link=Get started");
	    selenium.waitForPageToLoad("30000");
	    
	    String winHandleBefore = driver.getWindowHandle();
	    
	    selenium.click("link=Log In to Volunteer");
	    selenium.waitForPageToLoad("30000");
	    
	    for(String winHandle : driver.getWindowHandles()) {
	    	driver.switchTo().window(winHandle);
	    }
	    driver.close();
	    driver.switchTo().window(winHandleBefore);
	}
*/
}
