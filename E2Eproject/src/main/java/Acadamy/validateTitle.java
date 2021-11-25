package Acadamy;
import org.testng.annotations.Test;

import pageObjects.landingPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class validateTitle extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialised");
		
		driver.get(p.getProperty("url"));
		log.info("navigation to url");

		
		
		
	}
	@Test
	public void validatingTitle() throws IOException {
		
	
		
		landingPage lp=new landingPage(driver);
//		lp.getLogin().click(); 
//		lp.getEmail().sendKeys(username);
//		lp.getPassword().sendKeys(password);
//		System.out.println(text);
//
//		lp.getLoginTo().click();
		
		
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COU123RSES");
		log.info("successfully validating");

		
		
		
			
		
		
	}
//	@DataProvider
//	public Object[][] getData() {
//		
//		Object[][] data=new Object[2][3];
//		data[0][0]="nonrestricted@fdv.com";
//		data[0][1]="1235348";
//		data[0][2]="sdfvwvsd";
//		
//		data[1][0]="restricted@fdv.com";
//		data[1][1]="123534";
//		data[0][2]="sdvsd";
//
//		return data;
//		
//		
//		
//	}
//	
//	
//	@AfterTest
//	public void teardown() {
//		driver.close();
//		
//		
//		
//	}

}
