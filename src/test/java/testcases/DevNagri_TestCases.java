package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevNagri_TestCases {
	@Test
	public void Devnagri_register()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://account.devnagri.com/register");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Anurath Kumar");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mahto");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anurathkumar14@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8789325332");
		driver.close();
	}

	
	public static void main(String[] args) 
	{
		/*WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://account.devnagri.com/register");
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Anurath Kumar");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mahto");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anurathkumar14@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8789325332");
		//driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mahto");
		*/
	}

}
