package com.automatemavenjenkins.Automatemavenjenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstLaunchDemo {
	static WebDriver driver;
	String url,title;
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test(priority =0)
	public void launch() {
		url = "https://www.google.com";	
		driver.get(url);
		System.out.println("Website opened");
	}

	@Test(priority =1)
	public void getTtile() {
		title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		System.out.println("Correct title");
	}
	
}
