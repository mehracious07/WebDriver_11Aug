package August20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.LoggerHelper;

public class Annotations {
	WebDriver driver;
	private static final org.apache.logging.log4j.Logger log = LoggerHelper.getLogger(Annotations.class);

	@BeforeMethod
	public void Login() {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		log.info("Invoking the browser");
	}
	@AfterMethod
	public void Close() {
		driver.close();
	}

	
	@Test(priority=1)
	public void ValidLogin() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		log.info("Entering the username");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		log.info("Entering the password");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("You have logined !!!");
		log.info("Login Test Finished!");
	}
	@Test(priority=2)
	public void InValidLogin() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sanj");
		log.info("Entering the username");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		log.info("Entering the password");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("Invalid Login !!!");
		log.info("Login Failed");
	}
}
