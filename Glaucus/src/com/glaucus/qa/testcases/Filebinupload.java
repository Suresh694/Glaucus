package com.glaucus.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filebinupload {
	
public static WebDriver driver;
	
	//Passed
	public void upload() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Suresh Das\\eclipse-workspace\\Glaucus\\Drivers\\chromedriverupdated.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://filebin.net/");
		
		WebElement uploadButton=driver.findElement(By.xpath("//input[contains(@id,'fileField')]"));
		uploadButton.sendKeys("E:\\Eclipse Installation.rtf");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filebinupload obj=new Filebinupload();
		obj.upload();

	}

}
