
# Appium testing framework (Android and iOS)

Single code base framework to test android and iOS app using appium.

## Prequisites:

- Appium server installed on the machine. In case not, install it by running command `npm install -g appium`.(v1.22.2 Preferred Stable version) For more details visit: https://appium.io/docs/en/about-appium/getting-started/?lang=en

- iOS Simulator or Android Emulator or real device to execute tests.

- Install Maven in your machine. Maven is a build tool (can be downloaded from [here](https://maven.apache.org/download.cgi)). pom.xml file is present in base directory which has all the required dependencies and code to invoke testng.xml file when executed from command line.

- Framework is setup with testng tests, also used for execution.

## Running sample test

- **Connect your device to your machine or start the emulator.** Note: Appium server is setup to start programatically.


- **Goto Project location on terminal** : cd com.teamrh.mobileApp.testSuite/


- **For Android run below in terminal** : mvn test -Dos=android -Dsurefire.suiteXmlFiles=testng.xml (For iOS -Dos=iOS)


## Architecture Overview

**Package : UITestFramework** : It includes the common classes (and methods) which are required by each test to perform actions. Below are classes in this package:

**retryLogic** : It has classes to implement retry in case of failure of a test. Retry count  is set to 1 as of now. Test will be run once if it fails during the execution. 


**CreateSession.java** : All the methods to create a new session and destroy the session after the test(s) execution is over. Each test extends this class. Below are the methods in CreateSession class in their execution order.

1. invokeAppium() - method starts Appium server. Calls startAppiumServer method to start the session depending upon your OS.

2. createDriver(String os, Method methodName) - method creates the driver depending upon the passed parameter (android or iOS) and loads the properties files (config and test data properties files).

3. Tests execution (tests are present in tests.testngtests package)

4. teardown() - method quit the driver after the execution of test(s) 

5. stopAppium() - method to stop Appium server. Calls stopAppiumServer() method to stop session depending upon your OS.



**GenericMethods.java** : It is a common repository for all the  webdriver and appium methods which are called in each coreLogic classes. Every new method which is being used in coreLogic classes should be added in this class as well. It is to reduce the duplicate code. Each screen class extends this class. Below are few methods defined in this class:

waitForVisibility(By targetElement) - method to wait for an element to be visible

findElement(By locator) - method to find an element

findElements(By locator) - method to find all the elements of specific locator

**MysqlDatabase.java** : This can be used if any DB values need to be verified. It has method to read DB and get data from required table. For more help, read on this link: http://www.vogella.com/tutorials/MySQLJava/article.html


**Package : app** : It contains the app build against which tests would be executed. 

**Package : config** - It contains three files config.properties, android_config.properties and iOS_config.properties.

**config.properties** : Path to android and iOS config files are defined in this file. Other common required values like DB connection information etc. could be written in this file.


1. android_config.properties - contains the location of the file where test data required by android tests is defined

2. iOS_config.properties - contains the location of the file where test data required by iOS tests is defined

**Package: testData** : This package contains files having android and iOS test data. It contains two files: en_US_android.properties and en_US_iOS.properties.


1. en_US_android.properties - All test data required by android tests is defined in this file.

2. en_US_iOS.properties - All test data required by iOS tests is defined in this file.

**Package: logger** : It contains Log.java class which contains methods to show the logs on console and save the logs in LogFile.txt of each run.
				

**Package: screens** : Classes in this package contains locators which are being used in coreLogic classes. Each page in mobile application is mapped to screen. E.g. for android login page, its AndroidLoginScreen. Segregated the locators on the bases of platform: android or iOS

**Package: screens.android** : Each screen on andriod app will be having as screen class under this package. It contains all the locators which are visible on that screen. Each android screen class extends GenericMethods.java. 

**Package: screens.ios** : Each screen on ios app will be having as screen class under this package. It contains all the locators which are visible on that screen. Each iOS screen class extends GenericMethods.java. 

**Package: coreLogic** : Classes in this package contains methods which performs intended actions and validations required by a test. Divided the coreLogic package depending on the platform : android, ios and base
 		
**Package: coreLogic.base** : For each screen there would be corresponding coreLogic class. Classes under this package contains abstract methods which are defined in their respective classes in coreLogic.android and coreLogic.ios package.
				
**Package: coreLogic.android** : For each base coreLogic there would be corresponding android coreLogic 
where abstract method declared in base class are defined. Corresponding base class, coreLogic will be extended by android coreLogic class.

**Package: coreLogic.ios** : For each base coreLogic class there would be corresponding ios coreLogic
where abstract method declared in base class are defined.Corresponding base coreLogic class will be extended by ios coreLogic class.

**Package: tests.testngTests** :  This package contains all the tests. In each test there is instantiateHelpers(String invokeDriver) method which creates the object at 
runtime of the coreLogic classes required in the test. Object creation happens depending on the platform passed through invokeDriver parameter (android or ios). Then test calls methods defined in the coreLogic (of which object is created).

**Reports** : A report is generated on every execution by extent report. To view reports, navigate to **target>>ExtentReport**

![image](UIAutomation/images/pic.png)
