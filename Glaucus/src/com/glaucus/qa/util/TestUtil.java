package com.glaucus.qa.util;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.glaucus.qa.Base.TestBase;

public class TestUtil extends TestBase {
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=20;
	
	public void takescreenshot(String name) {
		try {
		TakesScreenshot shot=(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		String Path=prop.getProperty("SucessScreenshotPath")+name+".png";
		File dest=new File(Path);
		
			FileUtils.copyFile(src, dest);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
