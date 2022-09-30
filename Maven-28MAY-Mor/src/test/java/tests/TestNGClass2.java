package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.LoginPage;
import pages.MessengerPage;
import pages.RoomsPage;
import setup.Base;
import utilis.Utility;

public class TestNGClass2 extends Base{
	
	private WebDriver driver ;
	private LoginPage loginPage ;
	private RoomsPage roomsPage ;
	private MessengerPage messengerPage ;
	private SoftAssert soft ;
	
	int testID ;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		
//		System.out.println(browserName);
//		
//		if(browserName.equals("Chrome"))
//		{
//			
//			driver = openChromeBrowser();
//		}
//		
//		if(browserName.equals("Firefox"))
//		{
//			driver = openFirefoxBrowser();
//		}
//		
//		if(browserName.equals("Oprea"))
//		{
//			driver = openOperaBrowser();	
//		}
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@BeforeClass
	public void creatPOMObjects() {
		loginPage = new LoginPage(driver);
		messengerPage = new MessengerPage(driver);
		roomsPage = new RoomsPage(driver);
	}
	
	
//	"https://www.T-facebook.com/"
//	"https://www.D-facebook.com/"
//	"https://www.R-facebook.com/"
//	"https://www.facebook.com/
	
	@BeforeMethod
	public void openRoomPage() {
		driver.get("https://www.facebook.com/");	
		loginPage.openMessenger();	
		messengerPage.openRooms();
		soft = new SoftAssert();
	}
	
	@Test
	public void verifyReturnToMessangerButton() {	
		testID = 4332;
		System.out.println("verifyReturnToMessangerButton");
		roomsPage.goBackToMessenger();
		String url = driver.getCurrentUrl() ;
		String title = driver.getTitle();
		
		// Sheet Row Cell
		String user = Utility.getDataFromExcel();
		loginPage.sendUserName(user);
		
		soft.assertEquals(url, "https://www.messenger.co/");
		soft.assertEquals(title, "Messenge");	
		
		soft.assertAll() ;
	}
	
	@Test
	public void verifyContactToHelpCenterButton() {	
		testID = 1234;
		
		System.out.println("verifyContactToHelpCenterButton");
		roomsPage.contactToHelpCenter();
		String url = driver.getCurrentUrl() ;
		String title = driver.getTitle();
	                                                  
		soft.assertEquals(url, "https://www.messenger.com/hel", "URL of Home is wrong"); 
		soft.assertEquals(title, "Messenger Help Centr", "Title of Home page is wrong");
	
		soft.assertAll() ;
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) {	
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			// testID
			Utility.captureScrren();
		}
		
		System.out.println("After Method");
		System.out.println("LOGOUT");
	}
	
//	TestNG Listner - > to maintain the status of test cases
//  ITestReporter
//  ITestResult
//	ITestListner
//	IReporter
//	
	@AfterClass
	public void clearObjects() {
		loginPage = null ;
		messengerPage = null ;
		roomsPage = null ;
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("After Class");
		driver.close();
		driver = null ;
		System.gc(); // garbeg collector	
	}
}
