package coreLogic.android;

import logger.Log;
import screens.android.AndroidLandingPageScreen;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import coreLogic.base.*;

import org.junit.Assert;


/**
 * contains all methods to verify that cards on the landing page.
 */
public class AndroidLandingPageCoreLogic extends LandingPageCoreLogic {
    AndroidLandingPageScreen androidLandingPageScreen;


    public AndroidLandingPageCoreLogic(WebDriver driver) {
        androidLandingPageScreen = new AndroidLandingPageScreen(driver);
    }

    
    @Override
    public void verifyFirstCard(String Item1, String desc) throws InterruptedException {
        
    	//verify if "FirstItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.FirstItemCard);  
        
        //verify the Text is valid
        String ActualFirstText = androidLandingPageScreen.findElement(androidLandingPageScreen.FirstItemText).getText();
        String ExpectedFirstText = Item1;
		Assert.assertEquals(ExpectedFirstText , ActualFirstText);
        
        //verify the description is present and valid
        String ActualFirstDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.FirstItemDescription).getText();
        String ExpectedFirstDescription = desc;
		Assert.assertEquals(ExpectedFirstDescription , ActualFirstDescription);
        Log.info("FirstItem Successfully Verified");  
        Reporter.log("FirstItem Card Successfully Verified");

    }
    
    @Override
    public void verifySecondCard(String Item2, String desc) throws InterruptedException {
        
    	//verify if "SecondItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.SecondItemCard);  
        
        //verify the Text is valid
        String ActualSecondText = androidLandingPageScreen.findElement(androidLandingPageScreen.SecondItemText).getText();
        String ExpectedSecondText = Item2;
		Assert.assertEquals(ExpectedSecondText , ActualSecondText);
        
        //verify the description is present and valid
        String ActualSecondDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.SecondItemDescription).getText();
        String ExpectedSecondDescription = desc;
		Assert.assertEquals(ExpectedSecondDescription , ActualSecondDescription);
        Log.info("SecondItem Successfully Verified"); 
        Reporter.log("SecondItem Card Successfully Verified");

    }


	@Override
	public void verifyThirdCard(String Item3, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//verify if "ThirdItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.ThirdItemCard);  
        
        //verify the Text is valid
        String ActualThirdText = androidLandingPageScreen.findElement(androidLandingPageScreen.ThirdItemText).getText();
        String ExpectedThirdText = Item3;
		Assert.assertEquals(ExpectedThirdText , ActualThirdText);
        
        //verify the description is present and valid
        String ActualThirdDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.ThirdItemDescription).getText();
        String ExpectedThirdDescription = desc;
		Assert.assertEquals(ExpectedThirdDescription , ActualThirdDescription);
        Log.info("ThirdItem Successfully Verified"); 
        Reporter.log("ThirdItem Card Successfully Verified");
		
	}


	@Override
	public void verifyFourthCard(String Item4, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
	   	//verify if "FourthItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.FourthItemCard);  
        
        //verify the Text is valid
        String ActualFourthText = androidLandingPageScreen.findElement(androidLandingPageScreen.FourthItemText).getText();
        String ExpectedFourthText = Item4;
		Assert.assertEquals(ExpectedFourthText , ActualFourthText);
        
        //verify the description is present and valid
        String ActualFourthDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.FourthItemDescription).getText();
        String ExpectedFourthDescription = desc;
		Assert.assertEquals(ExpectedFourthDescription , ActualFourthDescription);
        Log.info("FourthItem Successfully Verified"); 
        Reporter.log("FourthItem Card Successfully Verified");
		
	}


	@Override
	public void verifyFifthCard(String Item5, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "FifthItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.FifthItemCard);  
        
        //verify the Text is valid
        String ActualFifthText = androidLandingPageScreen.findElement(androidLandingPageScreen.FifthItemText).getText();
        String ExpectedFifthText = Item5;
		Assert.assertEquals(ExpectedFifthText , ActualFifthText);
        
        //verify the description is present and valid
        String ActualFifthDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.FifthItemDescription).getText();
        String ExpectedFifthDescription = desc;
		Assert.assertEquals(ExpectedFifthDescription , ActualFifthDescription);
        Log.info("FifthItem Successfully Verified"); 
        Reporter.log("Fifth Card Successfully Verified");
		
	}


	@Override
	public void verifySixCard(String Item6, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "SixthItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.SixthItemCard);  
        
        //verify the Text is valid
        String ActualSixthText = androidLandingPageScreen.findElement(androidLandingPageScreen.SixthItemText).getText();
        String ExpectedSixthText = Item6;
		Assert.assertEquals(ExpectedSixthText , ActualSixthText);
        
        //verify the description is present and valid
        String ActualSixthDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.SixthItemDescription).getText();
        String ExpectedSixthDescription = desc;
		Assert.assertEquals(ExpectedSixthDescription , ActualSixthDescription);
        Log.info("SixthItem Successfully Verified");  

        Reporter.log("SixthItem Card Successfully Verified");
		
	}


	@Override
	public void verifySeventhCard(String Item7, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "SeventhItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.SeventhItemCard);  
        
        //verify the Text is valid
        String ActualSeventhText = androidLandingPageScreen.findElement(androidLandingPageScreen.SeventhItemText).getText();
        String ExpectedSeventhText = Item7;
		Assert.assertEquals(ExpectedSeventhText , ActualSeventhText);
        
        //verify the description is present and valid
        String ActualSeventhDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.SecondItemDescription).getText();
        String ExpectedSeventhDescription = desc;
		Assert.assertEquals(ExpectedSeventhDescription , ActualSeventhDescription);
        Log.info("SeventhItem Successfully Verified");  
        Reporter.log("SeventhItem Card Successfully Verified");
		
	}


	@Override
	public void verifyEightCard(String Item8, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "EightItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.EightItemCard);  
        
        //verify the Text is valid
        String ActualEightText = androidLandingPageScreen.findElement(androidLandingPageScreen.EightItemText).getText();
        String ExpectedEightText = Item8;
		Assert.assertEquals(ExpectedEightText , ActualEightText);
        
        //verify the description is present and valid
        String ActualEightDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.EightItemDescription).getText();
        String ExpectedEightDescription = desc;
		Assert.assertEquals(ExpectedEightDescription , ActualEightDescription);
        Log.info("EightItem Successfully Verified"); 
        Reporter.log("EightItem Card Successfully Verified");
		
	}


	@Override
	public void verifyNinethCard(String Item9, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "NinethItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.NinethItemCard);  
        
        //verify the Text is valid
        String ActualNinethText = androidLandingPageScreen.findElement(androidLandingPageScreen.NinethItemText).getText();
        String ExpectedNinethText = Item9;
		Assert.assertEquals(ExpectedNinethText , ActualNinethText);
        
        //verify the description is present and valid
        String ActualNinethDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.NinethItemDescription).getText();
        String ExpectedNinethDescription = desc;
		Assert.assertEquals(ExpectedNinethDescription , ActualNinethDescription);
        Log.info("NinethItem Successfully Verified"); 
        Reporter.log("NinethItem Card Successfully Verified");
		
	}


	@Override
	public void verifyTenthCard(String Item10, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "TenthItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.TenthItemCard);  
        
        //verify the Text is valid
        String ActualTenthText = androidLandingPageScreen.findElement(androidLandingPageScreen.TenthItemText).getText();
        String ExpectedTenthText = Item10;
		Assert.assertEquals(ExpectedTenthText , ActualTenthText);
        
        //verify the description is present and valid
        String ActualTenthDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.TenthItemDescription).getText();
        String ExpectedTenthDescription = desc;
		Assert.assertEquals(ExpectedTenthDescription , ActualTenthDescription);
        Log.info("TenthItem Successfully Verified"); 

        Reporter.log("TenthItem Card Successfully Verified");
		
	}


	@Override
	public void verifyEleventhCard(String Item11, String desc) throws InterruptedException {
		// TODO Auto-generated method stub
		
    	//verify if "EleventhItem" Card is present
        androidLandingPageScreen.waitForVisibility(androidLandingPageScreen.EleventhItemCard);  
        
        //verify the Text is valid
        String ActualEleventhText = androidLandingPageScreen.findElement(androidLandingPageScreen.EleventhItemText).getText();
        String ExpectedEleventhText = Item11;
		Assert.assertEquals(ExpectedEleventhText , ActualEleventhText);
        
        //verify the description is present and valid
        String ActualEleventhDescription = androidLandingPageScreen.findElement(androidLandingPageScreen.EleventhItemDescription).getText();
        String ExpectedEleventhDescription = desc;
		Assert.assertEquals(ExpectedEleventhDescription , ActualEleventhDescription);
        Log.info("EleventhItem Successfully Verified"); 
        Reporter.log("EleventhItem Card Successfully Verified");
		
	}


	@Override
	public void searchFunctionality(String shortcut) throws InterruptedException {
		// TODO Auto-generated method stub
		
	}



}



/*
//scroll down twice with each duration of 500 ms
androidLandingPageScreen.scrollDown(2, 500);

//long press first Card
androidLandingPageScreen.longPress(androidLandingPageScreen.FirstItemCard);

//press back key
androidLandingPageScreen.back(); 

// below code will enable airplane mode on the device
//androidLandingPageScreen.setNetworkConnection(true,false,false); 
 
 */

