package August19_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestNG_HardAssertion {
	
	@Test
	public void login() throws InterruptedException {
	
    ChromeOptions chromeOptions = new ChromeOptions();
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
    String Atitle=driver.getTitle();
    System.out.println("actual title of the page is : "+ Atitle);
    String Etitle="OrangeHRM";
     // hard assertion  - the validation fails if the assertion is failing 
 		Assert.assertEquals(Atitle,Etitle);

    //enter text in username field
    
    Thread.sleep(2000);
    WebElement username = driver.findElement(By.name("username"));
    username.sendKeys("Admin");
    Thread.sleep(2000);
    //enter password field
   
    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
    password.sendKeys("admin123");
    Thread.sleep(2000);
    //enter login button
   
    WebElement loginbutton  = driver.findElement(By.xpath("//button[@type = 'submit']"));
    loginbutton.click();
    
    Thread.sleep(2000);

  
}      


}