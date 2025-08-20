package LabSession_August18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lab2 {
WebDriver driver;
@BeforeClass
public void LaunchApp() {
	driver=new ChromeDriver();
	driver.get("https://phptravels.net/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println("App launched");
}

@Test(priority=0)
public void SelectTypeOfTrip() {
	WebElement e= driver.findElement(By.xpath("//select[@class='flight_way form-select form-select-sm px-3 rounded-2 border']"));
	Select s = new Select(e);
	s.selectByIndex(1);
	System.out.println("Trip Type Selected");
}

@Test(priority=1)
public void FlightType() {
	WebElement e = driver.findElement(By.xpath("//select[@id='flight_type']"));
Select s = new Select(e);
s.selectByIndex(2);
System.out.println("Flight Type Selected");
}

@Test (priority=2)
public void FlyingFrom() {
	driver.findElement(By.xpath("//input[@name='from']")).sendKeys("New Delhi");
	System.out.println("FromLocation Initalized");
}

@Test (priority=3)
public void FlyingTo() {
	driver.findElement(By.xpath("//input[@name='to']")).sendKeys("Banglore");
	System.out.println("Destination Location Initalized");
}

@Test (priority=4)
public void TripDate() {
	driver.findElement(By.xpath("//input[@id='departure']")).clear();
	driver.findElement(By.xpath("//input[@id='departure']")).sendKeys("15/10/2025");
	System.out.println("Departure  Date Initalized");
	driver.findElement(By.xpath("//input[@id='return_date']")).clear();
	driver.findElement(By.xpath("//input[@id='return_date']")).sendKeys("20/10/2025");
	System.out.println(" Return date Initalized");
}

}
