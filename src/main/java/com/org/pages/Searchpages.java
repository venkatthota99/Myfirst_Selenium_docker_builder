package com.org.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchpages {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="q")
	private WebElement Searchbuttontxt;
	
	@FindBy(id="search_button_homepage")
	private WebElement Searchbuttonhomepage;
	
	@FindBy(linkText="Videos")
	private WebElement videoslink;
	
	@FindBy(className="tile--vid")
	private List <WebElement> allvideos;
	
	public Searchpages(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}
		
	public void Gotoduckduckgo() {
			this.driver.get("https://duckduckgo.com/");
			this.wait.until(ExpectedConditions.visibilityOf(this.Searchbuttontxt));
		}
		
		
	public void enterkeyword(String keyword) {
		  this.Searchbuttontxt.sendKeys(keyword);
		  this.Searchbuttonhomepage.click();
	}
	
	public int getvideoscount() {
		this.videoslink.click();
		By by = By.className("tile--vid");
		this.wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by,0));
		int count = this.allvideos.size();
		System.out.println(count);
		return count;
	}
	
	}


	
	
	
	


