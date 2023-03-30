package com.sel.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowHandling {

	@Test
	public void windows() {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		
		WebElement button = driver.findElement(By.xpath("//span[text()='Open']"));
		button.click();
		
		String parent = driver.getWindowHandle();  //parent window
		
		Set<String>  windows = driver.getWindowHandles();  //It includes parent and child windows
	
	for(String temp : windows) {
		
		if(!temp.equals(parent)) {
			
			driver.switchTo().window(temp);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			}
		}
	}
}
