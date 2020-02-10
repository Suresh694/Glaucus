package com.glaucus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.glaucus.qa.Base.TestBase;

public class ListOfCustomers extends TestBase {
	
	//PageFactory
	
	@FindBy(xpath="//*[@id='productTable']/tbody[1]/tr/td[4]/button")
	WebElement selectCustomer;
	
	@FindBy(xpath="//*[@id='dialogmastercustomer']/div/form/div/div[3]/button")
	WebElement cancelbutton;
	
	@FindBy(xpath="//*[@id='dialogmastercustomer']/div/form/div/div[1]/button/span[1]")
	WebElement closeButton;

}
