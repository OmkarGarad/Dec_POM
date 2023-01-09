package com.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Pages.amazon_login_page;

import data_provider.configuration_file;

public class amazon_login_test {
	
	WebDriver driver;
	amazon_login_page alp;

	
	@Test
 public void amzon_launch() {
	driver= TestBase.amazon_lauch_url();
	
 }

}
