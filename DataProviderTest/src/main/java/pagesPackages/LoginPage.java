package pagesPackages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath= "//input[@id='Sign in name']")
	
	WebElement phone;
	
	@FindBy(xpath="//input[@id='password']")
	
	WebElement password;
	
	
	
	
public void login(String mobno, String pasrd) {
	
	phone.sendKeys(mobno);
	password.sendKeys(pasrd);
	
	
	
	
}
}