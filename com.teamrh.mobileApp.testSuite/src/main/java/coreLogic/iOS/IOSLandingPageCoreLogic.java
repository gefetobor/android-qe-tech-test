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
	public void searchFunctionality(String shortcut) throws InterruptedException {
		
    	//verify searchfield is present
        iOSLandingPageScreen.waitForVisibility(iOSLandingPageScreen.searchField);  
        
        //search for a shortcut
        iOSLandingPageScreen.findElement(iOSLandingPageScreen.searchField).sendKeys(shortcut);
        
        //verify shortcut result is present
        iOSLandingPageScreen.findShortCutResult();
        
	
	}



	@Override
	public void verifyFirstCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifySecondCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyThirdCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyFourthCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyFifthCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifySixCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifySeventhCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyEightCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyNinethCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyTenthCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void verifyEleventhCard(String item, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

}
