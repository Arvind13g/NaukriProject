package TestClass_Pakages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import LoginScenario.NaukriHomepage;
import LoginScenario.NaukriLoginpage;
import LoginScenario.NaukriLogout;
import LoginScenario.NaukriUpdateResume;
import utilities.Utilty;

public class UpdateResume  {
	
	WebDriver driver ;
	NaukriLoginpage naukriLoginpage ;
	NaukriHomepage naukriHomepage ;
	NaukriUpdateResume naukriupdateResume ;
	NaukriLogout naukriLogout ;

	int testID ;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "F:\\FF\\geckodriver.exe");
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createObject() {
		naukriLoginpage = new NaukriLoginpage (driver) ;
		naukriHomepage = new NaukriHomepage (driver) ;
	    naukriupdateResume = new NaukriUpdateResume (driver) ;
		naukriLogout = new NaukriLogout (driver) ;
	}
	
	@BeforeMethod
	public void loginUserAccount() throws InterruptedException {
		driver.get("https://www.naukri.com/");
		naukriLoginpage.clickOnLogin();
		naukriLoginpage.sendNaukriUsername("arvindgaikwad0013@gmail.com");
		naukriLoginpage.sendNaukriPassword("arvindgaikwad0013@gmail.com");
		naukriLoginpage.clickOnLoginButton();
		Thread.sleep(2000);
		
		naukriHomepage.clickOnProfileimg();
		Thread.sleep(2000);
		
		naukriHomepage.clickOnViewAndUpdate();
		naukriupdateResume.clickOnDeleteIcon();
		Thread.sleep(1000);
		
		naukriupdateResume.clickOnDeleteButton();
		naukriupdateResume.clickOnUploadResume();
		Thread.sleep(10000);
	}
	
//	@Test
//	public void verifyLoginPage() {
//		testID = 100 ;
//		String link = naukriLoginpage.verifyNaukriLoginpageLink();
//		if(link.equals("https://www.naukri.com/"))
//		{
//			System.out.println("HomePage link is "+ link);
//		}
//		else
//		{
//			Assert.fail();
//		}	
//	}
//	
//	@Test
//	public void verifyDashboard() {
//		testID = 200 ;
//		String link = naukriHomepage.verifyNaukriHomepageLink();
//		if(link.equals("https://www.naukri.com/mnjuser/homepage"))
//		{
//			System.out.println("HomePage link is "+ link);
//		}
//		else
//		{
//			Assert.fail();
//		}	
//	}
	
	@Test
	public void verifyUpdatepage() {
		testID = 300 ;
		String link = naukriupdateResume.verifyNaukriUpdatePage();
		if(link.equals("https://www.naukri.com/mnjuser/profile?id=&altresid&action=modalOpen"))
		{
			System.out.println("UpdatePage link is==> "+ link);
		}
		else
		{
			Assert.fail();
		}	
	}
	
	

	
//	@AfterMethod
//	public void logoutUserAccount(ITestResult result) throws InterruptedException, IOException {
//		if(ITestResult.FAILURE == result.getStatus())
//		{
//			Utilty.takeScreenshot(driver, testID);
//		}
//		Thread.sleep(10000);
//		naukriLogout.clickOnProfileIcon();
//		naukriLogout.clickOnLogout();
//	}
	
	@AfterMethod
	public void logoutUserAccount() throws InterruptedException {
		naukriLogout.clickOnProfileIcon();
        Thread.sleep(2000);
		naukriLogout.clickOnLogout();
	}
	
	@AfterClass
	public void clearObjects() {
		naukriLoginpage = null ;
		naukriHomepage = null ;
	    naukriupdateResume = null ;
		naukriLogout = null ;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.quit();
		driver = null;
		System.gc();
	}
	
}
