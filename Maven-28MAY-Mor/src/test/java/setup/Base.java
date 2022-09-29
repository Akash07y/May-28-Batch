package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver ;
	}
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver ;
	}
	
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opre.driver", "C:\\Users\\akash\\OneDrive\\Documents\\Automation\\Selenium\\opreadriver.exe");
		WebDriver driver = new OperaDriver();
		return driver ;
	}
}
