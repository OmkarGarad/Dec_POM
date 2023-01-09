package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class amazon_login_page {
	
	WebDriver driver;
	
	public amazon_login_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver	, this);
	}
	
}
