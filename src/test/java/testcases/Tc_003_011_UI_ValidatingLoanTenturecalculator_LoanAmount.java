package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driverUtility.DriverSetup;
import outputUtility.ScreenShot;
import pageObject.PageObject;

public class Tc_003_011_UI_ValidatingLoanTenturecalculator_LoanAmount extends DriverSetup{
	@Test(priority=13)
	public void validatingLoanTenturecalculator_LoanAmount()
	{
		l.info("validating LoanTenture calculator LoanAmount");
		PageObject p=new PageObject(driver);
		SoftAssert s=new SoftAssert();
		p.dropdown();
		p.clickLoanCalculator();
		p.clickLoanTentureCalculator();
		ScreenShot.takeScreenshot(driver);
		//check the textbox is displayed or not
        if(p.loanAmountTextBox().isDisplayed())
        {
        	s.assertTrue(true);
        	l.info("Textbox displayed");
        }
        else
        {
        	s.assertFalse(false);
        	l.info("textBox not displayed");
        }
      //check the textbox is enabled or not
        if(p.loanAmountTextBox().isEnabled())
        {
        	s.assertTrue(true);
        	l.info("textBox Enabled");
        }
        else
        {
        	s.assertFalse(false);
        	l.info("textBox not enabled");
        }
      //check the slider is displayed or not
        if(p.loanAmountslider().isDisplayed())
        {
        	s.assertTrue(true);
        	l.info("Slider displayed");
        }
        else
        {
        	s.assertFalse(false);
        	l.info("slider not disabled");
        }
      //check the slider is enabled or not
        if(p.loanAmountslider().isEnabled())
        {
        	s.assertTrue(true);
        	l.info("Slider enabled");
        }
        else
        {
        	s.assertFalse(false);
        	l.info("slider not enabled");
        }
	}
}
