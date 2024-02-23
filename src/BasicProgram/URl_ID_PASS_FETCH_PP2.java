package BasicProgram;

import java.io.File;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class URl_ID_PASS_FETCH_PP2 {

	//public static void main(String[] args) throws IOException, InterruptedException {
	@Test
	public void URl_ID_PASS_FETCH_PP2Method() throws IOException, InterruptedException {	
		//String strPath ="C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
	    WebDriver driver=new FirefoxDriver();
		
		Properties properties = new Properties();
		String filePath=System.getProperty("user.dir")+"\\Properties\\new.properties";
		FileInputStream file = new FileInputStream(filePath);
		properties.load(file);
	    file.close();
		String name = properties.getProperty("web_URL1");	
		driver.get(name);
		System.out.println(name);
		
//=====================================================================================================================================				
		 int i=1;
	     while(i<=6)
	     {
		 String usernameKey = "Username"+i;
	     String passwordKey = "Password"+i;
			            
	     String username = properties.getProperty(usernameKey);
		 String password = properties.getProperty(passwordKey);
				
	     System.out.println(username);
						
				
		 Thread.sleep(2000);
				
		 driver.findElement(By.id("inputEmail3")).sendKeys(username);

	     //driver.findElement(By.name("inputEmail")).sendKeys(strUserName);
				
	     Thread.sleep(2000);
	     driver.findElement(By.name("password")).sendKeys(password);
	     Thread.sleep(200);
	     
	     try {
	     driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
	    			
	     Thread.sleep(2000);
	    			
	     WebElement successElement = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/a"));
	    				
	     }
	     catch(Exception e)
	     {
	    	i++;	
	     }
//=========================================================================================================================
	     //1: Home Page	 	
	        //Click on Reports Tab
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/a/span[1]")).click();
			Thread.sleep(2000);
	        //Screen Shots for Home Page
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
	        System.out.println ("1-Screenshot is Taken for reports Tab");
	//==================================================================================================================		
	        //2: Click on Vostro Balance tab
		    driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/ul/li[2]/a")).click();
		    Thread.sleep(2000);
		    
		     // Handle the alert
	         Alert alert = driver.switchTo().alert();

	         // Get the text from the alert
	         String alertText = alert.getText();

	         // Print the alert text to the console
	         System.out.println("Alert Text: " + alertText);

	         // Close the alert
	         alert.accept();
		    
	         //Screen Shots for Partner Settings
	         File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         Files.copy(f2, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayPartner Settings.jpg"));
	         System.out.println ("2-Screenshot is Taken for Vostro Blance tab");

//=====================================================================================================================================  
	        //3: Click on select partner Tab Bu using Xpath 
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for select partner Tab
	        File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Tab.jpg"));
	        //System.out.println ("3-Screenshot is Taken for select partner Tab");
	        //Scroll down the web page by 5000 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 500)");   
	        Thread.sleep(2000);
	//=====================================================================================================================================		
	        //4: Select the Partner From Partner Drop Down
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[7]")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for Select the Partner
	        File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        System.out.println ("4-Screenshot is Taken for Selected Partner Dropdown");
	//=======================================================================================================================================		
	        //5: Click on the refresh Button
	      	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[6]/a")).click();
	      	Thread.sleep(3000);
	        //Take Screen Shots for Select the Partner
	        File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        System.out.println ("5-Screenshot is Taken for Selecte for refresh Button");  
	//===================================================================================================================================================     
	         //6: Select the Pop_Up
	      	 driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span")).click();
	      	 Thread.sleep(3000);
            //Take Screen Shots for Select the Partner
	         File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	         System.out.println ("6-Screenshot is Taken for Pop_Up message");
//==========================================================================================================================================================         
	        //7: Copy balance By using get TEXT
	        //2: If we have attribute value but value in intger that time we will used get integer value method
	        //1: If we don't know attribute value that time we will use get test method   
	    
	        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]")).click();
	        WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]"));
	                                          
	        // Get text from the element
	        String elementText = element.getText();
	        String vostroBalance=elementText.replace(",", "");

	        // Print or use the retrieved text
	        System.out.println("Vostro Balance: " + vostroBalance);
	        System.out.println(properties.getProperty("BAHL-PKR"));
	        
			if(Double.valueOf(vostroBalance)  < Double.valueOf(properties.getProperty("BAHL-PKR"))) {
			
				System.out.println("BALANCE IS BELOW THRESHOLD BALANCE");
			}else if(Double.valueOf(properties.getProperty("AJWB-MAD")) <  Double.valueOf(vostroBalance) && Double.valueOf(vostroBalance)  < Double.valueOf(properties.getProperty("AJWB-Near_Threshold_Balance"))) {
				System.out.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE");
			}
	        Thread.sleep(2000);
	        
	        driver.quit();
	     }}}     
//=====================================================================================================================================	      
