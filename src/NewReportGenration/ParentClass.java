package NewReportGenration;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParentClass {
	//FOR TEST NG	
	//@Test
	//public void URl_ID_PASS_FETCH_PPMethod() throws IOException, InterruptedException {

	// FOR CHROME AND FIREFOX	
	//public static void main(String[] args) throws InterruptedException, IOException {

	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();

	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = null;

		try {
			System.setProperty("webdriver.geck.driver", "C:\\Users\\Shubham\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} catch (Exception e) {
			System.out.println("Firefox browser initialization failed. Trying with Chrome...");

			try {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception ex) {
				System.out.println("Both Firefox and Chrome browser initialization failed.");
				ex.printStackTrace();
				// Handle the failure or throw an exception as needed.
			}
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//==========================================================================================================================================
		//1:ABLPAK_ALLIED_BANK_LIMITED  
		Thread.sleep(2000); //MID
		int i=0;
		int counter = 0;
		do {
			try {
				counter++;
				ABLPAK_ALLIED_BANK_LIMITED base001 = new  ABLPAK_ALLIED_BANK_LIMITED();                 
				base001.testBase001(driver); 
				System.out.println("Test Case 1 passed For ABLPAK_ALLIED_BANK_LIMITED.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 1 failed For ABLPAK_ALLIED_BANK_LIMITED. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//2:AUB_ASIA_UNITED_BANK  
		//Thread.sleep(2000); //SLOW
		i=0;
		counter = 0;
		do {
			try {
				counter++;
				AUB_ASIA_UNITED_BANK base002 = new  AUB_ASIA_UNITED_BANK();               
				base002.testBase002(driver); 
				System.out.println("Test Case 2 passed For AUB_ASIA_UNITED_BANK.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 2 failed For AUB_ASIA_UNITED_BANK. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//3:AJWB_ATTIJARIWAFA_BANK 
		Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try {
				counter++;
				AJWB_ATTIJARIWAFA_BANK base003 = new  AJWB_ATTIJARIWAFA_BANK();                
				base003.testBase003(driver); 
				System.out.println("Test Case 3 Attijariwafa passed For AJWB_ATTIJARIWAFA_BANK.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 3 Attijariwafa failed For AJWB_ATTIJARIWAFA_BANK. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//4:BAHL_BANK_AL_HABIB_LIMITED    
		Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;
				BAHL_BANK_AL_HABIB_LIMITED base004 = new  BAHL_BANK_AL_HABIB_LIMITED();                 
				base004.testBase004(driver); 
				System.out.println("Test Case 4 passed For BAHL_BANK_AL_HABIB_LIMITED.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 4 failed For BAHL_BANK_AL_HABIB_LIMITED. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//5:BPI_BANK_OF_PHILIPPINES_ISLANDS 
		//Thread.sleep(2000); //MID
		i=0;
		counter=0;
		do {
			try { 
				counter++;
				BPI_BANK_OF_PHILIPPINES_ISLANDS base005 = new  BPI_BANK_OF_PHILIPPINES_ISLANDS();           
				base005.testBase005(driver); 
				System.out.println("Test Case 5 passed For BPI_BANK_OF_PHILIPPINES_ISLANDS.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 5 failed For BPI_BANK_OF_PHILIPPINES_ISLANDS. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//6:BCA_BCA_Bank_Central_Asia  
		Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				BCA_Bank_Central_Asia base006 = new  BCA_Bank_Central_Asia();          
				base006.testBase006(driver); 
				System.out.println("Test Case 6 passed For BCA_Bank_Central_Asia.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 6 failed For BCA_Bank_Central_Asia. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//7:BDO_Banco_de_Oro_Unibank_Inc 
		//Thread.sleep(2000); //Vv.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++; 
				BDO_Banco_de_Oro_Unibank_Inc base007 = new  BDO_Banco_de_Oro_Unibank_Inc();         
				base007.testBase007(driver); 
				System.out.println("Test Case 7 passed For BDO_Banco_de_Oro_Unibank_Inc.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 7 failed For BDO_Banco_de_Oro_Unibank_Inc. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//#:BRI_Bank_Rakyat_Indonesia 
		Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;    
				BRI_Bank_Rakyat_Indonesia base008 = new  BRI_Bank_Rakyat_Indonesia();           
				base008.testBase008(driver); 
				System.out.println("Test Case 8 passed For BRI_Bank_Rakyat_Indonesia.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 8 failed For BRI_Bank_Rakyat_Indonesia. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//9:GIBL_Global_IME_Bank_Ltd
		//Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				GIBL_Global_IME_Bank_Ltd base009 = new  GIBL_Global_IME_Bank_Ltd();         
				base009.testBase009(driver); 
				System.out.println("Test Case 9 passed For GIBL_Global_IME_Bank_Ltd.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 9 failed For GIBL_Global_IME_Bank_Ltd. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//10:HABIB_HABIB_BANK_LTD
		//Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++; 
				HABIB_HABIB_BANK_LTD base010 = new  HABIB_HABIB_BANK_LTD();            
				base010.testBase010(driver); 
				System.out.println("Test Case 10 passed For HABIB_HABIB_BANK_LTD.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 10 failed For HABIB_HABIB_BANK_LTD. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//11:HDFC_HDFC_Bank_Ltd.
		Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				HDFC_HDFC_Bank_Ltd base011 = new  HDFC_HDFC_Bank_Ltd();              
				base011.testBase011(driver); 
				System.out.println("Test Case 11 passed For HDFC_HDFC_Bank_Ltd.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 11 failed For HDFC_HDFC_Bank_Ltd. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//12:HBTF_HOUSING_BANK_FOR_TRADE_AND_FINANCE 
		//Thread.sleep(2000); //MID
		i=0;
		counter=0;
		do {
			try { 
				counter++;     
				HBTF_HOUSING_BANK_FOR_TRADE_AND_FINANCE base012 = new  HBTF_HOUSING_BANK_FOR_TRADE_AND_FINANCE();                    
				base012.testBase012(driver); 
				System.out.println("Test Case 12 passed For HBTF_HOUSING_BANK_FOR_TRADE_AND_FINANCE.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 12 failed For HBTF_HOUSING_BANK_FOR_TRADE_AND_FINANCE. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//13:ICICI_ICICI_Bank_Ltd. 
		//Thread.sleep(2000); //V.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				ICICI_ICICI_Bank_Ltd base013 = new  ICICI_ICICI_Bank_Ltd();                   
				base013.testBase013(driver); 
				System.out.println("Test Case 13 passed For ICICI_ICICI_Bank_Ltd.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 13 failed For ICICI_ICICI_Bank_Ltd. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//14:IBBL_Islami_Bank_Bangladesh_Limited  
		//Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				IBBL_Islami_Bank_Bangladesh_Limited base014 = new  IBBL_Islami_Bank_Bangladesh_Limited();                  
				base014.testBase014(driver); 
				System.out.println("Test Case 14 passed For IBBL_Islami_Bank_Bangladesh_Limited.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 14 failed For IBBL_Islami_Bank_Bangladesh_Limited. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//15:JBL_JANATA_BANK_LTD   
		//Thread.sleep(2000); //Fast
		i=0;
		counter=0;
		do {
			try { 
				counter++;     
				JBL_JANATA_BANK_LTD base015 = new  JBL_JANATA_BANK_LTD();                
				base015.testBase015(driver); 
				System.out.println("Test Case 15 passed For JBL_JANATA_BANK_LTD.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 15 failed For JBL_JANATA_BANK_LTD. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//16:MBTC_Metropolitan_Bank_and_Trust_Company  
		//Thread.sleep(2000); //V.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				MBTC_Metropolitan_Bank_and_Trust_Company base016 = new  MBTC_Metropolitan_Bank_and_Trust_Company();                   
				base016.testBase016(driver); 
				System.out.println("Test Case 16 passed For MBTC_Metropolitan_Bank_and_Trust_Company.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 16 failed For MBTC_Metropolitan_Bank_and_Trust_Company. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//17:MCB_Muslim_Commercial_Bank_Ltd.
		Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				MCB_Muslim_Commercial_Bank_Ltd base017 = new  MCB_Muslim_Commercial_Bank_Ltd();                      
				base017.testBase017(driver); 
				System.out.println("Test Case 17 passed For MCB_Muslim_Commercial_Bank_Ltd.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 17 failed For MCB_Muslim_Commercial_Bank_Ltd. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//18:BNI_PT_BANK_NEGARA_INDONESIA_TBK 
		//Thread.sleep(2000);  //V.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++; 
				BNI_PT_BANK_NEGARA_INDONESIA_TBK base018 = new  BNI_PT_BANK_NEGARA_INDONESIA_TBK();              
				base018.testBase018(driver); 
				System.out.println("Test Case 18 passed For BNI_PT_BANK_NEGARA_INDONESIA_TBK.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 18 failed For BNI_PT_BANK_NEGARA_INDONESIA_TBK. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//19:PB_Peoples_Bank 
		//Thread.sleep(2000); //FAST BUT FOR 1 CURRENCY
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				PB_Peoples_Bank base019 = new  PB_Peoples_Bank();         
				base019.testBase019(driver); 
				System.out.println("Test Case 19 passed For PB_Peoples_Bank.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 19 failed For PB_Peoples_Bank. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//20:PNB_Philippine_National_Bank   
		//Thread.sleep(2000); //V.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				PNB_Philippine_National_Bank base020 = new  PNB_Philippine_National_Bank();               
				base020.testBase020(driver); 
				System.out.println("Test Case 20 passed For PNB_Philippine_National_Bank.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 20 failed For PNB_Philippine_National_Bank. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//21:SAMPATH_SAMPATH_BANK_PLC
		//Thread.sleep(2000);  //v.slow
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				SAMPATH_SAMPATH_BANK_PLC base021 = new  SAMPATH_SAMPATH_BANK_PLC();            
				base021.testBase021(driver); 
				System.out.println("Test Case 21 passed For SAMPATH_SAMPATH_BANK_PLC.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 21 failed For SAMPATH_SAMPATH_BANK_PLC. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//22:SBL_SONALI_BANK_LTD 
		//Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				SBL_SONALI_BANK_LTD base022 = new  SBL_SONALI_BANK_LTD();                  
				base022.testBase022(driver); 
				System.out.println("Test Case 22 passed For SBL_SONALI_BANK_LTD.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 22 failed For SBL_SONALI_BANK_LTD. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//23:SEBL_SOUTHEAST_BANK_LTD 
		//Thread.sleep(2000);  //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				SEBL_SOUTHEAST_BANK_LTD base023 = new  SEBL_SOUTHEAST_BANK_LTD();                  
				base023.testBase023(driver); 
				System.out.println("Test Case 23 passed For SEBL_SOUTHEAST_BANK_LTD.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 23 failed For SEBL_SOUTHEAST_BANK_LTD. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//24:SBI_State_Bank_Of_India  
		//Thread.sleep(2000); //V.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++; 
				SBI_State_Bank_Of_India base024 = new  SBI_State_Bank_Of_India();                   
				base024.testBase024(driver); 
				System.out.println("Test Case 24 passed For SBI_State_Bank_Of_India.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 24 failed For SBI_State_Bank_Of_India. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//25:FBL_THE_FEDERAL_BANK_LIMITED 
		//Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++;   
				FBL_THE_FEDERAL_BANK_LIMITED base025 = new  FBL_THE_FEDERAL_BANK_LIMITED();                 
				base025.testBase025(driver); 
				System.out.println("Test Case 25 passed For FBL_THE_FEDERAL_BANK_LIMITED.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 25 failed For FBL_THE_FEDERAL_BANK_LIMITED. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//26:UBL_United_Bank_Limited 
		//Thread.sleep(2000); //FAST
		i=0;
		counter=0;
		do {
			try { 
				counter++; 
				UBL_United_Bank_Limited base026 = new  UBL_United_Bank_Limited();                      
				base026.testBase026(driver); 
				System.out.println("Test Case 26 passed For UBL_United_Bank_Limited.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 26 failed For UBL_United_Bank_Limited. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
		//27:BM_PT_BANK_MANDIRI_(PERSERO)_TBK 
		//Thread.sleep(2000); //V.SLOW
		i=0;
		counter=0;
		do {
			try { 
				counter++;  
				BM_PT_BANK_MANDIRI_PERSERO_TBK base027 = new  BM_PT_BANK_MANDIRI_PERSERO_TBK();                      
				base027.testBase027(driver); 
				System.out.println("Test Case 27 passed For BM_PT_BANK_MANDIRI_PERSERO_TBK.");
				i=1;
			} catch (Exception e) {
				System.err.println("Test Case 27 failed For BM_PT_BANK_MANDIRI_PERSERO_TBK. Exception details: " + e.getMessage());
				e.printStackTrace();
			}
		}while(i==0 || counter==3);
//==========================================================================================================================================
	}
}

