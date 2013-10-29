package bestFriendsSiteMap;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.*;

import testClasses.SeleniumSimplifiedTest;
//import pageObjects.Home_Page;
//import pageObjects.SanctuaryAnimals_Page;
import pageObjects.Dog_Page;

public class DogSurvey extends SeleniumSimplifiedTest{
	
	//////////////////
	// PageObjects
	//////////////////
	//static Home_Page home_Page;
	//static SanctuaryAnimals_Page sanctuaryAnimals_Page;
	static Dog_Page dog_Page;

	@Before
	public void setUpBeforeClass() throws IOException {
		//home_Page = new Home_Page(selenium);
		//home_Page.openAdoptAPet();
		dog_Page = new Dog_Page(selenium);
		dog_Page.openDogSurvey();
	}

	@Test
	public void DogSurveyAllFields(){
	    System.out.println("Dog Survey Page - All Fields");
		//sanctuaryAnimals_Page = new SanctuaryAnimals_Page(selenium);
		dog_Page = new Dog_Page(selenium);
		
		//assertTrue(selenium.isTextPresent("Select an Animal"));
		//assertTrue(sanctuaryAnimals_Page.isAdoptAPetHeroImagePresent());
		
		//sanctuaryAnimals_Page.clickDogLink();
		
		//dog_Page.learnMoreAboutBarney();
		
		//dog_Page.adoptBarney();
		
		// Date
		dog_Page.typeDate("10/31/13");  //Not Required
		
		// Name of Applicant
		dog_Page.typeNameOfApplicant("Gerhard Zeke");  //Not Required
		
		// Age
		dog_Page.typeAge("32");  //Not Required
		
		// Street Address
		dog_Page.typeStreetAddress("123 N. Main Street");  //Required
	
		// Mailing Address
		dog_Page.typeMailingAddress("PO Box 1234");  //Not Required
		
		// City
		dog_Page.typeCity("Salt Lake City");  //Not Required
		
		// State
		dog_Page.typeState("UT");  //Not Required
		
		// Zip Code
		dog_Page.typeZipCode("84123");  //Not Required
		
		// Home Phone
		dog_Page.typeHomePhone("8019871234"); //Required
		
		// Cell Phone
		dog_Page.typeCellPhone("8012309876");  //Required
		
		// Work Phone
		dog_Page.typeWorkPhone("N/A");  //Not Required
		
		// Email
		dog_Page.typeEmail("anyone@aol.com");  //Required
		
		// Other Email
		dog_Page.typeOtherEmail("N/A");  //Not Required
		
		// Own or Rent
		dog_Page.selectOwnOrRent("Rent");  //Required
		
		// Housing Type
		dog_Page.checkHousingType("House");  //Required
		
		// Landlord Name
		dog_Page.typeLandlordName("Don Knotts");  //Not Required
		
		// Landlord Phone
		dog_Page.typeLandlordPhone("8017650987");  //Not Required
		
		// Breed Restrictions
		dog_Page.checkBreedRestrictions("Yes");  //Required
		
		// Interested in Particular Dog
		dog_Page.checkInterestedInParticularDog("No");  //Required
		
		// Particular Dog Name #1
		dog_Page.typeDogName1("Max");  //Not Required
		
		// Particular Dog Name #2
		dog_Page.typeDogName2("Pogo");  //Not Required
		
		// Fenced Yard
		dog_Page.checkFencedYard("Yes");  //Required
		
		// Fence Type and Height
		dog_Page.typeFenceTypeAndHeight("6 foot chain-link");  //Not Required
		
		// Dog Door
		dog_Page.checkDogDoor("Yes");  //Required
		
		// Dog Kept During the Day
		dog_Page.typeDogKeptDuringDay("Outside on a dog run");  //Not Required
		
		// Dog Kept During the Night
		dog_Page.typeDogKeptDuringNight("Inside the house");  //Not Required
		
		// Adopt in Next 30 Days
		dog_Page.checkAdoptInNext30Days("Yes");  //Required
		
		// Special Needs Trip
		dog_Page.checkSpecialNeedsTrip("Yes");  //Required
		
		// Characteristics of New Pet Family Member
		dog_Page.typeNewPetFamilyMemberCharacteristics("Cute and obedient");  //Not Required
		
		// Characteristics of Your Human Family
		dog_Page.typeHumanFamilyCharacteristics("Parents and seven children");  //Not Required
		
		// Characteristics of Other Pet Family Members
		dog_Page.typeOtherPetFamilyMemberCharacteristics("There are no other pets");  //Not Required
		
		// Hear About Best Friends Adoptions
		dog_Page.selectHearAboutBestFriendsAdoptions("Internet Search");  //Required, but has a default value
		
		// Form Certification
		dog_Page.clickFormCertification();  //Not sure if should be required or not - presently not required
		
		// Submit the form
		dog_Page.submitForm();
	}
	
