package ABase_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ANewParentClass {
private WebDriver driver;
private PrintWriter pw;
private Properties properties;

	    public void loadProperties() throws IOException {
		properties = new Properties();
		String filePath = System.getProperty("user.dir") + "\\Properties\\new.properties";
		FileInputStream file = new FileInputStream(filePath);
		properties.load(file);
		file.close();}

	    @BeforeTest
	    public void setUp() throws IOException, InterruptedException {
		// Initialize WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Initialize properties
		Properties properties = new Properties();
		String filePath = System.getProperty("user.dir") + "\\Properties\\new.properties";
		FileInputStream file = new FileInputStream(filePath);
		properties.load(file);
		file.close();

		// Initialize PrintWriter for output file
		File file1 = new File("outPut.txt");
		FileWriter fw = new FileWriter(file1, true);
		pw = new PrintWriter(fw);

		// Navigate to the URL
		String name = properties.getProperty("web_URL1");
		driver.get(name);
//===============================================================================================================
		int i=1;
		while(i<=6)
		{
		String usernameKey = "Username"+i;
		String passwordKey = "Password"+i;

		String username = properties.getProperty(usernameKey);
		String password = properties.getProperty(passwordKey);
		Thread.sleep(2000);

		driver.findElement(By.id ("inputEmail3")).sendKeys(username);
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(password);
		//Thread.sleep(200);
		try {
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-sm']")).click();
		Thread.sleep(2000);
		WebElement successElement = driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/div[1]/a"));

		break;
		}
		catch(Exception e)
		{
		i++;	
		}
		} 
//======================================================================================================================================== 
		//1: Home Page	 	
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/a/span[1]")).click();
		Thread.sleep(2000);
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f1, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Quick-pay(SNB) Dash Board.jpg"));
		pw.println ("User is able to click on reports Tab");
//==================================================================================================================		
		//2: Click on Vostro Balance tab
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[8]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		pw.println("Alert Text: " + alertText);
		alert.accept();
		File f2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f2, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Voatro Balance Tab.jpg"));
		pw.println ("User is able to click on Vostro Blance tab");
//=====================================================================================================================================  
		//3: Click on select partner Tab By using Xpath 
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select")).click();
		//Thread.sleep(2000);
		File f3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f3, new File("C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Automation Screenshots\\Partner Drop-Down.jpg"));
		pw.println ("User is able to click on select partner Tab");
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("scrollBy(0, 500)");   
	}
