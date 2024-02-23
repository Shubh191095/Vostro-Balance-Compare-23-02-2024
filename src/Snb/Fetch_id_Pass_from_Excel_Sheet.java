package Snb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_id_Pass_from_Excel_Sheet {

	public static void main(String[] args) throws InterruptedException, IOException {
		
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

		 }
	  }
   
