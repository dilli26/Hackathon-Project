package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driverUtility.DriverSetup;
import outputUtility.ScreenShot;
import pageObject.PageObject;

public class Tc_003_004_UI_ValidatingEMIcalculator_FeesAndCharges extends DriverSetup {
	@Test(priority=6)
	public void validatingEMIcalculator_FeesAndCharges()
	{l.info("valildating  EMI calculator FeesAndCharges");
		PageObject p=new PageObject(driver);
		SoftAssert s=new SoftAssert();
		p.dropdown();
		p.clickLoanCalculator();
		p.clickEMICalculator();
		ScreenShot.takeScreenshot(driver);
		//check the textbox is displayed or not
        if(p.FeesAndChargesTextBox().isDisplayed())
        {
        	s.assertTrue(true);
        	l.info("Text displayed");
        }
        else
        {
        	s.assertFalse(false);
        	l.info("textBox not displayed");
        }
      //check the textbox is enabled or not
        if(p.FeesAndChargesTextBox().isEnabled())
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
        if(p.FeesAndChargesslider().isDisplayed())
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
        if(p.FeesAndChargesslider().isEnabled())
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
