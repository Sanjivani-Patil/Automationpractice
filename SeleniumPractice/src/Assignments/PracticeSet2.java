package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSet2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//to maximize browser window use
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
        WebElement usernameInputfield  =  driver.findElement(By.name("username"));
            System.out.println("usernameInputfield  visible or not "+usernameInputfield .isDisplayed());
            System.out.println("usernameInputfield  editable or not "+usernameInputfield.isEnabled());
            System.out.println("usernameInputfield find default value "+usernameInputfield.getAttribute("Placeholder"));
            
            WebElement passwordInputfield  =  driver.findElement(By.name("password"));
            System.out.println("passwordInputfield   visible or not "+passwordInputfield .isDisplayed());
            System.out.println("passwordInputfield   visible or not "+passwordInputfield.isEnabled());
            System.out.println("passwordInputfield   editable or not "+passwordInputfield.getAttribute("placeholder"));
            
            WebElement LoginButton=  driver.findElement(By.className("orangehrm-login-button"));
            System.out.println("LoginButton visible or not "+LoginButton.isDisplayed());
            System.out.println("LoginButton selectable or not "+LoginButton.isSelected());
            System.out.println("LoginButton buttonname "+LoginButton.getText());
            
            WebElement forgotpassword = driver.findElement(By.className("oxd-text"));
            System.out.println("forgotpassword visible or not "+forgotpassword.isDisplayed());
            System.out.println("forgotpassword visible or not "+forgotpassword.isSelected());
	}

}

/*
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Admin/admin123

validation:
	Username:
	visible or not --->
	editable or not--->
	default value--->
	
	password:
	visible or not --->
	editable or not--->
	default value--->

Login button:
	visible or not--->
	clickable or not--->
	button name--->

Forgot your password?
	visible or not--->
	clickable or not--->
	link name--->

*/