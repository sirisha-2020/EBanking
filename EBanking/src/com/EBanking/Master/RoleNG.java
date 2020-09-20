package com.EBanking.Master;

import org.testng.annotations.Test;

public class RoleNG extends Base
{
  @Test
  public void RoleCre() throws InterruptedException
  {
	  Li.RoleCreation("HydTeller","CashTeller","E");
  }
}
