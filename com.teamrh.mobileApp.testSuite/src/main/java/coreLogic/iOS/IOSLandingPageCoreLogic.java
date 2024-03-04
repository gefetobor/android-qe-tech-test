package coreLogic.iOS;

import org.openqa.selenium.WebDriver;
import coreLogic.base.*;
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
	public void searchFunctionality(String shortcut) throws InterruptedException {
		
    	//verify searchfield is present
        iOSLandingPageScreen.waitForVisibility(iOSLandingPageScreen.searchField);  
        
        //search for a shortcut
        iOSLandingPageScreen.findElement(iOSLandingPageScreen.searchField).sendKeys(shortcut);
        
        //verify shortcut result is present
        iOSLandingPageScreen.findShortCutResult();
        
	
	}

}
