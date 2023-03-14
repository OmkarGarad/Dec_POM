package data_provider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class TestBase {
	
	static WebDriver  driver;
	
	static configuration_file cf = new configuration_file();
	
	
	
	public static WebDriver jbk_lauch_url() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",cf.getDriverPath());
		 driver = new ChromeDriver(options);
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
