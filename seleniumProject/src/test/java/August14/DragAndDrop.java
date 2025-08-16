package August14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        Thread.sleep(1000);
       Actions act =new Actions(driver);
       
       WebElement from = driver.findElement(By.xpath("//div[@id='column-a']"));
       WebElement to = driver.findElement(By.xpath("//div[@id='column-b']"));
       Thread.sleep(1000);
       act.dragAndDrop(from, to).perform();
       Thread.sleep(1000);
       driver.quit();
	}

}
