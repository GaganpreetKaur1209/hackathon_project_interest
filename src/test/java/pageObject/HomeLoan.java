package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtil;

public class HomeLoan extends basePage{

	public HomeLoan(WebDriver driver) {
		super(driver);
	}
	
	static int row=0;
	static String file_path = System.getProperty("user.dir") + ".\\testData\\HackathonData.xlsx";
		
	@FindBy(id="menu-item-dropdown-2696")
	WebElement calculatorbtn;
	
	@FindBy(id="menu-item-3294")
	WebElement homeloanEMI;
	
	@FindBy(id="homeprice")
	WebElement HV;
	
	@FindBy(id="downpayment")
	WebElement downpayment;
	
	@FindBy(id="homeloaninsuranceamount")
	WebElement LI;
	
	@FindBy(id="homeloaninterest")
	WebElement interest;
	
	@FindBy(id="homeloanterm")
	WebElement loantenure;
	
	@FindBy(id="onetimeexpenses")
	WebElement onetimeexpenses;
	
	@FindBy(id="propertytaxes")
	WebElement propertytaxes;
	
	@FindBy(id="homeinsurance")
	WebElement homeinsurance;
	
	@FindBy(id="maintenanceexpenses")
	WebElement maintenanceexpenses;
	
	@FindBy(id="paymentschedule")
	WebElement paymentschedule;
	
	@FindBy(xpath="//*[@id=\"paymentschedule\"]/table/tbody/tr[1]/th")
	List<WebElement> tableheadercolum;
	
	@FindBy(xpath="//*[@id=\"paymentschedule\"]/table/tbody/tr")
	List<WebElement> yeartable;
	
	@FindBy(id="menu-item-dropdown-2696")
	WebElement pagetop;
	
	@FindBy(id="monthlyhomeloanpaymentsummary")
	WebElement monthlypayment;
	
	@FindBy(xpath="//*[text()=\"Total Monthly Payment\"]")
	WebElement totalmonthlypayment;
	
	@FindBy(id="totalhomeloanpaymentbreakup")
	WebElement totalPaymenttable;
	
	@FindBy(xpath="//*[text()=\"Total of all Payments\"]")
	WebElement totalpayment;
	
	public void clickcalculatorbtn() {
		calculatorbtn.click();
	}
	
	public void clickhomeloanbtn() {
		homeloanEMI.click();
	}
	
	public void setHomeValue() {
		HV.clear();
		HV.sendKeys("20,00,000");
	}
	
	public void setDownpayment() {
		downpayment.clear();
		downpayment.sendKeys("30");
	}
	
	public void setLoanInsurance() {
		LI.clear();
		LI.sendKeys("12,000");
	}
	
	
	public void setInterest() {
		interest.clear();
		interest.sendKeys(Keys.chord(Keys.CONTROL,"a"),"9.5"); 
	}
	
	public void setLoanTenure() {
		loantenure.clear();
		loantenure.sendKeys(Keys.chord(Keys.CONTROL,"a"),"10");
	}
	
	public void setOneTimeExpenses() {
		onetimeexpenses.clear();
		onetimeexpenses.sendKeys("12");
	}
	
	public void setPropertyTaxes() {
		propertytaxes.clear();
		propertytaxes.sendKeys("0.3");
	}
	
	public void setHomeInsurance() {
		homeinsurance.clear();
		homeinsurance.sendKeys("0.75");
	}
	
	public void setMaintenanceexpenses() {
		maintenanceexpenses.clear();
		maintenanceexpenses.sendKeys("3,000");
	}
	
	public void scrollTillMonthlyTable() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",monthlypayment);
	}
	
	public boolean monthlypaymentdisplayed() {
		boolean monthlypaymentdisplayed=totalmonthlypayment.isDisplayed();
		return monthlypaymentdisplayed;
	}
	
	public void scrollTillTotalPaymentTable() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",totalPaymenttable);
	}
	
	public boolean totalpaymentdisplayed() {
		boolean totalpaymentdisplayed=totalpayment.isDisplayed();
		return totalpaymentdisplayed;
	}
	
	public void scrollPage() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",paymentschedule);
	}
	
	public void tableheader() {
		int cell=0;
		for(int i=0;i<tableheadercolum.size();i++) 
		{
			String heading=tableheadercolum.get(i).getText();
				try {
					ExcelUtil.setCellData(file_path,"Sheet1",row,cell,heading);
					cell++;
				}
				catch(Exception e) {
					
				}
		}
		row++;
	}
	
	public void yeartable() {
		//because we are not taking heading
		for(int i=2;i<=yeartable.size();i=i+2) {
				int cell=0;
			for(int j=1;j<=tableheadercolum.size();j++) 
			{
				String info=driver.findElement(By.xpath("//*[@id=\"paymentschedule\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		        	try {
						ExcelUtil.setCellData(file_path,"Sheet1",row,cell,info);
						cell++;
					}
					catch(Exception e) {
						
					}
			}
			row++;
			}
		}
	
	public void pagetop() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", pagetop);
	}
	}
	

