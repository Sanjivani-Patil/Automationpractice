package day2.ObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//enter application of URL
	   driver.get("https://www.saucedemo.com/");
		//identify username input field
		driver.findElement(By.id("user-name")).sendKeys("standard_user");;
		//type username as admin
		//usernameInputfield .sendKeys("standard_user");
		
		
		
		
		//identify password input field"
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//type password as admin
	//	passwordinputfield.sendKeys("secret_sauce");
    //identify login button
	driver.findElement(By.id("login-button")).click();
	//click on login button
	//signinbutton .click();

	}

}

/*
 * Open browser
 * enter application URL
 * type username as standard_user
 * type password as secret_sauce
 * click on signin button
 */
