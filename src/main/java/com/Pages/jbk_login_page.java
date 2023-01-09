package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class jbk_login_page {
	
	WebDriver lpdriver;
	
	public jbk_login_page(WebDriver driver) {
		lpdriver=driver;
		PageFactory.initElements(lpdriver, this);
	}
	
	@FindBy(id="email") 
	private WebElement username;
	
	public void uname(String text) {
		username.sendKeys(text);
		//PageFactory.initElements(lpdriver, this);
	}
	
	
	public void valid_credentials() {
		uname("kiran@gmail.com");
	}
	
	@FindBys(@FindBy(xpath = "id"))
	List<WebElement> id;
	
	
	
	
	/*
	 * private WebElement username() { return lpdriver.findElement(By.id("email"));
	 * 
	 * }
	 * 
	 * public void get_username() { username().sendKeys("kiran@gmail.com");
	 * 
	 * }
	 */
	 
  
 

}
