package ABase_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

public class AAssistant {

	static void VostroCheckCompare(WebDriver driver,String partnerName,String Xpath,String threshold,String NearThreshold) throws IOException, InterruptedException
	{
		//WebDriver driver = null;
		File file1 = new File("outPut.txt");
		FileWriter fw = new FileWriter(file1, true);
		PrintWriter pw = new PrintWriter(fw);
		
		Date d=new Date();
		System.out.println(d);
		//Simple Format class used
		//Date Format JAVA class
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss"); // SimpleDateFormat=Constuucter
		String date = d1.format(d);
		pw.println(date);
//==================================================================================================================================		
		driver.findElement(By.xpath(Xpath)).click();
		//Thread.sleep(2000);
		//Take Screen Shots for Select the Partner
		File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Selecte Partner From Drop-down-"+partnerName+date+".jpg"));
		pw.println ("User is able to click on Selected Partner Drop-down");
//==========================================================================================================================================
		driver.findElement(By.xpath("html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[6]/a")).click();
		//Take Screen Shots for Select the Partner
		File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Click on refresh Button-"+partnerName+date+".jpg"));
		pw.println ("User is able to click on refresh Button");
//=====================================================================================================================================================		                  	
		//6: Accept the Pop_Up	  Condition for above 6 to wait for the selection
	    //WebDriverWait wait = new WebDriverWait(driver, 55);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(59));
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/md-dialog/md-dialog-content")));
		String popupText = popup.getText();
		pw.println("Pop-up Text: " + popupText);

		// Wait for the button to be clickable before clicking it
		WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span")));
		okButton.click();		
//=====================================================================================================================================================				
		//Take Screen Shots for Select the Partner
		File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Accept the Pop_Up-"+partnerName+date+".jpg"));
		pw.println ("User is able to click on Accept the Pop_Up");
//========================================================================================================================================		  
		//Get text and compare with properties file
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]")).click();
		WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr/td[2]"));

		// Get text from the element
		String elementText = element.getText();
		String vostroBalance=elementText.replace(",", "");

		// Print or use the retrieved text
		pw.println("Vostro Balance for : "+ partnerName +" is " + vostroBalance);
		pw.println("threshold Balance for : "+ partnerName +" is " + threshold);

