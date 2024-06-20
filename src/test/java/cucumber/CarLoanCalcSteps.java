package cucumber;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarLoanCalcSteps extends DriverInstance{

	PageObjectCucumber poc = new PageObjectCucumber(driver);
	
	@Given("user click car loan")
	public void userClickCarLoan() {
	   poc.clickCarLoan();
	}
	
	
	@Given("send car loan amount value as {int}")
	public void sendCarLoanAmountValueAs(Integer loanAmount) {
		
	    poc.loanAmount(loanAmount);
	}
	
	@Given("send interest rate as {double}")
	public void sendInterestRateAs(Double interestRate) {
		
	    poc.interestRate(interestRate);
	}
	
	@Given("send loan tensure as {int}")
	public void sendLoanTensureAs(Integer loanTensure) throws Exception {
		
	   poc.loanTensure(loanTensure);
	}
	
	@When("press enter")
	public void userClickOnYr() throws InterruptedException {
//		Thread.sleep(1000);
	    poc.pressEnter();
	}
	
	@Then("Display the interest amount and principle amount of first month")
	public void displayTheInterestAmountAndPrincipleAmountOfFirstMonth() throws Exception {
		Thread.sleep(1000);
	    String[] amounts = poc.getAmounts();
	    int interestAmount=Integer.parseInt(amounts[0].replaceAll("[^0-9]", ""));
	    int principleAmount=Integer.parseInt(amounts[1].replaceAll("[^0-9]", ""));
	    
	    System.out.println("Interest Amount Of First Month: ₹"+interestAmount+"\nPrinciple Amount Of First Month: ₹"+principleAmount);
	    
	    Assert.assertTrue(interestAmount>0&&principleAmount>0);
	}
}
