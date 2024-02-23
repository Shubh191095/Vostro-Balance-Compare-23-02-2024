package Snb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LoginLogoutFunctionality {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		    WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
			
			//Locked Acc jyotid Grs@123
		
			driver.findElement(By.id ("inputEmail3")).sendKeys("PDS");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("Grs@123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
			Thread.sleep(5000);     
			

       // Wait for a few seconds to see the result
       try {
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       // Verify if the login was successful (you can customize this based on your application)
       if (driver.getCurrentUrl().equals("http://10.180.184.30:8080/grs-web/app.html#/Home")) {
           System.out.println("Login successful!");
           //Screen Shots for Home Page
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Home Page.jpg"));
	        System.out.println ("Screenshot is Taken for Home page");
           
       } else if(!driver.findElement(By.xpath("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/span")).getText().equals("")) {
           String strMessage = driver.findElement(By.xpath("/html/body/div/div/md-whiteframe/div[2]/div[2]/div/div/div/div/div[2]/form/span")).getText();
       	System.out.println("Login failed! due to - "+ strMessage);
           //Screen Shots for Login failed
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Invalid Credentials.jpg"));
	        System.out.println ("Screenshot is Taken for Login failed");
	        driver.close();
       }
       

       //Click on sign out ID       
       driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
       //Take Screen Shots for Logout Button
       File f9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       Files.copy(f9, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Sign out.jpg"));
       System.out.println ("Screenshot is Taken for sign out");
    
       //Click on sign out Button
       driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[3]/ul/li[3]/a")).click();
	    Thread.sleep(2000);
       System.out.println ("Log-in Log-out activity complted End of the program");
       driver.close();
	}
}
