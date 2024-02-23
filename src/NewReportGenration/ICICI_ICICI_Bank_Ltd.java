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

public class ICICI_ICICI_Bank_Ltd {
	public void testBase013(WebDriver driver) throws InterruptedException, IOException
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
	         Thread.sleep(2000);
	         driver.findElement(By.id ("inputEmail3")).sendKeys(username);
	         //driver.findElement(By.name("inputEmail")).sendKeys(username);	     	
	         //driver.findElement(By.xpath ("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/div[1]/div/input")).sendKeys(username);
	         
	 		Thread.sleep(2000);
	 		driver.findElement(By.name("password")).sendKeys(password);
	 		Thread.sleep(200);
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
//=========================================================================================================================================	     
	     //1: Home Page	 	
			driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/a/span[1]")).click();
			Thread.sleep(2000);
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
	        pw.println ("User is able to click on reports Tab");
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
	         pw.println ("User is able to click on Vostro Blance tab");
//=====================================================================================================================================  
	        //3: Click on select partner Tab Bu using Xpath 
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select")).click();
			Thread.sleep(2000);
	        File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Tab.jpg"));
	        pw.println ("User is able to click on select partner Tab");
	        JavascriptExecutor js = (JavascriptExecutor)driver;  
	        js.executeScript("scrollBy(0, 500)");   
	        Thread.sleep(2000);
//=====================================================================================================================================		
	        //4: Select the Partner From Partner Drop Down
			driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[24]")).click();
			Thread.sleep(2000);
	        File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("User is able to click on Selected Partner Dropdown");
//=======================================================================================================================================		
	        //5: Click on the refresh Button
	      	driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[6]/a")).click();
	      	Thread.sleep(40000);
	        File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
	        pw.println ("User is able to click on refresh Button");  
//===================================================================================================================================================     
	           //6: Accept the Pop_Up	  
			   //Identify the pop-up element using XPath (adjust the XPath as needed)
			     WebElement popup = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-content"));

			     // Perform actions on the pop-up
			     String popupText = popup.getText();
			     pw.println("Pop-up Text: " + popupText);

			     // Perform actions within the pop-up (e.g., clicking a button)
			     WebElement okButton = driver.findElement(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span"));
			     okButton.click();
			     
			        //Take Screen Shots for Select the Partner
				    File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				    Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Vostro Balance For (ICICI)ICICI_Bank_Ltd.jpg"));
				    pw.println ("User is able to click on Accept the Pop_Up");
//==========================================================================================================================================================         
	         //7:Get text and compare with properties file
	         driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]")).click();
	         WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]"));

	         // Get text from the element
	         String elementText = element.getText();
	         String vostroBalance=elementText.replace(",", "");

	         // Print or use the retrieved text
	         pw.println("Vostro Balance ICICI-INR: " + vostroBalance);
	         pw.println("Threshold Balance For ICICI-INR: "+properties.getProperty("ICICI-INR"));

	         if(Double.valueOf(vostroBalance)  < Double.valueOf(properties.getProperty("ICICI-INR"))) {

	         pw.println("BALANCE IS BELOW THRESHOLD BALANCE FOR ICICI-INR CURRENCY");
	         }else if(Double.valueOf(properties.getProperty("ICICI-INR")) <  Double.valueOf(vostroBalance) && Double.valueOf(vostroBalance)  < Double.valueOf(properties.getProperty("ICICI_Near_To_Threshold_Balance"))) {
	         pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE FOR ICICI-INR CURRENCY");
	         }else {
	         pw.println("BALANCE IS SUFFICIENT FOR ICICI-INR CURRENCY");
	         }
	        //Thread.sleep(2000);
	         pw.println("*****Test Case 013 Passed For ICICI_ICICI_Bank_Ltd*****");
	         pw.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	         pw.close();
	         }}