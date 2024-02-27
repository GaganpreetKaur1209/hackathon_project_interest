package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarLoan extends basePage{
	
	static int rupees;
	
	public CarLoan(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='car-loan']/a")
	WebElement carloan;
	
	@FindBy(id="loanamount")
	WebElement loanamount;

	@FindBy(id="loanterm")
	WebElement loanterm;
	
	@FindBy(xpath="//*[text()='EMI in Arrears ']")
	WebElement emiArrears;
	
	@FindBy(xpath="//*[@id='loaninterestslider']/span")
	WebElement scrollbar;
	
	@FindBy(xpath="//*[@id=\"emitotalinterest\"]/p/span")
	WebElement totalpayableinterest;
	
	@FindBy(xpath="//*[@id='emitotalamount']/p/span")
	WebElement totalpayment;
	
	@FindBy(xpath="//*[@id='loanamountslider']/span")
	WebElement amountscrollscale;
	
	@FindBy(xpath="//*[@id='loaninterestslider']/span")
	WebElement interestscrollscale;
	
	@FindBy(xpath="//*[@id='loantermslider']/span")
	WebElement tenurescrollscale;
	
	@FindBy(id="emipaymenttable")
	WebElement table;
	
	@FindBy(id="year2024")
	WebElement year;
	
	@FindBy(xpath="//*[@id='monthyear2024']/td/div/table/tbody/tr[1]/td[2]")
	WebElement paEMI;
	
	@FindBy(xpath="//*[@id='monthyear2024']/td/div/table/tbody/tr[1]/td[3]")
	WebElement interestEMI;
	
	@FindBy(id="leschemewrapper")
	WebElement emischeme;
	
	@FindBy(xpath="//*[text()='EMI in Advance ']")
	WebElement emiAdvance;
	
	@FindBy(id="navbarNavDropdown")
	WebElement pagetop;
	
	public void carLoan()
	{
		carloan.click();
	}
	
	public String checkBeforeAmountScale() {
		String beforeamountscale= amountscrollscale.getAttribute("style");
		return beforeamountscale;
	}
	
	public void clearLoanAmount()
	{
		loanamount.clear();
	}
	
	public void setLoanAmount()
	{
		loanamount.sendKeys("15,00,000");
	}
	
	public String checkAfterAmountScale() {
		String afteramountscale= amountscrollscale.getAttribute("style");
		return afteramountscale;
	}
	
	
	public String checkBeforeInterestScale() {
		String beforeinterestscale= interestscrollscale.getAttribute("style");
		return beforeinterestscale;
	}
	
	public void setInterest()
	{
		Actions act =new Actions(driver);
		act.dragAndDropBy(scrollbar,40, 50).perform();
	}
	
	public String checkAfterInterestScale() {
		String afterinterestscale= interestscrollscale.getAttribute("style");
		return afterinterestscale;
	}
	
	public String checkBeforeTenureScale() {
		String beforetenurescale= tenurescrollscale.getAttribute("style");
		return beforetenurescale;
	}
	
	public void clearLoanTenure()
	{
		loanterm.clear();
	}
	
	public String checkAfterTenureScale() {
		String aftertenurescale= tenurescrollscale.getAttribute("style");
		return aftertenurescale;
	}
	
	public void clickEmiArrears() {
		emiArrears.click();
	}
	
	public void scrollDownArrearsPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", table);
	}
	
	public String arrearsInterest() {
		year.click();
		String interest=interestEMI.getText();
		return interest;
	}
	
	public String arrearsPrincipalAmount() {
		String principalamount=paEMI.getText();
		return principalamount;
	}

	public void scrollUpEmiPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", emischeme);
	}
	
	public void clickEmiAdvance() {
		emiAdvance.click();
	}
	
	public void scrollDownAdvancePage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", table);
	}
	
	public String advanceInterest() {
		year.click();
		String interest=interestEMI.getText();
		return interest;
	}
	
	public String advancePrincipalAmount() {
		String principalamount=paEMI.getText();
		return principalamount;
	}
	
	public void scrollUpPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", pagetop);
	}
}
