package com.google;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class New_Tours2 {
			

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		String fName = scanner.nextLine();
		System.out.print("Please enter your last name: ");
		String lName = scanner.nextLine();
		System.out.print("Please enter your phone number: ");
		String phone = scanner.nextLine();
		String email = generateEmail(fName, lName);
		System.out.print("Please enter your Address: ");
		String address1 = scanner.nextLine();
		System.out.print("Please enter your Address 2: ");
		String address2 = scanner.nextLine();
		System.out.print("Please enter your City: ");
		String state = scanner.nextLine();
		System.out.print("Please enter your State: ");
		String city = scanner.nextLine();
		System.out.print("Please enter your Postal Code: ");
		String postalCode = scanner.nextLine();
		System.out.print("Please enter your Country: ");
		String country = scanner.nextLine();
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\farid\\Downloads\\chromedriver_win322\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
//		driver.findElement(By.name("userName")).sendKeys("mercury");
//		driver.findElement(By.name("password")).sendKeys("mercury");
//		driver.findElement(By.name("login")).click();		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys(fName);
		driver.findElement(By.name("lastName")).sendKeys(lName);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("userName")).sendKeys(email);
		driver.findElement(By.name("address1")).sendKeys(address1);
		driver.findElement(By.name("address2")).sendKeys(address2);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		
		WebElement countryDropdown = driver.findElement(By.name("country"));
		
		/*
		 * findElement method returns WebElement data type
		 * thats why we are assign it to WebElement object 'countryDropdown'
		 */
		
		Select select = new Select(countryDropdown);
		select.selectByVisibleText(country.toUpperCase());
		
		driver.findElement(By.name("email")).sendKeys(generateUserName(fName, lName));
		
		String password = generatePassword(fName, lName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		
		driver.findElement(By.name("register")).click();

		Thread.sleep(2000);		
		
		String actualConfirmationText = driver.findElement(By.tagName("b")).getText(); // getText method returns String
		String expectedConfirmationText = "Dear " + fName + " " + lName + ",";
		
		if (actualConfirmationText.equals(expectedConfirmationText) ) { // equals --> comparing content/value objects of String 
//			if ( actualConfirmationText == equals(expectedConfirmationText ) { 
			// == --> comparing two objects of String 
			System.out.println("You are register at Mercury");
		} else {
			
			System.out.println("Something went wrong...");
		}
		
			
		
		/*
		 * Task:
		 * Enter First Name, Last Name and Phone Number
		 * create a private method to generate user email and return the email, 
		 * 	the method should accept 2 Strings (fName, lName) as parameters, return --> ali.ismoilov@someemail.net 
		 */

//		driver.quit();
		
	}
	
		private static String generateEmail ( String fName, String lName ) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(fName).append(".").append(lName).append("@yahoo.com");
			return stringBuilder.toString().toLowerCase();
	}
	
		private static String generateUserName ( String fName, String lName ) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(fName).append(".").append(lName);
			return stringBuilder.toString().toLowerCase();
	}
	
		private static String generatePassword ( String fName, String lName ) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(fName).append(".").append(lName).append(123);
			return stringBuilder.toString();
	}
	
}






