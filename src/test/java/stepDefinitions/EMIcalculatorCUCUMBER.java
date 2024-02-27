package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.BaseClass;
import testCases.TC_001_Carloan;
import testCases.TC_002_HomeLoan;
import testCases.TC_003_LoanCalculator;

public class EMIcalculatorCUCUMBER {

	WebDriver driver;
	
	TC_001_Carloan tc1=new TC_001_Carloan();
	TC_002_HomeLoan tc2=new TC_002_HomeLoan();
	TC_003_LoanCalculator tc3=new TC_003_LoanCalculator();
	
	@Given("User opens the  emicalculator.net")
	public void user_opens_the_emicalculator_net() throws IOException  {
	   BaseClass bc=new BaseClass();
	   bc.setup("chrome");
	}

	@Given("user clicks on the Car Loan button")
	public void user_clicks_on_the_car_loan_button() {
	    tc1.clickcarLoan();
	}

	@When("user fills the Car Loan Amount as {string} as input field")
	public void user_fills_the_car_loan_amount_as_as_input_field(String string) {
	   tc1.CarLoanAmount();
	}

	@Then("user validates the Car Loan Amount")
	public void user_validates_the_car_loan_amount() {
	   tc1.validateCarLoanAmount();
	}

	@When("user fills the Interset Rate as {string} as input field")
	public void user_fills_the_interset_rate_as_as_input_field(String string) {
	   tc1.InterestRate();
	}

	@Then("user validates the Interset Rate")
	public void user_validates_the_interset_rate() {
	   tc1.validateInterestRate();
	}

	@When("user fills the Loan Tenure as {string} as input field")
	public void user_fills_the_loan_tenure_as_as_input_field(String string) {
	   tc1.LoanTenure();
	}

	@Then("validates the Loan Tenure")
	public void validates_the_loan_tenure() {
	 tc1.validateLoanTenure();
	}

	@When("user clicks on EMI in Arrears")
	public void user_clicks_on_emi_in_arrears() {
	    tc1.clickEmiArrears();
	}

	@When("user scrolls down till year table")
	public void user_scrolls_down_till_year_table() {
	  tc1.scrollDownArrearsCarLoanPage();
	}

	@Then("user fetches the arrears interest amount for one month and display it")
	public void user_fetches_the_arrears_interest_amount_for_one_month_and_display_it() {
	  tc1.interestArrearsCarLoanPage();
	}

	@Then("arrears principal amount for one month and display it")
	public void arrears_principal_amount_for_one_month_and_display_it() {
	    tc1.principalAmountArrearsCarLoanPage();
	}

	@When("user scrolls up till EMI page")
	public void user_scrolls_up_till_emi_page() {
	   tc1.scrollUpCarLoanPage();
	}

	@When("user clicks on EMI Advance")
	public void user_clicks_on_emi_advance() {
	    tc1.clickEmiAdvance();
	}

	@When("user scrolls down Advance page till year table")
	public void user_scrolls_down_advance_page_till_year_table() {
	  tc1.scrollDownAdvanceCarLoanPage();
	}

	@Then("user fetches the advance interest amount for one month and display it")
	public void user_fetches_the_advance_interest_amount_for_one_month_and_display_it() {
	  tc1.interestAdvanceCarLoanPage();
	}

	@Then("advance principal amount for one month and display it")
	public void advance_principal_amount_for_one_month_and_display_it() {
	   tc1.principalAmountAdvanceCarLoanPage();
	}

	@When("user scrolls up till top of the page")
	public void user_scrolls_up_till_top_of_the_page() {
	    tc1.scrollUpPage();
	}

	@When("user clicks on calculator button and home loan button")
	public void user_clicks_on_calculator_button_and_home_loan_button() {
	    tc2.clickHomeLoan();
	}

	@When("user then sets Home Loan values")
	public void user_then_sets_home_loan_values() {
	   tc2.setHomeLoanValues();
	}

	@Then("user verifies monthly payment is displayed or not")
	public void user_verifies_monthly_payment_is_displayed_or_not() {
	    tc2.monthlyPaymentDisplayed();
	}

	@Then("user verifies total payment is displayed or not")
	public void user_verifies_total_payment_is_displayed_or_not() {
	   tc2.totalPaymentDisplayed();
	}

	@When("user scroll home page")
	public void user_scroll_home_page() {
	   tc2.scrollHomeLoanPage();
	}

	@Then("user handles table header")
	public void user_handles_table_header() {
	   tc2.handletableheader();
	}

	@Then("user handles year on year table")
	public void user_handles_year_on_year_table() {
	   tc2.table();
	}

	@When("user scrolls up the page")
	public void user_scrolls_up_the_page() {
	   tc2.pagetop();
	}

	@When("user clicks calculator button and Loan Calculator and under EMI calculator")
	public void user_clicks_calculator_button_and_loan_calculator_and_under_emi_calculator() {
	    tc3.clickLoanCalculator();
	}

	@Then("user validates EMI UI check for textbox and scales")
	public void user_validates_emi_ui_check_for_textbox_and_scales() {
	    tc3.checkEmiUI();
	}

	@Then("user verifies EMI scale")
	public void user_verifies_emi_scale() {
	   tc3.checkEmiscale();
	}

	@When("user clicks on Loan Amount Calculator")
	public void user_clicks_on_loan_amount_calculator() {
	   tc3.clickLoanAmountCalculator();
	}

	@Then("user validates Loan Amount Calculator UI check for textbox and scales")
	public void user_validates_loan_amount_calculator_ui_check_for_textbox_and_scales() {
	    tc3.checkLoanAmountCalculatorUI();
	}

	@Then("user verifies Loan Amount Calculator scale")
	public void user_verifies_loan_amount_calculator_scale() {
	    tc3.checkLoanAmountscale();
	}

	@When("user clicks on Loan Tenure Calculator")
	public void user_clicks_on_loan_tenure_calculator() {
	   tc3.clickLoanTenureCalculator();
	}

	@Then("user validates Loan Tenure Calculator UI check for textbox and scales")
	public void user_validates_loan_tenure_calculator_ui_check_for_textbox_and_scales() {
	    tc3.checkLoanTenureCalculatorUI();
	}



}
