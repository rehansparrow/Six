package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pagesPackages.LoginPage;
import utilPackage.TestUtil;
import testBasePackage.TestBaseClass;

public class LoginTest extends TestBaseClass {
	
	TestUtil testutilobj;
	LoginPage loginobj;
	
	String sheetName = "Sheet1";
	
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		loginobj =new LoginPage();
	}
	
	@DataProvider
	public Object getTestData() {
		Object data[][]= TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test( dataProvider= "getTestData")
	public void loginTestCase(String mobno1, String pasrd) {
		loginobj.login(mobno1, pasrd );
		
		
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("Success");
	}
	

}
