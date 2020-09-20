package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchHP 
{
	//Element Properties
		@FindBy(xpath="//input[@id='BtnNewBR']")
		WebElement NewBraBu;
	//Element Methods
		public void NewBranch()
		{
			NewBraBu.click();
		}
}
