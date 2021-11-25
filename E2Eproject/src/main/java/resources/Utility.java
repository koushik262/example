package resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static void capture(WebDriver driver,String screenshotName){
		
		
		
		try {
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File sourse=ts.getScreenshotAs(OutputType.FILE);
			
			
			FileUtils.copyFile(sourse, new File("D:\\selinium\\selenium-programs\\Exceldriven\\screenshotss/"+screenshotName+".png"));
			System.out.println("Screenshot taken");
		
		} 
		
		
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while printing screen shot");
		}
		
		
		
		driver.quit();	
	}
	
	

}
