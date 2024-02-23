package Snb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelLoginTest {

    public static void main(String[] args) {
        


        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();

        try {
            // Open the Excel file
            String excelFilePath ="C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Portal Id's and passwords\\Portal Id passwords.xlsx";
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through rows (assuming first row is header)
            for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row row = sheet.getRow(rowNum);

                // Get user name and password from Excel
                String username = row.getCell(0).getStringCellValue();
                String password = row.getCell(1).getStringCellValue();

                // Open the login page
                driver.get("http://10.180.184.30:8080/grs-web/#/login");

                // Find the user name and password fields, and login button
                WebElement usernameField = driver.findElement(By.id("inputEmail3"));
                WebElement passwordField = driver.findElement(By.id("password"));
                WebElement loginButton = driver.findElement(By.id("//button[@class='btn btn-success btn-sm']"));

                // Enter credentials and click login
                usernameField.sendKeys();
                passwordField.sendKeys(password);
                loginButton.click();

                // Wait for a few seconds to see the result
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Close the workbook and input stream
            workbook.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}