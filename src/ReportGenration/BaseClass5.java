package ReportGenration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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

public class BaseClass5 {
	public void testBase5(WebDriver driver) throws InterruptedException, IOException
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
	         Thread.sleep(8000);
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
//==================================================================================================================		 
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
//====================================================================================================================================		
        //by id not applicable   
        //System.out.println("Before Calling Select....");
        //WebElement triggerElement = driver.findElement(By.id("//select[@id='select0']"));
        //triggerElement.click();
        // System.out.println("After Calling Select....");
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
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[20]")).click();
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
        Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner Tab.jpg"));
        System.out.println ("5-Screenshot is Taken for Selecte for refresh Button");  
//===================================================================================================================================================     
         //6: Select the Pop_Up
      	 driver.findElement(By.xpath("html/body/div[3]/md-dialog/md-dialog-actions/button/span")).click();
      	 Thread.sleep(3000);
      	 
//      	 // Handle the alert
//         Alert alert1 = driver.switchTo().alert();
//
//         // Get the text from the alert
//         String alert1Text = alert1.getText();
//
//         // Print the alert text to the console
//         System.out.println("Alert Text: " + alert1Text);
//
//         // Close the alert
//          alert1.accept();
//      	 
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
        
        Thread.sleep(2000);

        //driver.quit();
        
Properties testProperties = new Properties();
String URL = "";
HashMap<String, String> hm = new HashMap<String, String>();
        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.properties")) {
			testProperties.load(inputStream);
			URL = testProperties.getProperty("URL");
			
			hm= new HashMap<String, String>((Map) testProperties);
			
			System.out.println("URL = "+ URL);
			
			for (Map.Entry<String, String> entry : hm.entrySet()) {
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("Key=" + key + ", Value=" + value);
	        }
			
			URL = hm.get("BAHL-PKR");
			String threshold=hm.get("Threshold_Balance");
			
			System.out.println("URL From HashMap = "+URL);
			System.out.println("threshold From HashMap = "+threshold);
			
			//System.out.println("UserID = "+ hm.get("UserId"));
			
			if(Double.valueOf(vostroBalance)  < Double.valueOf(URL) &&  Double.valueOf(vostroBalance)  > Double.valueOf(threshold)) {
				
				System.out.println("Vostro Balance is near to threshold balance kindly inform the FR team");
			}
			if(Double.valueOf(vostroBalance)  < Double.valueOf(threshold)) {
			
				System.out.println("BALANCE IS BELOW THRESHOLD BALANCE");
			}
			
			
		} catch (Exception  exceptionObj)  {
			exceptionObj.printStackTrace();
		}		
    }
}


