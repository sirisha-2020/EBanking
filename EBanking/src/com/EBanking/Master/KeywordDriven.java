package com.EBanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeywordDriven
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Library Li=new Library();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SriramBabuRao\\Desktop\\LiveProject\\OpenSourceSoftwares\\chromedriver.exe");
		String Result=null;
		//To Get Test Data From Excel File
		FileInputStream FIS=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\KeywordData.xlsx");
		XSSFWorkbook WB=new XSSFWorkbook(FIS);
		//Get Data from TestCases and TestSteps of ExcelSheet
		XSSFSheet WS=WB.getSheet("TestCase");
		XSSFSheet WS1=WB.getSheet("TestSteps");
		//Last Row Count of the Sheets
		int TCRC=WS.getLastRowNum();
		//System.out.println(TCRC);
		int TSRC=WS1.getLastRowNum();
		//System.out.println(TSRC);
		for(int i=1;i<=TCRC;i++)
		{
			String Exe=WS.getRow(i).getCell(2).getStringCellValue();
			if(Exe.equalsIgnoreCase("Y"))
			{
				String TCID=WS.getRow(i).getCell(0).getStringCellValue();
				for(int j=1;j<=TSRC;j++)
				{
					String TSTCID=WS1.getRow(j).getCell(0).getStringCellValue();
					if(TSTCID.equalsIgnoreCase(TCID))
					{
						String Key=WS1.getRow(j).getCell(3).getStringCellValue();
						switch(Key)
						{
						case "RLaunch":Result=Li.OpenApp("http://183.82.100.55/ranford2/");
										break;
						case "RLogin":Result=Li.AdminLogin("Admin","M1ndq");
										break;
						case "RBranch":Result=Li.BranchCreation("Ananthapuram","Sriram Nager","Sanivararapupet","Bank Colony","Nizampet","50090","INDIA","GOA","GOA");
										break;
						case "RRole":Result=Li.RoleCreation("TestApp","Testing Application","E");
										break;
						case "REmp":Result=Li.EmployeeCreation("Swapna32","1234567","Tester","Amberpet");
									break;
						case "RBLogin":Result=Li.BranchLogin("Amberpet","Swapna32","1234567");
										break;
						case "RLogout":Li.Logout();
										break;
						case "RClose":Li.CloseApp();
										break;
						case "RBLogout":Li.RBLogout();
										break;
						default:System.out.println("Pass a Valid Keyword");
						}//switch
					//result updation in test steps sheet
					WS1.getRow(j).createCell(4).setCellValue(Result);
					//result updation in test case sheet
					if (!WS1.getRow(j).getCell(4).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							WS.getRow(i).createCell(3).setCellValue(Result);
						}
						else
						{
							WS.getRow(i).createCell(3).setCellValue("Fail");
						}
					}//if
				}//for
			}//if
			else
			{
				WS.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}//for
		FileOutputStream FOS=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Res_KeywordData.xlsx");
		WB.write(FOS);
		WB.close();
	}
	}
