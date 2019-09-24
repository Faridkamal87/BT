package com.google;

//import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tours1 {
			

	public static void main(String[] args) throws InterruptedException {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please neter your first name: ");
//		String fName = scanner.nextLine();
//		System.out.println("Please neter your last name: ");
//		String lName = scanner.nextLine();
//		System.out.println("Please neter your phone name: ");
//		String phone = scanner.nextLine();	
//		String email = generateEmail(fName, lName);
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\farid\\Downloads\\chromedriver_win322\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("http://newtours.demoaut.com/");
		
//		driver.findElement (By.name("Register")).sendKeys("techcenture");
//		driver.findElement (By.name("password")).sendKeys("password");
//		driver.findElement (By.name("login")).click();
		
		//By.name("userName") --> locator
		
//		driver.findElement(By.linkText("REGISTER")).click();
//		driver.findElement (By.name("firstName")).sendKeys(fName);
//		driver.findElement (By.name("lastName")).sendKeys(lName);
//		driver.findElement (By.name("phone")).sendKeys(phone);
//		driver.findElement (By.name("userName")).sendKeys(email);

		
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement (By.name("firstName")).sendKeys("Farid");
		driver.findElement (By.name("lastName")).sendKeys("Kamalov");
		driver.findElement (By.name("phone")).sendKeys("2012859086");
		driver.findElement (By.name("userName")).sendKeys("farid.kamalov@yahoo.com");
		driver.findElement (By.name("address1")).sendKeys("334 Cleveland avenue unit 2");
		driver.findElement (By.name("city")).sendKeys("Harrison");
		driver.findElement (By.name("state")).sendKeys("New Jersey");
		driver.findElement (By.name("postalCode")).sendKeys("07029");
		driver.findElement (By.name("country")).sendKeys("UNITED STATES");
		driver.findElement (By.name("email")).sendKeys("faridkamal87");
		driver.findElement (By.name("password")).sendKeys("farid123");
		driver.findElement (By.name("confirmPassword")).sendKeys("farid123");
		driver.findElement (By.name("register")).click();
		
        Thread.sleep(5000);		
		driver.quit();
		
	}
	

//	private static String generateEmail ( String fName, String lName ) {
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append(fName).append(".").append(lName).append("@gmail.com");
//		return stringBuilder.toString().toLowerCase();		
		
	}

//}


//Selenium locators:
/**
* id
* name
* className
* sccSelector
* tagName
* linkText
* partialLinkText
* xpath
*/
