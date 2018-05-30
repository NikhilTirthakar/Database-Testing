package com.maven.MyMavenOne;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebElement
{

	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	   System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);  
		driver.get("http://opensource.demo.orangehrmlive.com/");
		//driver.get("https://web.whatsapp.com/");
	   
	}
	
	@Test
	public void assertion_softAssertion() throws IOException 
	{

			System.out.println("Positive test");
		
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			driver.findElement(By.id("btnLogin")).click();

	}
	
	@Test
	public void table() throws InterruptedException 
	{

		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
        //driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_6']")).click();
        driver.findElement(By.id("ohrmList_chkSelectRecord_6")).click();
        
        
	}
	
	
  
	@AfterTest
	public void aftertest()
	{
		
	}
}
