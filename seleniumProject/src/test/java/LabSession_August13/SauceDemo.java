package LabSession_August13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo{
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
		 
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		 driver.findElement(By.name("login-button")).click();
	 }
 }
