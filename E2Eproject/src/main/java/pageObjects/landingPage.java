package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {

	
	public  WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	By email=By.cssSelector("[id='user_email']");
	By password=By.cssSelector("[type='password']");
	By login=By.cssSelector("[type='submit']");
	By title=By.xpath("//*[@id=\"content\"]/div/div");
	By menu=By.cssSelector("#homepage > header > div.navbar.navbar-default.navbar-static-top > div > nav > ul");
	

	



	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}





	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(signin);
	}
	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		// TODO Auto-generated method stub
		return driver.findElement(password);
	}
	public WebElement getLoginTo() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}
	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}
	
	public WebElement getmenu() {
		// TODO Auto-generated method stub
		return driver.findElement(menu);
	}
	
	
	
}
