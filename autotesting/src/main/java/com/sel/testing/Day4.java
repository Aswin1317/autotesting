package com.sel.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		List<WebElement> radio = driver.findElements(By.xpath("//input[@id='inlineRadio1']"));
		
		for(WebElement temp :radio)
		{
			temp.click();
		}
		
	}
	
	
	
}
