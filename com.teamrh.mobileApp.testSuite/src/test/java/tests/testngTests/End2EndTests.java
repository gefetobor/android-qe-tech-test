package tests.testngTests;
import logger.Log;

import org.testng.Reporter;
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
public class End2EndTests extends CreateSession {
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
	public void EndToEndTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyFirstCard(localeConfigProp.getProperty("item1"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifySecondCard(localeConfigProp.getProperty("item2"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyThirdCard(localeConfigProp.getProperty("item3"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyFourthCard(localeConfigProp.getProperty("item4"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyFifthCard(localeConfigProp.getProperty("item5"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifySixCard(localeConfigProp.getProperty("item6"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifySeventhCard(localeConfigProp.getProperty("item7"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyEightCard(localeConfigProp.getProperty("item8"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyNinethCard(localeConfigProp.getProperty("item9"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyTenthCard(localeConfigProp.getProperty("item10"), localeConfigProp.getProperty("desc"));
		landingPageCoreLogic.verifyEleventhCard(localeConfigProp.getProperty("item11"), localeConfigProp.getProperty("desc"));
		Log.info("E2E Tests Successful");
		Reporter.log("E2E Tests Successful");
	}
	
}
