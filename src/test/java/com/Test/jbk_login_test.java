package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.jbk_login_page;


public class jbk_login_test {
	
	WebDriver driver;	
    jbk_login_page lp = null;
  
	@Test	
	public void jbk_launch() {	
	driver=	TestBase.jbk_lauch_url();
	lp = new jbk_login_page(driver);
	lp.valid_credentials();
		
		
	}

}
