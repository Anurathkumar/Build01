package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class LoginPage extends TestBase
{
	// object repository
	@FindBy(xpath="//input[@name='user-name']") private WebElement userTxtBox;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordTxtBox;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginBtn;
		public LoginPage()
		{
			PageFactory.initElements(driver, this);
		}
	public String loginToApplication() throws IOException
		{
			userTxtBox.sendKeys(ReadData.readpropertyFile("Username"));
			passwordTxtBox.sendKeys(ReadData.readpropertyFile("Password"));
			loginBtn.click();
			return driver.getCurrentUrl();	
		}

	public String verifytitleofApplication()
	{
		return driver.getTitle();
		
	}
	public String verifyURlofApplication() 
	{
		return driver.getCurrentUrl();
		
	}

}
