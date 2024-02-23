package Snb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Logout_Fetch_Multiple_ID_PASS_From_ExcelSheet_ {

	public static void main(String[] args) throws InterruptedException, IOException {
//FileInputStream fis = new FileInputStream ("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Portal Id's and passwords\\Portal Id passwords.xlsx");
//		
//		XSSFWorkbook workbook =new XSSFWorkbook (fis);
//		XSSFSheet sheet = workbook.getSheet("ID PASSWORDS Sheet");
//		int rowcount =sheet .getLastRowNum();
//		int colcount =sheet .getRow(1).getLastCellNum();
//		System.out.println("rowcount:"+rowcount+"colcount:+colcount");
//		//for (int i=2; i<rowcount ;i++)
		
		Properties properties = new Properties();
		Map<String, String> credentialsMap = new HashMap<>();
		
		//Thread.currentThread().getContextClassLoader().getResourceAsStream("test.properties")

        try (InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("credentials.properties")) {
            properties.load(inputStream);

            // Accessing usernames and passwords
            
            
            
            for (int i = 1; i <= 6; i++) {
                String usernameKey = "Username" + i;
                String passwordKey = "Password" + i;

                String username = properties.getProperty(usernameKey);
                String password = properties.getProperty(passwordKey);
                
                credentialsMap.put(username, password);

               
                
                // Use the values as needed
//                System.out.println("Username" + i + ": " + username);
//                System.out.println("Password" + i + ": " + password);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (Map.Entry<String, String> entry : credentialsMap.entrySet()) {
            System.out.println("Username: " + entry.getKey() + ", Password: " + entry.getValue());
        }

		
//		for (int i=2; i<rowcount;i++)
//		{
//			
//			WebDriver driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get("http://10.180.184.30:8080/grs-web/#/login");
//			Thread.sleep(2000);
//			
//			XSSFRow celldata = sheet .getRow(i);
//			
//			String Username =celldata.getCell(0).getStringCellValue();
//			String Password =celldata.getCell(1).getStringCellValue();
//			
//			driver.findElement(By.id ("inputEmail3")).sendKeys(Username);
//			Thread.sleep(2000);
//			
//			driver.findElement(By.name("password")).sendKeys(Password);
//			Thread.sleep(2000);
//				
//			System.out.println(i+"."+Username+" || "+Password);
//			Thread.sleep(2000);
//			
//			driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
//			Thread.sleep(5000);
//			
//			driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li[2]/a")).click();
//			Thread.sleep(2000);
//			driver.quit();
//			//break;
			
		 }
	  }
   
