package com.org.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	
protected WebDriver driver;
	
@BeforeTest

public void Setup(ITestContext ctx) throws MalformedURLException {
	
	String host = "Localhost";
	DesiredCapabilities dc =  DesiredCapabilities.chrome();
	
	if(System.getProperty("Browser")!= null && 
			System.getProperty("Browser").equalsIgnoreCase("firefox")) {
		dc = DesiredCapabilities.firefox();
	}
	
	if(System.getProperty("HUB_Host")!= null){
		host=System.getProperty("HUB_HOST");
	}
	
	String Testname = ctx.getCurrentXmlTest().getName();
	
	String CompleteUrl = "http://" + host + ":4444/wd/hub";
	dc.setCapability("name", Testname);
	this.driver = new RemoteWebDriver(new URL(CompleteUrl), dc);
	
	
//ystem.setProperty("webdriver.chrome.driver","E:/Selenium 2020/chromedriver/chromedriver.exe");
//his.driver= new ChromeDriver();
}
	

}
