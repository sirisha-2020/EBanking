package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewBranchPage
{
	//Element Properties
		@FindBy(xpath="//input[@id='txtbName']")
		WebElement BraName;
		@FindBy(xpath="//input[@id='txtAdd1']")
		WebElement BraAdd1;
		@FindBy(xpath="//input[@id='Txtadd2']")
		WebElement BraAdd2;
		@FindBy(xpath="//input[@id='txtadd3']")
		WebElement BraAdd3;
		@FindBy(xpath="//input[@id='txtArea']")
		WebElement BraArea;
		@FindBy(xpath="//input[@id='txtZip']")
		WebElement BraZip;
		@FindBy(xpath="//select[@id='lst_counrtyU']")
		WebElement BraCntry;
		@FindBy(xpath="//select[@id='lst_stateI']")
		WebElement	BraState;
		@FindBy(xpath="//select[@id='lst_cityI']")
		WebElement BraCity;		
		@FindBy(xpath="//input[@id='btn_insert']")
		WebElement BraSub;
	//Element Methods
		public void BranchDetails()
		{
			BraName.sendKeys("Lalakpet");
			BraAdd1.sendKeys("Secunderabad");
			BraAdd2.sendKeys("Nizampet");
			BraAdd3.sendKeys("SRNagar");
			BraArea.sendKeys("Bharath Nagar");
			BraZip.sendKeys("50090");
			Select Cntry=new Select(BraCntry);
			Cntry.selectByVisibleText("INDIA");
			Select State=new Select(BraState);
			State.selectByVisibleText("GOA");
			Select City=new Select(BraCity);
			City.selectByVisibleText("GOA");
			BraSub.click();
		}
}
