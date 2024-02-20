package execution;

import driverfactory.LaunchBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.Electronics;

public class electronicSteps 
{
	Electronics ec=new Electronics (LaunchBrowser.getdriver());
	@Given("user should be at home page")
	public void user_should_be_at_home_page()
	{

	}

	@When("user clicks on Electronics module on Amazon homepage")
	public void user_clicks_on_electronics_module_on_amazon_homepage() 
	{
		ec.electronics();
	}

	@When("user clicks on laptop and accessories")
	public void user_clicks_on_laptop_and_accessories()
	{
		ec.laptopAcces();
	}

	@When("user clicks on pen drives")
	public void user_clicks_on_pen_drives() 
	{
		ec.pendrives();
	}

	@When("user clicks on Hp")
	public void user_clicks_on_hp() throws InterruptedException
	{
		ec.Hp();
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() 
	{
		ec.addTocart();
	}

	@Then("user should go on new window")
	public void user_should_go_on_new_window()
	{

	}

	@Then("user close the window")
	public void user_close_the_window()
	{
		ec.Close();
	}
	
}
