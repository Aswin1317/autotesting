package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

	public static void main(String[] args) {
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
		
		WebElement name = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		name.sendKeys("Hello");
		
		WebElement value = driver.findElement(By.cssSelector("input[id='value-a']"));
		value.sendKeys("10");
		
		
		

	}

}
