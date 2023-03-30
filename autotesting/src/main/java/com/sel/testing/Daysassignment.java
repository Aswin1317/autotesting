package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Daysassignment {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		
		
		WebElement messege = driver.findElement(By.cssSelector("input[id='single-input-field']"));
		messege.sendKeys("Hello");
		/*messege.clear();
		messege.sendKeys("testing");
		System.out.println(messege.isDisplayed());
		System.out.println(messege.isEnabled());
		System.out.println(messege.isSelected());
		System.out.println(messege.getTagName());
		System.out.println(messege.getAttribute("id"));
		System.out.println(messege.getText());
		WebElement button=driver.findElement(By.id("button-one"));
		System.out.println(button.getText());
		System.out.println(button.getSize());
		System.out.println(button.getCssValue("color"));
		System.out.println(button.getLocation());
		
		WebElement link1 = driver.findElement(By.cssSelector("input[id='value-a']"));
		link1.sendKeys("10");
		
		
		
		WebElement link2 = driver.findElement(By.cssSelector("input[id='value-b']"));
		link2.sendKeys("20");
		
		
		
		/*driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		
		
		WebElement link3 = driver.findElement(By.cssSelector("select[id='single-input-field']"));
		link3.click();
		
	
		
		driver.get("https://selenium.obsqurazone.com/ajax-form-submit.php");
		
		
		
		WebElement link4 = driver.findElement(By.cssSelector("input[id='subject']"));
		link4.click();*/
	
		
	}

}
