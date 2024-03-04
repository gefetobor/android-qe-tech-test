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
		landingPageCoreLogic.verifyFirstCard();
		landingPageCoreLogic.verifySecondCard();
		landingPageCoreLogic.verifyThirdCard();
		landingPageCoreLogic.verifyFourthCard();
		landingPageCoreLogic.verifyFifthCard();
		landingPageCoreLogic.verifySixCard();
		landingPageCoreLogic.verifySeventhCard();
		landingPageCoreLogic.verifyEightCard();
		landingPageCoreLogic.verifyNinethCard();
		landingPageCoreLogic.verifyTenthCard();
		landingPageCoreLogic.verifyEleventhCard();
		Log.info("E2E Tests Successful");
		Reporter.log("E2E Tests Successful");
	}
	
}
