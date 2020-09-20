package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeHP 
{
	//Element Properties
		@FindBy(xpath="//input[@id='BtnNew']")
		WebElement NewEmpBu;
	//Element Methods
		public void NewEmployee()
		{
			NewEmpBu.click();
		}
}
