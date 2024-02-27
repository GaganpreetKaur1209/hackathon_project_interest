package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.CarLoan;
import testBase.BaseClass;

public class TC_001_Carloan extends BaseClass{

	
	public CarLoan cl;
	String beforeamountscale;
	String afteramountscale;
	String beforeInterestScale;
	String afterInterestScale;
	String beforeTenureScale;
	String afterTenureScale;
	
	@Test(priority=1)
	public void clickcarLoan() 	{
		BaseClass.getlogger().info("*****Starting TC_001_Carloan *****");
		cl=new CarLoan(driver);
		cl.carLoan();
		BaseClass.getlogger().info("Clicked on Car Loan");
	}
	
	@Test(priority=2, dependsOnMethods = {"clickcarLoan"})
	public void CarLoanAmount() {
		BaseClass.getlogger().info("Setting Car Loan amount values");
		cl=new CarLoan(driver);
	    beforeamountscale=cl.checkBeforeAmountScale();
		cl.clearLoanAmount();
		cl.setLoanAmount();
		afteramountscale=cl.checkAfterAmountScale();
	}
	
	@Test(priority=3)
	public void validateCarLoanAmount() {
		BaseClass.getlogger().info("Validating Car Loan amount values");
		cl=new CarLoan(driver);
		if(beforeamountscale!=afteramountscale) {
	        Assert.assertTrue(true);
	        BaseClass.getlogger().info("Validated amount scale");
		}
		else {
			BaseClass.getlogger().info("Amount scale Test failed");
			
			Assert.fail();
		}
	}
	
	@Test(priority=4)
	public void InterestRate() {
		BaseClass.getlogger().info("Setting Interest rate values");
		cl=new CarLoan(driver);
		beforeInterestScale=cl.checkBeforeInterestScale();
		cl.setInterest();
		afterInterestScale=cl.checkAfterInterestScale();
	}
	
	@Test(priority=5)
	public void validateInterestRate() {
		BaseClass.getlogger().info("Validating Interest rate values");
		cl=new CarLoan(driver);
		if(beforeInterestScale!=afterInterestScale) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Validated interest scale");
			}
			else {
				BaseClass.getlogger().info("Interest scale Test failed");
				Assert.fail();
			}
	}
	
	@Test(priority=6)
		public void LoanTenure() {
		BaseClass.getlogger().info("Setting Car Loan tenure values");
			cl=new CarLoan(driver);
		beforeTenureScale=cl.checkBeforeTenureScale();
		cl.clearLoanTenure();
		afterTenureScale=cl.checkAfterTenureScale();
	}
	
	@Test(priority=7)
	public void validateLoanTenure() {
		BaseClass.getlogger().info("Validating Car Loan tenure values");
		cl=new CarLoan(driver);
		if(beforeTenureScale!=afterTenureScale) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Validated tenure scale");
			}
			else {
				BaseClass.getlogger().info("Tenure scale Test failed");
				Assert.fail();
			}
		}
	
	@Test(priority=8, dependsOnMethods= {"LoanTenure"})
	public void clickEmiArrears() {
		cl=new CarLoan(driver);
		cl.clickEmiArrears();
		BaseClass.getlogger().info("Clicked on EMI in Arrears");
	}
	
	@Test(priority=9)
	public void scrollDownArrearsCarLoanPage() {
		cl=new CarLoan(driver);
		cl.scrollDownArrearsPage();
		BaseClass.getlogger().info("Page successfully scrolled down");
	}
	
	@Test(priority=10, dependsOnMethods={"scrollDownArrearsCarLoanPage"})
	public void interestArrearsCarLoanPage() {
		cl=new CarLoan(driver);
        String interest=cl.arrearsInterest();
        System.out.println("Interest of in EMI arrears for one month is: "+interest);
        BaseClass.getlogger().info("One month interest displayed for EMI in Arrears");
	}
	
	@Test(priority=11, dependsOnMethods={"scrollDownArrearsCarLoanPage"})
	public void principalAmountArrearsCarLoanPage() {
		cl=new CarLoan(driver);
		String principalAmount=cl.arrearsPrincipalAmount();
	    System.out.println("Principal Amount of EMI in arrears for one month is: "+principalAmount);
	    BaseClass.getlogger().info("One month Principal Amount displayed for EMI in Arrears");
	}	
	
	@Test(priority=12)
	public void scrollUpCarLoanPage() {
		cl=new CarLoan(driver);
		cl.scrollUpEmiPage();
		BaseClass.getlogger().info("Scrolled up the page");
	}
	
	@Test(priority=13)
	public void clickEmiAdvance() {
		cl=new CarLoan(driver);
		cl.clickEmiAdvance();
		BaseClass.getlogger().info("Clicked on EMI in Advance");
	}
	
	@Test(priority=14)
	public void scrollDownAdvanceCarLoanPage() {
		cl=new CarLoan(driver);
		cl.scrollDownAdvancePage();
		BaseClass.getlogger().info("Scrolled down the page till table");
	}
	
	@Test(priority=15, dependsOnMethods={"scrollDownAdvanceCarLoanPage"})
	public void interestAdvanceCarLoanPage() {
		cl=new CarLoan(driver);
		String interest=cl.advanceInterest();
		System.out.println("Interest of advance EMI for one month is: "+interest);
		BaseClass.getlogger().info("One month interest displayed for EMI in Advance");
	}
	
	@Test(priority=16, dependsOnMethods={"scrollDownAdvanceCarLoanPage"})
	public void principalAmountAdvanceCarLoanPage() {
		cl=new CarLoan(driver);
		String principalAmount=cl.advancePrincipalAmount();
		System.out.println("Principal Amount of advance EMI for one month is: "+principalAmount);
		BaseClass.getlogger().info("One month Principal Amount displayed for EMI in Advance");
	}	
	
	@Test(priority=17)
	public void scrollUpPage() {
		cl=new CarLoan(driver);
		cl.scrollUpPage();
		BaseClass.getlogger().info("Scrolled till the top of the page");
		BaseClass.getlogger().info("*****Finished TC_001_Carloan *****");
	}
	
}
