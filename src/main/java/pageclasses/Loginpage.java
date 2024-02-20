package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;

	@FindBy(xpath = "//*[text()='Hello, sign in']")
	private WebElement Signtab;

	@FindBy(xpath = "//*[@id='ap_email']")
	private WebElement Username;

	@FindBy(xpath = "//*[@class='a-button-input']")
	private WebElement Continue;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement Password;

	@FindBy(xpath = "//*[@id='signInSubmit']")
	private WebElement Signin;

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void tab()
	{
		Signtab.click();
	}

	public void username(String user)
	{	
		Username.clear();
		Username.sendKeys(user);

	}
	public void Cont()
	{	
		Continue.click();

	}
    public void password(String pass)
	{
		Password.sendKeys(pass);
	}

	public void signin()
	{
		Signin.click();
	}







}
