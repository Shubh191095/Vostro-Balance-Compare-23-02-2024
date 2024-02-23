package Snb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Pass_Blank_Scenario {

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=new ChromeDriver();       
    	driver.manage().window().maximize();
		driver.get("http://10.180.184.30:8080/grs-web/#/login");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
		Thread.sleep(5000);     

		 // Handle the alert
         Alert alert = driver.switchTo().alert();

        // Get the text from the alert
        String alertText = alert.getText();

        // Print the alert text to the console
        System.out.println("Alert Text: " + alertText);

        // Close the alert
        alert.accept();

        // Close the browser
        driver.quit();
    }
}