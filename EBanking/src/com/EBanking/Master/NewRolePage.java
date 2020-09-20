package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewRolePage
{
	//Element Properties
		@FindBy(xpath="//input[@id='txtRname']")
		WebElement RolName;
		@FindBy(xpath="//input[@id='txtRDesc']")
		WebElement RolDesc;
		@FindBy(xpath="//select[@id='lstRtypeN']")
		WebElement RolType;
		@FindBy(xpath="//input[@id='btninsert']")
		WebElement RolSub;
	//Element Methods
		public void RoleDetails()
		{
			RolName.sendKeys("TellerSep");
			RolDesc.sendKeys("CashCounter");
			Select Type=new Select(RolType);
			Type.selectByVisibleText("E");
			RolSub.click();
		}
}

