package com.glaucus.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glaucus.qa.Base.TestBase;

public class LoginPage extends TestBase {
	
	LoginPage loginPage;
	OrdersPage orderPage;
	//PageFactory---Object Repository
	
	@FindBy(xpath="//input[contains(@id,'loginEmail')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@id,'loginPassword')]")
	WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Please enter valid email address.')]")
	WebElement wrongEmail;
	
	@FindBy(xpath="//button[contains(@id,'loginSubmit')]")
	WebElement loginFinal;
	
	@FindBy(xpath="//button[contains(@id,'getClients')]")
	WebElement submitEmail;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage submitEmail(String usr) {
		username.sendKeys(usr);	
		submitEmail.click();
		return new LoginPage();
	}
	
	public OrdersPage login(String pass) {
		
		password.sendKeys(pass);
		loginFinal.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		return new OrdersPage();
				
	}
	public Boolean wrongEmailValidationFunction() {
		loginPage=new LoginPage();
		loginPage.submitEmail(prop.getProperty("wrongemail"));
		return wrongEmail.isDisplayed();
		
	}
	
	public Boolean wrongPassWordValidationFunction() {
		loginPage=new LoginPage();
		orderPage=new OrdersPage();
		loginPage.submitEmail(prop.getProperty("username"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		loginPage.login(prop.getProperty("wrongPassword"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement order=orderPage.order;
		return order.isDisplayed();
		
	}
	
	public void finalLogin() {
		loginPage=new LoginPage();
		loginPage.submitEmail(prop.getProperty("username"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		loginPage.login(prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

}
