package Snb;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class MaintenanceFlagFunctionality {

	private static final WebDriver Driver = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		//==================================================================================================================		
	    WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://10.180.184.30:8080/grs-web/#/login");
		Thread.sleep(2000);
//==================================================================================================================		
        //0>>>>>>>>Login
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
        //1>>>>>>>>>>>>>>Home Page	 	
        //Click on Configuration Tab
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/a")).click();
		Thread.sleep(2000);
        //Screen Shots for Home Page
        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayHomePage.jpg"));
        System.out.println ("1-Screenshot is Taken for Home page");
//==================================================================================================================		
        //2>>>>>>>>>>>>>>>>Click on Partner Settings
	    driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
        //Screen Shots for Partner Settings
        File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f2, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpayPartner Settings.jpg"));
        System.out.println ("2-Screenshot is Taken for Partner Settings tab");
//==================================================================================================================		
        //3>>>>>>>>>>>>>>>>>>>Click on select partner Tab
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
        //4>>>>>>>>>>>>>>>>>Select the Partner
		driver.findElement(By.xpath("/html/body/div[3]/md-select-menu/md-content/md-option[47]/div")).click();
		Thread.sleep(2000);
        //Take Screen Shots for Select the Partner
        File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect the Partner.jpg"));
        System.out.println ("4-Screenshot is Taken for Select the Partner");
//==================================================================================================================       
        //5>>>>>>>>>>>>>>>>>>>>>Click on edit icon button
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/section/div[2]/div/div/div[1]/div[1]/div[2]/div/div[2]/div")).click();
		Thread.sleep(4000);
        //Take Screen Shots for edit icon button
        File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect edit icon button.jpg"));
        System.out.println ("5-Screenshot is Taken for edit icon button");
//==================================================================================================================	
        //6>>>>>>>>>>>>>>>>>>>Maintenance flag on (Toggle Handling)
		driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-content/md-content/div[1]/md-input-container/md-switch")).click();
		Thread.sleep(3000);
        //Take Screen Shots for Maintenance flag on
        File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect Maintenance flag on.jpg"));
        System.out.println ("6-Screenshot is Taken for Maintenance flag on");
//==================================================================================================================       
        //7>>>>>>>>>Click on save button 
        driver.findElement(By.xpath("/html/body/div[4]/div/md-dialog/form/md-dialog-actions/div/button[2]")).click();
		Thread.sleep(2000);
        //Take Screen Shots for save button 
        File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f7, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect click on save button.jpg"));
        System.out.println ("7-Screenshot is Taken for save button");
//==================================================================================================================      
        //8>>>>>>>>>Click on ok button 
        driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button/span")).click();
		Thread.sleep(2000);
        //Take Screen Shots for ok button 
        File f8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f8, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect click on save button.jpg"));
        System.out.println ("8-Screenshot is Taken for Successfully clicked on ok button");
//==================================================================================================================        
        //9>>>>>>>>>>>Log out (Click on SITCHECKER1)      
        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
        //Take Screen Shots for Logout Button
        File f9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f9, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect click on Click on SITCHECKER1.jpg"));
        System.out.println ("9-Screenshot is Taken for Logout button (Click on SITCHECKER1)");
//==================================================================================================================      
        //10>>>>>>>>>>>>Log out
        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/ul/li[3]/a")).click();
	    Thread.sleep(2000);
        //Take Screen Shots for Logout Button
        File f10=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f10, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect click on logoutbutton.jpg"));
        System.out.println ("10-Screenshot is Taken for Logout button");
        System.out.println ("Maker activity complted End of the program");
        //Checker Activity
//==================================================================================================================       
        //1>>>>>>>>Login
        //Screen Shots for checker Login page
        File f11=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f11, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaylogin.jpg"));
        System.out.println ("11-Screenshot is Taken for checker Login Page");
        driver.findElement(By.id ("inputEmail3")).sendKeys("NCB101");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Grs@123");
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
		Thread.sleep(2000);
//==================================================================================================================
        //12>>>>>>>>>>>>>>Home Page	 	
        //Click on Authorization Tab
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/div[1]/a/span[1]")).click();
		Thread.sleep(2000);
	    //Screen Shots for Home Page			 
	    File f12=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			        		        
        Files.copy(f12, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpay HomePage Authorization Tab.jpg"));
		System.out.println ("12-Screenshot is Taken for Home Page");
//==================================================================================================================			       
        //13 Approve Screen 	       
        //Click on Approve Screen  Tab
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);			
        //Screen Shots for Approve Screen tab	        
		File f13=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f13, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpay HomePage Approve Screen tab.jpg"));
		System.out.println ("13-Screenshot is Taken Approve Screen tab");
//==================================================================================================================		
        //14>>>>>>>>>>>>Select operation	       
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/md-input-container[2]/md-select")).click();
		Thread.sleep(2000);
        //Take Screen Shots for select partner Tab	        
		File f14=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	        
        Files.copy(f14, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Select operation.jpg"));
		System.out.println ("14-Screenshot is Taken for select partner Tab");			
        //Scroll down the web page by 5000 pixels  
		JavascriptExecutor jsa = (JavascriptExecutor)driver;  
		jsa.executeScript("scrollBy(0, 500)");   
	    Thread.sleep(2000);
//==================================================================================================================			       
        //15>>>>>>>>>>>Setting update
	    driver.findElement(By.xpath("/html/body/div[3]/md-select-menu/md-content/md-option[13]/div[1]")).click();
		Thread.sleep(2000);			
        //Take Screen Shots for select partner Tab	        
	    File f15=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f15, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Setting update.jpg"));
		System.out.println ("15-Screenshot is Taken for Setting update");
//==================================================================================================================
        //16>>>>>>>>>>>Approve Screen	       
		driver.findElement(By.xpath(" /html/body/div[1]/div[1]/div/div/div/section/div/div/div/div[2]/div[2]/table/tbody/tr/td[7]/input")).click();
		Thread.sleep(2000);
        //Take Screen Shots for Approve Screen	        
		File f16=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);       
        Files.copy(f16, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Approve Screen.jpg"));
	    System.out.println ("16-Screenshot is Taken for Approve Screen");
//==================================================================================================================	       
        //17>>>>>>>>>>>Submit Button	       
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/section/div/div/div/table/tbody/tr/td/button")).click();
	    Thread.sleep(2000);
        //Take Screen Shots for Submit Button	        
		File f17=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f17, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Submit Button.jpg"));
		System.out.println ("17-Screenshot is Taken for Submit Button");			       
//==================================================================================================================		
        //18>>>>>>>>>>>Ok Button   
	    driver.findElement(By.xpath("/html/body/div[4]/md-dialog/md-dialog-actions/button/span")).click();
	    Thread.sleep(2000);
        //Take Screen Shots for Submit Button		        
		File f18=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			        
        Files.copy(f18, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quickpaypartner Submit Button.jpg"));
		System.out.println ("18-Screenshot is Taken for Successfully clicked on ok button");
//==================================================================================================================		
        //19>>>>>>>>>>>>Log out (Click on SITCHECKER1)	       
	    driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/a/span")).click();
		Thread.sleep(1000);
        //Take Screen Shots for Logout Button	        
	    File f19=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		       
        Files.copy(f19, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect click on Click on checker SITCHECKER.jpg"));
	    System.out.println ("20-Screenshot is Taken for Logout button");	    
//==================================================================================================================
        //21>>>>>>>>>>>>Log out	       
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/ul/li[3]/a")).click();
	    Thread.sleep(1000);
        //Take Screen Shots for Logout Button	        
		File f20=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f20, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\QuickpaySelect click on checker logoutbutton.jpg"));
	    System.out.println ("21-Screenshot is Taken for Logout button");	       
	    System.out.println ("Checker activity completed End of the program");
	    Driver.close();
//==================================================================================================================			       		  
	}
}

