package TC_01_URL_ID_PASS_FETCH_FROM_PROPERTIES_FILE;

import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URl_ID_PASS_FETCH_FORM_PROPERTIES_FILE {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
//	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
//	    WebDriver driver=new ChromeDriver(); 
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.manage().window().maximize();
		Properties properties = new Properties();
		String filePath=System.getProperty("user.dir")+"\\Properties\\new.properties";
		FileInputStream file = new FileInputStream(filePath);
		properties.load(file);
	    file.close();
		String name = properties.getProperty("web_URL1");	
		driver.get(name);
		System.out.println(name);
		
//=====================================================================================================================================				
		 int i=1;
	     while(i<=6)
	     {
		 String usernameKey = "Username"+i;
	     String passwordKey = "Password"+i;
			            
	     String username = properties.getProperty(usernameKey);
		 String password = properties.getProperty(passwordKey);
				
	     System.out.println(username);
							
		 Thread.sleep(2000);
				
		 //driver.findElement(By.id("inputEmail3")).sendKeys(username);

	     //driver.findElement(By.name("inputEmail")).sendKeys(strUserName);
				
	     
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
	     }}
         }}
