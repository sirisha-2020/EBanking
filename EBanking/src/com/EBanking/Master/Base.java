package com.EBanking.Master;


import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeSuite;


import java.io.IOException;


import org.testng.annotations.AfterSuite;


public class Base
 
{
	
Library Li=new Library();
   
@BeforeTest
  public void beforeTest()
 
 {
	  
 Li.AdminLogin("Admin", "M1ndq");
 
 }

 
 @AfterTest
  
public void afterTest() 
  
{
	 
 Li.Logout();
  
}

  
@BeforeSuite
 
 public void beforeSuite() throws IOException
  
{

	  Li.OpenApp("http://183.82.100.55/ranford2/");
 
 }

 
 @AfterSuite
  
public void afterSuite()
 
 {
	
Li.CloseApp();  
  
}


}
