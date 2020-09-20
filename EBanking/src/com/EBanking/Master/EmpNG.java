package com.EBanking.Master;

import org.testng.annotations.Test;

public class EmpNG extends Base
{
  @Test
  public void EmpCre() throws InterruptedException 
  {
	  Li.EmployeeCreation("Madhurima","Santoshi","HydTeller","Lalapur");
  }
}
