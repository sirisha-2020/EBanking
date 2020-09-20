package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewEmployeePageArg 
{
//Element Properties
	@FindBy(xpath="//input[@id='txtUname']")
	WebElement EmpName;
	@FindBy(xpath="//input[@id='txtLpwd']")
	WebElement EmpPwd;
	@FindBy(xpath="//select[@id='lst_Roles']")
	WebElement EmpRol;
	@FindBy(xpath="//select[@id='lst_Branch']")
	WebElement EmpBra;
	@FindBy(xpath="//input[@id='BtnSubmit']")
	WebElement EmpSub;
//Element Methods
	public String EmployeeDetails(String Ename,String EPwd,String ERol,String EBra)
	{
		EmpName.sendKeys(Ename);
		EmpPwd.sendKeys(EPwd);
		Select ER=new Select(EmpRol);
		ER.selectByVisibleText(ERol);
		Select EB=new Select(EmpBra);
		EB.selectByVisibleText(EBra);
		EmpSub.click();
		return null;
	}
}
