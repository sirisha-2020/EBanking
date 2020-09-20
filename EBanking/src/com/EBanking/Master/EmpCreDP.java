package com.EBanking.Master;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class EmpCreDP extends Base
{
  @Test(dataProvider = "EmpData")
  public void EmpCre(String EName,String EPwd,String ERol,String EBra) throws InterruptedException 
  {
	  Li.EmployeeCreation(EName, EPwd, ERol, EBra);
  }

  @DataProvider
  public Object[][] EmpData() 
  {
    Object[][] obj=new Object[3][4];
    obj[0][0]="Swathvika1";
    obj[0][1]="santhi";
    obj[0][2]="TesterHyde";
    obj[0][3]="NZMPTBOB1";
    obj[1][0]="Sripriya1";
    obj[1][1]="swathi";
    obj[1][2]="TesterSecd";
    obj[1][3]="NZMPTBOI1";
    obj[2][0]="Srimukhi1";
    obj[2][1]="swallow";
    obj[2][2]="TesterNZMPT";
    obj[2][3]="NZMPTSBI1";
    return obj;
  };
}

