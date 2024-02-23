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
public class OneToFourCardTests extends CreateSession {
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
	public void firstCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyFirstCard();;
		Log.info("Verified first card");
	}
	
	@Test
	public void secondCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifySecondCard();;
		Log.info("Verified second card");
	}

	@Test
	public void thirdCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyThirdCard();;
		Log.info("Verified third card");
	}

	@Test
	public void fourthCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyFourthCard();;
		Log.info("Verified fourth card");
	}	
	
}
