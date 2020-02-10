package com.glaucus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.glaucus.qa.Base.TestBase;

public class OrdersPage extends TestBase {

	//PageFactory--Object Repository By Suresh
	@FindBy(xpath="//div/a[contains(text(),'Orders')]")
	WebElement order;
	
	@FindBy(xpath="//span[contains(text(),'Sale Order')]")
	WebElement salesOrder;
	
	
	
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	public OrdersPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public OrdersPage clickOrder() {
		
			order.click();
			wait.until(ExpectedConditions.visibilityOf(salesOrder));
			return new OrdersPage();
		
	}
	public SalesOrder clickSalesOrder() {
		salesOrder.click();
		return new SalesOrder();
		
	}
	
	
}
