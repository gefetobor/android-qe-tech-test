package screens.android;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import UITestFramework.GenericMethods;

/**
 * contains all the locators present on the landing Screen
 */
public class AndroidLandingPageScreen extends GenericMethods {

	public AndroidLandingPageScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// Locators for the first Card
	public By FirstItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_1']");
	public By FirstItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_1']");
	public By FirstItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_1']");

	// Locators for the second Card
	public By SecondItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_2']");
	public By SecondItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_2']");
	public By SecondItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_2']");

	// Locators for the second Card
	public By ThirdItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_3']");
	public By ThirdItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_3']");
	public By ThirdItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_3']");

	// Locators for the first Card
	public By FourthItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_4']");
	public By FourthItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_4']");
	public By FourthItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_4']");

	// Locators for the second Card
	public By FifthItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_5']");
	public By FifthItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_5']");
	public By FifthItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_5']");

	// Locators for the second Card
	public By SixthItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_6']");
	public By SixthItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_6']");
	public By SixthItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_6']");

	// Locators for the first Card
	public By SeventhItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_7']");
	public By SeventhItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_7']");
	public By SeventhItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_7']");

	// Locators for the second Card
	public By EightItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_8']");
	public By EightItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_8']");
	public By EightItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_8']");

	// Locators for the second Card
	public By NinethItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_9']");
	public By NinethItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_9']");
	public By NinethItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_9']");

	// Locators for the first Card
	public By TenthItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_10']");
	public By TenthItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_10']");
	public By TenthItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_10']");

	// Locators for the second Card
	public By EleventhItemCard = By.xpath("//android.view.View[@resource-id='ListItemCard_11']");
	public By EleventhItemText = By.xpath("//android.widget.TextView[@resource-id='ListItemText_11']");
	public By EleventhItemDescription = By.xpath("//android.widget.TextView[@resource-id='ListItemDesc_11']");

}
