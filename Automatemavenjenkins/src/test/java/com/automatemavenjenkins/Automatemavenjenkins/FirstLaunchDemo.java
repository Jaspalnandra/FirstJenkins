package com.automatemavenjenkins.Automatemavenjenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstLaunchDemo {
	static WebDriver driver;
	String url;
//	
//	@BeforeSuite
//	public void setup() {
//		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");		
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
	
	@Test
	public void launch() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		url = "https://www.google.com";	
		driver.get(url);
		System.out.println("RUNNNNNNNNNNNN");
	}
}
