package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilis.Utility;

public class LoginPage {
	
	private WebDriver driver ;
	private WebDriverWait wait ;

	@FindBy (xpath = "//input[@id='email']") 
	private WebElement userName ;
	

	@FindBy (xpath = "//input[@id='pass']") 
	private WebElement password ;
	
	@FindBy (xpath = "//button[@name='login']") 
	private WebElement loginButton ;
	
	@FindBy (xpath = "//a[text()='Create New Account']") 
	private WebElement creatNewAccount ;
	
	@FindBy (xpath = "//a[text()='Messenger']") 
	private   WebElement messengerLink ;
	
	public LoginPage(WebDriver driver)  // driver = driver = new ChromeDriver()
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		//wait = new WebDriverWait(driver, 20); // 20 sec
	}
	
	public void clickOnCreatNewAcc() {
		wait = new WebDriverWait(driver, 20); // 20 sec
		wait.until(ExpectedConditions.visibilityOf(creatNewAccount));
		creatNewAccount.click();
	}
	
	public void sendUserName(String user) {
		wait = new WebDriverWait(driver, 30); // 20 sec
		wait.until(ExpectedConditions.visibilityOf(userName));
		
		userName.sendKeys(user);
	}
	
	public void sendPasswordName() {
		
		password.sendKeys("12345678");
	}
	
	public void clickOnLoginButton() {
		loginButton.isEnabled();
	}

	public void openMessenger() {
		messengerLink.click();
	}
	
	//OR
	// Complete Functonality
	public void loginToApplication() {
		userName.sendKeys("Velocity@gmail.com");
		password.sendKeys("12345678");
		loginButton.click();
	}
	
	// POM Class
	
	// Mouse Action
	// Explicit Wait 
	// Select 
	
	
	
	
	
	
	
}
