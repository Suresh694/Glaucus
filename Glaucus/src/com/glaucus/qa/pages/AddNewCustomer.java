package com.glaucus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glaucus.qa.Base.TestBase;

public class AddNewCustomer extends TestBase{

	
	//Page Factory
	@FindBy(xpath="//input[contains(@id,'customerAddModalRef')]")
	WebElement customerRefNo;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalSales')]")
	WebElement salesChannel;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalCompany')]")
	WebElement companyName;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalfirstName')]")
	WebElement customerFirstName;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModallastName')]")
	WebElement customerLastName;
	
	@FindBy(xpath="//input[contains(@id,'custEmail')]")
	WebElement emailID;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalPhone')]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalAddress1')]")
	WebElement shippingaddressline1;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalAddress2')]")
	WebElement shippingaddressline2;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalAddress3')]")
	WebElement shippingaddressLine3;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalState')]")
	WebElement shippingstate;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalDistrict')]")
	WebElement shippingdistrict;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalCity')]")
	WebElement shippingcity;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalPIN')]")
	WebElement shippingpincode;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalGSTIN')]")
	WebElement shippingGSTIN;
	
	@FindBy(xpath="//input[contains(@id,'customerShippingAddressCode')]")
	WebElement shippingAddressCode;
	
	@FindBy(xpath="//*[@id='customerAddModalSameAddress']/div[1]")
	WebElement checkBoxforBilling;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalBAddress1')]")
	WebElement billingAddressLine1;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalBAddress2')]")
	WebElement billingAddressLine2;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalBAddress3')]")
	WebElement billingAddressLine3;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalBState')]")
	WebElement billingSate;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalBDistrict')]")
	WebElement billingDistrict;
	
	@FindBy(xpath="//select[contains(@id,'customerAddModalBCity')]")
	WebElement billingCity;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalBPIN')]")
	WebElement billingPincode;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalBGSTIN')]")
	WebElement billingGSTIN;
	
	@FindBy(xpath="//input[contains(@id,'customerBillingAddressCode')]")
	WebElement billingAddressCode;
	
	@FindBy(xpath="//input[contains(@id,'customerAddModalRW')]")
	WebElement returnWindowDays;
	
	@FindBy(xpath="//button[contains(@id,'customerAddModalSubmit')]")
	WebElement addNewCustomerButton;
	
	@FindBy(xpath="//button[contains(@id,'customerAddModalCancel2')]")
	WebElement cancelAddNewCustomerButton;
	
	@FindBy(xpath="//*[@id='customerAddModalCancel1']/span[1]")
	WebElement closebutton;
	
	public AddNewCustomer() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
}
