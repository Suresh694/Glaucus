package com.glaucus.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.glaucus.qa.Base.TestBase;
import com.glaucus.qa.pages.LoginPage;
import com.glaucus.qa.pages.OrdersPage;

@Listeners(com.glaucus.qa.util.Listener.class)
public class Login_Page_Test extends TestBase {

	LoginPage loginpage;
	OrdersPage orderpage;
	public Login_Page_Test() {
		super();		
	}
	
	@BeforeMethod
	public void setup() {
		initialization();//Calling the Initialization method from the TestBase
		loginpage =new LoginPage();
	}
	
	@Test(enabled=true)
	public void loginPageTest() {
			loginpage.finalLogin();
			/*loginpage=loginpage.submitEmail(prop.getProperty("username"));
			orderpage=loginpage.login(prop.getProperty("password"));*/
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	}
	@Test(enabled=true)
	public void wrongEmailValidationTest() {
		boolean flag=loginpage.wrongEmailValidationFunction();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Assert.assertTrue(flag, "Wrong EmailID");
	}
	@Test(enabled=true)
	public void wrongPasswordValidationTest() {
		boolean flag=loginpage.wrongPassWordValidationFunction();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Assert.assertFalse(flag);
	}
	
	@AfterMethod
	public void closedriver() {
		driver.quit();
	}
	
	
	
	
}
