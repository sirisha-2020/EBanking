package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewEmployeePage 
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
		public void EmployeeDetails()
		{
			EmpName.sendKeys("Taruni");
			EmpPwd.sendKeys("Swapna");
			Select ER=new Select(EmpRol);
			ER.selectByVisibleText("TellerSep");
			Select EB=new Select(EmpBra);
			EB.selectByVisibleText("Lalakpet");
			EmpSub.click();
		}
}
