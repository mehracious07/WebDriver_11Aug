package August14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_Mouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
       Actions act =new Actions(driver);
		
WebElement sell= driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
Thread.sleep(1000);
act.doubleClick(sell).perform();
Thread.sleep(2000);
driver.navigate().back();

WebElement mxPlayer= driver.findElement(By.xpath("//a[normalize-space()='MX Player']"));
Thread.sleep(1000);
act.contextClick(mxPlayer).perform();
Thread.sleep(3000);
driver.navigate().back();
       
      
	}

}
