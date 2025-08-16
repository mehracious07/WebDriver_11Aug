package August13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdgeBrowser {
    
    public static void main(String[] args) {
        
        // Set the exact path to msedgedriver.exe
        System.setProperty("webdriver.edge.driver", 
            "C:\\Users\\my pc\\OneDrive\\Desktop\\edgeDriver\\msedgedriver.exe");
        
        // Launch Edge
        WebDriver driver = new EdgeDriver();
        
        // Open the URL
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Maximize the browser window
        driver.manage().window().maximize();
    }
}
