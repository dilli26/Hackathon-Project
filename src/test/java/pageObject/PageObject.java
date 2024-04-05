package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageObject {
	
	public WebDriver driver;
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//*************TestCase1
	//for car tab
	@FindBy(xpath="//*[@id=\"car-loan\"]")
	WebElement cartab;
	public void clickCarTab() {
		cartab.click();
	}
	//for enter the input fields
	
	@FindBy(xpath="//*[@id='loanamount']")//amount
	WebElement txt_amount;
	
	@FindBy(xpath="//*[@id='loaninterest']")//interest percent
	WebElement txt_interest;
	
	@FindBy(xpath="//*[@id='loanterm']")//tenture year
	WebElement txt_year;
	public void enterAmountValues()
	{
		txt_amount.sendKeys(Keys.chord(Keys.CONTROL, "a"), "1500000");
		txt_interest.sendKeys(Keys.chord(Keys.CONTROL, "a"), "9.5");
		txt_year.sendKeys(Keys.chord(Keys.CONTROL,"a"),"1");
		txt_year.sendKeys(Keys.ENTER);
	}
	
	//getting the values in the carLoan 
	@FindBy(xpath="//div[@id='emiamount']/p/span")//loan emi
	WebElement txt_Loanemi;
	public String LoanEmi()
	{
		return txt_Loanemi.getText();
		
	}
	
	@FindBy(xpath="//*[@id='emitotalinterest']/p/span")//Totalinterestpayable
	WebElement txt_Totalinterestpayable;
	public String Totalinterestpayable()
	{
		return txt_Totalinterestpayable.getText();
		
	}
	
	@FindBy(xpath="//*[@id='emitotalamount']/p/span")//Totalamount
	WebElement txt_Totalamount;
	public String Totalamount()
	{
		return txt_Totalamount.getText();
		
	}
	//*********** testcase 2
	//HomeLone EMI calculator
	@FindBy(xpath="//a[@id='menu-item-dropdown-2696']")//click dropdown 
	WebElement dropdowntab;
	public void dropdown() 
	{
		dropdowntab.click();
	}
	@FindBy(xpath="//a[@title='Home Loan EMI Calculator']")//click dropdown 
	WebElement txt_HomeEmiCalculator;
	public void clickHomeEmiCalculator() 
	{
		txt_HomeEmiCalculator.click();
	}

	@FindBy(xpath="//table[@class='noextras']/tbody/tr[contains(@class,'yearlypaymentdetails')]//td")//getting the rows in the table element
	List <WebElement> txt_tablerow;
	@FindBy(xpath="//div[@id='paymentschedule']/table/tbody/tr/th")//getting the cells in the  table element
	List <WebElement> txt_headings;
	
	public List<String>  getDetailsOfTheTable() 
	{
		List <String> l=new ArrayList <String>();
		 for(int i=0; i<txt_headings.size();i++) {
			 if(!(txt_headings.get(i).getText().isBlank() || txt_headings.get(i).getText().isEmpty())) {
				 l.add(txt_headings.get(i).getText());
			 }
		 }
		 for(int i=0;i<txt_tablerow.size();i++) {
			 l.add (txt_tablerow.get(i).getText());
		 }
		return l;
	}
}
