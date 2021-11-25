package Acadamy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;


public class validateNavBar extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());

	
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		driver.get(p.getProperty("url"));
		
		
		
	}
	@Test
	public void basePageNavigation() throws IOException {
		
	
		
		landingPage lp=new landingPage(driver);
//		lp.getLogin().click(); 
//		lp.getEmail().sendKeys(username);
//		lp.getPassword().sendKeys(password);
//		System.out.println(text);
//
//		lp.getLoginTo().click();
		
		Assert.assertTrue(lp.getmenu().isDisplayed());
		log.info("navigation bar success");
		
		
		
			
		
		
	}
/*	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricted@fdv.com";
		data[0][1]="1235348";
		data[0][2]="sdfvwvsd";
		
		data[1][0]="restricted@fdv.com";
		data[1][1]="123534";
		data[0][2]="sdvsd";

		return data;
		
		
		
	}*/
	@AfterTest
	public void teardown() {
		driver.close();
	
		
		
	}

}
