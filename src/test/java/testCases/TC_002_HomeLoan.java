package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomeLoan;
import testBase.BaseClass;

public class TC_002_HomeLoan extends BaseClass {
	
	public HomeLoan hl;
	
	@Test(priority=18)
	public void clickHomeLoan() {
		BaseClass.getlogger().info("*****Starting TC_002_HomeLoan *****");
		hl=new HomeLoan(driver);
		hl.clickcalculatorbtn();
		BaseClass.getlogger().info("Clicked on Calculator button");
		hl.clickhomeloanbtn();
		BaseClass.getlogger().info("Clicked on Home Loan EMI Calculator button");
		try {
			driver.findElement(By.id("card")).isDisplayed();
			driver.findElement(By.xpath("//*[@id='dismiss-button']/div")).click();
		}
		catch(Exception e) {
		}
		}
	
	
	@Test(priority=19)
	public void setHomeLoanValues(){
		BaseClass.getlogger().info("Setting Home Loan values");
	    hl=new HomeLoan(driver);
		hl.setHomeValue();
		hl.setDownpayment();
		hl.setLoanInsurance();
		hl.setInterest();
		hl.setLoanTenure();
		hl.setOneTimeExpenses();
		hl.setPropertyTaxes();
		hl.setHomeInsurance();
		hl.setMaintenanceexpenses();
	}
	
	@Test(priority=20)
	public void monthlyPaymentDisplayed() {
		hl=new HomeLoan(driver);
		hl.scrollTillMonthlyTable();
		BaseClass.getlogger().info("Scroll till monthly table");
		boolean displayed=hl.monthlypaymentdisplayed();
		if(displayed==true) {
		Assert.assertTrue(true);
		BaseClass.getlogger().info("Total Monthly Payment is displayed");
			}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Total Monthly Payment is not displayed");
		}
		}
	
	@Test(priority=21)
	public void totalPaymentDisplayed() {
		hl=new HomeLoan(driver);
		hl.scrollTillTotalPaymentTable();
		BaseClass.getlogger().info("Scroll till total payment table");
		boolean displayed=hl.totalpaymentdisplayed();
		if(displayed==true) {
			Assert.assertTrue(true);
			BaseClass.getlogger().info("Total of all Payments is displayed");
	}
		else {
			Assert.fail();
			BaseClass.getlogger().info("Total of all Payments is not displayed");
		}
		}
	
	@Test(priority=22)
	public void scrollHomeLoanPage() {
		hl=new HomeLoan(driver);
		hl.scrollPage();
		BaseClass.getlogger().info("Scroll till home loan table");
	}
	
	@Test(priority=23)
	public void handletableheader() {
		hl=new HomeLoan(driver);
		hl.tableheader();
		BaseClass.getlogger().info("Handled the header table");
	}
	
	@Test(priority=24)
	public void table() {
		hl=new HomeLoan(driver);
		hl.yeartable();
		BaseClass.getlogger().info("Handled the table");
	}
	
	@Test(priority=25)
	public void pagetop() {
		hl=new HomeLoan(driver);
		hl.pagetop();
		BaseClass.getlogger().info("Scrolled till the top of the page");
		BaseClass.getlogger().info("*****Finished TC_002_HomeLoan *****");
	}

}
