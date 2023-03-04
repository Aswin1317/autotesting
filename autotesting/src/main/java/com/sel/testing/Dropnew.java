package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropnew {

	
	@Test
	public void drop()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.id("sel1"));
		Select list = new Select(drop);
		
		//list.selectByIndex(5);
		list.selectByVisibleText("india");
		list.selectByIndex(1);
		System.out.println(list.getFirstSelectedOption().getText());
		
		list.deselectByIndex(1);
		list.deselectByVisibleText("India");
		list.deselectAll();
	}
	
}
