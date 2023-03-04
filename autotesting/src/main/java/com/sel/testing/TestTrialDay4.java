package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTrialDay4 {

	
	@Test
public void firstPage()
{
	
		WebDriver driver=new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement value = driver.findElement(By.id("value-a"));
		value.sendKeys("15");
		
		WebElement value1 = driver.findElement(By.id("value-b"));
		value1.sendKeys("25");
		
		WebElement value2 = driver.findElement(By.id("button-two"));
		value2.click();
		
		WebElement value3 = driver.findElement(By.id("message-two"));
		System.out.println(value3.getText());
		
		Assert.assertEquals(value3.getText(),"Total A + B : 40", "failure messege  :mismatching the text");
		
		
}
}
	
	