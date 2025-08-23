package August20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	WebDriver driver;
	@DataProvider(name="LoginData")
	public Object[][]getData(){
		return new Object[][] {
			{"student","Password123"},
			{"Student","Pass"},
			{"ssss","pppp"}
		};
	}
	
	@Test(dataProvider="LoginData")
	public void Login(String username,String password) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
