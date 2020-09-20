package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewRolePageArg 
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
	public String RoleDetails(String RName,String RDesc,String RType)
	{
		RolName.sendKeys(RName);
		RolDesc.sendKeys(RDesc);
		Select Type=new Select(RolType);
		Type.selectByVisibleText(RType);
		RolSub.click();
		return null;
	}
}
