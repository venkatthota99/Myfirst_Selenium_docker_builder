package com.org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrationpage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="firstName")
	private WebElement firstnametxt;
	
	@FindBy(name = "lastName")
	private WebElement lastnametxt;
	
	@FindBy(name = "email")
	private WebElement usernametxt;
	
	@FindBy(name = "password")
	private WebElement passwordtxt;
	
	@FindBy(name = "confirmPassword")
	private WebElement confirmpasswordtxt;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	
	public Registrationpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
		
	}
	
	public void Goto() {
		this.driver.get("http://demo.guru99.com/test/newtours/register.php");
		this.wait.until(ExpectedConditions.visibilityOf(this.firstnametxt));
		
	}
	
	public void Enterdetails(String Firstname, String Lastname) {
		this.firstnametxt.sendKeys(Firstname);
		this.lastnametxt.sendKeys(Lastname);
	}
	
    public void Entercredentials(String Username, String Password) {
    	
       this.usernametxt.sendKeys(Username);
       this.passwordtxt.sendKeys(Password);
       this.confirmpasswordtxt.sendKeys(Password);
         
    }
    
      public void submit() {
    	  this.submit.click();
      }
}

















