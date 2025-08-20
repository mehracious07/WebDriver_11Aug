package August19_testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @Test
    public void login() throws IOException {
        File src = new File("C:\\Users\\my pc\\OneDrive\\Desktop\\Logi_Credentials.xlsx");
        FileInputStream fis = new FileInputStream(src);

        // load the work book
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);

        // loop through rows
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(chromeOptions);

            // launch the url
            driver.get("https://practicetestautomation.com/practice-test-login/");
            driver.manage().window().maximize();

            // read username
            cell = sheet.getRow(i).getCell(0);
            WebElement email = driver.findElement(By.id("username"));
            email.sendKeys(cell.getStringCellValue());

            // read password
            cell = sheet.getRow(i).getCell(1);
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys(cell.getStringCellValue());

            // submit login
            driver.findElement(By.id("submit")).click();

            // get page title
            String title = driver.getTitle();

            // write title into 3rd column
            sheet.getRow(i).createCell(2).setCellValue(title);

            driver.quit();
        }

        fis.close();

        // ✅ Now save updates to the same Excel file (AFTER loop)
        FileOutputStream fos = new FileOutputStream(src);
        workbook.write(fos);
        fos.close();
        workbook.close();
    }
}
