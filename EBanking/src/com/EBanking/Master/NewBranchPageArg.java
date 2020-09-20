package com.EBanking.Master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewBranchPageArg 
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
		public String BranchDetails(String BName,String BAdd1,String BAdd2,String BAdd3,String Area,String Zip,String Ctry,String State,String City)
		{
			BraName.sendKeys(BName);
			BraAdd1.sendKeys(BAdd1);
			BraAdd2.sendKeys(BAdd2);
			BraAdd3.sendKeys(BAdd3);
			BraArea.sendKeys(Area);
			BraZip.sendKeys(Zip);
			Select Cntry=new Select(BraCntry);
			Cntry.selectByVisibleText(Ctry);
			Select Stat=new Select(BraState);
			Stat.selectByVisibleText(State);
			Select Cit=new Select(BraCity);
			Cit.selectByVisibleText(City);
			BraSub.click();
			return null ;
		}
}

