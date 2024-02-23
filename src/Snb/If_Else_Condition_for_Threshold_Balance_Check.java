package Snb;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class If_Else_Condition_for_Threshold_Balance_Check {

	public static void main(String[] args) throws IOException, InterruptedException {
		
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
//	        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/div/input"));
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
//	        // Close the browser
//	        driver.quit();
	        //
	        // Find an element by XPath (replace "yourXPath" with the actual XPath expression)
	        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/div/input"));

	        // Get the value attribute of the element
	        String attributeValue = element.getAttribute("value");

	        // Convert the attribute value to an integer
	        try {
	            int integerValue = Integer.parseInt(attributeValue);
	            
	            // Expected integer value
	            int expectedValue = 5000000;

	            // Check if the retrieved integer value matches the expected value
	            if (integerValue == expectedValue) {
	                System.out.println("The retrieved integer value matches the expected value.");
	            } else {
	                System.out.println("The retrieved integer value does not match the expected value.");
	            }

	        } catch (NumberFormatException e) {
	            System.err.println("Unable to convert attribute value to integer: " + e.getMessage());
	        }

	        // Close the browser
	        driver.quit();
	   
	    }
	}