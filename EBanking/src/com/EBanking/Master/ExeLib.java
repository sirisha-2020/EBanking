package com.EBanking.Master;
import java.io.IOException;
public class ExeLib
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Library Li=new Library();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SriramBabuRao\\Desktop\\Live Project\\Jenkins\\chromedriver.exe");
		String Rval=Li.OpenApp("http://183.82.100.55/ranford2/");
		System.out.println(Rval);
		Li.AdminLogin("Admin","M1ndq");
		String BVal=Li.BranchCreation("Ananthapuram","Sriram Nager","Sanivararapupet","Bank Colony","Nizampet","50090","INDIA","GOA","GOA");
		System.out.println(BVal);
		String RVal=Li.RoleCreation("TestApp","Testing Application","E");
		System.out.println(RVal);
		Li.EmployeeCreation("Swapna32","1234567","Tester","Amberpet");
		Li.Logout();
		Li.CloseApp();
	}
}

