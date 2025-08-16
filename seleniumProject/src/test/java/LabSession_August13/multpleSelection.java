package LabSession_August13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multpleSelection {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://grotechminds.com/multiple-select/");
	        WebElement dropdown= driver.findElement(By.id("automobiles"));
	        Select sel = new Select(dropdown);
	        
	       if(sel.isMultiple()) {
	    	   sel.selectByIndex(0);
	    	   Thread.sleep(1000);
	    	   sel.selectByValue("sedan");
	    	   Thread.sleep(1000);
	    	   sel.selectByVisibleText("Hatchback");
	    	   Thread.sleep(1000);
	    	   sel.selectByIndex(3);
	    	   Thread.sleep(1000);
	       }
	       // Deselect options
	        sel.deselectByIndex(0);
	        Thread.sleep(1000);
	        sel.deselectByValue("motorcycle");
	        Thread.sleep(1000);
	        sel.deselectByVisibleText("Hatchback");
	        Thread.sleep(1000);

	        // Clear all selections
	        sel.deselectAll();
	        Thread.sleep(1000);

	        driver.quit();

	}

}
