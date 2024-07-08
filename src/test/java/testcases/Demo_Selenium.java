package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Selenium extends TestBase
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.linkedin.com/feed/");
		
	}

}
