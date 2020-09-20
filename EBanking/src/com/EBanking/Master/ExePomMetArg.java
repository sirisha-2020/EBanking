package com.EBanking.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExePomMetArg 
{
	WebDriver driver;
	AdminHP AHP;
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
	public void AdminB()
	{
	AHP=PageFactory.initElements(driver, AdminHP.class);
	//To Execute the Branch Functionalities
	AHP.Branch();	//Click on Branch Button
	BranchHP BHP=PageFactory.initElements(driver, BranchHP.class);
	BHP.NewBranch();    //Click on New Branch Button
	NewBranchPageArg NBP=PageFactory.initElements(driver, NewBranchPageArg.class);
	NBP.BranchDetails("Lalakpet","Secunderabad","Nizampet","SRNagar","Bharath Nagar","50090","INDIA","GOA","GOA");   //Click on Submit Button after the details 
    driver.switchTo().alert().accept();
    
	}
	@Test(priority=3)
	public void AdminR()
	{
	AHP.Home();
	//To Execute the Role Functionalities
	AHP.Role(); 	//Click on Role Button
	RoleHP RoHP=PageFactory.initElements(driver, RoleHP.class);
	RoHP.NewRole();    //Click on New Role Button
	NewRolePageArg NRP=PageFactory.initElements(driver, NewRolePageArg.class);
	NRP.RoleDetails("TellerSep","CashCounter","E");   //Click on Submit Button after the details 
    driver.switchTo().alert().accept();
	}
	@Test(priority=4)
	public void AdminE()
	{
    AHP.Home();
    //To Execute the Employee Functionalities
  	AHP.Employee(); 	//Click on Employee Button
  	EmployeeHP EHP=PageFactory.initElements(driver, EmployeeHP.class);
  	EHP.NewEmployee();    //Click on New Employee Button
  	NewEmployeePageArg NEP=PageFactory.initElements(driver, NewEmployeePageArg.class);
  	NEP.EmployeeDetails("Taruni","Swapna","TellerSep","Lalakpet");   //Click on Submit Button after the details 
    driver.switchTo().alert().accept();
	}
	@AfterTest
	public void Close()
	{
	AHP.Logout();
	driver.close();
	}
}

