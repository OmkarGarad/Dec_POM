package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import data_provider.configuration_file;

public class TestBase {
	
	static WebDriver  driver;
	
	static configuration_file cf=new configuration_file() ;
	
	public static WebDriver jbk_lauch_url() {
		
		System.setProperty("webdriver.chrome.driver",cf.getDriverPath());
		 driver = new ChromeDriver();
		 driver.get("file:///C:/Users/Shree/Desktop/TestScript/Offline%20Website/Offline%20Website/index.html");
		 driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver amazon_lauch_url() {
	
		System.setProperty("webdriver.chrome.driver", cf.getDriverPath());
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/ref=nav_logo");
		 driver.manage().window().maximize();
		return driver;
	}
	

}
