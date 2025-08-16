package LabSession_August14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		act.moveToElement(username).click()
		.keyDown(Keys.SHIFT)
		.sendKeys("hello")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		act.moveToElement(password).click()
		.keyDown(Keys.SHIFT)
		.sendKeys("password")
		.keyUp(Keys.SHIFT)
		.build()
		.perform();
	}

}