	@Test
	public void DogSurveyRequiredFields(){
	    System.out.println("Dog Survey Page - Required Fields");
		//sanctuaryAnimals_Page = new SanctuaryAnimals_Page(selenium);
		dog_Page = new Dog_Page(selenium);
		
		//assertTrue(selenium.isTextPresent("Select an Animal"));
		//assertTrue(sanctuaryAnimals_Page.isAdoptAPetHeroImagePresent());
		
		//sanctuaryAnimals_Page.clickDogLink();
		
		//dog_Page.learnMoreAboutBarney();
		
		//dog_Page.adoptBarney();
		
		// Click 'Submit Form' without any fields being populated
		dog_Page.submitForm();
		
		// Check for Required fields being highlighted
		// Street Address
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Street Address  dlgNBlank", dog_Page.getValidationAlertMessage());
		
		dog_Page.typeStreetAddress("123 N. Main Street");  //Required
		
		dog_Page.submitForm();
		
		// Home Phone
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Home Phone   dlgNBlank", dog_Page.getValidationAlertMessage());
		
		dog_Page.typeHomePhone("8019871234"); //Required
		
		dog_Page.submitForm();
		
		// Cell Phone
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Cell Phone    dlgNBlank", dog_Page.getValidationAlertMessage());
		
		dog_Page.typeCellPhone("8012309876");  //Required
		
		dog_Page.submitForm();
		
		// Email
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Email     dlgNBlank", dog_Page.getValidationAlertMessage());
		
		dog_Page.typeEmail("anyone@aol.com");  //Required
		
		dog_Page.submitForm();
		
		// Own or Rent
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Own or Rent      First item is not a valid selection.", dog_Page.getValidationAlertMessage());
		
		dog_Page.selectOwnOrRent("Rent");  //Required
		
		dog_Page.submitForm();
		
		// Housing Type
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Housing Type       Options are required.", dog_Page.getValidationAlertMessage());

		dog_Page.checkHousingType("House");  //Required
		
		dog_Page.submitForm();
		
		// Breed Restrictions
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Breed Restrictions        Options are required.", dog_Page.getValidationAlertMessage());
		
		dog_Page.checkBreedRestrictions("Yes");  //Required
		
		dog_Page.submitForm();
		
		// Interested in Particular Dog
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Interested in Particular Dog         Options are required.", dog_Page.getValidationAlertMessage());
		
		dog_Page.checkInterestedInParticularDog("No");  //Required
		
		dog_Page.submitForm();
		
		// Fenced Yard
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Fenced Yard          Options are required.", dog_Page.getValidationAlertMessage());
		
		dog_Page.checkFencedYard("Yes");  //Required
		
		dog_Page.submitForm();
		
		// Dog Door
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Dog Door           Options are required.", dog_Page.getValidationAlertMessage());
		
		dog_Page.checkDogDoor("Yes");  //Required
		
		dog_Page.submitForm();
		
		// Adopt in Next 30 Days
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Able to adopt a dog in the next 30 days?            Options are required.", dog_Page.getValidationAlertMessage());
		
		dog_Page.checkAdoptInNext30Days("Yes");  //Required
		
		dog_Page.submitForm();
		
		// Special Needs Trip
		assertTrue(dog_Page.hasShownValidationAlert());
		assertEquals("Special Needs Trip to Kanab             Options are required.", dog_Page.getValidationAlertMessage());
		
		dog_Page.checkSpecialNeedsTrip("Yes");  //Required
		
		// Hear About Best Friends Adoptions
		dog_Page.selectHearAboutBestFriendsAdoptions("Internet Search");  //Required, but has a default value
		
		// Form Certification
		dog_Page.clickFormCertification();
		
		dog_Page.submitForm();
		
	    //if (dog_Page.hasShownValidationAlert())
        //{   // An alert came up, so handle alerts here
     	//    System.out.println(dog_Page.getValidationAlertMessage());
        //}   // if
	}
}
