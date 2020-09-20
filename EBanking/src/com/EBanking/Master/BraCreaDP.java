package com.EBanking.Master;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class BraCreaDP extends Base
{
  @Test(dataProvider = "BraData")
  public void Bra(String BName,String Add1,String Add2,String Add3,String Area,String Zip,String Ctry,String Sta,String City) throws InterruptedException 
  {
	  Li.BranchCreation(BName, Add1, Add2, Add3, Area, Zip, Ctry, Sta, City);
  }

  @DataProvider
  public Object[][] BraData() 
  {
	  Object[][] obj=new Object[3][9];
	  obj[0][0]="NZMPTSBI1";
	  obj[0][1]="NZMPT";
	  obj[0][2]="Secunderabad";
	  obj[0][3]="Santoshpur";
	  obj[0][4]="SRNagar";
	  obj[0][5]="50090";
	  obj[0][6]="INDIA";
	  obj[0][7]="GOA";
	  obj[0][8]="GOA";
	  obj[1][0]="NZMPTBOI1";
	  obj[1][1]="NZMPT";
	  obj[1][2]="Secunderabad";
	  obj[1][3]="Santoshpur";
	  obj[1][4]="SRNagar";
	  obj[1][5]="50090";
	  obj[1][6]="INDIA";
	  obj[1][7]="GOA";
	  obj[1][8]="GOA";
	  obj[2][0]="NZMPTBOB1";
	  obj[2][1]="NZMPT";
	  obj[2][2]="Secunderabad";
	  obj[2][3]="Santoshpur";
	  obj[2][4]="SRNagar";
	  obj[2][5]="50090";
	  obj[2][6]="INDIA";
	  obj[2][7]="GOA";
	  obj[2][8]="GOA";
	return obj;
  };
}