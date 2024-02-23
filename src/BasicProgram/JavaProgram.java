package BasicProgram;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaProgram {

	public static void main(String[] args) throws InterruptedException {
		
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
    //WebDriver driver=new ChromeDriver(); 
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();     
		      
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("http://10.180.184.30:8080/grs-web/#/login");
 	//Thread.sleep(2000);
	}
}
