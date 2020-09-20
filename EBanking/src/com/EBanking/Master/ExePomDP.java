package com.EBanking.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExePomDP 
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
	@Test(priority=2,dataProvider = "BraData")
	public void AdminB(String BName,String Add1,String Add2,String Add3,String Area,String Zip,String Ctry,String Sta,String City) throws InterruptedException
	{
	AHP=PageFactory.initElements(driver, AdminHP.class);
	//To Execute the Branch Functionalities
	AHP.Branch();	//Click on Branch Button
	BHP=PageFactory.initElements(driver, BranchHP.class);
	BHP.NewBranch();    //Click on New Branch Button
	NBP=PageFactory.initElements(driver, NewBranchPageArg.class);
	NBP.BranchDetails(BName,Add1,Add2,Add3,Area,Zip,Ctry,Sta,City);   //Click on Submit Button after the details 
    driver.switchTo().alert().accept();
    AHP.Home();
    }
	@Test(priority=3,dataProvider="RoleData")
	public void AdminR(String RName,String RDesc,String RType)
	{
	//To Execute the Role Functionalities
	AHP.Role(); 	//Click on Role Button
	RoleHP RoHP=PageFactory.initElements(driver, RoleHP.class);
	RoHP.NewRole();    //Click on New Role Button
	NewRolePageArg NRP=PageFactory.initElements(driver, NewRolePageArg.class);
	NRP.RoleDetails(RName,RDesc,RType);   //Click on Submit Button after the details 
    driver.switchTo().alert().accept();
    AHP.Home();
	}
	@Test(priority=4,dataProvider = "EmpData")
	public void AdminE(String EName,String EPwd,String ERol,String EBra)
	{
    //To Execute the Employee Functionalities
  	AHP.Employee(); 	//Click on Employee Button
  	EmployeeHP EHP=PageFactory.initElements(driver, EmployeeHP.class);
  	EHP.NewEmployee();    //Click on New Employee Button
  	NewEmployeePageArg NEP=PageFactory.initElements(driver, NewEmployeePageArg.class);
  	NEP.EmployeeDetails(EName,EPwd,ERol,EBra);   //Click on Submit Button after the details 
    driver.switchTo().alert().accept();
    AHP.Home();
	}
	@AfterTest
	public void Close()
	{
	AHP.Logout();
	driver.close();
	}
@DataProvider
public Object[][] BraData() 
{
	  Object[][] obj=new Object[3][9];
	  obj[0][0]="NZMPTSBI1";
	  obj[0][1]="NZMPT";
	  obj[0][2]="Secunderabad";
	  obj[0][3]="Santoshpur";
	  obj[0][4]="SRNagar";
	  obj[0][5]="50090";
	  obj[0][6]="INDIA";
	  obj[0][7]="GOA";
	  obj[0][8]="GOA";
	  obj[1][0]="NZMPTBOI1";
	  obj[1][1]="NZMPT";
	  obj[1][2]="Secunderabad";
	  obj[1][3]="Santoshpur";
	  obj[1][4]="SRNagar";
	  obj[1][5]="50090";
	  obj[1][6]="INDIA";
	  obj[1][7]="GOA";
	  obj[1][8]="GOA";
	  obj[2][0]="NZMPTBOB1";
	  obj[2][1]="NZMPT";
	  obj[2][2]="Secunderabad";
	  obj[2][3]="Santoshpur";
	  obj[2][4]="SRNagar";
	  obj[2][5]="50090";
	  obj[2][6]="INDIA";
	  obj[2][7]="GOA";
	  obj[2][8]="GOA";
	return obj;
}
@DataProvider
public Object[][] RoleData() 
{
  Object[][] obj=new Object[3][3];
  obj[0][0]="TesterHyde";
  obj[0][1]="Testing";
  obj[0][2]="E";
  obj[1][0]="TesterSecd";
  obj[1][1]="TestSec";
  obj[1][2]="E";
  obj[2][0]="TesterNZMT";
  obj[2][1]="TestNZMPT";
  obj[2][2]="E";
  return obj;
 }
@DataProvider
public Object[][] EmpData() 
{
  Object[][] obj=new Object[3][4];
  obj[0][0]="Swathvika1";
  obj[0][1]="santhi";
  obj[0][2]="TesterHyde";
  obj[0][3]="NZMPTBOB1";
  obj[1][0]="Sripriya1";
  obj[1][1]="swathi";
  obj[1][2]="TesterSecd";
  obj[1][3]="NZMPTBOI1";
  obj[2][0]="Srimukhi1";
  obj[2][1]="swallow";
  obj[2][2]="TesterNZMPT";
  obj[2][3]="NZMPTSBI1";
  return obj;
}
}
