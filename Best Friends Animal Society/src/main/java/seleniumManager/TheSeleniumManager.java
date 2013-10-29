package seleniumManager;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TheSeleniumManager {

	private volatile static SeleniumManager instance = null;
	//private volatile static SeleniumManager driver = null;
	
	private TheSeleniumManager() {
	}
	
	public static SeleniumManager getSeleniumManager() {
		if(instance == null) {
			synchronized(SeleniumManager.class){
				if(instance == null) {
					System.out.println("!!!! CREATE SELENIUM MANAGER");
					instance = new SeleniumManager();
					
					// Selenium-RC
					//instance.useSeleniumRC();
					
					// Web Driver
					instance.useSeleniumWebDriver();
					
					instance.resetProperties();
				}
		    }
		}    
		return instance;
	}
	
	//public static SeleniumManager getDriver() {
	//	return driver;
	//}

	private static String screenshotsFolder = null;
	
	public static String getScreenshotsFolder() {
		// only create the folder when needed
		if(screenshotsFolder==null){ 
			screenshotsFolder = createNowfolder();
		}
		
		return screenshotsFolder;
	}	
	
	static private String createNowfolder() {
		// setup the directory structure to create screenshots into
		String screenShotsFolder = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator;
		SimpleDateFormat sdfmth = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Calendar cal = Calendar.getInstance();
		screenShotsFolder = screenShotsFolder + sdfmth.format(cal.getTime());
		new File(screenShotsFolder).mkdirs();
		return screenShotsFolder + File.separator;
	}
	
}
