package data_provider;

import java.io.File;
import java.sql.Time;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
	
	
	
	public static String capture(WebDriver driver, String name) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	File Dest = new File("src/../ErrImages/" + System.currentTimeMillis()+ ".png");
		File Dest = new File("src/../ErrImages/" + name + ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		
		//return null;
		return errflpath;
	}
	

}
