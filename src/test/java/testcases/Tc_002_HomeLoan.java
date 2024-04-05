package testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import driverUtility.DriverSetup;
import excelUtility.ExcelWrite;
import pageObject.PageObject;

public class Tc_002_HomeLoan extends DriverSetup{
	@Test
	public void valaidateHomeLoan()
	{
		PageObject p=new PageObject(driver);
		p.dropdown();//clicking the dropdown
		p.clickHomeEmiCalculator();//click the Home EMI Calculator
		List <String> l=p.getDetailsOfTheTable();
		System.out.println(l);
		ExcelWrite ex=new ExcelWrite();
		ex.writeinTable(l);
		
	}
}
