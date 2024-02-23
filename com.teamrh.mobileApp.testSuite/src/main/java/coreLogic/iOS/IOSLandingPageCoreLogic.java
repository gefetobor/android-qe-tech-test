package coreLogic.iOS;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import coreLogic.base.*;
import logger.Log;
import screens.iOS.ShortcutsLandingPage;

public class IOSLandingPageCoreLogic extends LandingPageCoreLogic {
	ShortcutsLandingPage iOSLandingPageScreen;

	public IOSLandingPageCoreLogic(WebDriver driver) {
		iOSLandingPageScreen = new ShortcutsLandingPage(driver);
	}

	@Override
	public void verifyFirstCard() throws InterruptedException {

	}

	@Override
	public void verifySecondCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyThirdCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyFourthCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyFifthCard() throws InterruptedException { 

	}

	@Override
	public void verifySixCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifySeventhCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyEightCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyNinethCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTenthCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyEleventhCard() throws InterruptedException {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchFunctionality() throws InterruptedException {
		
    	//verify searchfield is present
        iOSLandingPageScreen.waitForVisibility(iOSLandingPageScreen.searchField);  
        
        //search for a shortcut
        iOSLandingPageScreen.findElement(iOSLandingPageScreen.searchField).sendKeys("Create New File");
        
        //verify shortcut result is present
        iOSLandingPageScreen.waitForVisibility(iOSLandingPageScreen.searchResult);
        String ActualShortcutText = iOSLandingPageScreen.findElement(iOSLandingPageScreen.searchResult).getText();
        String ExpectedShortcutText = "Create New File";
		Assert.assertEquals(ExpectedShortcutText , ActualShortcutText);
        
	
	}

}
