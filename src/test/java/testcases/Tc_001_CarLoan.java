package testcases;

import org.testng.annotations.Test;


import driverUtility.DriverSetup;
import outputUtility.ScreenShot;
import pageObject.PageObject;

public class Tc_001_CarLoan extends DriverSetup{
	@Test
	public void validateCarLoan()
	{
		PageObject p=new PageObject(driver);
		p.clickCarTab();//calling the click function for click car loan tab
		p.enterAmountValues();//entering the values 
		
		String loanemi =p.LoanEmi();//getting the loan emi
		System.out.println("Loan EMI = "+loanemi);
		
		String totalinterestpayable=p.Totalinterestpayable();//getting the total interest payable 
		System.out.println("Total Interest Payable = "+totalinterestpayable);
		
		String totalamount=p.Totalamount();//getting the total amount
		System.out.println("Total Amount = "+totalamount);
		ScreenShot.takeScreenshot(driver);
	}

}
