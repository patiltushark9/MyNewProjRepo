package libraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public void launchChromeBrowser()
	{
		System.setProperty("webdriver.Chrome.driver", "E:\\MavenProjects\\SwagLabs\\Browsers\\chromedriver.exe");
		
		ChromeOptions chromeOptions=new ChromeOptions();
		
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		
		driver=new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	public void launchFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\MavenProjects\\SwagLabs\\Browsers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
}
