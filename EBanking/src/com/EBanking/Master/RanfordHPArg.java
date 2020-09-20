package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHPArg 
{
	//Element Properties
	@FindBy(id="txtuId")
	WebElement UName;
	@FindBy(id="txtPword")
	WebElement UPwd;
	@FindBy(id="login")
	WebElement Login;
//Element Methods
	public void Login(String UN,String Pwd)
	{
		UName.sendKeys(UN);
		UPwd.sendKeys(Pwd);
		Login.click();
	}
}
