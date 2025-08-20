package LabSession_August19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("You have logined !!!");
	}
	@Test(priority=2)
	public void InValidLogin() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sanj");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		System.out.println("Invalid Login !!!");
	}
}
