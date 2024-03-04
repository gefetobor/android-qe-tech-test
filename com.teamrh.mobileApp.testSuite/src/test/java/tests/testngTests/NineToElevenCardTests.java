package tests.testngTests;
import logger.Log;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UITestFramework.CreateSession;
import coreLogic.android.*;
import coreLogic.base.*;
import coreLogic.iOS.*;

/**
 * automated test to verify login to android/iOS app.
 */
public class NineToElevenCardTests extends CreateSession {
	LandingPageCoreLogic landingPageCoreLogic;

	
	/** 
	 * this method instantiate required helpers depending on the platform(android or iOS)
	 * @param invokeDriver android or iOS
	 */
	@Parameters({"os"})
	@BeforeMethod
	public void instantiateHelpers(String invokeDriver){
		
		if (invokeDriver.equalsIgnoreCase("android")){
			landingPageCoreLogic = new AndroidLandingPageCoreLogic(driver);
		}																		         
		else if (invokeDriver.equalsIgnoreCase("iOS")){
			landingPageCoreLogic = new IOSLandingPageCoreLogic(driver);
		}
	}

	@Test
	public void ninethCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyNinethCard(localeConfigProp.getProperty("item9"), localeConfigProp.getProperty("desc"));;
		Log.info("Verified nineth card");
	}

	@Test
	public void tenthCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyTenthCard(localeConfigProp.getProperty("item10"), localeConfigProp.getProperty("desc"));;
		Log.info("Verified tenth card");
	}

	@Test
	public void eleventhCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyEleventhCard(localeConfigProp.getProperty("item11"), localeConfigProp.getProperty("desc"));;
		Log.info("Verified eleventh card");
	}	
	
}
