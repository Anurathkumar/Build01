package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Devnagri_testcase 
{
	@Test
	public void Devnagri_register() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://account.devnagri.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Anurath Kumar");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mahto");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anurathkumar2@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8789325335");
		driver.findElement(By.xpath("//input[@id='organization_name']")).sendKeys("Voxwill Technology pvt ltd");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anurathk123@");
		driver.findElement(By.xpath("//input[@id='password_confirmation']")).sendKeys("Anurathk123@");
		driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys("25");
		driver.findElement(By.xpath("//div[normalize-space()='Register']")).click();
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		Thread.sleep(4000);
		String expectedurl="https://account.devnagri.com/email/verify";
		Assert.assertEquals(expectedurl,url);
		driver.close();
	}

}
