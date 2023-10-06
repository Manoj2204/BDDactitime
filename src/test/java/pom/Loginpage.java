package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name = "pwd")
	private WebElement pwdtbx;
	
	@FindBy(id = "loginButton")
	private WebElement loginBtn;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutBtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setuntbx(String uname)
	{
		untbx.sendKeys(uname);
	}
	public void setpwdtbx(String pwd)
	{
		pwdtbx.sendKeys(pwd);
	}
	public WebElement getloginBtn()
	{
		return loginBtn;
	}
	public WebElement getlogoutBtn()
	{
		return logoutBtn;
	}

}
