package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class amazon_login_page {
	
	WebDriver driver;
	
	public amazon_login_page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver	, this);
	}
	
	
	@FindBy(xpath="//a[starts-with(text(),'Mobiles')]")
	private WebElement mobiletab;
	
	public void getmobiletab() {
		mobiletab.click();
	}
	
	
	@FindBys(@FindBy(css="div.DealCardDynamic-module__cardImageVertical_1IizpyChuPf_yh4IHtuaWk"))
	private List<WebElement> top_deals;
	
	
	
	
	
}
