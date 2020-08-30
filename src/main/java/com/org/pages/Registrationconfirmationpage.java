package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrationconfirmationpage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(partialLinkText = "Sign-In")
	private WebElement signintxt;
	
	@FindBy(linkText = "Flights")
	private WebElement flightstxt;
	
	private Registrationconfirmationpage(WebDriver driver) {
		   this.driver = driver;
		   this.wait = new WebDriverWait(driver, 30);
		   PageFactory.initElements(driver, this);
	}

	public void clickflights() {
		this.wait.until(ExpectedConditions.visibilityOf(signintxt));
		this.flightstxt.click();
	}
	
	
}
