package LabSession_August14;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("Sanjay");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	   driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
	   Thread.sleep(3000);
		Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
		alert1.dismiss();

	}

}
