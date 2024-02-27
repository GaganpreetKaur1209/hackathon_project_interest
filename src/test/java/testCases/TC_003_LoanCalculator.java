package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoanAmountCalculator;
import pageObject.LoanCalculator;
import pageObject.LoanTenureCalculator;
import testBase.BaseClass;

public class TC_003_LoanCalculator extends BaseClass {
	
	public LoanCalculator lc; 
	
	@Test(priority=26)
	public void clickLoanCalculator() {
		BaseClass.getlogger().info("*****Starting TC_003_LoanCalculator *****");
		lc=new LoanCalculator(driver);
		lc.clickcalculatorbtn();
		BaseClass.getlogger().info("Clicked on the calculator button");
		lc.clickloancalculatorbtn();
		BaseClass.getlogger().info("Clicked on the loan calculator button");
		lc.clickemicalculator();
		BaseClass.getlogger().info("Clicked on the EMI Calculator button");
	}
	
	@Test(priority=27)
	public void checkEmiUI() {
		lc=new LoanCalculator(driver);
		boolean loanamountvalue=lc.checkLoanAmountTextBox();
		if(loanamountvalue==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan amount value is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan amount value has failed");
		}
		//Assert.assertEquals(loanamountvalue, true);
		boolean loanamountscale=lc.checkLoanAmountScale();
		if(loanamountscale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan amount scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan amount scale has failed");
		}
		//Assert.assertEquals(loanamountscale, true);
		boolean loaninterestvalue=lc.checkLoanInterestTextBox();
		if(loaninterestvalue==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan interest value is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan interest value has failed");
		}
		//Assert.assertEquals(loaninterestvalue, true);
		boolean loaninterestscale=lc.checkLoanInterestScale();
		if(loaninterestscale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan interest scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan interest scale has failed");
		}
		//Assert.assertEquals(loaninterestscale, true);
		boolean loantermvalue=lc.checkLoanTermTextBox();
		if(loantermvalue==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan term value is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan term value has failed");
		}
		//Assert.assertEquals(loantermvalue, true);
		boolean loantermscale=lc.checkLoanTermScale();
		if(loantermscale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan term scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan term scale has failed");
		}
		//Assert.assertEquals(loantermscale, true);
		boolean loanfeesvalue=lc.checkLoanFeesTextBox();
		if(loanfeesvalue==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan fees value is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan fees value has failed");
		}
		//Assert.assertEquals(loanfeesvalue, true);
		boolean loanfeesscale=lc.checkLoanFeesScale();
		if(loanfeesscale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan fees scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan fees scale has failed");
		}
		//Assert.assertEquals(loanfeesscale, true);
	}
	
