package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day3assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new EdgeDriver();
		driver.get("https://selenium.obsqurazone.com/form-submit.php");
		
		WebElement name=driver.findElement(By.id("validationCustom01"));
		name.sendKeys("Aswin");
		System.out.println(name.isDisplayed());
		System.out.println(name.isEnabled());
		System.out.println(name.isSelected());
		//System.out.println(name.getText());
		System.out.println(name.getTagName());
		System.out.println(name.getAttribute("id"));
		System.out.println(name.getAttribute("class"));
		System.out.println(name.getAttribute("placeholder"));
		System.out.println(name.getAttribute("type"));
		System.out.println(name.getCssValue("color"));
		System.out.println(name.getSize());
		System.out.println(name.getLocation());
	}

}
