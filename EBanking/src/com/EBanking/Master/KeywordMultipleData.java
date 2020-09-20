package com.EBanking.Master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeywordMultipleData 
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
						case "RBranch":FileInputStream FISB=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\EBanking.xlsx");
										XSSFWorkbook WBB=new XSSFWorkbook(FISB);
										//Branch
										XSSFSheet WSB=WBB.getSheet("BData");
										int RC=WSB.getLastRowNum();
										System.out.println(RC);
										for(int k=1;k<=RC;k++)
										{
											XSSFRow WR=WSB.getRow(k);
											XSSFCell WC=WR.getCell(0);
											XSSFCell WC1=WR.getCell(1);
											XSSFCell WC2=WR.getCell(2);
											XSSFCell WC3=WR.getCell(3);
											XSSFCell WC4=WR.getCell(4);
											XSSFCell WC5=WR.getCell(5);
											XSSFCell WC6=WR.getCell(6);
											XSSFCell WC7=WR.getCell(7);
											XSSFCell WC8=WR.getCell(8);
											XSSFCell WC9=WR.createCell(9);
											String BName=WC.getStringCellValue();
											String Add1=WC1.getStringCellValue();
											String Add2=WC2.getStringCellValue();
											String Add3=WC3.getStringCellValue();
											String Area=WC4.getStringCellValue();
											String Zip=WC5.getStringCellValue();
											String Ctry=WC6.getStringCellValue();
											String Sta=WC7.getStringCellValue();
											String City=WC8.getStringCellValue();
											String Res=Li.BranchCreation(BName,Add1,Add2,Add3,Area,Zip,Ctry,Sta,City);
											WC9.setCellValue(Res);
										}
										FileOutputStream FOSB=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Bra_Result.xlsx");
										WBB.write(FOSB);
										WBB.close();
										break;
						case "RRole":FileInputStream FISR=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\EBanking.xlsx");
									 XSSFWorkbook WBR=new XSSFWorkbook(FISR);
									 XSSFSheet WSR=WBR.getSheet("RData");
									 int RC1=WSR.getLastRowNum();
									 System.out.println(RC1);
									 for(int k=1;k<=RC1;k++)
									 {
										 XSSFRow WR=WSR.getRow(k);
										 XSSFCell WC=WR.getCell(0);
										 XSSFCell WC1=WR.getCell(1);
										 XSSFCell WC2=WR.getCell(2);
										 XSSFCell WC3=WR.createCell(3);
										 String RName=WC.getStringCellValue();
										 String RDesc=WC1.getStringCellValue();
										 String RType=WC2.getStringCellValue();
										 String Res=Li.RoleCreation(RName, RDesc, RType);
										 WC3.setCellValue(Res);
									 }
									 FileOutputStream FOSR=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Rol_Result.xlsx");
									 WBR.write(FOSR);
									 WBR.close();
									 break;
						case "REmp":FileInputStream FISE=new FileInputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\TestData\\EBanking.xlsx");
									XSSFWorkbook WBE=new XSSFWorkbook(FISE);
									XSSFSheet WSE=WBE.getSheet("EData");
									int RC2=WSE.getLastRowNum();
									System.out.println(RC2);
									for(int k=1;k<=RC2;k++)
									{
										XSSFRow WR=WSE.getRow(k);
										XSSFCell WC=WR.getCell(0);
										XSSFCell WC1=WR.getCell(1);
										XSSFCell WC2=WR.getCell(2);
										XSSFCell WC3=WR.getCell(3);
										XSSFCell WC4=WR.createCell(4);
										String EName=WC.getStringCellValue();
										String EPwd=WC1.getStringCellValue();
										String ERol=WC2.getStringCellValue();
										String EBra=WC3.getStringCellValue();
										String Res=Li.EmployeeCreation(EName,EPwd,ERol,EBra);
										WC4.setCellValue(Res);
									}
									FileOutputStream FOSE=new FileOutputStream("C:\\Users\\SriramBabuRao\\Project-WorkSpace\\EBanking\\src\\com\\EBanking\\Results\\Emp_Result.xlsx");
									WBE.write(FOSE);
									WBE.close();
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
