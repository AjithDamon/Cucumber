package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition")

public class RunnerClass {

	public static WebDriver driver;
	@BeforeClass
	
	public void setUp() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajith\\eclipse-workspace\\AdactinCucumber1\\CHROME\\New Version\\chromedriver.exe");

		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@AfterClass
	
	public void tearDown() {
		driver.close();

	}
	
}