//=============================================================================================================================================================================
       //REAL DATA PLS CHANGE AFTER TESTING       500000   600000
       //1:ABLPAK_ALLIED_BANK_LIMITED               
	   //ABLPAK_Near_To_Threshold_Balance=800000
	   //ABLPAK-PKR=700000

	    @Test(priority=-27,invocationCount=1)
	    public void testABLPAK() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter = 0;
		String partnerName="";
		String ablPakXpath="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[3]";
		partnerName="ABLPAK-PKR";
		String ablPakThreshold=properties.getProperty("ABLPAK-PKR");
		String ablPakNearThreshold=properties.getProperty("ABLPAK_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		//System.out.println("Counter= "+ counter);
		//System.out.println("Value of i1= "+ i1);
		AAssistant.VostroCheckCompare(driver,partnerName,ablPakXpath,ablPakThreshold,ablPakNearThreshold);
		System.out.println("1:==========******TEST CASE FOR ABLPA PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		// If retried 3 times, fail the test using TestNG's Assert class
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//==========================================================================================================================   
        //2:AUB_ASIA_UNITED_BANK                      
	    //AUB_Near_To_Threshold_Balance=600000
	    //AUB-USD=500000
	    //AUB-PHP=500000 

	    @Test(priority=-26,invocationCount=1)
	    public void testAUB() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="AUB-USD";
		String partnerName211="AUB-PHP";
		String AUB_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[4]";
		String AUB_thres_usd=properties.getProperty("AUB-USD");
		String AUB_thres_php=properties.getProperty("AUB-PHP");
		String AUB_NEAR_TO_THRESHOLD1=properties.getProperty("AUB_Near_To_Threshold_Balance1");
		String AUB_NEAR_TO_THRESHOLD2=properties.getProperty("AUB_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, AUB_XPATH, AUB_thres_usd, AUB_thres_php, AUB_NEAR_TO_THRESHOLD1,AUB_NEAR_TO_THRESHOLD2);
		System.out.println("2:==========******TEST CASE FOR AUB PASSED*****==========");
		i1++;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================================
        //REAL DATA PLS CHANGE AFTER TESTING        #5000000   5500000
	    //3:AJWB_ATTIJARIWAFA_BANK                               
	    //AJWB-Near_To_Threshold_Balance=350000
	    //AJWB-MAD=200000

	    @Test(priority=-25,invocationCount=1)
	    public void testAJWB() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter = 0;
		String partnerName="";
		String AJWB_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[5]";
		partnerName="AJWB-MAD";
		String AJWB_thres=properties.getProperty("AJWB-MAD");
		String AJWB_Near_thres=properties.getProperty("AJWB-Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,AJWB_XPATH,AJWB_thres,AJWB_Near_thres);
		System.out.println("3:==========******TEST CASE FOR AJWB PASSED*****==========");
		i1=1;
		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//================================================================================================================================================    
        //4:BAHL_BANK_AL_HABIB_LIMITED                               
	    //BAHL_Near_To_Threshold_Balance=6000000
	    //BAHL-PKR=5000000
	  
	    @Test(priority=-24,invocationCount=1)
	    public void testBAHL() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter = 0;
		String partnerName="";
		String BAHL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[7]";
		partnerName="BAHL-PKR";
		String BAHL_thres=properties.getProperty("BAHL-PKR");
		String BAHL_Near_thres=properties.getProperty("BAHL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,BAHL_XPATH,BAHL_thres,BAHL_Near_thres);
		System.out.println("4:==========******TEST CASE FOR BAHL PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //5:BPI_BANK_OF_PHILIPPINES_ISLANDS          
	    //BPI_Near_To_Threshold_Balance=6000000
	    //BPI-PHP=5000000
	    //BPI-USD=5000000    

	    @Test(priority=-23,invocationCount=1)
	    public void testBPI() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="BPI-PHP";
		String partnerName211="BPI-USD";
		String BPI_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[11]";
		String BPI_thres_usd=properties.getProperty("BPI-PHP");
		String BPI_thres_php=properties.getProperty("BPI-USD");
		String BPI_NEAR_TO_THRESHOLD1=properties.getProperty("BPI_Near_To_Threshold_Balance1");
		String BPI_NEAR_TO_THRESHOLD2=properties.getProperty("BPI_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, BPI_XPATH, BPI_thres_usd, BPI_thres_php, BPI_NEAR_TO_THRESHOLD1,BPI_NEAR_TO_THRESHOLD2);
		System.out.println("5:==========******TEST CASE FOR BPI PASSED*****==========");
		i1++;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//================================================================================================================================================    
        //6:BCA_BCA_Bank_Central_Asia             
	    //BCA_Near_To_Threshold_Balance_For_IDR=6000000
	    //BCA-IDR=5000000
	    //BCA_Near_To_Threshold_Balance_For_USD=60000
	    //BCA-USD=50000

	    @Test(priority=-22,invocationCount=1)
	    public void testBCA() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="BCA-IDR";
		String partnerName211="BCA-USD";
		String BCA_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[15]";
		String BCA_thres_usd=properties.getProperty("BCA-IDR");
		String BCA_thres_php=properties.getProperty("BCA-USD");
		String BCA_NEAR_TO_THRESHOLD1=properties.getProperty("BCA_Near_To_Threshold_Balance1");
		String BCA_NEAR_TO_THRESHOLD2=properties.getProperty("BCA_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, BCA_XPATH, BCA_thres_usd, BCA_thres_php, BCA_NEAR_TO_THRESHOLD1,BCA_NEAR_TO_THRESHOLD2);
		System.out.println("6:==========******TEST CASE FOR BCA PASSED*****==========");
		i1++;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //7:BDO_Banco_de_Oro_Unibank_Inc          
        //BDO_Near_To_Threshold_Balance=6000000
	    //BDO-PHP=5000000
	    //BDO_Near_To_Threshold_Balance=60000
	    //BDO-USD=50000  

	    @Test(priority=-21,invocationCount=1)
	    public void testBDO() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="BDO-PHP";
		String partnerName211="BDO-USD";
		String BDO_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[6]";
		String BDO_thres_usd=properties.getProperty("BDO-PHP");
		String BDO_thres_php=properties.getProperty("BDO-USD");
		String BDO_NEAR_TO_THRESHOLD1=properties.getProperty("BDO_Near_To_Threshold_Balance2");
		String BDO_NEAR_TO_THRESHOLD2=properties.getProperty("BDO_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, BDO_XPATH, BDO_thres_usd, BDO_thres_php, BDO_NEAR_TO_THRESHOLD1,BDO_NEAR_TO_THRESHOLD2);
		System.out.println("7:==========******TEST CASE FOR BDO PASSED*****==========");
	    i1++;

	    } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================   
        //8:BRI_Bank_Rakyat_Indonesia                             
	    //BRI_Near_To_Threshold_Balance=6000000
	    //BRI-IDR=5000000

	    @Test(priority=-20,invocationCount=1)
	    public void testBRI() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter = 0;
		String partnerName="";
		String BRI_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[12]";
		partnerName="BRI-IDR";
		String BRI_thres=properties.getProperty("BRI-IDR");
		String BRI_Near_thres=properties.getProperty("BRI_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,BRI_XPATH,BRI_thres,BRI_Near_thres);
		System.out.println("8:==========******TEST CASE FOR BRI PASSED*****==========");
	    i1=1;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================== 	
        //9:GIBL_Global_IME_Bank_Ltd                           
	    //GIBL_Near_To_Threshold_Balance=6000000
	    //GIBL-NPR=5000000

	    @Test (priority=-19,invocationCount=1)
	    public void testGIBL() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter = 0;
		String partnerName="";
		String GIBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[19]";
		partnerName="GIBL-NPR";
		String GIBL_thres=properties.getProperty("GIBL-NPR");
		String GIBL_Near_thres=properties.getProperty("GIBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,GIBL_XPATH,GIBL_thres,GIBL_Near_thres);
		System.out.println("9:==========******TEST CASE FOR GIBL PASSED*****==========");
		i1=1;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================    
        //10:HABIB_HABIB_BANK_LTD                                          
	    //HABIB_Near_To_Threshold_Balance=600000
	    //HABIB-PKR=500000

	    @Test(priority=-18,invocationCount=1)
	    public void testHABIB() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter = 0;
		String partnerName="";
		String HABIB_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[20]";
		partnerName="HABIB-PKR";
		String HABIB_thres=properties.getProperty("HABIB-PKR");
		String HABIB_Near_thres=properties.getProperty("HABIB_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,HABIB_XPATH,HABIB_thres,HABIB_Near_thres);
		System.out.println("10:==========*****TEST CASE FOR HABIB PASSED*****==========");
		i1=1;	

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //11:HDFC_HDFC_Bank_Ltd.                       
	    //HDFC_Near_To_Threshold_Balance=6000000
	    //HDFC-INR=5000000

	    @Test(priority=-17,invocationCount=1)
	    public void testHDFC() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String HDFC_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[21]";
		partnerName="HDFC-INR";
		String HDFC_thres=properties.getProperty("HDFC-INR");
		String HDFC_Near_thres=properties.getProperty("HDFC_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,HDFC_XPATH,HDFC_thres,HDFC_Near_thres);
		System.out.println("11:==========*****TEST CASE FOR HDFC PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================        
        //12:HBTF_HOUSING_BANK_FOR_TRADE_AND_FINANCE       
	    //HBTF_Near_To_Threshold_Balance=600000
	    //HBTF-JOD=500000

	    @Test(priority=-16,invocationCount=1)
	    public void testHBTF() throws InterruptedException, IOException {
		
		loadProperties();
		int i1=0;
		int counter = 0;
		String partnerName="";
		String HBTF_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[23]";
		partnerName="HBTF-JOD";
		String HBTF_thres=properties.getProperty("HBTF-JOD");
		String HBTF_Near_thres=properties.getProperty("HBTF_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,HBTF_XPATH,HBTF_thres,HBTF_Near_thres);
		System.out.println("12:==========*****TEST CASE FOR HBTF PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
	    System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //13:ICICI_ICICI_Bank_Ltd.                                           
	    //ICICI_Near_To_Threshold_Balance=100
	    //ICICI-INR=0

	    @Test(priority=-15,invocationCount=1)
	    public void testICICI() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String ICICI_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[24]";
		partnerName="ICICI-INR";
		String ICICI_thres=properties.getProperty("ICICI-INR");
		String ICICI_Near_thres=properties.getProperty("ICICI_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,ICICI_XPATH,ICICI_thres,ICICI_Near_thres);
		System.out.println("13:==========*****TEST CASE FOR ICICI PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================    
        //14:IBBL_Islami_Bank_Bangladesh_Limited                
	    //IBBL_Near_To_Threshold_Balance=600000
	    //IBBL-BDT=500000

	    @Test(priority=-14,invocationCount=1)
     	public void testIBBL() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String IBBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[25]";
		partnerName="IBBL-BDT";
		String IBBL_thres=properties.getProperty("IBBL-BDT");
		String IBBL_Near_thres=properties.getProperty("IBBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,IBBL_XPATH,IBBL_thres,IBBL_Near_thres);
		System.out.println("14:==========*****TEST CASE FOR IBBL PASSED*****==========");
		i1=1;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //15:JBL_JANATA_BANK_LTD                                      
	    //JBL_Near_To_Threshold_Balance=6000000
	    //JBL-BDT=5000000

	    @Test(priority=-13,invocationCount=1)
	    public void testJBL() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String JBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[26]";
		partnerName="JBL-BDT";
		String JBL_thres=properties.getProperty("JBL-BDT");
		String JBL_Near_thres=properties.getProperty("JBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;	
		AAssistant.VostroCheckCompare(driver,partnerName,JBL_XPATH,JBL_thres,JBL_Near_thres);
		System.out.println("15:==========*****TEST CASE FOR JBL PASSED*****==========");
		i1=1;
	    } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================
        //16:MBTC_Metropolitan_Bank_and_Trust_Company  
	    //MBTC_Near_To_Threshold_Balance=6000000
	    //MBTC-PHP=5000000	
	    //MBTC_Near_To_Threshold_Balance=60000
	    //MBTC-USD=50000

	    @Test(priority=-12,invocationCount=1)
	    public void testMBTC() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="MBTC-PHP";
		String partnerName211="MBTC-USD";
		String MBTC_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[27]";
		String MBTC_thres_usd=properties.getProperty("MBTC-PHP");
		String MBTC_thres_php=properties.getProperty("MBTC-USD");
		String MBTC_NEAR_TO_THRESHOLD1=properties.getProperty("MBTC_Near_To_Threshold_Balance1");
		String MBTC_NEAR_TO_THRESHOLD2=properties.getProperty("MBTC_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, MBTC_XPATH, MBTC_thres_usd, MBTC_thres_php, MBTC_NEAR_TO_THRESHOLD1,MBTC_NEAR_TO_THRESHOLD2);
		System.out.println("16:==========*****TEST CASE FOR MBTC PASSED*****==========");
		i1++;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //#17:MCB_Muslim_Commercial_Bank_Ltd.                       
	    //MCB_Near_To_Threshold_Balance=600000
	    //MCB-PKR=500000

	    @Test(priority=-11,invocationCount=1)
	    public void testMCB() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String MCB_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[28]";
		partnerName="MCB-PKR";
		String MCB_thres=properties.getProperty("MCB-PKR");
		String MCB_Near_thres=properties.getProperty("MCB_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,MCB_XPATH,MCB_thres,MCB_Near_thres);
		System.out.println("17:==========*****TEST CASE FOR MCB PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================
        //18:BNI_PT_BANK_NEGARA_INDONESIA_TBK                      
	    //BNI_Near_To_Threshold_Balance=6000
	    //BNI-USD=5000
	    //BNI-IDR=5000

	    @Test(priority=-10,invocationCount=1)
	    public void testBNI() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="BNI-USD";
		String partnerName211="BNI-IDR";
		String BNI_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[34]";
		String BNI_thres_usd=properties.getProperty("BNI-USD");
		String BNI_thres_php=properties.getProperty("BNI-IDR");
		String BNI_NEAR_TO_THRESHOLD1=properties.getProperty("BNI_Near_To_Threshold_Balance1");
		String BNI_NEAR_TO_THRESHOLD2=properties.getProperty("BNI_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, BNI_XPATH, BNI_thres_usd, BNI_thres_php, BNI_NEAR_TO_THRESHOLD1,BNI_NEAR_TO_THRESHOLD1);
		System.out.println("18:==========*****TEST CASE FOR BNI PASSED*****==========");
		i1++;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================    
//FAST BUT FOR 1 CURRENCY	
	    //19:PB_Peoples_Bank                                               
	    //PB_Near_To_Threshold_Balance=600000                           
	    //PB-LKR=500000

	    @Test(priority=-9,invocationCount=1)
	    public void testPB() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String PB_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[31]";
		partnerName="PB-LKR";
		String PB_thres=properties.getProperty("PB-LKR");
		String PB_Near_thres=properties.getProperty("PB_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,PB_XPATH,PB_thres,PB_Near_thres);
		System.out.println("19:==========*****TEST CASE FOR PB PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //20:PNB_Philippine_National_Bank             
	    //PNB_Near_To_Threshold_Balance=5000000
	    //PNB-PHP=5000000
	    //Threshold_Balance=50000
	    //PNB-USD=50000

	    @Test(priority=-8,invocationCount=1)
	    public void testPNB() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="PNB-PHP";
		String partnerName211="PNB-USD";
		String PNB_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[32]";
		String PNB_thres_usd=properties.getProperty("PNB-PHP");
		String PNB_thres_php=properties.getProperty("PNB-USD");
		String PNB_NEAR_TO_THRESHOLD1=properties.getProperty("PNB_Near_To_Threshold_Balance1");
		String PNB_NEAR_TO_THRESHOLD2=properties.getProperty("PNB_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;	
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, PNB_XPATH, PNB_thres_usd, PNB_thres_php, PNB_NEAR_TO_THRESHOLD1,PNB_NEAR_TO_THRESHOLD2);
		System.out.println("20:==========*****TEST CASE FOR PNB PASSED*****==========");
		i1++;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================   
        //21:SAMPATH_SAMPATH_BANK_PLC
	    //SAMPATH_near_To_Threshold_Balance=19999999999999
	    //SAMPATH-LKR=9999999999999
        //SAMPATH_near_To_Threshold_Balance=19999999999999
	    //SAMPATH-USD=9999999999999

	    @Test(priority=-7,invocationCount=1)
	    public void testSAMPATH() throws InterruptedException, IOException {
		loadProperties();

		int i1=0;
		int counter=0;
		String partnerName111="SAMPATH-LKR";
		String partnerName211="SAMPATH-USD";
		String SAMPATH_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[36]";
		String SAMPATH_thres_usd=properties.getProperty("SAMPATH-LKR");
		String SAMPATH_thres_php=properties.getProperty("SAMPATH-USD");
		String SAMPATH_NEAR_TO_THRESHOLD1=properties.getProperty("SAMPATH_Near_To_Threshold_Balance1");
		String SAMPATH_NEAR_TO_THRESHOLD2=properties.getProperty("SAMPATH_Near_To_Threshold_Balance2");
		AAssistant assistant=new AAssistant();
		
		do {
		try {
		counter++;
		AAssistant.VostroCheckCompare2Currency(driver,partnerName111,partnerName211, SAMPATH_XPATH, SAMPATH_thres_usd, SAMPATH_thres_php, SAMPATH_NEAR_TO_THRESHOLD1,SAMPATH_NEAR_TO_THRESHOLD2);
		System.out.println("21:==========*****TEST CASE FOR SAMPATH PASSED*****==========");
		i1++;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName111 + partnerName211 + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName111 + partnerName211 + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //22:SBL_SONALI_BANK_LTD                                               
	    //SBL_Near_To_Threshold_Balance=6000000
	    //SBL-BDT=5000000

	    @Test(priority=-6,invocationCount=1)
	    public void testSBL() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String SBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[37]";
		partnerName="SBL-BDT";
		String SBL_thres=properties.getProperty("SBL-BDT");
		String SBL_Near_thres=properties.getProperty("SBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
	    try {
		counter++;		
		AAssistant.VostroCheckCompare(driver,partnerName,SBL_XPATH,SBL_thres,SBL_Near_thres);
		System.out.println("22:==========*****TEST CASE FOR SBL PASSED*****==========");
		i1=1;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
	    System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================    
        //23:SEBL_SOUTHEAST_BANK_LTD                     
	    //SEBL_Near_To_Threshold_Balance=600000
	    //SEBL-BDT=500000

	    @Test(priority=-5,invocationCount=1)
	    public void testSEBL() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String SEBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[38]";
		partnerName="SEBL-BDT";
		String SEBL_thres=properties.getProperty("SEBL-BDT");
		String SEBL_Near_thres=properties.getProperty("SEBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;		
		AAssistant.VostroCheckCompare(driver,partnerName,SEBL_XPATH,SEBL_thres,SEBL_Near_thres);
		System.out.println("23:==========*****TEST CASE FOR SEBL PASSED*****==========");
		i1=1;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
	    }
		} while (i1 == 0);}
//=========================================================================================================================================    
//SLOW  //24:SBI_State_Bank_Of_India                                         
       	//SBI_Near_To_Threshold_Balance=100
	    //SBI-INR=1

	    @Test(priority=-4,invocationCount=1)
	    public void testSBI() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String SBI_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[39]";
		partnerName="SBI-INR";
		String SBI_thres=properties.getProperty("SBI-INR");
		String SBI_Near_thres=properties.getProperty("SBI_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,SBI_XPATH,SBI_thres,SBI_Near_thres);
		System.out.println("24:==========*****TEST CASE FOR SBI PASSED*****==========");
		i1=1;
        } catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
	    }
		}
		} while (i1 == 0);}
//===========================================================================================================================        
        //25:FBL_THE_FEDERAL_BANK_LIMITED                            
	    //FBL_Near_To_Threshold_Balance=6000000
	    //FBL-INR=5000000

	    @Test(priority=-3,invocationCount=1)
	    public void testFBL() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String FBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[41]";
		partnerName="FBL-INR";
		String FBL_thres=properties.getProperty("FBL-INR");
		String FBL_Near_thres=properties.getProperty("FBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,FBL_XPATH,FBL_thres,FBL_Near_thres);
		System.out.println("25:==========*****TEST CASE FOR FBL PASSED*****=========");
		i1=1;
		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//=========================================================================================================================================    
        //26:UBL_United_Bank_Limited                                 
	    //UBL_Near_To_Threshold_Balance=5000
	    //UBL-PKR=5000

	    @Test(priority=-2,invocationCount=1)
	    public void testUBL() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String UBL_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[42]";
		partnerName="UBL-PKR";
		String UBL_thres=properties.getProperty("UBL-PKR");
		String UBL_Near_thres=properties.getProperty("UBL_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,UBL_XPATH,UBL_thres,UBL_Near_thres);
		System.out.println("26:==========*****TEST CASE FOR UBL PASSED*****==========");
		i1=1;
		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//===========================================================================================================================    
//SLOW  //27:BM_PT_BANK_MANDIRI_(PERSERO)_TBK                      
        //BM_Near_To_Threshold_Balance=6000000
	    //BM-IDR=5000000

	    @Test(priority=-1,invocationCount=1)
	    public void testBM() throws InterruptedException, IOException {
		loadProperties();
		
		int i1=0;
		int counter = 0;
		String partnerName="";
		String BM_XPATH="/html/body/div/div[1]/div/div/div/section/div/div/div/div[2]/div/div[1]/select/option[33]";
		partnerName="BM-IDR";
		String BM_thres=properties.getProperty("BM-IDR");
		String BM_Near_thres=properties.getProperty("BM_Near_To_Threshold_Balance");
		AAssistant assistant=new AAssistant();
		
		do {			
		try {
		counter++;
		AAssistant.VostroCheckCompare(driver,partnerName,BM_XPATH,BM_thres,BM_Near_thres);
		System.out.println("27:==========*****TEST CASE FOR BM PASSED*****==========");
		i1=1;

		} catch (Exception e) {
		if (counter >= 3) {
		org.testng.Assert.fail("Test case for " + partnerName + " failed after 3 attempts.");
		} else {
		System.out.println(partnerName + ": " + e);
		}
		}
		} while (i1 == 0);}
//================================================================================================================================================    
	@AfterTest
	public void closeConnection() {
	driver.close();
	driver.quit();
	}
}
