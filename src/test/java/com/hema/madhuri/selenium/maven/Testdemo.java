package com.hema.madhuri.selenium.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdemo {
	@Test
public static void demo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome Launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window MAximized sucesfully");
		driver.get("http://www.gmail.com");
		System.out.println("opened the url"+driver.getCurrentUrl());
		
		System.out.println("changed bby other person");
		Thread.sleep(5000);
		driver.close();

	}
}
