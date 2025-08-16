package August13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement>box=driver.findElements(By.xpath("//input[@type='checkbox']"));
int size=box.size();
for(int i=0;i<size;i++) {
	Thread.sleep(1000);
	box.get(i).click();
	Thread.sleep(2000);
}
	}

}
