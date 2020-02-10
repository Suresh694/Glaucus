package com.glaucus.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.glaucus.qa.Base.TestBase;

public class SalesOrder extends TestBase {

	@FindBy(xpath="//h4[contains(text(),'Sale Order')]")
	WebElement saleOrderHeading;
	
	@FindBy(xpath="//button[contains(text(),'Add Order')]")
	WebElement addOrder;
	
	SalesOrder salesorder;
	WebDriverWait wait=new WebDriverWait(driver, 10);
	
	public SalesOrder() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyHeading() {
		return saleOrderHeading.isDisplayed();
	}
	
	
	
	public void clickOnAddOrderTest() {
		try {
			addOrder.click();
			//wait.until(ExpectedConditions.visibilityOf(addOrder));
			Thread.sleep(7000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//return new AddOrder();
		
	}
	
}
