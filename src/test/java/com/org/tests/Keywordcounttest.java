package com.org.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.org.base.TestBase;
import com.org.pages.Searchpages;

public class Keywordcounttest extends TestBase {
	
	//private WebDriver driver;
	
	
	@Test
	@Parameters({"Keyword"})
	public void countvideos(String Keyword) {
		Searchpages searchpages = new Searchpages(driver);
		searchpages.Gotoduckduckgo();
		searchpages.enterkeyword(Keyword);
		searchpages.getvideoscount();
		
	}
	

}