		if ((Double.valueOf(vostroBalance) < Double.valueOf(Double.valueOf(NearThreshold)) && (Double.valueOf(vostroBalance) > Double.valueOf(threshold)))) {
		    pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE FOR " + partnerName);
		    pw.println("==========*****TEST CASE PASSED FOR =>>" + partnerName);
		} else if (Double.valueOf(vostroBalance) < Double.valueOf(threshold)) {
		    pw.println("BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName);
		    //pw.println(); 
		    pw.println("==========*****TEST CASE FAILED FOR =>>" + partnerName);
		    pw.println();
		    pw.flush(); // Flush the PrintWriter to ensure all buffered data is written
		    pw.close(); // Close the PrintWriter to release the file resources
		    Assert.fail("TEST CASE IS FAILED BEACOUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName);
		} else {
		    pw.println("BALANCE IS SUFFICIENT FOR " + partnerName);
		    pw.println("==========*****TEST CASE PASSED FOR =>>" + partnerName);
		}

		pw.println(" ");
		pw.close();}
            
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>FOR MULTIPLE CURRENCY<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

	//	static void VostroCheckCompare(WebDriver driver,String partnerName,String Xpath,String threshold,String NearThreshold) throws IOException, InterruptedException
//	{

	public static void VostroCheckCompare2Currency(WebDriver driver,String partnerName1,String partnerName2, String Xpath,String Curr1threshold,String Curr2Threshold,String NearThreshold1,String NearThreshold2) throws IOException, InterruptedException
	{
		File file1 = new File("outPut.txt");
		FileWriter fw = new FileWriter(file1, true);
		PrintWriter pw = new PrintWriter(fw);

		Date d=new Date();
		System.out.println(d);
		//Simple Format class used
		//Date Format JAVA class
		DateFormat d1 = new SimpleDateFormat("dd-MM-yy & HH-mm-ss"); // SimpleDateFormat=Constuucter
		String date = d1.format(d);
		pw.println(date);
//=====================================================================================================================================		
		//4: Select the Partner From Partner Drop Down
		driver.findElement(By.xpath(Xpath)).click();
		//Thread.sleep(2000);
		//Take Screen Shots for Select the Partner
		File f4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f4, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Selecte Partner From Drop-down "+partnerName1+" & "+partnerName2+date+".jpg"));
		pw.println ("User is able to click on Partner Dropdown");
//=======================================================================================================================================		
		//5: Click on the refresh Button
		//For PHP Currency
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[6]/a/span")).click();                          
		//Thread.sleep(3000);
		//Take Screen Shots for Select the Partner
		File f5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f5, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Click on refresh Button 1 "+partnerName1+" & "+partnerName2+date+".jpg"));
		pw.println ("User is able to click on refresh Button 1");    
//=============================================================================================================================================================================		
		//>>>>>>>>>>>>>>>>>>>	//6: Select the Pop_Up 1 	
		//6: Accept the Pop_Up	  Condition for above 6 to wait for the selection
				
		//WebDriverWait wait = new WebDriverWait(driver, 55);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(59));
		WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/md-dialog/md-dialog-content")));
		String popupText = popup.getText();
		pw.println("Pop-up Text: " + popupText);

		// Wait for the button to be clickable before clicking it
		WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span")));
		okButton.click();
				
		//Take Screen Shots for Select the Partner
		File f6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f6, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Accept the Pop_Up 1 "+partnerName1+" & "+partnerName2+ date+".jpg"));
		pw.println ("User is able to click on Accept the Pop_Up 1");		
//=======================================================================================================================================		
		//7: Click on the refresh Button
		//For USD Currency
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/a/span")).click();
		//Thread.sleep(3000);
		//Take Screen Shots for Select the Partner
		File f7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f7, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Click on refresh Button 2 "+partnerName1+" & "+partnerName2+ date+".jpg"));
		pw.println ("User is able to click on refresh Button 2"); 
//==============================================================================================================================================================		
		//8: Select the Pop_Up 2		
		//WebDriverWait wait1 = new WebDriverWait(driver, 55);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(59));
		WebElement popup1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/md-dialog/md-dialog-content")));
		String popupText1 = popup1.getText();
		pw.println("Pop-up Text: " + popupText1);

		// Wait for the button to be clickable before clicking it
		WebElement okButton1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/md-dialog/md-dialog-actions/button/span")));
		okButton1.click();
		
		//Take Screen Shots for Select the Partner
		File f8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f8, new File("C:\\Users\\Shubham\\Desktop\\SS For SNB-GRS Auto Testing\\Accept the Pop_Up 2 "+partnerName1+" & "+partnerName2+ date+".jpg"));
		pw.println ("User is able to click on Accept the Pop_Up 2");
//==========================================================================================================================================================         
		//9:Get text and compare with properties file
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]")).click();
		WebElement element1 = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[1]/td[2]"));

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]")).click();
		WebElement element2 = driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]"));

		String vostroBalance1=element1.getText().replace(",", "");
		String vostroBalance2=element2.getText().replace(",", "");

		// Print or use the retrieved text
		pw.println("Vostro Balance for : "+ partnerName1 +" is " + vostroBalance1);
	    pw.println("Vostro Balance for : "+ partnerName2 +" is " + vostroBalance2);
		    	
		pw.println("threshold Balance for : "+ partnerName1 +" is " + Curr1threshold);
		pw.println("threshold Balance for : "+ partnerName2 +" is " + Curr2Threshold);
        boolean isFirstCurrFail = false;
        boolean isSecondCurrFail = false;
		
        //For 1st Currency       
		try {		   
		if (Double.valueOf(vostroBalance1) < Double.valueOf(Curr1threshold)) {
	    pw.println("BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName1);
		pw.println("==========*****TEST CASE FAILED FOR ==>" + partnerName1);
		//pw.println();
		isFirstCurrFail = true;
        //pw.flush(); // Flush the PrintWriter to ensure all buffered data is written
        //Assert.fail("TEST CASE IS FAILED BECAUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName1);
	    } else if (Double.valueOf(Curr1threshold) < Double.valueOf(vostroBalance1) && Double.valueOf(vostroBalance1) < Double.valueOf(NearThreshold1)) {
	    pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE FOR " + partnerName1);
		pw.println("==========*****TEST CASE PASSED FOR ==>" + partnerName1);
		} else {
		pw.println("BALANCE IS SUFFICIENT FOR " + partnerName1);
		pw.println("==========*****TEST CASE PASSED FOR ==>" + partnerName1);
		}

		//For 2st Currency  
		if (Double.valueOf(vostroBalance2) < Double.valueOf(Curr2Threshold)) {
		pw.println("BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName2);
		pw.println("==========*****TEST CASE FAILED FOR ==>" + partnerName2);
		pw.println();
		isSecondCurrFail = true;
	    //pw.flush(); // Flush the PrintWriter to ensure all buffered data is written
	    //Assert.fail("TEST CASE IS FAILED BECAUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName2);
	    } else if (Double.valueOf(Curr2Threshold) < Double.valueOf(vostroBalance2) && Double.valueOf(vostroBalance2) < Double.valueOf(NearThreshold2)) {
		pw.println("REACHING NEAR TO THRESHOLD BALANCE PLEASE ADD BALANCE FOR " + partnerName2);
		pw.println("==========*****TEST CASE PASSED FOR ==>" + partnerName2);
		pw.flush();
		} else {
		pw.println("BALANCE IS SUFFICIENT FOR " + partnerName2);
		pw.println("==========*****TEST CASE PASSED FOR ==>" + partnerName2);
		pw.flush();
		}
		pw.println(" ");
				
		if(isFirstCurrFail && isSecondCurrFail) {
		pw.flush();
		Assert.fail("TEST CASE IS FAILED BECAUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName1 +", "+partnerName2);
		//Assert.fail("TEST CASE IS FAILED BECAUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName2);
		}else if(!isFirstCurrFail && isSecondCurrFail) {
		pw.flush();
		Assert.fail("TEST CASE IS FAILED BECAUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName2);
		}else if(isFirstCurrFail && !isSecondCurrFail) {
		pw.flush();
		Assert.fail("TEST CASE IS FAILED BECAUSE BALANCE IS BELOW THRESHOLD BALANCE FOR " + partnerName1);
		}
		pw.close(); 	
		} catch (Exception e) { 	    
		}
	    }
		}