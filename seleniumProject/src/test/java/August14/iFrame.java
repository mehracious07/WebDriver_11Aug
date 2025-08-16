package August14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(2000);
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	driver.switchTo().frame(frame1);
	Thread.sleep(2000);
	
	WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement to = driver.findElement(By.xpath("//div[@id='droppable']"));
	
	Actions act = new Actions(driver);
	act.dragAndDrop(from, to).perform();
	
	Thread.sleep(2000);
	driver.close();

	}

}
