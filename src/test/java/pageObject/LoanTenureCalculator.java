package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanTenureCalculator extends basePage{

	public LoanTenureCalculator(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="loan-tenure-calc")
	WebElement loantenurecalculator;
	
	@FindBy(id="loanamount")
	WebElement loanamount;
	
	@FindBy(id="loanamountslider")
	WebElement loanamountslider;

	@FindBy(id="loanemi")
	WebElement loanemi;
	
	@FindBy(id="loanemislider")
	WebElement loanemislider;

	@FindBy(id="loaninterest")
	WebElement loaninterest;
	
	@FindBy(id="loaninterestslider")
	WebElement loaninterestslider;

	@FindBy(id="loanfees")
	WebElement loanfees;
	
	@FindBy(id="loanfeesslider")
	WebElement loanfeesslider;
	
	public void clickloantenurecalculator() {
		loantenurecalculator.click();
	}

	public boolean checkLoanAmountTextBox() {
		boolean loanamountTextbox=loanamount.isEnabled();
		return loanamountTextbox;
	}
	
	public boolean checkLoanAmountSlider() {
		boolean loanamountSlider=loanamountslider.isEnabled();
		return loanamountSlider;
	}
	
	public boolean checkLoanEmiTextBox() {
		boolean loanemiTextbox=loanemi.isEnabled();
		return loanemiTextbox;
	}
	
	public boolean checkLoanEmiSlider() {
		boolean loanemiSlider=loanemislider.isEnabled();
		return loanemiSlider;
	}
	
	public boolean checkLoanInterestTextBox() {
		boolean loaninterestTextbox=loaninterest.isEnabled();
		return loaninterestTextbox;
	}
	
	public boolean checkLoanInterestSlider() {
		boolean loaninterestSlider=loaninterestslider.isEnabled();
		return loaninterestSlider;
	}
	
	public boolean checkLoanFeesTextBox() {
		boolean loanfeesTextbox=loanfees.isEnabled();
		return loanfeesTextbox;
	}
	
	public boolean checkLoanFeesSlider() {
		boolean loanfeesSlider=loanfeesslider.isEnabled();
		return loanfeesSlider;
	}
	
}
