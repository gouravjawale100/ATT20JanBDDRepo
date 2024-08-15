package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;
	Capabilities capabilities;
	
	public WebDriver initBrowser(String browserName) throws MalformedURLException
	{
		if(browserName.equals("Chrome"))
		{
		capabilities = new ChromeOptions();
		}
		else if(browserName.equals("Firefox"))
		{
			capabilities = new FirefoxOptions();
		}
		
		driver = new RemoteWebDriver(new URL("http://54.163.26.174:4444/wd/hub"), capabilities);
		
		return driver;
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}

}
