package moduleLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(xpath="//input[@id='user-name']") private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String usernameTxt)
	{
		username.sendKeys(usernameTxt);
	}
	
	public void enterPassword(String passwordTxt)
	{
		password.sendKeys(passwordTxt);
	}
	
	public void clickLoginBtn()
	{
		login.click();
	}
}
