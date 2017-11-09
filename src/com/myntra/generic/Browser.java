package com.myntra.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static WebDriver driver;
	
	public static void launchBrowser(){
		if(Constant.browser.equalsIgnoreCase("Firefox")){
			System.setProperty(Constant.browserDriver, Constant.browserDriverPath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else{
			System.setProperty(Constant.browserDriver, Constant.browserDriverPath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}

}
