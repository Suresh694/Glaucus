package com.glaucus.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.glaucus.qa.Base.TestBase;
import com.glaucus.qa.pages.AddOrder;
import com.glaucus.qa.pages.LoginPage;
import com.glaucus.qa.pages.OrdersPage;
import com.glaucus.qa.pages.SalesOrder;

public class AddOrder_Page_Test extends TestBase{
	LoginPage loginpage;
	OrdersPage orderPage;
	SalesOrder salesOrderpage;
	
	AddOrder addorderPage=new AddOrder();
	
	public AddOrder_Page_Test() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage=new LoginPage();
		orderPage=new OrdersPage();
		salesOrderpage=new SalesOrder();
		addorderPage=new AddOrder();
	}
	
	@Test(enabled=false)
	public void closeAddOrderTest() {
		
		addorderPage.closeAddorderPage();
	}
	
	@Test(enabled=false)
	public void checkCancelButton() {
		
		addorderPage.cancelButttonFunction();
	}
	
	@Test(enabled=false)
	public void checkSeeAllCustomerButton() {
		
		addorderPage.clikToSeeAllCustomerButton();
	}
	
	@Test(enabled=false)
	public void seeAllCustomerNamesTest() {
		
		addorderPage.seeallCustomerNames();
	}
	
	@AfterMethod
	public void closeDriver() {
		
	}
	
	/*@AfterTest
	public void closeAllDriver() {
		driver.close();
	}*/
}
