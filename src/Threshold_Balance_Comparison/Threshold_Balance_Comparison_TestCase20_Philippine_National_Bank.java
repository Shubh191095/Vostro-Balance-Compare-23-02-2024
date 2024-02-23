package Threshold_Balance_Comparison;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.time.Duration;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;


public class Threshold_Balance_Comparison_TestCase20_Philippine_National_Bank {
		//<option value="ASIA UNITED BANK">ASIA UNITED BANK</option>

public static void main(String[] args) throws InterruptedException, IOException {
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
Properties properties = new Properties();
String filePath=System.getProperty("user.dir")+"\\Properties\\new.properties";
FileInputStream file = new FileInputStream(filePath);
properties.load(file);
file.close();
//Code for results outPut.txt file
File file1 = new File("outPut.txt");
FileWriter fw = new FileWriter(file1, true);
PrintWriter pw = new PrintWriter(fw);

String name = properties.getProperty("web_URL1");	
driver.get(name);
pw.println(name);			    
//=====================================================================================================================================				
				 int i=1;
			     while(i<=6)
			     {
				 String usernameKey = "Username"+i;
			     String passwordKey = "Password"+i;
					            
			     String username = properties.getProperty(usernameKey);
				 String password = properties.getProperty(passwordKey);
						
				// pw.println(username);
											
				 Thread.sleep(2000);
						
				 driver.findElement(By.id("inputEmail3")).sendKeys(username);
						
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
//==================================================================================================================		 
	        //1: Home Page	 	
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/a/span[1]")).click();
			Thread.sleep(2000);
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
	        pw.println ("1-Screenshot is Taken for reports Tab");
//==================================================================================================================		
	        //2: Click on Vostro Balance tab
		    driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/ul/li[2]/a")).click();
		    Thread.sleep(2000);
	         Alert alert = driver.switchTo().alert();
	         String alertText = alert.getText();
	         pw.println("Alert Text: " + alertText);
	         alert.accept();
	         File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         Files.copy(f2, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayPartner Settings.jpg"));
	         pw.println ("2-Screenshot is Taken for Vostro Blance tab");
//=====================================================================================================================================  
	        //3: Click on select partner Tab Bu using Xpath 
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select")).click();
			Thread.sleep(2000);
	        File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Tab.jpg"));
	        pw.println ("3-Screenshot is Taken for select partner Tab");
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 500)");   
	        Thread.sleep(2000);
//=====================================================================================================================================		
	        //4: Select the Partner From Partner Drop Down
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[32]")).click();
			Thread.sleep(2000);
	        File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("4-Screenshot is Taken for Selected Partner Dropdown");
//=======================================================================================================================================		
	        //5: Click on the refresh Button
	        //For PHP Currency
	      	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/a/span")).click();                          
	      	Thread.sleep(60000);
	        File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("5-Screenshot is Taken for Selecte for refresh Button");    
//===================================================================================================================================================     
	        //6: Select the Pop_Up 1 PHP
	     	driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span")).click();                          
	     	Thread.sleep(10000);    	 
	        File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("6-Screenshot is Taken for Pop_Up message");
//=======================================================================================================================================		
	        //7: Click on the refresh Button
	        //For USD Currency
	      	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/a/span")).click();
	      	Thread.sleep(60000);
	        File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f7, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("7-Screenshot is Taken for Selecte for refresh Button"); 
//===================================================================================================================================================     
	         //8: Select the Pop_Up 2  USD
	      	 driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span")).click();     	                            
	      	 Thread.sleep(10000);    	 
	         File f8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         Files.copy(f8, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	         pw.println ("8-Screenshot is Taken for Pop_Up message");
//==========================================================================================================================================================         
	         //9:Get text and compare with properties file
	 	    //PHP
	         driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]")).click();
	         WebElement elementPHP = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));

	         //USD
	         driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).click();
	         WebElement elementUSD = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]"));

	         String vostroBalancePHP=elementPHP.getText().replace(",", "");
	         String vostroBalanceUSD=elementUSD.getText().replace(",", "");

	         // Print or use the retrieved text
	         pw.println("Vostro Balance PHP: " + vostroBalancePHP);
	         pw.println("Vostro Balance USD: " + vostroBalanceUSD);
	         
	         pw.println(properties.getProperty("PNB-PHP"));
	         pw.println(properties.getProperty("PNB-USD"));
	  
	        //For PHP Currency
	 		if(Double.valueOf(vostroBalancePHP)  < Double.valueOf(properties.getProperty("BPI-PHP"))) {

	 			 pw.println("BALANCE IS BELOW THRESHOLD BALANCE");
	 		}else if(Double.valueOf(properties.getProperty("PNB-PHP")) <  Double.valueOf(vostroBalancePHP) && Double.valueOf(vostroBalancePHP)  < Double.valueOf(properties.getProperty("PNB_Near_To_Threshold_Balance"))) {
	 			 pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE");
	 		}else {
	 			 pw.println("BALANCE IS SUFFICIENT FOR PHP CURRENCY");
	 		}
	 		Thread.sleep(2000);
	 		
	        //For USD Currency		
	 		if(Double.valueOf(vostroBalanceUSD)  < Double.valueOf(properties.getProperty("BPI-PHP"))) {

	 			 pw.println("BALANCE IS BELOW THRESHOLD BALANCE");
	 		}else if(Double.valueOf(properties.getProperty("PNB-USD")) <  Double.valueOf(vostroBalanceUSD) && Double.valueOf(vostroBalanceUSD)  < Double.valueOf(properties.getProperty("PNB_Near_To_Threshold_Balance"))) {
	 			 pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE");
	 		}else {
	 			 pw.println("BALANCE IS SUFFICIENT FOR USD CURRENCY");
	 		}
	 		Thread.sleep(2000);
	 		pw.close();
	 		}}}
