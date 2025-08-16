package August13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Invoking_ChromeBrowser {
    public static void main(String[] args) {

        // Create ChromeOptions for custom settings
        ChromeOptions chromeOptions = new ChromeOptions();
       
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser with options
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Open website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       
    }
}
