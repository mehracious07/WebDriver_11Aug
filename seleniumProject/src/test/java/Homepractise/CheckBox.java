package Homepractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> box = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		box.get(1).click();
		for(int i=0;i<box.size();i++) {
			box.get(i).click();
		}
		Thread.sleep(2000);
		for(int i=0;i<box.size();i++) {
			box.get(i).click();
		}
	}

}
