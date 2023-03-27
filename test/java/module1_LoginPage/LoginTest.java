package module1_LoginPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryFiles.BaseClass;
import moduleLogin.LoginPage;

public class LoginTest extends BaseClass 
{
	
	LoginPage obj_LoginPage;
	
	
	@BeforeMethod
	public void login()
	{
		launchChromeBrowser();
		
		obj_LoginPage=new LoginPage(driver);
		
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		obj_LoginPage.enterUsername("standard_user");
		
		Thread.sleep(3000);
		
		obj_LoginPage.enterPassword("secret_sauce");
		
		Thread.sleep(3000);
		
		obj_LoginPage.clickLoginBtn();
		
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
//		driver.quit();
	}
	
}
