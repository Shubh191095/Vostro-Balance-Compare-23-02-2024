package NewReportGenration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class AUB_ASIA_UNITED_BANK {
	public void testBase002(WebDriver driver) throws InterruptedException, IOException
	{
		//WebDriver driver=new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
//		pw.println(name);
//=====================================================================================================================================				
		 int i=1;
	     while(i<=6)
	     {
	     	String usernameKey = "Username"+i;
	         String passwordKey = "Password"+i;
	         
	         String username = properties.getProperty(usernameKey);
	         String password = properties.getProperty(passwordKey);
	         Thread.sleep(5000);
	         driver.findElement(By.id ("inputEmail3")).sendKeys(username);
	         //driver.findElement(By.name("inputEmail")).sendKeys(username);
	     	//driver.findElement(By.xpath ("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[1]/div/input")).sendKeys(username);
	         
	     	Thread.sleep(2000);
	 		driver.findElement(By.name("password")).sendKeys(password);
	 		Thread.sleep(2000);
	 		try {
	 			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
	 			Thread.sleep(2000);
	 			WebElement successElement = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/a"));
	 			
	 			break;
	 		}
	 		catch(Exception e)
	 		{
	 			i++;	
	 		}
	     }
//================================================================	     
	   //1: Home Page	 	
	        //Click on Reports Tab
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/a/span[1]")).click();
			Thread.sleep(2000);
	        //Screen Shots for Home Page
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
	        pw.println ("User is able to click on reports Tab");
//==================================================================================================================		
	        //2: Click on Vostro Balance tab
		    driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/ul/li[2]/a")).click();
		    Thread.sleep(2000);
		     // Handle the alert
	         Alert alert = driver.switchTo().alert();
	         // Get the text from the alert
	         String alertText = alert.getText();
	         // Print the alert text to the console
	         pw.println("Alert Text: " + alertText);
	         // Close the alert
	         alert.accept();
	         //Screen Shots for Partner Settings
	         File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         Files.copy(f2, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayPartner Settings.jpg"));
	         pw.println ("User is able to click on Vostro Blance tab");
//=====================================================================================================================================  
	        //3: Click on select partner Tab By using Xpath 
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for select partner Tab
	        File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Tab.jpg"));
	        pw.println ("User is able to click on select partner Tab");
	        //Scroll down the web page by 5000 pixels  
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 500)");   
	        Thread.sleep(2000);
//=====================================================================================================================================		
	        //4: Select the Partner From Partner Drop Down
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[4]")).click();
			Thread.sleep(2000);
	        //Take Screen Shots for Select the Partner
	        File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("User is able to click on Selected Partner Dropdown");
//=======================================================================================================================================		
	        //5: Click on the refresh Button
	        //For PHP Currency
	      	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/a/span")).click();                          
	      	Thread.sleep(60000);
	        //Take Screen Shots for Select the Partner
	        File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("User is able to click on refresh Button 1");    
//===================================================================================================================================================     
	       
	      //6: Select the Pop_Up 1 PHP	  
			   //Identify the pop-up element using XPath (adjust the XPath as needed)
	        Thread.sleep(2000);
			     WebElement popup = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-content"));

			     // Perform actions on the pop-up
			     String popupText = popup.getText();
			     pw.println("Pop-up Text: " + popupText);

			     // Perform actions within the pop-up (e.g., clicking a button)
			     WebElement okButton = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span"));
			     okButton.click();
			     
			   //Take Screen Shots for Select the Partner
				    File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Vostro Balance For AUB(ASIA_UNITED_BANK).jpg"));
				    pw.println ("User is able to click on Accept the Pop_Up");
				    			   
//=======================================================================================================================================		
	        //7: Click on the refresh Button
	        //For USD Currency
	      	driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/a/span")).click();
	      	Thread.sleep(60000);
	        //Take Screen Shots for Select the Partner
	        File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f7, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("User is able to click on refresh Button 2"); 
//===================================================================================================================================================     
	         //8: Select the Pop_Up 2  USD	  
			   //Identify the pop-up element using XPath (adjust the XPath as needed)
	        Thread.sleep(2000);     
	        WebElement popup1 = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-content"));

			     // Perform actions on the pop-up
			     String popup1Text = popup1.getText();
			     pw.println("Pop-up Text: " + popup1Text);

			     // Perform actions within the pop-up (e.g., clicking a button)
			     WebElement okButton1 = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span"));
			     okButton1.click();
	       
//==========================================================================================================================================================         
	         //9:Get text and compare with properties file
	 	     //AUB-USD
	         driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]")).click();
	         WebElement elementPHP = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));

	         //AUB-PHP
	         driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).click();
	         WebElement elementUSD = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]"));

	         String vostroBalancePHP=elementPHP.getText().replace(",", "");
	         String vostroBalanceUSD=elementUSD.getText().replace(",", "");

	         // Print or use the retrieved text
	         pw.println("Vostro Balance USD: " + vostroBalanceUSD);
	         pw.println("Vostro Balance PHD: " + vostroBalancePHP);
	         	    
	    	 pw.println("Threshold Balance For AUB-USD: "+properties.getProperty("AUB-USD"));
	    	 pw.println("Threshold Balance For AUB-PHP: "+properties.getProperty("AUB-PHP"));
	  
	        //For PHP Currency
	 		if(Double.valueOf(vostroBalancePHP)  < Double.valueOf(properties.getProperty("BPI-PHP"))) {

	 			pw.println("BALANCE IS BELOW THRESHOLD BALANCE FOR AUB-USD CURRENCY");
	 		}else if(Double.valueOf(properties.getProperty("AUB-USD")) <  Double.valueOf(vostroBalancePHP) && Double.valueOf(vostroBalancePHP)  < Double.valueOf(properties.getProperty("AUB_Near_To_Threshold_Balance"))) {
	 			pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE FOR AUB-USD CURRENCY");
	 		}else {
	 			pw.println("BALANCE IS SUFFICIENT FOR AUB-USD CURRENCY");
	 		}
	 		//Thread.sleep(2000);
	 		
	        //For USD Currency		
	 		if(Double.valueOf(vostroBalanceUSD)  < Double.valueOf(properties.getProperty("BPI-PHP"))) {

	 			pw.println("BALANCE IS BELOW THRESHOLD BALANCE AUB-PHP CURRENCY");
	 		}else if(Double.valueOf(properties.getProperty("AUB-PHP")) <  Double.valueOf(vostroBalanceUSD) && Double.valueOf(vostroBalanceUSD)  < Double.valueOf(properties.getProperty("AUB_Near_To_Threshold_Balance"))) {
	 			pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE AUB-PHP CURRENCY");
	 		}else {
	 			pw.println("BALANCE IS SUFFICIENT FOR AUB-PHP CURRENCY");
	 		}
	 		//Thread.sleep(2000);	
	 		pw.println("*****Test Case 002 Passed For AUB_ASIA_UNITED_BANK*****");
	 		pw.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	 		pw.close();
	 		 
	 		}}
	     