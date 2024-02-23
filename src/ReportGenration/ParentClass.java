package ReportGenration;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentClass {

public static void main(String[] args) throws InterruptedException, IOException {
		
//System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
//WebDriver driver=new FirefoxDriver();
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
  		   
        BaseClass6 base6 = new  BaseClass6();
        BaseClass5 base5 = new  BaseClass5();
        BaseClass4 base4 = new  BaseClass4();
        BaseClass2 base2 = new 	BaseClass2();
        BaseClass3 base3 = new  BaseClass3();
           
        base6.testBase6(driver);
        base5.testBase5(driver);
        base4.testBase4(driver);
        base2.testBase2(driver);
		base3.testBase3(driver);
		
	}
}
