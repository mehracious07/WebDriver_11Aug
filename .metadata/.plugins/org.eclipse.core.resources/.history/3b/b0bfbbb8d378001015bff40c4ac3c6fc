package LabSession_August14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sanjay Singh Mehara");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sanjaymehra619@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9012867382");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("15-07-2001");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='subjects']")).sendKeys("Computer Science");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='hobbies'][1]")).click();
Thread.sleep(1000);
WebElement upload=driver.findElement(By.xpath("//input[@id='picture']"));
upload.sendKeys("C:\\Users\\my pc\\Downloads\\example.txt");
Thread.sleep(1000);
driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("Nainital, Uttarakhand");
Thread.sleep(1000);
WebElement select= driver.findElement(By.xpath("//select[@id='state']"));
Select s= new Select(select);
s.selectByIndex(1);

WebElement select1= driver.findElement(By.xpath("//select[@id='city']"));
Select s1= new Select(select1);
s1.selectByIndex(1);

driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
