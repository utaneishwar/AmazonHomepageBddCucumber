package execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driverfactory.LaunchBrowser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass 
{

	WebDriver driver ;
	@Before
	public void launchbrowser()
	{
		LaunchBrowser lb =new LaunchBrowser();
		driver=lb.InitBrowser();
//		ChromeOptions option =new ChromeOptions();
//		option.addArguments("--incognito");
		driver.manage().window().maximize();
	}
	@After
	public void closebrowser() throws InterruptedException
	{
//		Thread.sleep(5000);
//		driver.quit();
	}
 
}
