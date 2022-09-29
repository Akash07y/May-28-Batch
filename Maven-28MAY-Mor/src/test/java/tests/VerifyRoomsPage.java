package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
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

public class VerifyRoomsPage {

	private WebDriver driver ;
	private LoginPage loginPage ;
	private RoomsPage roomsPage ;
	private MessengerPage messengerPage ;
	private SoftAssert soft ;
	
	private int testID ;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		
		System.out.println(browserName);
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}
		
		if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}
		
		if(browserName.equals("Oprea"))
		{
			System.setProperty("webdriver.opara.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\operadriver.exe");
			driver = new OperaDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		}

	}
	
	@BeforeClass
	public void creatPOMObjects() {
		loginPage = new LoginPage(driver);
		messengerPage = new MessengerPage(driver);
		roomsPage = new RoomsPage(driver);
	}
	
	@BeforeMethod
	public void openRoomPage() {
		driver.get("https://www.facebook.com/");	
		loginPage.openMessenger();	
		messengerPage.openRooms();
		soft = new SoftAssert();
	}
	
	@Test
	public void verifyReturnToMessangerButton() {	
		
		testID = 12212 ;
		
		System.out.println("verifyReturnToMessangerButton");
		roomsPage.goBackToMessenger();
		String url = driver.getCurrentUrl() ;
		String title = driver.getTitle();

		soft.assertEquals(url, "https://www.messenger.co/");
		soft.assertEquals(title, "Messenge");	
		
		soft.assertAll() ;
	}
	
	@Test
	public void verifyContactToHelpCenterButton() {	
		testID = 32233;
		
		System.out.println("verifyContactToHelpCenterButton");
		roomsPage.contactToHelpCenter();
		String url = driver.getCurrentUrl() ;
		String title = driver.getTitle();
	                                                  
		soft.assertEquals(url, "https://www.messenger.com/hel", "URL of Home is wrong"); 
		soft.assertEquals(title, "Messenger Help Centr", "Title of Home page is wrong");
	
		soft.assertAll() ;
	}
	
	@AfterMethod
	public void logoutFromApplication() {		
		System.out.println("After Method");
		System.out.println("LOGOUT");
	}
	
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
