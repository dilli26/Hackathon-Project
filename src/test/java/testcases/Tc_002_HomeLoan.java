package testcases;
import java.util.List;
import org.testng.annotations.Test;
import driverUtility.DriverSetup;
import excelUtility.ExcelWrite;
import outputUtility.ScreenShot;
import pageObject.PageObject;

public class Tc_002_HomeLoan extends DriverSetup{
	@Test(priority=2)
	public void valaidateHomeLoan()
	{
		l.info("valildating HomeLoan ");
		PageObject p=new PageObject(driver);
		p.dropdown();//clicking the dropdown
		p.clickHomeEmiCalculator();//click the Home EMI Calculator
		List <String> li=p.getDetailsOfTheTable();
		ScreenShot.takeScreenshot(driver);
		l.info("writing the values in the table");
		ExcelWrite ex=new ExcelWrite();
		ex.writeinTable(li);
		
	}
}
