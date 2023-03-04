package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5Assert {
	WebElement name;
	WebDriver driver;
	@Test
	public void test()
	{
		
		
		driver= new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		name=driver.findElement(By.id("single-input-field"));
		name.sendKeys("Aswin");
		
	}
	
	@Test(priority = 1, enabled = false)
	public void test3()
	{
			
		//System.out.println(name.isDisplayed());
		Assert.assertTrue(name.isDisplayed(), "Failure messege - name is not displayed");
		
	}
	
	@Test(priority = 2)
	public void test1()
	{
		
		//System.out.println(name.isEnabled());
		Assert.assertTrue(name.isEnabled(), "Failure messege - name is not enabled");
		
	}
	
	@Test(priority = 3)
	public void test2()
	{
		
		//System.out.println(name.isSelected());
		Assert.assertFalse(name.isSelected(), "Failure messege - name is selected");
	
	//	Assert.assertEquals(name.getTagName(), "input", "Failure messege - Tag name is not matching");
		//Assert.assertEquals(name.getAttribute("id"), "single-input-field", "Failure messege - id is not matching");
	
		}
	}
	
	

