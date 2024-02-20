package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchBrowser 
{

	public static WebDriver driver;
	public WebDriver InitBrowser()
	{
		driver =new ChromeDriver();
		return driver;
		
	}
	public static WebDriver getdriver() 
	{
	    return driver; 
	}



}
