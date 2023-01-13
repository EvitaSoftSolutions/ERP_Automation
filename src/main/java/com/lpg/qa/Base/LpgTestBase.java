package com.lpg.qa.Base;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.apache.maven.surefire.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class LpgTestBase {
	
      public static WebDriver driver;
			 
			public void intializeBrowser(String browser) {
				if(browser.equalsIgnoreCase("chrome")) {
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\YOGESH\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe\\");
					 driver=new ChromeDriver();
				System.out.println("Chrome driver sucessfully open");
				}
				driver.get("http://myerp.mygasagency.com/");
			
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			}
			@AfterMethod
			public void screenshotCapture(ITestResult result) throws IOException {
				if(result.getStatus()==ITestResult.FAILURE) {
					Date d=new Date();
					String name = d.toString().replace(" ", "").replace(":", "")+".png";
					File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
					FileUtils.copyFile(source, new File("C:\\Users\\YOGESH\\Desktop\\Lpg Screenshot\\lpg"+name));
				}
			
			}
}

	

