package com.EBanking.Master;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class RoleCreDP extends Base
{
  @Test(dataProvider = "RoleData")
  public void Role(String RName,String RDesc,String RType) throws InterruptedException
  {
	  Li.RoleCreation(RName, RDesc, RType);
  }
    @DataProvider
  public Object[][] RoleData() 
  {
    Object[][] obj=new Object[3][3];
    obj[0][0]="TesterHyde";
    obj[0][1]="Testing";
    obj[0][2]="E";
    obj[1][0]="TesterSecd";
    obj[1][1]="TestSec";
    obj[1][2]="E";
    obj[2][0]="TesterNZMT";
    obj[2][1]="TestNZMPT";
    obj[2][2]="E";
    return obj;
   };
  }

