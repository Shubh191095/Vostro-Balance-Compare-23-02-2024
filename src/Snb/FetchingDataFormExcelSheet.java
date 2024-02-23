package Snb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchingDataFormExcelSheet {

	public static void main(String[] args) throws IOException {
	//  //We can read data directly
//		 //First which file is that and there location
//		 //(C:\Users\Shubham\Desktop\Automation Excel Sheet)=>Excel Sheet Location and name =>Automation Excel Sheet
	//  //We will used Apache POI some classes
//		 //String variable name is path //Also Single slash used double slash
//			
//		 String path ="C:\\Users\\Shubham\\Desktop\\Automation Excel Sheet\\GRS PASSWORDS.xlsx";//here we can place the path
//		 //File Read
//		 FileInputStream file = new FileInputStream(path);//Except exception and throw deceleration//Used java class//Fle read by java but not read internal information
//		 //file=reference variable and use constructor new FileInputStram();//Throw deceleration used for the constructor
//		 //Workbook read
//		 //for read workbook we will used workbook class
//		 XSSFWorkbook workbook =new XSSFWorkbook(file);//Except exception and throw deceleration //WorkBook=class  //Create WorkBook object 
//		 //Read sheet
//		 XSSFSheet sheet= workbook.getSheet ("ID PASSWORDS Sheet");//XSSF sheet class  //Workbook class getsheet method use
//		 //Read row
//		 XSSFRow row = sheet.getRow(1);//Used sheet method//2 is row number
//		 //Read Cell
//		 XSSFCell cell = row.getCell(1);//
	//	
//		 //Data read//used cell class method
//		 String data =cell.getStringCellValue();
//		 System.out.println(data);
			
	//===========================================================================================================================	 
		 //SHORTS
			
		// String path ="C:\\Users\\Shubham\\Desktop\\Automation Excel Sheet\\GRS PASSWORDS.xlsx";
		 String path ="C:\\Users\\Shubham\\Desktop\\New Automation Project Related Docs\\Portal Id's and passwords\\Portal Id passwords.xlsx";
		
		 
		 //File Read
		 FileInputStream file = new FileInputStream(path);
		
		 //Workbook read
		 XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		 //Read sheet
		 XSSFSheet sheet= workbook.getSheet ("ID PASSWORDS Sheet");
		
		 //Read row
		 XSSFRow row = sheet.getRow(1);
		 
		 //Read Cell
		 XSSFCell cell = row.getCell(2);
		 
		 //Data read//used cell class method
		 String data =cell.getStringCellValue();
		 System.out.println(data);
		 
		}
	}
