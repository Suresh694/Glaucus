package com.glaucus.qa.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.glaucus.qa.Base.TestBase;

public class AddOrder extends TestBase{
	
	 LoginPage loginpage;
	 OrdersPage orderPage;
	 SalesOrder salesOrderpage;
	 AddOrder addorderPage;
	//Object Repository
	
	@FindBy(xpath="//a[contains(text(),'Single Order')]")
	WebElement singleOrder;
	
	@FindBy(xpath="//a[contains(text(),'Bulk Order')]")
	WebElement bulkOrder;
	
	@FindBy(xpath="//input[contains(@id,'SOAddRef1')]")
	WebElement refNo;
	
	@FindBy(xpath="//select[contains(@name,'channelObject')]")
	WebElement channel;
	
	@FindBy(xpath="//*[@id='tabOne']/div/div[2]/div[1]/span/span")
	WebElement mandatoryChannelSymbol;
	
	@FindBy(xpath="tableCustomerFullName")
	WebElement customerName;
	
	@FindBy(xpath="//button[contains(@id,'SOAddCMore')]")
	WebElement seeallCustomerButton;
	
	@FindBy(xpath="//*[@id='productTable']/tbody/tr[1]/td[1]")
	WebElement  seeallCustomerNames;
	
	@FindBy(id="SOAddCAdd")
	WebElement addCustomerButton;
	
	@FindBy(xpath="//select[contains(@name,'deliveryAddressName')]")
	WebElement shippingAddress;
	
	@FindBy(xpath="//input[contains(@id,'products_value')]")
	WebElement addProduct;
	
	@FindBy(xpath="//button[contains(@id,'SOAddSMore')]")
	WebElement seeAllOrdersButtton;
	
	@FindBy(xpath="//*[@id='SOSSelectH']/md-checkbox/div[1]")
	WebElement sameBillingaddressCheckbox;
	
	@FindBy(xpath="//select[contains(@name,'billingAddress')]")
	WebElement BillingAddressButton;
	
	@FindBy(xpath="//*[@id='SOAddBAAdd']")
	WebElement addBillingAddressButton;
	
	@FindBy(xpath="//*[@id='SOAddPT']")
	WebElement paymentTypeDropdown;
	
	@FindBy(xpath="//textarea[contains(@name,'remarksString')]")
	WebElement remarks;
	
	@FindBy(xpath="//*[@id='SOAddCancel1']/span[1]")
	WebElement closeButton;
	
	@FindBy(xpath="//button[contains(@id,'SOAddCancel2')]")
	WebElement cancelButton;
	
	@FindBy()
	WebElement salesChannelDate;
	
	@FindBy()
	WebElement shippingdate;
	
	@FindBy()
	WebElement deliveryDate;
	
	public AddOrder() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void closeAddorderPage() {
		loginpage.finalLogin();
		/*loginpage.submitEmail(prop.getProperty("username"));
		loginpage.login(prop.getProperty("password"));*/
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		orderPage=new OrdersPage();
		orderPage.clickOrder();
		orderPage.clickSalesOrder();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		salesOrderpage=new SalesOrder();
		salesOrderpage.clickOnAddOrderTest();				
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		addorderPage=new AddOrder();
		addorderPage.closeAddOrder();
	}
	
	public void cancelButttonFunction() {
		
		loginpage.finalLogin();
		/*loginpage.submitEmail(prop.getProperty("username"));
		loginpage.login(prop.getProperty("password"));*/
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		orderPage=new OrdersPage();
		orderPage.clickOrder();
		orderPage.clickSalesOrder();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		salesOrderpage=new SalesOrder();
		salesOrderpage.clickOnAddOrderTest();				
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		addorderPage=new AddOrder();
		addorderPage.clickCancelButton();
		
	}
	public void clikToSeeAllCustomerButton() {
		
		loginpage.finalLogin();
		/*loginpage.submitEmail(prop.getProperty("username"));
		loginpage.login(prop.getProperty("password"));*/
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		orderPage=new OrdersPage();
		orderPage.clickOrder();
		orderPage.clickSalesOrder();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		salesOrderpage=new SalesOrder();
		salesOrderpage.clickOnAddOrderTest();				
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		addorderPage=new AddOrder();
		addorderPage.clickToseeAllCustomerFunction();
	}
	
	public void seeallCustomerNames() {
		/*loginpage =new LoginPage();*/
		loginpage.finalLogin();
		/*loginpage.submitEmail(prop.getProperty("username"));
		loginpage.login(prop.getProperty("password"));*/
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		orderPage=new OrdersPage();
		orderPage.clickOrder();
		orderPage.clickSalesOrder();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		salesOrderpage=new SalesOrder();
		salesOrderpage.clickOnAddOrderTest();				
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		addorderPage=new AddOrder();
		addorderPage.clickToseeAllCustomerFunction();
		addorderPage.clickToseeAllCustomerFunction();
		//String xpathof= seeallCustomerNames.getText();
		List<WebElement> allcustomer= driver.findElements(By.xpath("//*[@id='productTable']/tbody/tr[1]/td[1]"));
		List<WebElement> all=(List<WebElement>) seeallCustomerNames;
		for (WebElement customer : allcustomer) {
			System.out.println("Customer name is:- "+customer.getText());
		}
		System.out.println("Total Number of Customers:- "+allcustomer.size());
		
	}
	
	public boolean validateSingleOrderavailable()
	{
		return singleOrder.isDisplayed();
		
	}
	 
	public boolean validateSingleOrderClickable()
	{
		return singleOrder.isSelected();
	}
	
	public boolean validateBulkOrderAvailable() {
		return bulkOrder.isDisplayed();
	}
	public boolean validateBulkOrderClickable() {
		
		return bulkOrder.isEnabled();
	}
	public boolean validatemandatoryField()
	{
		return mandatoryChannelSymbol.isDisplayed();
	}
	
	public void closeAddOrder() {
		closeButton.click();
	}
	
	public void clickCancelButton() {
		cancelButton.click();
	}
	public void clickToseeAllCustomerFunction() {
		seeallCustomerButton.click();
	}
	
	
	
	
	
	
}
