package com.sel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsMethod {

	
	@Test
	public void demo() {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		Actions action = new Actions(driver);
		WebElement show = driver.findElement(By.xpath("(//span[text()='Show'])[1]"));
		
		
		
		//show.click();
		
		//action.click(show).build().perform();
		
		//action.moveToElement(show).build().perform();
		
		//action.moveToElement(show).click().build().perform();
		
		//action.contextClick().build().perform();
		
		//action.moveToElement(show).contextClick().build().perform();
		
		//action.doubleClick(show).build().perform();
		
		//action.clickAndHold(show).build().perform();
		
		//action.moveByOffset(0, 0).click().build().perform();	
		
		
	}
	
}
