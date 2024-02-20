package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics 
{
	WebDriver driver;

//	@FindBy(xpath = "//*[text()=' Electronics ']")
//	private WebElement Electronics;
	@FindBy(xpath = "//*[@data-csa-c-slot-id='nav_cs_2']")
	private WebElement Electronics;
	
//	@FindBy(xpath = "//a[normalize-space()='  Laptops & Accessories']")
//	private WebElement laptopAccessories ;
	@FindBy(xpath = "//span[normalize-space()='Laptops & Accessories']")
	private WebElement laptopAccessories ;
	
	@FindBy(xpath = "(//*[@class='a-dynamic-image sl-sobe-carousel-sub-card-img'])[2]")
	private WebElement pen_drive;

	@FindBy(xpath = "(//*[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[1]")
	private WebElement hp;

	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	private WebElement AddTocart;
	@FindBy(xpath = "//*[@class='a-link-normal close-button']")
	private WebElement close;

	public Electronics (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void electronics ()
	{
		Electronics.click();
	}

	public void laptopAcces()
	{	
		laptopAccessories .click();

	}
	public void  pendrives()
	{
		pen_drive.click();
	}
	public void Hp() throws InterruptedException
	{
		Thread.sleep(3000);
		hp.click();
	}

	public void addTocart()
	{
		AddTocart.click();
	}
	public void Close()
	{
		close.click();
	}


}
