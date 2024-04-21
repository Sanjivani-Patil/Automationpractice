package day2.ObjectIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Example1 {

	public static void main(String[] args) {
		//open required browser
		WebDriver driver = new ChromeDriver();
		//enter application of URL
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//identify username input field
				
			WebElement usernameInputfield = driver.findElement(By.id("Username"));
			
			//delete existing text from username input field
			usernameInputfield.clear();
			
			//type username as admin
			usernameInputfield.sendKeys("admin");
			
			//identify password input field
			WebElement PasswordInputfield =driver.findElement(By.id("password"));
			
			//delete existing text from password input field
			PasswordInputfield.clear();
			
			//type password as admin
			PasswordInputfield.sendKeys("admin");
			
			//identify login button
			WebElement SignINbutton = driver.findElement(By.className("buttonBlue"));
			
			//click on login button
			SignINbutton.click();
	}

}
/*
 * Open browser
 * enter application URL
 * delete existing text from username input field
 * type username as admin
 * delete existing text from password input filed
 * type password as admin
 * click on signin button
 */
