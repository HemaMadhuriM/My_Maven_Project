package com.hema.madhuri.selenium.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampletest2 {
	@Test
	public static void demo1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	System.out.println("chrome Launched successfully");
	driver.manage().window().maximize();
	System.out.println("Window MAximized sucesfully");
	driver.get("http://www.facebook.com");
	System.out.println("opened the url"+driver.getCurrentUrl());
	
	
	Thread.sleep(5000);
	driver.close();
}
	}
