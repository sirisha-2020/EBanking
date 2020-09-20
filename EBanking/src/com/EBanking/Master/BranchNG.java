package com.EBanking.Master;

import org.testng.annotations.Test;

public class BranchNG extends Base
{
  @Test
  public void BraCrea() throws InterruptedException 
  {
	  Li.BranchCreation("Lalapur","Nzmpt","SantoshNagar","Hyderabad","SRNagar","50090","INDIA","GOA","GOA");
  }
}
