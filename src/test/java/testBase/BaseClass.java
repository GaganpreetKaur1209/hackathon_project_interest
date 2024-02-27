package testBase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;


public class BaseClass {
	
public	static WebDriver driver;
static Logger logger;
public static Properties p;
	
	@BeforeTest
	@Parameters({"browser"})
public void setup(String br) throws IOException 
	{
		//loading properties file
		FileReader file=new FileReader(".//src/test/resources/config.properties");
		p=new Properties();
		p.load(file);
		
		//Loading log4j2 file
		
		
		//launching browser based on condition
		if(br.equalsIgnoreCase("chrome"))
		{
	    driver=new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
				}
		else 
		{
			System.out.println("No matching browser");
			return;
				}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	driver.get(p.getProperty("appURL"));
}

	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	public String captureScreen(String name) {
		 
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + name + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
	 }
	
	public static Logger getlogger() {
		logger=LogManager.getLogger();//Log4j
		return logger;
	}
	
}
