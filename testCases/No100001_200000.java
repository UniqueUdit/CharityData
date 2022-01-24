package com.charityData.testCases;
import org.testng.annotations.BeforeMethod;
import au.com.bytecode.opencsv.CSVReader;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class No100001_200000 {
  	WebDriver driver;
  	Logger log = Logger.getLogger("devpinoyLogger");
  	public static char
    getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }
  	
    @Test
  public void f() throws IOException, InterruptedException 
    {
  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
  	  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
  	ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");     
    options.addArguments("--disable-gpu");
    
 	//Setting the driver to chrome driver
 	  driver = new ChromeDriver(options);
  	  String url = "https://www.ic.gc.ca/app/scr/cc/CorporationsCanada/fdrlCrpSrch.html?locale=en_CA";
  	  driver.get(url);
  	  
 // 	driver.findElement(By.tagName("input")).sendKeys("https://www.ic.gc.ca/app/scr/cc/CorporationsCanada/fdrlCrpSrch.html?locale=en_CA");
  	
 // 	driver.findElement(By.xpath("//button[@type='submit']")).click();
  //	TimeUnit.SECONDS.sleep(10);
  	  // This will load csv file 
  	// CSVReader reader = new CSVReader(new FileReader("D:\\JAVA\\charityDataV1\\Excels\\Test1.csv")); 
  	 // this will load content into list
  	 // List<String[]> li=reader.readAll();
  	//  System.out.println("Total rows which we have is "+li.size()); 	            
  	 // create Iterator reference
  	//  Iterator<String[]>i1= li.iterator();    
  	 // Iterate all values 
  	
  	/*while(i1.hasNext())
  	 	{
  	     
  		 String[] str=i1.next();
  	   
  		 System.out.print(" Values are ");*/
  		 
  		 
  		/* for(int i11=0;i11<str.length;i11++)
  		 	{*/
  	 
  		//	 System.out.println(" "+str[i11]);
  	 int loop=0;
  	 if(loop==0) {
  		 
  		File file= new File("C:\\Users\\eden_einav\\eclipse-workspace\\CharityData_V1\\Excels\\Data_No200000.xls");
  		XSSFWorkbook wb = new XSSFWorkbook();
  		XSSFSheet sh = wb.createSheet("TestData");
  		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
  		Row row = sh.getRow(0);
  		Row newRow = sh.createRow(rowCount+1);
  		sh.createRow(0).createCell(0).setCellValue("Demo");
  		int cellA=0;
  			int cellB=0;
  			
  			int Coloumn1=0;
  			int Coloumn2=1;
  			int num=100001;
  			int lastNum=0;
  			
  			for(int i=100001;i<200000;i++) {
  			String formatted = String.format("%06d", num);
  			lastNum=0;
  			
  			for(int j=0;j<=9;j++)
  			{
  				System.out.println(formatted+"-"+lastNum);
  				
  			
  			
  			//System.out.println(formatted);
  			
  	  		 
  				String corpstring=formatted+"-"+lastNum;
  				System.out.println(corpstring);
  			 driver.findElement(By.name("corpNumber")).sendKeys(corpstring);
  			 driver.findElement(By.id("buttonNext")).click();
  			String resultsWere="0 results were found";
  			if (driver.findElements(By.xpath("(//div[@class='icBgQ padding3'])[2]")).size() != 0) {
					System.out.println("Element exist");
					resultsWere = driver.findElement(By.xpath("(//div[@class='icBgQ padding3'])[2]")).getText();

				} else {
					System.out.println("resultsWere doesn't exist");}
  			 //String resultsWere = driver.findElement(By.xpath("(//div[@class='icBgQ padding3'])[2]")).getText();  	
  			 int index = 0;
  			 int ch = getCharFromString(resultsWere, index);
  			 System.out.println("Character from " + resultsWere
  			 + " at index " + index
             + " is " + ch);
  			 int f=1;
  			 int s=ch-48;
  			 if(s==0)
  			 	{
  				 driver.findElement(By.linkText("Start New Search")).click();
  			 	}
  			 else
  			 	{
  				 int i111=1;
  				
  				 String[] corporationNumber = new String[ch];  	  
  				
					//sh.createRow(i2).createCell(0).setCellValue(" ");
  				 while(i111<=s)
  				 	{
  					 
  					/* corporationNumber[f] = driver.findElement(By.xpath("//div[@id='tables']/section[1]/section[1]/ol[1]/li["+i+"]/div[1]/div[2]/span[3]")).getText();
  					 String sub = corporationNumber[f].substring(20, 30);
					String mysz2 = sub.replaceAll("\\s","");
  					 */
  					 driver.findElement(By.xpath("(//div[@class='col-md-11']//a)["+i111+"]")).click();
  						  	
  					 String[] Div = new String[100]; 
  					 String[] Col = new String[100];
  					String registeredOfficeAddress="Blank";
  					String shawneeWay="Blank";
  					String directorsMinimumMaximum="Blank";
  					String annualFilings="Blank";
  					String anniversaryDateMMDD="Blank";
  					String corporateHistory="Blank";
  					String corporateNameHistory="Blank";
  					
  					 
  					if (driver.findElements(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[6]/h3[1]")).size() != 0) {
  						System.out.println("Element exist");
  	   					registeredOfficeAddress = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[6]/h3[1]")).getText();

  					} else {
  						System.out.println("registeredOfficeAddress doesn't exist");
  					}
   					//registeredOfficeAddress = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[6]/h3[1]")).getText();
  					
  					if (driver.findElements(By.xpath("//div[@class='well']//div[1]")).size() != 0) {
  						System.out.println("Element exist");
  						shawneeWay = driver.findElement(By.xpath("//div[@class='well']//div[1]")).getText();
  					} else {
  						System.out.println("shawneeWay doesn't exist");
  					}
  					 //shawneeWay = driver.findElement(By.xpath("//div[@class='well']//div[1]")).getText();
  					
  					if (driver.findElements(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[8]")).size() != 0) {
  						System.out.println("Element exist");
  	  					 directorsMinimumMaximum = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[8]")).getText();
  					} else {
  						System.out.println("directorsMinimumMaximum doesn't exist");
  					}
  					 
  					if (driver.findElements(By.xpath("//h3[text()='Annual Filings']")).size() != 0) {
  						System.out.println("Element exist");
  	  					 annualFilings = driver.findElement(By.xpath("//h3[text()='Annual Filings']")).getText();
  					} else {
  						System.out.println("annualFilings doesn't exist");
  					}
  					 //annualFilings = driver.findElement(By.xpath("//h3[text()='Annual Filings']")).getText();
  					
  					if (driver.findElements(By.xpath("//div[@class='well mrgn-bttm-sm']")).size() != 0) {
  						System.out.println("Element exist");
  	  					 anniversaryDateMMDD = driver.findElement(By.xpath("//div[@class='well mrgn-bttm-sm']")).getText();
  					} else {
  						System.out.println("anniversaryDateMMDD doesn't exist");
  					}
  					
  					if (driver.findElements(By.xpath("//h3[text()='Corporate History']")).size() != 0) {
  						System.out.println("Element exist");
  						corporateHistory = driver.findElement(By.xpath("//h3[text()='Corporate History']")).getText();
  					} else {
  						System.out.println("corporateHistory doesn't exist");
  					}
  					//corporateHistory = driver.findElement(By.xpath("//h3[text()='Corporate History']")).getText();
  					
  					if (driver.findElements(By.xpath("//h3[text()='Corporate History']")).size() != 0) {
  						System.out.println("Element exist");
  						corporateHistory = driver.findElement(By.xpath("//h3[text()='Corporate History']")).getText();
  					} else {
  						System.out.println("corporateHistory doesn't exist");
  					}
  					
  					if (driver.findElements(By.tagName("table")).size() != 0) {
  						System.out.println("Element exist");
  						corporateNameHistory = driver.findElement(By.tagName("table")).getText();
  					} else {
  						System.out.println("corporateHistory doesn't exist");
  					}
  					
  					// corporateNameHistory = driver.findElement(By.tagName("table")).getText();
  					
  					 int i2=0;
  					 
  					 if(Coloumn1==0 && Coloumn2==1)
  					 {
  					for(;i2<5;i2++)
  						{
  						Div[i2] = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[4]/div["+(i2+1)+"]/div[1]/b[1]")).getText();
  						System.out.println(Div[i2]);
  						sh.createRow(cellA++).createCell(Coloumn1).setCellValue(Div[i2]);
  						Col[i2] = driver.findElement(By.xpath("(//div[@class='col-sm-8'])["+(i2+1)+"]")).getText();
	  					System.out.println(Col[i2]);
	  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(Col[i2]);
  						}
  					
  						
  					System.out.println(registeredOfficeAddress);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(registeredOfficeAddress);
  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(shawneeWay);
  					/*sh.createRow(cellA++).createCell(Coloumn1).setCellValue(directors);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(minimum);
  					cellB++;
  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(minimum_count);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(maximum);
  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(maximum_count);*/
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(directorsMinimumMaximum);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(annualFilings);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(anniversaryDateMMDD);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(corporateHistory);
  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(corporateNameHistory);
  					
  					 }
  					 else
  					 {
  						for(;i2<5;i2++)
  						{
  						Div[i2] = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[4]/div["+(i2+1)+"]/div[1]/b[1]")).getText();
  						System.out.println(Div[i2]);
  						sh.getRow(cellA++).createCell(Coloumn1).setCellValue(Div[i2]);
  						Col[i2] = driver.findElement(By.xpath("(//div[@class='col-sm-8'])["+(i2+1)+"]")).getText();
	  					System.out.println(Col[i2]);
	  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(Col[i2]);
  						}
  					
  						
  					System.out.println(registeredOfficeAddress);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(registeredOfficeAddress);
  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(shawneeWay);
  					/*sh.getRow(cellA++).createCell(Coloumn1).setCellValue(directors);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(minimum);
  					cellB++;
  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(minimum_count);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(maximum);
  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(maximum_count);	*/
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(directorsMinimumMaximum);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(annualFilings);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(anniversaryDateMMDD);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(corporateHistory);
  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(corporateNameHistory);
  					 }
  					
  					Coloumn1++;
  					Coloumn2++;
  					Coloumn1++;
  					Coloumn2++;
  					cellA=0;
  					cellB=0;
  						
  					try 
  						{
  						FileOutputStream fos = new FileOutputStream(file);
  	  					 wb.write(fos);
  						}
  					
  					catch(FileNotFoundException e)
  						{
  						e.printStackTrace();
  						}
  					
  					 driver.navigate().back();
  					 System.out.println(corporationNumber[f]);
  					 f++;
  					 i111++;  					 
  				 	 }
  				 	--f;
  				 if(f==s)
  				 	{
  					//driver.findElement(By.linkText("Start New Search")).click();
  					driver.get(url);
  				 	}
				
  				 }	
  			lastNum++;
  			}
  			log.debug("last coorporation number "+num);
  			num++;
  			 }
  	 }
  			loop++;
  			
  			if(loop==1)
  			{
  				File file= new File("C:\\Users\\eden_einav\\eclipse-workspace\\CharityData_V1\\Excels\\Data_No2000001.xls");
  		  		XSSFWorkbook wb = new XSSFWorkbook();
  		  		XSSFSheet sh = wb.createSheet("TestData");
  		  		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
  		  		Row row = sh.getRow(0);
  		  		Row newRow = sh.createRow(rowCount+1);
  		  		sh.createRow(0).createCell(0).setCellValue("Demo");
  		  		int cellA=0;
  		  			int cellB=0;
  		  			
  		  			int Coloumn1=0;
  		  			int Coloumn2=1;
  				int num=1000000;
  				for(int i=1000000;i<2000000;i++) {
  		  			String formatted = String.format("%07d", num);
  		  			int lastNum=0;
  		  			for(int j=0;j<=9;j++)
  		  			{
  		  				System.out.println(formatted+"-"+lastNum);
  		  				
  		  			
  		  			
  		  			//System.out.println(formatted);
  		  			
  		  	  		 
  		  				String corpstring=formatted+"-"+lastNum;
  		  				System.out.println(corpstring);
  		  			 driver.findElement(By.name("corpNumber")).sendKeys(corpstring);
  		  			 driver.findElement(By.id("buttonNext")).click();
  		  			 String resultsWere = driver.findElement(By.xpath("(//div[@class='icBgQ padding3'])[2]")).getText();  	
  		  			 int index = 0;
  		  			 int ch = getCharFromString(resultsWere, index);
  		  			 System.out.println("Character from " + resultsWere
  		  			 + " at index " + index
  		             + " is " + ch);
  		  			 int f=1;
  		  			 int s=ch-48;
  		  			 if(s==0)
  		  			 	{
  		  				 driver.findElement(By.linkText("Start New Search")).click();
  		  			 	}
  		  			 else
  		  			 	{
  		  				 int i111=1;
  		  				
  		  				 String[] corporationNumber = new String[ch];  	  
  		  				
  							//sh.createRow(i2).createCell(0).setCellValue(" ");
  		  				 while(i111<=s)
  		  				 	{
  		  					 
  		  					/* corporationNumber[f] = driver.findElement(By.xpath("//div[@id='tables']/section[1]/section[1]/ol[1]/li["+i+"]/div[1]/div[2]/span[3]")).getText();
  		  					 String sub = corporationNumber[f].substring(20, 30);
  							String mysz2 = sub.replaceAll("\\s","");
  		  					 */
  		  					 driver.findElement(By.xpath("(//div[@class='col-md-11']//a)["+i111+"]")).click();
  		  						  	
  		  					 String[] Div = new String[100]; 
  		  					 String[] Col = new String[100];
  		  					String registeredOfficeAddress="Blank";
  		  					String shawneeWay="Blank";
  		  					String directorsMinimumMaximum="Blank";
  		  					String annualFilings="Blank";
  		  					String anniversaryDateMMDD="Blank";
  		  					String corporateHistory="Blank";
  		  					String corporateNameHistory="Blank";
  		  					
  		  					 
  		  					if (driver.findElements(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[6]/h3[1]")).size() != 0) {
  		  						System.out.println("Element exist");
  		  	   					registeredOfficeAddress = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[6]/h3[1]")).getText();

  		  					} else {
  		  						System.out.println("registeredOfficeAddress doesn't exist");
  		  					}
  		   					//registeredOfficeAddress = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[6]/h3[1]")).getText();
  		  					
  		  					if (driver.findElements(By.xpath("//div[@class='well']//div[1]")).size() != 0) {
  		  						System.out.println("Element exist");
  		  						shawneeWay = driver.findElement(By.xpath("//div[@class='well']//div[1]")).getText();
  		  					} else {
  		  						System.out.println("shawneeWay doesn't exist");
  		  					}
  		  					 //shawneeWay = driver.findElement(By.xpath("//div[@class='well']//div[1]")).getText();
  		  					
  		  					if (driver.findElements(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[8]")).size() != 0) {
  		  						System.out.println("Element exist");
  		  	  					 directorsMinimumMaximum = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[8]")).getText();
  		  					} else {
  		  						System.out.println("directorsMinimumMaximum doesn't exist");
  		  					}
  		  					 
  		  					if (driver.findElements(By.xpath("//h3[text()='Annual Filings']")).size() != 0) {
  		  						System.out.println("Element exist");
  		  	  					 annualFilings = driver.findElement(By.xpath("//h3[text()='Annual Filings']")).getText();
  		  					} else {
  		  						System.out.println("annualFilings doesn't exist");
  		  					}
  		  					 //annualFilings = driver.findElement(By.xpath("//h3[text()='Annual Filings']")).getText();
  		  					
  		  					if (driver.findElements(By.xpath("//div[@class='well mrgn-bttm-sm']")).size() != 0) {
  		  						System.out.println("Element exist");
  		  	  					 anniversaryDateMMDD = driver.findElement(By.xpath("//div[@class='well mrgn-bttm-sm']")).getText();
  		  					} else {
  		  						System.out.println("anniversaryDateMMDD doesn't exist");
  		  					}
  		  					
  		  					if (driver.findElements(By.xpath("//h3[text()='Corporate History']")).size() != 0) {
  		  						System.out.println("Element exist");
  		  						corporateHistory = driver.findElement(By.xpath("//h3[text()='Corporate History']")).getText();
  		  					} else {
  		  						System.out.println("corporateHistory doesn't exist");
  		  					}
  		  					//corporateHistory = driver.findElement(By.xpath("//h3[text()='Corporate History']")).getText();
  		  					
  		  					if (driver.findElements(By.xpath("//h3[text()='Corporate History']")).size() != 0) {
  		  						System.out.println("Element exist");
  		  						corporateHistory = driver.findElement(By.xpath("//h3[text()='Corporate History']")).getText();
  		  					} else {
  		  						System.out.println("corporateHistory doesn't exist");
  		  					}
  		  					
  		  					if (driver.findElements(By.tagName("table")).size() != 0) {
  		  						System.out.println("Element exist");
  		  						corporateNameHistory = driver.findElement(By.tagName("table")).getText();
  		  					} else {
  		  						System.out.println("corporateHistory doesn't exist");
  		  					}
  		  					
  		  					// corporateNameHistory = driver.findElement(By.tagName("table")).getText();
  		  					
  		  					 int i2=0;
  		  					 
  		  					 if(Coloumn1==0 && Coloumn2==1)
  		  					 {
  		  					for(;i2<5;i2++)
  		  						{
  		  						Div[i2] = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[4]/div["+(i2+1)+"]/div[1]/b[1]")).getText();
  		  						System.out.println(Div[i2]);
  		  						sh.createRow(cellA++).createCell(Coloumn1).setCellValue(Div[i2]);
  		  						Col[i2] = driver.findElement(By.xpath("(//div[@class='col-sm-8'])["+(i2+1)+"]")).getText();
  			  					System.out.println(Col[i2]);
  			  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(Col[i2]);
  		  						}
  		  					
  		  						
  		  					System.out.println(registeredOfficeAddress);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(registeredOfficeAddress);
  		  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(shawneeWay);
  		  					/*sh.createRow(cellA++).createCell(Coloumn1).setCellValue(directors);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(minimum);
  		  					cellB++;
  		  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(minimum_count);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(maximum);
  		  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(maximum_count);*/
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(directorsMinimumMaximum);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(annualFilings);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(anniversaryDateMMDD);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(corporateHistory);
  		  					sh.createRow(cellA++).createCell(Coloumn1).setCellValue(corporateNameHistory);
  		  					
  		  					 }
  		  					 else
  		  					 {
  		  						for(;i2<5;i2++)
  		  						{
  		  						Div[i2] = driver.findElement(By.xpath("//div[@id='metrics']/div[1]/div[1]/div[1]/section[1]/div[4]/div["+(i2+1)+"]/div[1]/b[1]")).getText();
  		  						System.out.println(Div[i2]);
  		  						sh.getRow(cellA++).createCell(Coloumn1).setCellValue(Div[i2]);
  		  						Col[i2] = driver.findElement(By.xpath("(//div[@class='col-sm-8'])["+(i2+1)+"]")).getText();
  			  					System.out.println(Col[i2]);
  			  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(Col[i2]);
  		  						}
  		  					
  		  						
  		  					System.out.println(registeredOfficeAddress);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(registeredOfficeAddress);
  		  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(shawneeWay);
  		  					/*sh.getRow(cellA++).createCell(Coloumn1).setCellValue(directors);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(minimum);
  		  					cellB++;
  		  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(minimum_count);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(maximum);
  		  					sh.getRow(cellB++).createCell(Coloumn2).setCellValue(maximum_count);	*/
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(directorsMinimumMaximum);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(annualFilings);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(anniversaryDateMMDD);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(corporateHistory);
  		  					sh.getRow(cellA++).createCell(Coloumn1).setCellValue(corporateNameHistory);
  		  					 }
  		  					
  		  					Coloumn1++;
  		  					Coloumn2++;
  		  					Coloumn1++;
  		  					Coloumn2++;
  		  					cellA=0;
  		  					cellB=0;
  		  						
  		  					try 
  		  						{
  		  						FileOutputStream fos = new FileOutputStream(file);
  		  	  					 wb.write(fos);
  		  						}
  		  					
  		  					catch(FileNotFoundException e)
  		  						{
  		  						e.printStackTrace();
  		  						}
  		  					
  		  					 driver.navigate().back();
  		  					 System.out.println(corporationNumber[f]);
  		  					 f++;
  		  					 i111++;  					 
  		  				 	 }
  		  				 	--f;
  		  				 if(f==s)
  		  				 	{
  		  					//driver.findElement(By.linkText("Start New Search")).click();
  		  					driver.get(url);
  		  				 	}
  						
  		  				 }	
  		  			lastNum++;
  		  			}
  		  		log.debug("last coorporation number "+num);
  		  			num++;
  		  			 }
  			}
  		 	
  		 
  		 
  	 	
  	 

    }
  @BeforeMethod
  public void beforeMethod() {
  	  System.out.println("Starting the browser session");
  }
 
  @AfterMethod
  public void afterMethod() {
  	  System.out.println("Closing the browser session");
  	 // driver.quit();
  }
}