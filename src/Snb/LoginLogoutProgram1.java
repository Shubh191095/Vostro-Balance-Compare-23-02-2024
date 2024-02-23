package Snb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class LoginLogoutProgram1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver=new ChromeDriver();       
	    	driver.manage().window().maximize();
			driver.get("http://10.180.184.30:8080/grs-web/#/login");
			Thread.sleep(2000);
		
			driver.findElement(By.id ("inputEmail3")).sendKeys("PDS");
			Thread.sleep(2000);
			
			driver.findElement(By.name("password")).sendKeys("Grs@123");
			Thread.sleep(000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
			Thread.sleep(5000);       
	        
	        System.out.println("User login successful");
	        
	        //Screen Shots for Home Page
	        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\Automation Practice\\Automation Screen Shots\\QuickpayHomePage.jpg"));
	        System.out.println ("Screenshot is Taken for Home page");
   
//Title compare Test case 1
     
     // String expectedTitle = "Saudi National Bank";
     		
     //String actualTitle=	driver.getTitle();
     
     	   // if(expectedTitle.equals(actualTitle	))
     	   // {
     	   //	System.out.println("actualTitle is matched with expectedTitle ");
     	   //  }
     
     // else
     	   //{
     	   //System.out.println("Test case is failed");
     	   // }
     
     //driver.close();
		
     //System.out.println("End Of Program");
     
		   //driver.close();
   
// Test case 2 one time one run honar 1 or 2
     
     String expectedURL ="http://10.180.184.30:8080/grs-web/app.html#/Home";
     String actualURL=driver.getCurrentUrl();
     
    if(expectedURL.equals(actualURL))
    {
 	   System.out.println("Actual Home Page URL is matched with accepted Home Page URL");
 	   
 	   driver.close();
 	   
 	   System.out.println("End Of Program");
 	   
    }
    
    else
    { 
 	   System.out.println("Test case is failed");
 	   
 	   driver.close();
		 
		   System.out.println("End Of Program");
        
        driver.close();
	    }
    
}
}
