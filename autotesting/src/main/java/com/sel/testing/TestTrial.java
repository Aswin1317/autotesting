package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrial {

	@Test
	public void firstPage()
	{
		WebDriver driver=new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement messege= driver.findElement(By.id("single-input-field"));
		messege.sendKeys("Addition of two numbers");
		
		WebElement messege1=driver.findElement(By.id("button-one"));
		messege1.click();
		
		WebElement messege2 = driver.findElement(By.id("message-one"));
		System.out.println(messege2.getText());
		
		Assert.assertEquals(messege2.getText(), "Your Message : Addition two numbers","failure messege  :mismatching the text");

		
	}
	
	
	@Test
	public void secondPage()
	{
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement value=driver.findElement(By.id("value-a"));
		value.sendKeys("10");
		

		WebElement value1=driver.findElement(By.id("value-b"));
		value1.sendKeys("20");
	}
	
}
