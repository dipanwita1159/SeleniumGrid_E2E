package com.mohs10.base;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class StartBrowser {
	 public static WebDriver driver;
	 //set up report
	 public static ExtentReports extent;
	 public static ExtentTest parentTest;
	 public static ExtentTest childTest;
	 ExtentSparkReporter sparkReporter;
	
	 
	 @BeforeTest
	 public void generateReport()
	 {
		 sparkReporter = new ExtentSparkReporter("Report/AutomationReport.html");
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
	 }
	 
	 @BeforeMethod
	 public void methodName(Method method)
	 {
		parentTest = extent.createTest(method.getName()); 
	 }
	 @Test
	  public static WebDriver beforeClass(String Browser , String url) {
		  if(Browser.equals("firefox")) {
             driver= new FirefoxDriver();
         }
         else if(Browser.equals("chrome")) {
             driver=new ChromeDriver();
         }
         else if(Browser.equalsIgnoreCase("edge"))
         { 
       	  System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
             driver= new EdgeDriver();
         }
         driver.manage().window().maximize();
         driver.get(url);
         return driver;
			 
		 
	  }
	  @AfterClass public void afterClass() { driver.quit(); extent.flush(); }
	 

	}
