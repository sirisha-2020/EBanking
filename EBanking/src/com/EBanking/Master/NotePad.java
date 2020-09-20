package com.EBanking.Master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotePad
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		Library Li=new Library();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SriramBabuRao\\Desktop\\Live Project\\Jenkins\\geckodriver.exe");
		Li.OpenApp("http://183.82.100.55/ranford2/");
		Li.AdminLogin("Admin", "M1ndq");
		String SD;
		//To get Test Data File 
		FileReader FR=new FileReader("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\Branch.txt");
		BufferedReader BR=new BufferedReader(FR);
		String Sread=BR.readLine();
		System.out.println(Sread);
		//Write the Header into the Result File
		FileWriter FW=new FileWriter("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\BranchResult.txt");
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(Sread);
		BW.newLine();	
		while ((SD=BR.readLine())!=null)
		{
			String SR[]=SD.split("########");
			String BName=SR[0];
			String Add1=SR[1];
			String Add2=SR[2];
			String Add3=SR[3];
			String Area=SR[4];
			String Zip=SR[5];
			String Ctry=SR[6];
			String Sta=SR[7];
			String City=SR[8];
			String Result=Li.BranchCreation(BName, Add1, Add2, Add3, Area, Zip, Ctry, Sta, City);
			//Results
			BW.write(SD+"@@@@@"+Result);
			BW.newLine();
		}
		BW.close();
		BR.close();
		//To get Test Data File Path
		String Fpath="C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\Role.txt";
		//Result File Path
		String Rpath="C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\RoleResult.txt";
		String SD1;
		// To Get Test Data File
		FileReader FR1=new FileReader(Fpath);
		BufferedReader BR1=new BufferedReader(FR1);
		String Sread1=BR1.readLine();
		System.out.println(Sread1);
		//Write the Header into the Result File
		FileWriter FW1=new FileWriter(Rpath);
		BufferedWriter BW1=new BufferedWriter(FW1);
		BW1.write(Sread1);
		BW1.newLine();
		while ((SD1=BR1.readLine())!=null)
		{
			String SR1[]=SD1.split("########");
			String RName=SR1[0];
			String RDesc=SR1[1];
			String RType=SR1[2];
			String Result=Li.RoleCreation(RName, RDesc, RType);
			//Results
			BW1.write(SD1+"@@@@@"+Result);
			BW1.newLine();
		}
		BW1.close();
		BR1.close();
		String SD2;
		//To get Test Data File 
		FileReader FR2=new FileReader("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\Emp.txt");
		BufferedReader BR2=new BufferedReader(FR2);
		String Sread2=BR2.readLine();
		System.out.println(Sread2);
		//Write the Header into the Result File
		FileWriter FW2=new FileWriter("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\EmpResult.txt");
		BufferedWriter BW2=new BufferedWriter(FW2);
		BW2.write(Sread2);
		BW2.newLine();	
		while ((SD2=BR2.readLine())!=null)
		{
			String SR2[]=SD2.split("########");
			String EName=SR2[0];
			String EPwd=SR2[1];
			String ERol=SR2[2];
			String EBra=SR2[3];
			String Result=Li.EmployeeCreation(EName, EPwd, ERol, EBra);
			//Results
			BW2.write(SD2+"@@@@@"+Result);
			BW2.newLine();
		}
		BW2.close();
		BR2.close();
		Li.Logout();
		Li.CloseApp();
	}
}
