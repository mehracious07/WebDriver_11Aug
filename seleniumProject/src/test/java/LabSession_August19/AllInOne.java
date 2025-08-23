package LabSession_August19;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(Lab_Listners.class)
public class AllInOne {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();   // safer than close()
        }
    }

    @Test(priority = 1)
    public void ValidLogin() {
        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Valid login should redirect");
    }

    @Test(priority = 2)
    public void InValidLogin() {
        SoftAssert sa = new SoftAssert();
        driver.findElement(By.id("username")).sendKeys("Sanj");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        String expectedUrl = "https://practicetestautomation.com/practice-test-login/";
        sa.assertEquals(driver.getCurrentUrl(), expectedUrl, "Invalid login should stay on login page");

        // Verify error message
        String errorText = driver.findElement(By.id("error")).getText();
        sa.assertTrue(errorText.contains("Your username is invalid!") 
                   || errorText.contains("Your password is invalid!"),
                   "Error message should be shown");

        sa.assertAll();
    }
}
