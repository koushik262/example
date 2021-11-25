	package Acadamy;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.landingPage;
import resources.base;

public class hOMEpAGE extends base{
	
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		
		
		
		
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException {
		
		driver.get(p.getProperty("url"));
		
		
		landingPage lp=new landingPage(driver);
		lp.getLogin().click(); 
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
	

		lp.getLoginTo().click();
		

		
	}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[2][3];
		data[0][0]="nonrestricted@fdv.com";
		data[0][1]="1235348";
		data[0][2]="sdfvwvsd";
		
		data[1][0]="restricted@fdv.com";
		data[1][1]="123534";
		data[0][2]="sdvsd";

		return data;
				
}
//	@AfterTest
//	public void teardown() {
//		driver.close();
//		
//		
//	}
	

}
