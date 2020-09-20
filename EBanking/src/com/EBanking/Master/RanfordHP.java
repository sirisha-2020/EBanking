package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP
{
	//Element Properties
		@FindBy(id="txtuId")
		WebElement UName;
		@FindBy(id="txtPword")
		WebElement UPwd;
		@FindBy(id="login")
		WebElement Login;
	//Element Methods
		public void Login()
		{
			UName.sendKeys("Admin");
			UPwd.sendKeys("M1ndq");
			Login.click();
		}
}
