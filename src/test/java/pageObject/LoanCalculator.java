package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanCalculator extends basePage{

	public LoanCalculator(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="menu-item-2696")
	WebElement calculatorbtn;
	
	@FindBy(id="menu-item-2423")
	WebElement loancalculatorbtn;
	
	@FindBy(id="emi-calc")
	WebElement emicalculator;
	
	@FindBy(id="loanamount")
	WebElement loanamount;
	
	@FindBy(id="loanamountslider")
	WebElement loanamountslider;
	
	@FindBy(id="loaninterest")
	WebElement loaninterest;
	
	@FindBy(id="loaninterestslider")
	WebElement loaninterestslider;
	
	@FindBy(id="loanterm")
	WebElement loanterm;
	
	@FindBy(id="loantermslider")
	WebElement loantermslider;
	
	@FindBy(id="loanfees")
	WebElement loanfees;
	
	@FindBy(id="loanfeesslider")
	WebElement loanfeesslider;
	
	@FindBy(xpath="//*[@id=\"loantermsteps\"]/span[2]/span")
	WebElement loanteanureyrs;
	
	@FindBy(xpath="//*[@id='ltermwrapper']/div[1]/div/div/div/div/div/label[2]")
	WebElement monthsbtn;
	
	@FindBy(xpath="//*[@id='loantermsteps']/span[2]/span")
	WebElement loanteanuremonths;
	
	public void clickcalculatorbtn() {
		calculatorbtn.click();
	}
	
	public void clickloancalculatorbtn() {
		loancalculatorbtn.click();
	}
	
	public void clickemicalculator() {
		emicalculator.click();
	}
	
	public boolean checkLoanAmountTextBox() {
		boolean loanamountTextBox=loanamount.isEnabled();
		return loanamountTextBox;
	}
	
	public boolean checkLoanAmountScale() {
		boolean loanamountScale=loanamountslider.isEnabled();
		return loanamountScale;
	}
	
	public boolean checkLoanInterestTextBox() {
		boolean loaninterestTextBox=loaninterest.isEnabled();
		return loaninterestTextBox;
	}
	
	public boolean checkLoanInterestScale() {
		boolean loaninterestScale=loaninterestslider.isEnabled();
		return loaninterestScale;
	}
	
	public boolean checkLoanTermTextBox() {
		boolean loantermTextBox=loanterm.isEnabled();
		return loantermTextBox;
	}
	
	public boolean checkLoanTermScale() {
		boolean loantermsliderScale=loantermslider.isEnabled();
		return loantermsliderScale;
	}
	
	public boolean checkLoanFeesTextBox() {
		boolean loanfeesTextBox=loanfees.isEnabled();
		return loanfeesTextBox;
	}
	
	public boolean checkLoanFeesScale() {
		boolean loanfeessliderScale=loanfeesslider.isEnabled();
		return loanfeessliderScale;
	}
	
	public boolean checkEMIscale() {
		String yrs=loanteanureyrs.getText();
		int years=Integer.parseInt(yrs);
		monthsbtn.click();
		String mnths=loanteanureyrs.getText();
		int months=Integer.parseInt(mnths);
		if(years==months) 
			return false;
		return true;
	}


}
