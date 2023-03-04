package com.sel.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Day6 {

	@Test
	public void name()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/New%20folder%20(2)/dropdown.html");
		
		WebElement drop = driver.findElement(By.id("dropdown"));
		Select list = new Select(drop);
		
		list.selectByIndex(2);
		list.selectByValue("IN");
		list.selectByVisibleText("Africa");
		
		list.deselectByIndex(2);
		list.deselectByValue("IN");
		list.deselectByVisibleText("Africa");
	}

}
