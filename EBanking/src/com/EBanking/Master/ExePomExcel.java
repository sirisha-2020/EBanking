package com.EBanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExePomExcel 
{
	WebDriver driver;
	AdminHP AHP;
	BranchHP BHP;
	NewBranchPageArg NBP;
	RoleHP RoHP;
	NewRolePageArg NRP;
	EmployeeHP EHP;
	NewEmployeePageArg NEP;
	@BeforeTest
	public void Launch()
	{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://183.82.100.55/ranford2");
	}
	@Test(priority=1)
	public void Login()
	{
	RanfordHPArg RHP=PageFactory.initElements(driver, RanfordHPArg.class);
	RHP.Login("Admin","M1ndq");
	}
	@Test(priority=2)
	public void AdminB() throws IOException, InterruptedException
	{
	AHP=PageFactory.initElements(driver, AdminHP.class);
	//To Execute the Branch Functionalities
	AHP.Branch();	//Click on Branch Button
    //To Get Test Data From Excel File
	FileInputStream FIS=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\EBanking.xlsx");
	XSSFWorkbook WB=new XSSFWorkbook(FIS);
	//Branch
	XSSFSheet WS=WB.getSheet("BData");
	int RC=WS.getLastRowNum();
	System.out.println(RC);
	for(int i=1;i<=RC;i++)
	{
		BHP=PageFactory.initElements(driver, BranchHP.class);
		BHP.NewBranch();    //Click on New Branch Button
		NBP=PageFactory.initElements(driver, NewBranchPageArg.class);
		XSSFRow WR=WS.getRow(i);
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.getCell(3);
		XSSFCell WC4=WR.getCell(4);
		XSSFCell WC5=WR.getCell(5);
		XSSFCell WC6=WR.getCell(6);
		XSSFCell WC7=WR.getCell(7);
		XSSFCell WC8=WR.getCell(8);
		XSSFCell WC9=WR.createCell(9);
		String BName=WC.getStringCellValue();
		String Add1=WC1.getStringCellValue();
		String Add2=WC2.getStringCellValue();
		String Add3=WC3.getStringCellValue();
		String Area=WC4.getStringCellValue();
		String Zip=WC5.getStringCellValue();
		String Ctry=WC6.getStringCellValue();
		String Sta=WC7.getStringCellValue();
		String City=WC8.getStringCellValue();
		String Result=NBP.BranchDetails(BName,Add1,Add2,Add3,Area,Zip,Ctry,Sta,City);   //Click on Submit Button after the details
		driver.switchTo().alert().accept();
		WC9.setCellValue(Result);
	}
	FileOutputStream FOS=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Bra_Result.xlsx");
	WB.write(FOS);
	WB.close();
	}
	@Test(priority=3)
	public void AdminR() throws IOException
	{
	AHP.Home();
	//To Execute the Role Functionalities
	AHP.Role(); 	//Click on Role Button
	//Role 
	FileInputStream FIS1=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\EBanking.xlsx");
	XSSFWorkbook WB1=new XSSFWorkbook(FIS1);
	XSSFSheet WS1=WB1.getSheet("RData");
	int RC1=WS1.getLastRowNum();
	System.out.println(RC1);
	for(int i=1;i<=RC1;i++)
	{
		RoHP=PageFactory.initElements(driver, RoleHP.class);
		RoHP.NewRole();    //Click on New Role Button
		NRP=PageFactory.initElements(driver, NewRolePageArg.class);
		XSSFRow WR=WS1.getRow(i);
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.createCell(3);
		String RName=WC.getStringCellValue();
		String RDesc=WC1.getStringCellValue();
		String RType=WC2.getStringCellValue();
		String Result=NRP.RoleDetails(RName,RDesc,RType);   //Click on Submit Button after the details 
	    driver.switchTo().alert().accept();
		WC3.setCellValue(Result);
	}
	FileOutputStream FOS1=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Rol_Result.xlsx");
	WB1.write(FOS1);
	WB1.close();
	}
	@Test(priority=4)
	public void AdminE() throws IOException
	{
    AHP.Home();
    //To Execute the Employee Functionalities
  	AHP.Employee(); 	//Click on Employee Button
  	//Employee
  	FileInputStream FIS2=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\EBanking.xlsx");
  	XSSFWorkbook WB2=new XSSFWorkbook(FIS2);
  	XSSFSheet WS2=WB2.getSheet("EData");
  	int RC2=WS2.getLastRowNum();
  	System.out.println(RC2);
  	for(int i=1;i<=RC2;i++)
  	{
  		EHP=PageFactory.initElements(driver, EmployeeHP.class);
  	  	EHP.NewEmployee();    //Click on New Employee Button
  	  	NEP=PageFactory.initElements(driver, NewEmployeePageArg.class);
  		XSSFRow WR=WS2.getRow(i);
  		XSSFCell WC=WR.getCell(0);
  		XSSFCell WC1=WR.getCell(1);
  		XSSFCell WC2=WR.getCell(2);
  		XSSFCell WC3=WR.getCell(3);
  		XSSFCell WC4=WR.createCell(4);
  		String EName=WC.getStringCellValue();
  		String EPwd=WC1.getStringCellValue();
  		String ERol=WC2.getStringCellValue();
  		String EBra=WC3.getStringCellValue();
  		String Result=	NEP.EmployeeDetails(EName,EPwd,ERol,EBra);   //Click on Submit Button after the details 
  	    driver.switchTo().alert().accept();
  		WC4.setCellValue(Result);
  	}
  	FileOutputStream FOS2=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Emp_Result.xlsx");
  	WB2.write(FOS2);
  	WB2.close();
   	}
	@AfterTest
	public void Close()
	{
	AHP.Logout();
	driver.close();
	}
}



