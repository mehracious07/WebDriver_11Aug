package August13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		String title=driver.getTitle();
		System.out.print(title);
		Thread.sleep(2000);
String pageSource=driver.getPageSource();
System.out.print(pageSource);
		Thread.sleep(2000);
String currentUrl=driver.getCurrentUrl();
System.out.print(currentUrl);

	}

}
