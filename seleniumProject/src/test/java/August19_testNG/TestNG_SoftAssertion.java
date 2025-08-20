package August19_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_SoftAssertion {
    @Test
	public void loginsoft() throws InterruptedException {
		
	    ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	    String Atitle=driver.getTitle();
	    System.out.println("actual title of the page is : "+ Atitle);
	    String Etitle="OrangeHRM";

		// soft assertion  - the validation is captured  if the assertion is failing and continues with further execution
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(Atitle,Etitle);

	    //enter text in username field
	    
	    Thread.sleep(2000);
	    WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("Admin");
	    Thread.sleep(2000);
	    //enter password field
	    
	    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	    password.sendKeys("admin123");
	    
	    //enter login button
	  
	    WebElement loginbutton  = driver.findElement(By.xpath("//button[@type = 'submit']"));
	    loginbutton.click();
	    
	    Thread.sleep(2000);
	    
	    soft.assertAll();
        driver.quit();
	  
	}    
}
