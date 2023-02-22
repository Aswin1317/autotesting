package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();

driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

WebElement messege= driver.findElement(By.id("single-input-field"));
messege.sendKeys("Addition of two numbers");

WebElement value=driver.findElement(By.id("value-a"));
value.sendKeys("10");
WebElement value1=driver.findElement(By.id("value-b"));
value1.sendKeys("20");

/*WebElement value2=driver.findElement(By.className("form-control"));
value2.sendKeys("10");
WebElement value3=driver.findElement(By.className("form-control"));
value3.sendKeys("20");*/




	}

}
