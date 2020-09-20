package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RoleHP 
{
	//Element Properties
		@FindBy(xpath="//input[@id='btnRoles']")
		WebElement NewRolBu;
	//Element Methods
		public void NewRole()
		{
			NewRolBu.click();
		}
}
