package LabSession_August19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(Lab_Listners.class)
public class AllInOne {
	WebDriver driver;
	@BeforeMethod
	public void Login() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@AfterMethod
	public void Close() {
		driver.close();
	}

	
	@Test(priority=1)
	public void ValidLogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String Expectedurl = "https://practicetestautomation.com/logged-in-successfully/";
		Assert.assertEquals(driver.getCurrentUrl(),Expectedurl,"Login Sucessfull");
	}
	@Test(priority=2)
	public void InValidLogin() {
		SoftAssert sa = new SoftAssert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sanj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String Expectedurl = "https://practicetestautomation.com/logged-in-successfully/";
		sa.assertEquals(driver.getCurrentUrl(),Expectedurl,"Login Failed");
		driver.quit();
		sa.assertAll();
	
	}
}
