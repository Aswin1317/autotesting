package com.sel.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();  //child class of web driver
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		//navigation commands
		driver.navigate().to("https://www.myntra.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//browser commands
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.close();
		driver.quit();
	}

}
