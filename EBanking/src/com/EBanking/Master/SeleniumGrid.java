package com.EBanking.Master;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid
{
DesiredCapabilities cap=null;
 @Parameters("Browser")
 @Test
public void GD(String Br) throws MalformedURLException
{
	if(Br.equalsIgnoreCase("firefox"))
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");	
		cap.setPlatform(Platform.WINDOWS);
	}
	else if(Br.equalsIgnoreCase("chrome"))
	{
	cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	}
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.102:4444/wd/hub"),cap);
	driver.manage().window().maximize();
	driver.get("http://183.82.100.55/ranford2/");
	RanfordHP RHP=PageFactory.initElements(driver, RanfordHP.class);
	RHP.Login();
	AdminHP AHP=PageFactory.initElements(driver, AdminHP.class);
	AHP.Branch();
}
}
