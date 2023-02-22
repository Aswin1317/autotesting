package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2obsqura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement messege= driver.findElement(By.id("single-input-field"));
		messege.sendKeys("Hello");
	}

}
