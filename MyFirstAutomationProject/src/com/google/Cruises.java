package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driver.DriverNew; 

public class Cruises {
	
	public static void main(String[] args) throws InterruptedException { 
		
		
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\farid\\Downloads\\chromedriver_win322\\chromedriver.exe");
			
//			ChromeDriver driver = new ChromeDriver ();
			
			WebDriver driver = DriverNew.getDriver("chrome");
			driver.get("http://newtours.demoaut.com/");
						
			driver.findElement(By.xpath("(//a)[5]")).click();
			
			String actualTitle = driver.getTitle();
			String actualURL = driver.getCurrentUrl();
			
			if ( actualTitle.equals("Cruises:Mercury Tours") ) {
				System.out.println("Title chcecj : pass");
	
			} else {
				System.out.println("Title check: fail");
				
			}
			
			if ( actualURL.contains("http://newtours.demoaut.com/mercurycruise.php") ) {
				System.out.println("URL check: pass");
				
			} else {
				System.out.println("URL check: fail! Actual URL: " + actualURL);
			
	}
			
			Thread.sleep(2000);
			
					
		//	driver.findElement (By.name("email")).sendKeys("farid.kamalov@yahoo.com");
		//	driver.findElement (By.name("pass")).sendKeys("TottiCaffe-611");
		//	driver.findElement (By.name("Log In")).click(); 
		
	}
	

	}


