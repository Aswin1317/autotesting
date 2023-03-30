package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.get("E:/New%20folder%20(2)/sample.html");
		/*WebElement textbox= driver.findElement(By.id("001"));
		textbox.sendKeys("Aswin");
		WebElement radio= driver.findElement(By.id("002"));
		radio.click();
		WebElement radio1= driver.findElement(By.id("003"));
		radio1.click();
		WebElement checkbox= driver.findElement(By.id("004"));
		checkbox.click();
		WebElement button= driver.findElement(By.id("005"));
		button.click();*/
		
		
		/*WebElement textbox= driver.findElement(By.name("A"));
		textbox.sendKeys("Aswin");
		WebElement radio= driver.findElement(By.name("B"));
		radio.click();
		WebElement radio1= driver.findElement(By.name("C"));
		radio1.click();
		WebElement checkbox= driver.findElement(By.name("D"));
		checkbox.click();
		WebElement button= driver.findElement(By.name("E"));
		button.click();*/
		
		WebElement textbox= driver.findElement(By.className("c1"));
		textbox.sendKeys("Aswin");
		WebElement radio= driver.findElement(By.className("c2"));
		radio.click();
		WebElement radio1= driver.findElement(By.className("C3"));
		radio1.click();
		WebElement checkbox= driver.findElement(By.className("c4"));
		checkbox.click();
		WebElement button= driver.findElement(By.className("c5"));
		button.click();
	
		
		
		
	}
	

}
