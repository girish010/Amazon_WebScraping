package Amazon;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Miku 
{
	
	@Test
	public  void Miku_Smart(String urls) throws IOException, InterruptedException
	{
		
	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com/Nanit-Complete-Monitor-System-Breathing/dp/B07P98D67X");
		driver.get(urls);
		driver.navigate().refresh();
		//D.navigate().refresh();
		FileInputStream fsIP= new FileInputStream(new File("./WebScraping/AmzonExcel.xlsx")); //Read the spreadsheet that needs to be updated
        
        XSSFWorkbook wb = new XSSFWorkbook(fsIP); //Access the workbook
		//CreationHelper createHelper = wb.();	
        
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Amzon");
		
		
		Thread.sleep(2000);
		
		String Product_Name=driver.findElement(By.id("productTitle")).getText();
		Thread.sleep(2000);
		String  Price;
		try 
		{
		  Price=driver.findElement(By.id("priceblock_ourprice")).getText();
		Thread.sleep(2000);
		}
		catch(Exception E)
		{
			try {
				Price=driver.findElement(By.id("priceblock_dealprice")).getText();
				}
			catch(Exception Ea)
			{
				Price="Not Provided";
			}
			
		}
		String List_Price;
		try
		{
			List_Price=driver.findElement(By.xpath("//*[@id=\"acrCustomerReviewText\"]")).getText();
		Thread.sleep(2000);
		}
		catch(Exception E)
		{
			List_Price="Not Provided";
		}
		String You_save;
		try 
		{
		You_save=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[6]/div[5]/div[3]/div[9]/div/div/table/tbody/tr[3]/td[2]")).getText();
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			You_save="Not Applicable";
		}
		String Product_Variant;
		try {
		Product_Variant=driver.findElement(By.xpath("")).getText();
		//Thread.sleep(2000);
		}
		catch (Exception e)
		{
			Product_Variant="Not driverescribed";
		}
		String Amazons_Choice;
		try 
		{
		Amazons_Choice=driver.findElement(By.xpath("//*[@id=\"acBadge_feature_div\"]/div/span[1]")).getText();
		}
		catch (Exception e)
		{
			Amazons_Choice= "Not Applicable";
		}
		
		String Seller_Name;
		try
		{
			try {
				Seller_Name=driver.findElement(By.xpath("//*[@id=\"comparison_sold_by_row\"]/td[1]/span")).getText();
				Thread.sleep(2000);
			}
			catch (Exception E)
			{
				Seller_Name=driver.findElement(By.xpath("//*[@id=\'comparison_sold_by_row\']/td[1]/a")).getText();
				
			}	
		}
		catch (Exception E)
		{
			try
			{
			Seller_Name=driver.findElement(By.xpath("//*[@id=\'bylineInfo\']")).getText();
			}
			catch(Exception E1)
			{
				Seller_Name="Not Applicable";
			}
		}
		
		String Configration;
		try 
		{
			try {
			Configration=driver.findElement(By.xpath("//*[@id=\"prodDetails\"]/div/div[1]/div/div[2]")).getText();
			Thread.sleep(2000);
			}
			catch(Exception E)
			{
				Configration=driver.findElement(By.xpath("//*[@id=\'productDetails_detailBullets_sections1\']")).getText();
			}
		}
		catch(Exception E)
		{
			Configration= "Not Applicable";
		}
			
		String Accessorie;
		try {
		Accessorie=driver.findElement(By.xpath("")).getText();
		Thread.sleep(2000);
		}
		catch (Exception e){
		Accessorie="Not driverescribed";
		}
		String Total_rating=driver.findElement(By.xpath("//*[@id=\"reviewsMedley\"]/div/div[1]/div[2]/div[1]/div/div[2]/div/span/span/a/span")).getText();
		Thread.sleep(2000);
		String Total_Number_rating=driver.findElement(By.xpath("//*[@id=\"acrCustomerReviewText\"]")).getText();
		Thread.sleep(2000);
		String Five_star=driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[1]/td[3]/span[2]/a")).getText();
		Thread.sleep(2000);
		String Four_star=driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[2]/td[3]/span[2]/a")).getText();
		Thread.sleep(2000);
		String Three_star=driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[3]/td[3]/span[2]/a")).getText();
		Thread.sleep(2000);
		String Two_star=driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[4]/td[3]/span[2]/a")).getText();
		Thread.sleep(2000);
		String One_star=driver.findElement(By.xpath("//*[@id=\"histogramTable\"]/tbody/tr[5]/td[3]/span[2]/a")).getText();
		Thread.sleep(2000);	
		String Product_Description;
		try {
			Product_Description=driver.findElement(By.xpath("//*[@id=\'productDescription\']/p")).getText();
			Thread.sleep(2000);
		}
		catch(Exception E)
		{
			Product_Description=driver.findElement(By.xpath("//*[@id=\'aplus\']/div/div[1]/div")).getText();
		}
		
		String Amswered_Question=driver.findElement(By.xpath("//*[@id=\"askATFLink\"]/span")).getText();
		Thread.sleep(2000);
		
		
		
		
		//Sheet sheet=(Sheet) wb.getName("Amzon");
		 
		// Create the first Row
		

		//inserting first row cell value		
		
		CreationHelper createHelper = wb.getCreationHelper();
		
		Cell cell = null;
		Row row1 = sheet.createRow((short) 0);
		
	
			
		  row1.createCell(0).setCellValue(createHelper.
		  createRichTextString("Serial Number"));
		  row1.createCell(1).setCellValue(createHelper.
		  createRichTextString("Product Name"));
		  row1.createCell(2).setCellValue(createHelper.createRichTextString("Price"));
		  row1.createCell(3).setCellValue(createHelper.createRichTextString(
		  "List_Price"));
		  row1.createCell(4).setCellValue(createHelper.createRichTextString("You_save")
		  ); row1.createCell(5).setCellValue(createHelper.createRichTextString(
		  "Product_Variants"));
		  row1.createCell(6).setCellValue(createHelper.createRichTextString(
		  "Amazons_Choice"));
		  row1.createCell(7).setCellValue(createHelper.createRichTextString(
		  "Seller_Name"));
		  row1.createCell(8).setCellValue(createHelper.createRichTextString(
		  "Configration"));
		  row1.createCell(9).setCellValue(createHelper.createRichTextString(
		  "Accessories"));
		  row1.createCell(10).setCellValue(createHelper.createRichTextString(
		  "Total_rating"));
		  row1.createCell(11).setCellValue(createHelper.createRichTextString(
		  "Total_Number_rating"));
		  row1.createCell(12).setCellValue(createHelper.createRichTextString(
		  "Five_star"));
		  row1.createCell(13).setCellValue(createHelper.createRichTextString(
		  "Four_star"));
		  row1.createCell(14).setCellValue(createHelper.createRichTextString(
		  "Three_star"));
		  row1.createCell(15).setCellValue(createHelper.createRichTextString("Two_star"));
		  row1.createCell(16).setCellValue(createHelper.createRichTextString("One_star"));
		  row1.createCell(17).setCellValue(createHelper.createRichTextString(
		  "Product_Description"));
		  row1.createCell(18).setCellValue(createHelper.createRichTextString(
		  "Amswered_Questions"));
		 
	
		// creating second row		 
		Row row2 = sheet.createRow((short) 2);
		 
		// inserting first row cell value
		row2.createCell(0).setCellValue(001);
		row2.createCell(1).setCellValue(Product_Name);
		row2.createCell(2).setCellValue(Price);
		//row2.createCell(3).setCellValue(createHelper.createRichTextString(List_Price));
		row2.createCell(4).setCellValue(You_save);
		
		row2.createCell(5).setCellValue(Product_Variant);
		row2.createCell(6).setCellValue(Amazons_Choice);
		row2.createCell(7).setCellValue(Seller_Name);
		row2.createCell(8).setCellValue(Configration);
		
		row2.createCell(9).setCellValue(Accessorie);
		row2.createCell(10).setCellValue(Total_rating);
		
		row2.createCell(11).setCellValue(Total_Number_rating);
		row2.createCell(12).setCellValue(Five_star);
		row2.createCell(13).setCellValue(Four_star);
		row2.createCell(14).setCellValue(Three_star);
		
		row2.createCell(15).setCellValue(Two_star);
		row2.createCell(16).setCellValue(One_star);
		row2.createCell(17).setCellValue(Product_Description);
		row2.createCell(18).setCellValue(Amswered_Question);
		
		// Write the output to a file
		
		
		FileOutputStream fileOut = new FileOutputStream("./WebScraping/AmzonExcel.xlsx");
		wb.write(fileOut);
		fileOut.close();
		driver.close();
		
	}

}
