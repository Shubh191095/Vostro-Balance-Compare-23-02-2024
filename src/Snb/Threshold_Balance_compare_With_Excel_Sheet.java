package Snb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;
import com.google.common.io.Files;

public class Threshold_Balance_compare_With_Excel_Sheet {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
	    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);

	//==================================================================================================================		
	        //Login
	        //Screen Shots for Login page
	        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaylogin.jpg"));
	        System.out.println ("START EXECUTION *** Screenshot is Taken for Login Page");
	        driver.findElement(By.id ("inputEmail3")).sendKeys("PDS");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("Grs@123");
			Thread.sleep(200);
			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
			Thread.sleep(2000);
	//==================================================================================================================		 
	        //1: Home Page	 	
	        //Click on Configuration Tab
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/a")).click();
			Thread.sleep(2000);
	        //Screen Shots for Home Page
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
	        System.out.println ("1-Screenshot is Taken for Home page");
	//==================================================================================================================		
	        //2: Click on Partner Settings
		    driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/ul/li[2]/a")).click();
		    Thread.sleep(2000);
	        //Screen Shots for Partner Settings
	        File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayPartner Settings.jpg"));
	        System.out.println ("2-Screenshot is Taken for Partner Settings tab");
	//==================================================================================================================		
	        //3: Click on select partner Tab
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div[1]/div[3]/md-select/md-select-value/span[1]/div")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for select partner Tab
	        File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Tab.jpg"));
	        System.out.println ("3-Screenshot is Taken for select partner Tab");
	        //Scroll down the web page by 5000 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 200)");   
	        Thread.sleep(2000);

	        
	        
	        
	        
	//==================================================================================================================		
	        //4: Select the Partner
			driver.findElement(By.xpath("/html/body/div[3]/md-select-menu/md-content/md-option[49]/div[1]")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for Select the Partner
	        File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        System.out.println ("4-Screenshot is Taken for Select the Partner");
	//==================================================================================================================       
	        //5: Click on Vostro Balance module
			driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/section/div[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for Select the Partner
	        File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner.jpg"));
	        System.out.println ("5-Screenshot is Taken for Select the Vostro Blance check module");    
	//==================================================================================================================       
	        //6: Click on edit icon button
	        driver.findElement(By.xpath("//html/body/div[1]/div[1]/div/div/div/section/div[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/div")).click();
			Thread.sleep(4000);
	        //Take Screen Shots for edit icon button
	        File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect edit icon button.jpg"));
	        System.out.println ("6-Screenshot is Taken for edit icon button");
	//==================================================================================================================	
	        //7: Copy balance
	        
	        driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/div/input")).click();
	     
//	        // Find an element by XPath (replace "yourXPath" with the actual XPath expression)
//	          WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/div/input"));
//
//	        // Get the value attribute of the element
//	        String attributeValue = element.getAttribute("value");
//
//	        // Convert the attribute value to an integer
//	        try {
//	            int integerValue = Integer.parseInt(attributeValue);
//	            System.out.println("Integer Value: " + integerValue);
//	        } catch (NumberFormatException e) {
//	            System.err.println("Unable to convert attribute value to integer: " + e.getMessage());
//	        }
//
//	        // Close the browser
//	        driver.quit();
	        
	        
	        ///////////////////////
	       
	        
	         driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/div/input")).click();
		     
	        
	         WebElement element1 = driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/div/input"));
	         Thread.sleep(2000);
	        
	        String webValue = element1.getText().trim();  // Trim to remove leading/trailing whitespaces

	        // Check if the string is not empty before parsing
	        if (!webValue.isEmpty()) {
	            try {
	                int webIntegerValue = Integer.parseInt(webValue);

	                String excelFilePath = "C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Threshold_Blance Check.xlsx\\Sheet1.xlsx";
	                String sheetName = "Threshold_Balance_Check";
	                Thread.sleep(2000);
	                try (FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
	                     Workbook workbook = new XSSFWorkbook(inputStream)) {
	                	Thread.sleep(2000);
	                    org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet(sheetName);
	                    Row row = sheet.getRow(1);
	                    Cell cell = (Cell) row.getCell(1);
	                    Thread.sleep(2000);
	                    int expectedValue = (int) ((org.apache.poi.ss.usermodel.Cell) cell).getNumericCellValue();

	                    if (webIntegerValue == expectedValue) {
	                        System.out.println("The web page integer value matches the expected value from Excel.");
	                    } else {
	                        System.out.println("The web page integer value does not match the expected value from Excel.");
	                    }
	                    Thread.sleep(2000);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Unable to parse web page integer value to an integer.");
	                e.printStackTrace();
	            }
	            Thread.sleep(2000);
	        } else {
	            System.out.println("Error: Web page integer value is an empty string.");
	        }

	        driver.quit();
	    }
	}