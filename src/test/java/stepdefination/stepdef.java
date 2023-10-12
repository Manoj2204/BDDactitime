package stepdefination;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import GenericUtility.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Loginpage;

public class stepdef 
{

	WebDriver driver;
	public Loginpage lp;
	@Given("User launch the chromebrwser")
	public void user_launch_the_chromebrwser() 
	{
		driver=new ChromeDriver();
	    lp=new Loginpage(driver);
	   
	}

	@When("User enter the URL {string}")
	public void user_enter_the_url(String url) 
	{
	     driver.get(url);
		
	}

	@When("User enter the username as {string} and password as {string}")
	public void user_enter_the_username_as_and_password_as(String username, String password) 
	{
	   lp.setuntbx(username);
	   lp.setpwdtbx(password);
		
	}

	@When("Click on login button")
	public void click_on_login_button() throws InterruptedException 
	{
	   lp.getloginBtn().click();
	   Thread.sleep(2000);
		
	}

	@Then("Home page title should be {string}")
	public void home_page_title_should_be(String pagetitle) 
	{
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, pagetitle);
		
	}

	@Then("Click on logout button")
	public void click_on_logout_button() 
	{
	    lp.getlogoutBtn().click();
		
	}
	@Then("close browser")
	public void close_browser() 
	{
	    driver.quit();
	}




}
