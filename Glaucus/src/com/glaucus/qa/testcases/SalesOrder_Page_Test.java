package com.glaucus.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glaucus.qa.Base.TestBase;
import com.glaucus.qa.pages.AddOrder;
import com.glaucus.qa.pages.LoginPage;
import com.glaucus.qa.pages.OrdersPage;
import com.glaucus.qa.pages.SalesOrder;

public class SalesOrder_Page_Test extends TestBase{
	LoginPage loginpage;
	OrdersPage orderpage;
	SalesOrder salesOrderpage;
	AddOrder addOrdepage;
	
	public SalesOrder_Page_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();//Calling the Initialization method from the TestBase
		loginpage =new LoginPage();
		loginpage=loginpage.submitEmail(prop.getProperty("username"));
		orderpage=loginpage.login(prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);		
	}
	
	@Test(enabled=false)
	public void AddOrderButtonClickTest() {
		orderpage=orderpage.clickOrder();
		salesOrderpage=orderpage.clickSalesOrder();
		salesOrderpage.clickOnAddOrderTest();
		
	}
	@AfterMethod
	public void closedriver() {
		driver.quit();
	}

}