	@Test(priority=28)
	public void checkEmiscale() {
		lc=new LoanCalculator(driver);
		boolean scale=lc.checkEMIscale();
		if(scale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Tenure scale of EMI Calculator is working");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Tenure scale of EMI Calculator is not working");
		}
		//Assert.assertEquals(scale, true);
	}
	
	@Test(priority=29)
	public void clickLoanAmountCalculator() {
		LoanAmountCalculator lac=new LoanAmountCalculator(driver);
		lac.clickloanamountcalculator();
		BaseClass.getlogger().info("Clicked on Loan Amount Calculator");
	}
	
	@Test(priority=30)
	public void checkLoanAmountCalculatorUI() {
		LoanAmountCalculator lac=new LoanAmountCalculator(driver);
		boolean loanEMITextbox=lac.checkLoanEMITextbox();
		if(loanEMITextbox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan EMI textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan EMI textbox has failed");
		}
		//Assert.assertEquals(loanEMITextbox, true);
		boolean loanEMIScale=lac.checkLoanEMIScale();
		if(loanEMIScale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan EMI scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan EMI scale has failed");
		}
		//Assert.assertEquals(loanEMIScale, true);
		boolean loanInterestTextbox=lac.checkLoanInterestTextbox();
		if(loanInterestTextbox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan interest textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan interest textbox has failed");
		}
		//Assert.assertEquals(loanInterestTextbox, true);
		boolean loanInterestsliderScale=lac.checkLoanInterestsliderScale();
		if(loanInterestsliderScale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan interest slider scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan interest slider scale has failed");
		}
		//Assert.assertEquals(loanInterestsliderScale, true);
		boolean loanTermTextbox=lac.checkLoanTermTextbox();
		if(loanTermTextbox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan term textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan term textbox has failed");
		}
		//Assert.assertEquals(loanTermTextbox, true);
		boolean loanTermsliderScale=lac.checkLoanTermsliderScale();
		if(loanTermsliderScale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan term slider scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan term slider scale has failed");
		}
		//Assert.assertEquals(loanTermsliderScale, true);
		boolean loanFeesTextbox=lac.checkLoanFeesTextbox();
		if(loanFeesTextbox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan fees textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan fees textbox has failed");
		}
		//Assert.assertEquals(loanFeesTextbox, true);
		boolean loanFeessliderScale=lac.checkLoanFeessliderScale();
		if(loanFeessliderScale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan fees slider scale is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan fees slider scale has failed");
		}
		//Assert.assertEquals(loanFeessliderScale, true);
	}
	
	@Test(priority=31)
	public void checkLoanAmountscale() {
		LoanAmountCalculator lac=new LoanAmountCalculator(driver);
		boolean scale=lac.checkLoanAmountTenure();
		if(scale==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Tenure scale of Loan Amount Calculator is working");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Tenure scale of Loan Amount Calculator is not working");
		}
		//Assert.assertEquals(scale, true);
	}
	
	@Test(priority=32)
	public void clickLoanTenureCalculator() {
		LoanTenureCalculator ltc=new LoanTenureCalculator(driver);
		ltc.clickloantenurecalculator();
		BaseClass.getlogger().info("Clicked on Loan Tenure Calculator");
	}
	
	@Test(priority=33)
	public void checkLoanTenureCalculatorUI() {
		LoanTenureCalculator ltc=new LoanTenureCalculator(driver);
		boolean LoanAmountTextBox=ltc.checkLoanAmountTextBox();
		if(LoanAmountTextBox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Amount textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Amount textbox has failed");
		}
		//Assert.assertEquals(LoanAmountTextBox, true);
		boolean LoanAmountSlider=ltc.checkLoanAmountSlider();
		if(LoanAmountSlider==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Amount Slider is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Amount slider has failed");
		}
		//Assert.assertEquals(LoanAmountSlider, true);
		boolean LoanEmiTextBox=ltc.checkLoanEmiTextBox();
		if(LoanEmiTextBox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Emi textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Emi textbox has failed");
		}
		//Assert.assertEquals(LoanEmiTextBox, true);
		boolean LoanEmiSlider=ltc.checkLoanEmiSlider();
		if(LoanEmiSlider==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Emi slider is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Emi slider has failed");
		}
		//Assert.assertEquals(LoanEmiSlider, true);
		boolean LoanInterestTextBox=ltc.checkLoanInterestTextBox();
		if(LoanInterestTextBox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Interest textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Interest textbox has failed");
		}
		//Assert.assertEquals(LoanInterestTextBox, true);
		boolean LoanInterestSlider=ltc.checkLoanInterestSlider();
		if(LoanInterestSlider==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan Interest slider is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan Interest slider has failed");
		}
		//Assert.assertEquals(LoanInterestSlider, true);
		boolean LoanFeesTextBox=ltc.checkLoanFeesTextBox();
		if(LoanFeesTextBox==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan fees textbox is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan fees textbox has failed");
		}
		//Assert.assertEquals(LoanFeesTextBox, true);
		boolean LoanFeesSlider=ltc.checkLoanFeesSlider();
		if(LoanFeesSlider==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Loan fees slider is verified");
		}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Loan fees slider has failed");
		}
		//Assert.assertEquals(LoanFeesSlider, true);
		BaseClass.getlogger().info("*****Finished TC_003_LoanCalculator *****");
	}
	
}
