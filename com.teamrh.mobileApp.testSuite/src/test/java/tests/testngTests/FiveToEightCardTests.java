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
public class FiveToEightCardTests extends CreateSession {
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

	@Test(priority = 0)
	public void fifthCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyFifthCard(localeConfigProp.getProperty("item5"), localeConfigProp.getProperty("desc"));;
		Log.info("Verified fifth card");
	}

	@Test(priority = 1)
	public void sixthCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifySixCard(localeConfigProp.getProperty("item6"), localeConfigProp.getProperty("desc"));
		Log.info("Verified sixth card");
	}

	@Test(priority = 3)
	public void seventhCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifySeventhCard(localeConfigProp.getProperty("item7"), localeConfigProp.getProperty("desc"));;
		Log.info("Verified seventh card");
	}

	@Test(priority = 2)
	public void eightCardTests() throws InterruptedException {
		Log.info("Running landing Page test");
		landingPageCoreLogic.verifyEightCard(localeConfigProp.getProperty("item8"), localeConfigProp.getProperty("desc"));;
		Log.info("Verified eight card");
	}	
	
}
