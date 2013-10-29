package bestFriendsSiteMap;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;
import org.junit.runners.MethodSorters;

import pageObjects.DonateNow_Page;

import testClasses.SeleniumSimplifiedTest;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class WhatWeDo_OurWork_SaveThemAll extends SeleniumSimplifiedTest{
	
	static DonateNow_Page donateNowPage;
	
	@Before
	public void setUpBefore() throws IOException {
		selenium.open("/What We Do/Our Work/Save Them All/");
	    selenium.waitForPageToLoad("30000");
	}

	@Test
	public void TheProblem_LearnMore(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> The Problem-Learn More...testing");
	    selenium.click("css=img[alt='SAVE THEM ALL INFO']");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("id=fancybox-close");
	    selenium.waitForPageToLoad("10000");
	    assertTrue(selenium.isTextPresent("SPREAD THE WORD"));
	}
	
	@Test
	public void SpreadTheWord_ShareOnFacebook(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread The Word-Share on Facebook...testing");
	    selenium.click("link=Share on Facebook");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void SpreadTheWord_VisitUsOnFacebook(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread The Word-Visit us on Facebook...testing");
     	selenium.click("link=Share on Facebook");
	    selenium.waitForPageToLoad("30000");
	}
	
//	@Test
//	public void SpreadTheWord_TweetThis(){
//	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread The Word-Tweet This...testing");
//	    selenium.click("id=l");
//	    //selenium.selectWindow("name=twttrHubFrame");
//	    //selenium.waitForPopUp("", "30000");
//	    //selenium.selectWindow(null);
//	}
	
	@Test
	public void SpreadTheWord_FollowUsOnTwitter(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread The Word-Follow us on Twitter...testing");
	    selenium.click("link=Follow us on Twitter");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void SpreadTheWord_WatchAndShare(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread The Word-Watch and Share...testing");
	    selenium.click("link=Watch and Share");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void SpreadTheWord_WatchOtherVideos(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Spread The Word-Watch other videos...testing");
	    selenium.click("link=Watch other videos");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void HelpUsSaveThemAll_Adopt_SanctuaryAnimals(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Sanctuary Animals...testing");
	    selenium.click("link=Learn more");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=All");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Barnyard");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Bird");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Cat");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Dog");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Horse");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Pig");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Rabbit");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("link=Small & Furry");
	    selenium.waitForPageToLoad("10000");
	    selenium.click("css=div.sub-navigation > ul > li > a.active");
	}

	@Test
	public void HelpUsSaveThemAll_Adopt_AdoptFromBestFriendsLA(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt from Best Friends L.A....testing");
	    selenium.click("link=Learn more");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'Adopt from Best Friends L.A.')])[3]");
	    selenium.waitForPageToLoad("30000");
	}

	@Test
	public void HelpUsSaveThemAll_Adopt_AdoptNearYou(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adopt Near You...testing");
	    selenium.click("link=Learn more");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'Adopt Near You')])[3]");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=adopt from us");
	    selenium.waitForPageToLoad("30000");
	    selenium.goBack();
	    selenium.click("link=Petfinder.com");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=Petango.com");
	    selenium.waitForPageToLoad("30000");
	}
	
	@Test
	public void HelpUsSaveThemAll_Adopt_HowToAdopt(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> How to Adopt...testing");
	    selenium.click("link=Learn more");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'How to Adopt')])[3]");
	    selenium.waitForPageToLoad("30000");
	}
		
	@Test
	public void HelpUsSaveThemAll_Adopt_AdoptionPromotion(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Adoption Promotion...testing");
	    selenium.click("link=Learn more");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'Adoption Promotion')])[3]");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("link=click here");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("id=fancybox-close");
	    selenium.click("link=adoptions@bestfriends.org");
	}
	
	@Test
	public void HelpUsSaveThemAll_Adopt_RecentlyAdopted(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Adopt -> Recently Adopted...testing");
	    selenium.click("link=Learn more");
	    selenium.waitForPageToLoad("30000");
	    selenium.click("xpath=(//a[contains(text(),'Recently Adopted')])[3]");
	    selenium.waitForPageToLoad("30000");
	}

	@Test
	public void HelpUsSaveThemAll_MakeADonation(){
	    System.out.println("What We Do -> Our Work -> Save Them All -> Help Us Save Them All-Make a Donation...testing");
	    selenium.click("link=Donate to Save Them All");
	    selenium.waitForPageToLoad("30000");
	    
	    // Donate Now
		donateNowPage = new DonateNow_Page(selenium);
	    //selenium.click("css=div.left-navigation > ul > li > a");
	    //selenium.waitForPageToLoad("30000");
		donateNowPage.clickDonateNowButton();
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

}
