package August14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement upload=driver.findElement(By.xpath("//input[@id='file-upload']"));
		upload.sendKeys("C:\\Users\\my pc\\Downloads\\example.txt");
		Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='file-submit']")).click();
        
        WebElement validate=driver.findElement(By.xpath("//h3[normalize-space()='File Uploaded!']"));
        if(validate.isDisplayed()) {
        	System.out.print("FileUploaded");
        }else {
        	System.out.print("FileNotUploaded");
        }
	}

}
