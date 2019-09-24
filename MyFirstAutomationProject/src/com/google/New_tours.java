package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tours {
			

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\farid\\Downloads\\chromedriver_win322\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement (By.name("userName")).sendKeys("techcenture");
		driver.findElement (By.name("password")).sendKeys("password");
		driver.findElement (By.name("login")).click();
		
		//By.name("userName") --> locator
		
        Thread.sleep(5000);
		
		driver.quit();
		
	}

}
