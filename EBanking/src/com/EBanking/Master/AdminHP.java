package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{
	//Element Properties
		@FindBy(xpath="//table[@id='Table_01']//td[1]//a[1]//img[1]")
		WebElement BraBut;
		@FindBy(xpath="/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/a[1]/img[1]")
		WebElement RolBut;
		@FindBy(xpath="//tr[8]//td[1]//a[1]//img[1]")
		WebElement EmpBut;
		@FindBy(xpath="//td//td//td//td[3]//a[1]//img[1]")
		WebElement Logout;
		@FindBy(xpath="/html[1]/body[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[3]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/img[1]")
		WebElement AHomeBut;
	//Element Methods
		public void Branch()
		{
			BraBut.click();
		}
		public void Role()
		{
			RolBut.click();
		}
		public void Employee()
		{
			EmpBut.click();
		}
		public void Logout()
		{
			Logout.click();
		}
		public void Home()
		{
			AHomeBut.click();
		}
}
