package coreLogic.base;

/**
 * contains all methods which are present in AndroidLoginHelper and IOSLoginHelper.
 * Methods are abstract here and defined in specific class (AndroidLoginHelper and IOSLoginHelper) 
 */
public abstract class LandingPageCoreLogic {

	public abstract void verifyFirstCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifySecondCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyThirdCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyFourthCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyFifthCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifySixCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifySeventhCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyEightCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyNinethCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyTenthCard(String item, String desc) throws InterruptedException;
	
	public abstract void verifyEleventhCard(String item, String desc) throws InterruptedException;
	
	public abstract void searchFunctionality(String shortcut) throws InterruptedException;
	
	public  void verifyFirstCardr() throws InterruptedException{
		
	};

}
