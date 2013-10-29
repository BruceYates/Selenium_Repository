package pageObjects;

import com.thoughtworks.selenium.Selenium;

public class Dog_Page {

	//private static final String INPUT_VALUE_LOCATOR = "xpath=//*[@id='StreetAddress']";
	Selenium selenium;
	
	public Dog_Page(Selenium selenium) {
		this.selenium = selenium;
	}

	public void openDogSurvey() {
		selenium.open("/Adopt-a-Pet/How-to-Adopt/Adoption-Applications/Dog/");
	}
	public void typeDate(String inputValue) {
		selenium.type("//*[@id='Date']", inputValue);
	}
	
	public void typeNameOfApplicant(String inputValue) {
		selenium.type("//*[@id='Name_ofApplicant']", inputValue);
	}
	
	public void typeAge(String inputValue) {
		selenium.type("//*[@id='ApplicantAge']", inputValue);
	}
	
	public void typeStreetAddress(String inputValue) {
		selenium.type("//*[@id='StreetAddress']", inputValue);
	}
	
	public void typeMailingAddress(String inputValue) {
		selenium.type("//*[@id='MailingAddress']", inputValue);
	}
	
	public void typeCity(String inputValue) {
		selenium.type("//*[@id='City']", inputValue);
	}
	
	public void typeState(String inputValue) {
		selenium.type("//*[@id='State']", inputValue);
	}
	
	public void typeZipCode(String inputValue) {
		selenium.type("//*[@id='Zip']", inputValue);
	}
	
	public void typeHomePhone(String inputValue) {
		selenium.type("//*[@id='HomePhone']", inputValue);
	}
	
	public void typeCellPhone(String inputValue) {
		selenium.type("//*[@id='CellPhone']", inputValue);
	}
	
	public void typeWorkPhone(String inputValue) {
		selenium.type("//*[@id='WorkPhone']", inputValue);
	}
	
	public void typeEmail(String inputValue) {
		selenium.type("//*[@id='Email']", inputValue);
	}
	
	public void typeOtherEmail(String inputValue) {
		selenium.type("//*[@id='OtherEmail']", inputValue);
	}
	
	public void selectOwnOrRent(String inputValue) {
		selenium.select("//*[@id='Own_orRent']", "value="+inputValue);
	}
	
	public void checkHousingType(String inputValue) {
		selenium.check("//input[@name='HousingType' and @value='"+inputValue+"']");
	}
	
	public void typeLandlordName(String inputValue) {
		selenium.type("//*[@id='LandlordName']", inputValue);
	}
	
	public void typeLandlordPhone(String inputValue) {
		selenium.type("//*[@id='LandlordPhone']", inputValue);
	}
	
	public void checkBreedRestrictions(String inputValue) {
		selenium.check("//input[@name='BreedRestrictions' and @value='"+inputValue+"']");
	}
	
	public void checkInterestedInParticularDog(String inputValue) {
		selenium.check("//input[@name='Interested_inParticularDog' and @value='"+inputValue+"']");
	}
	
	public void typeDogName1(String inputValue) {
		selenium.type("//*[@id='DogName1']", inputValue);
	}
	
	public void typeDogName2(String inputValue) {
		selenium.type("//*[@id='DogName2']", inputValue);
	}
	
	public void checkFencedYard(String inputValue) {
		selenium.check("//input[@name='FencedYard' and @value='"+inputValue+"']");
	}
	
	public void typeFenceTypeAndHeight(String inputValue) {
		selenium.type("//*[@id='FenceType_andHeight']", inputValue);
	}
	
	public void checkDogDoor(String inputValue) {
		selenium.check("//input[@name='DogDoor' and @value='"+inputValue+"']");
	}
	
	public void typeDogKeptDuringDay(String inputValue) {
		selenium.type("//*[@id='DogKeptDuringDay']", inputValue);
	}
	
	public void typeDogKeptDuringNight(String inputValue) {
		selenium.type("//*[@id='DogKept_atNight']", inputValue);
	}
	
	public void checkAdoptInNext30Days(String inputValue) {
		selenium.check("//input[@name='AdoptNext30Days' and @value='"+inputValue+"']");
	}
	
	public void checkSpecialNeedsTrip(String inputValue) {
		selenium.check("//input[@name='SpecialNeedsTrip_toKanab' and @value='"+inputValue+"']");
	}
	
	public void typeNewPetFamilyMemberCharacteristics(String inputValue) {
		selenium.type("//*[@id='Looking_for_in_aPet']", inputValue);
	}
	
	public void typeHumanFamilyCharacteristics(String inputValue) {
		selenium.type("//*[@id='AboutHumanFamily']", inputValue);
	}
	
	public void typeOtherPetFamilyMemberCharacteristics(String inputValue) {
		selenium.type("//*[@id='AboutPetFamily']", inputValue);
	}
	
	public void selectHearAboutBestFriendsAdoptions(String inputValue) {
		selenium.select("//*[@id='HowDidYouHearAboutBF_Dog']", "value="+inputValue);
	}
	
	public void clickFormCertification() {
		selenium.click("//*[@id='CertifyDog']");
	}
	
	public boolean hasShownValidationAlert() {
		return selenium.isAlertPresent();
	}

	public String getValidationAlertMessage() {
		return selenium.getAlert();
	}

	public void learnMoreAboutBarney() {
		selenium.click("link=Learn More About Barney");
		selenium.waitForPageToLoad("30000");
	}
	
	public void adoptBarney() {
		selenium.click("css=html.gt-ie8 body.large-screen form#aspnetForm div.sub-panel div.container div.content div.pet-profile div.item-container div.text-content div.info div.description div.traits div.actions-cta a#ctl00_ctl00_cphMainContent_cphInnerContent_adopt_link.adopt-pet-btn");
		selenium.waitForPageToLoad("30000");
	}
	
	public void submitForm() {
		selenium.click("//html/body/form/div[5]/div/div/div/div[3]/div/div[2]/div/p[36]/input");
	}

}









