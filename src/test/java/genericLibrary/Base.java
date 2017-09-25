package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base extends CommonActions{
	
	public WebDriver driver ;
	public static ExtentReports eReports;
	public ExtentTest startTest;
	
	
	@BeforeMethod
	public void Applaunch()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}

	
	public String Snapshot() throws Exception
	{
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"src/SnapShots/screen_"+getDateTimeStamp()+".png";
		FileUtils.copyFile(screenshotAs, new File(path));
		return path;
	}
	

	public String getDateTimeStamp()
	{
		Date date = new Date();
		SimpleDateFormat sformat = new SimpleDateFormat("dd:mm:yy hh:mm:ss");
		return sformat.format(date);
	}

}