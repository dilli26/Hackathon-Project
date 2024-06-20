package testcases;

import java.util.Arrays;

import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driverUtility.DriverSetup;
import outputUtility.ScreenShot;
import pageObject.PageObject;

public class Tc_003_005_UI_ValidatingEMIcalculator_YearAndMonth extends DriverSetup{
	@Test(priority=7)
	public void validatingEMIcalculator_YearAndMonth()
	{
		l.info("valildating  EMI calculator YearAndMonth");
		PageObject p=new PageObject(driver);
		SoftAssert s=new SoftAssert();
		p.dropdown();
		p.clickLoanCalculator();
		p.clickEMICalculator();
		ScreenShot.takeScreenshot(driver);
		String year=p.getYearAndMonthText();
		int yearInt = Integer.parseInt(year);
		//System.out.println(year);
		List<WebElement> list = p. getYearAndMonthSlider();
		int[] yearScale = new int[list.size()];
		int i=0;
		for(WebElement li : list) {
			yearScale[i]=Integer.parseInt(li.getText());
			i++;
		}
		//System.out.println(Arrays.toString(yearScale));

		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('loanmonths').click()");
		String month=p.getYearAndMonthText();
		//System.out.println(month);
		list =p.getYearAndMonthSlider();
		int[] monthScale = new int[list.size()];
		int j=0;
		for(WebElement li : list) {
			monthScale[j]=Integer.parseInt(li.getText());
			j++;
		}
		//System.out.println(Arrays.toString(monthScale));
		for(int k=0;k<list.size();k++) {
			s.assertTrue(monthScale[k]/12==yearScale[k]);
			
		}
		if(month.equals(Integer.toString(yearInt*12))) {
			s.assertTrue(true);
			l.info("Year And Month verified");
		}
		else
		{
			s.assertTrue(false);
			l.info("Year And Month failed");
		}

 
	}

}
