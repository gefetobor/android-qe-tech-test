package screens.iOS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UITestFramework.GenericMethods;



/**
 * contains all the locators present on the Landing screen of iOS app.
 */
public class ShortcutsLandingPage extends GenericMethods {

	public ShortcutsLandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	// Locators on the Landing screen of the iOS app should be placed here.
	
	
	// Locators for the first Card
	public By searchField = By.xpath("//XCUIElementTypeSearchField[contains(@name, 'Search for a shortcut')]");
	public By searchResult = By.xpath("//XCUIElementTypeStaticText[@name='ShortcutRow_22'])[1]");


}
	
