package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;

public class LoginPageTest extends TestBase
{
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException, InterruptedException
	{
		initialization();
		login=new LoginPage();
	} 
	@Test
	public void verifytitleofApplicationTest()
	{
		String ActTitle="Swag Labs";
		String expTitle=login.verifytitleofApplication();
		Assert.assertEquals(expTitle,ActTitle);
	}
	@Test
	public void verifyURlofApplication()
	{
		String expURL="https://www.saucedemo.com/";
		String actURL=login.verifyURlofApplication();
		Assert.assertEquals(expURL,actURL);
		
	}
	@Test
	public void loginToApplicationTest() throws IOException
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=login.loginToApplication();
		Assert.assertEquals(expURL,actURL);
	}

	@AfterMethod
	public void closeBrowser() 
	{
		driver.close();
	}


}
