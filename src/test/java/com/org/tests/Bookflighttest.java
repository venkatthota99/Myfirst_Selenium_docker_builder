package com.org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.org.base.TestBase;
import com.org.pages.Registrationpage;


public class Bookflighttest extends TestBase {
	
	//private WebDriver driver;
	
	
	
	@Test
	public void Registrationpagetest() {
		Registrationpage registrationpage = new Registrationpage(driver);
		registrationpage.Goto();
		registrationpage.Enterdetails("Selenium", "Docker");
		registrationpage.Entercredentials("Selenium", "Docker");
		registrationpage.submit();		
	}
	
	

}
