package test_leaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.google.Cruises1;
import driver.DriverNew;

public class Edit {


		
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\farid\\Downloads\\chromedriver_win322\\chromedriver.exe");
			
			WebDriver  driver = DriverNew.getDriver("firefox");
			
			driver.get("http://testleaf.herokuapp.com/");
			
			driver.findElement(By.linkText("Edit")).click();
			String header = driver.findElement(By.tagName("h1")).getText();
			
			if ( header.equals("Work with Edit Fields") ) {
				System.out.println("Header validation is passed");
			} else {
				System.out.println("Header validation is failed");
			}	
			
				
			driver.findElement(By.id("email")).sendKeys("world");
			Cruises1.sleep(2);
			driver.findElement(By.cssSelector("[value= 'Append ']")).sendKeys(" appending text");
			Cruises1.sleep(2);
			
			String value = driver.findElement(By.name("username")).getAttribute("value");
			/*
			 * To get text out of text box, you should use getAttribute ("value") method
			 * 
			 * 
			 */
			
			System.out.println(value);
			Cruises1.sleep(3);
			//input[@name='username'] --> xpath
			/*
			 *  // relative xpath
			 *  input --> tag name
			 *  name --> attribute of element 
			 *  'username' --> value of an atribute
			 */
			
			driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
			Cruises1.sleep(2);
			
			
			WebElement webElement = driver.findElement(By.cssSelector("[diable='true']"));
			boolean isDisabled = !webElement.isEnabled();
			System.out.println(isDisabled);
										
			Cruises1.sleep(50);	
				
				
			driver.quit();


	}

}
		



