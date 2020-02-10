package com.glaucus.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.glaucus.qa.Base.TestBase;
import com.glaucus.qa.pages.LoginPage;
import com.glaucus.qa.pages.OrdersPage;
import com.glaucus.qa.pages.SalesOrder;
@Listeners(com.glaucus.qa.util.Listener.class)
public class Order_Page_Test extends TestBase{
	
	LoginPage loginpage;
	OrdersPage orderpage;
	SalesOrder salesorder;
	Login_Page_Test loginTest;
	
	public Order_Page_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();//Calling the Initialization method from the TestBase
		
	}
	
	@Test(enabled=false)
	public void ClickSaleOder() {
		//loginTest.loginPageTest();
		loginpage =new LoginPage();
		loginpage=loginpage.submitEmail(prop.getProperty("username"));
		orderpage=loginpage.login(prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		orderpage=orderpage.clickOrder();
		salesorder=orderpage.clickSalesOrder();
	}
	@AfterMethod
	public void closeDriver() {
		driver.quit();
	}
}
