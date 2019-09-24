package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static  driver.DriverNew.getDriver;

public class Cruises1 {

	public static void main(String[] args) throws InterruptedException { 
		
		
		
//		System.setProperty("webdriver.chrome.driver", 
//				"C:\\Users\\farid\\Downloads\\chromedriver_win322\\chromedriver.exe");
		
		WebDriver driver = getDriver("chrome");
		driver.get("http://newtours.demoaut.com/");
		
//		driver.navigate().to("http://newtours.demoaut.com/");
		sleep(2);
		
			
		driver.findElement(By.xpath("(//a[5]")).click();
		
		sleep(3);
		
		String actualTitle = driver.getTitle();
		String actualURL = driver.getCurrentUrl();
		
		if ( actualTitle.equals("Cruises: Mercury Tours") ) {
			System.out.println("Title check: pass");
		}else {
			System.out.println("Title check: fail");
		
		}
		
		if ( actualURL.equals("http://newtours.demoaut.com/mercurycruise.php") ) {
			System.out.println("URL check: pass");
		}else {
			System.out.println("URL check: fail! Actual URL: " + actualURL);					
		}		
		
		sleep(5);
		driver.quit();		
	}

	public static void sleep (int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	
}














