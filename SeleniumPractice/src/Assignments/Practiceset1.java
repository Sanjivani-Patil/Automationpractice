package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practiceset1 {

	public static void main(String[] args) {
		//Launch a new Chrome browser.
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tcs/login.do");
		
		
		//Get Page Title name and Title length
       String ActualTittle = driver.getTitle();
        String ExpectedTittle ="actiTIME";
        System.out.println("Number of character in Applicatin :"+ActualTittle .length());
        System.out.println("Is actiTIME page open?"+ActualTittle.equals(ExpectedTittle ));
        
      //Get Page URL and verify if it is a correct page opened
        System.out.println("Current URL of Application :"+driver.getCurrentUrl());
        
        
      //Enter valid username and password (admin01/admin01)
        WebElement userInputfield = driver.findElement(By.id("username"));
       userInputfield .sendKeys("admin01");
        
      //Enter valid username and password (admin01/admin01)
        WebElement passwordInputfield = driver.findElement(By.name("pwd"));
        passwordInputfield.sendKeys("admin01");
        
      //Click on login button
        WebElement signbutton = driver.findElement(By.id("loginButton"));
        signbutton .click();
        
        //Close the Browser.
       driver.close();
} 
}


//Launch a new Chrome browser.
//Open https://online.actitime.com/tcs/login.do
//Get Page Title name and Title length
//Print Page Title and Title length on the Eclipse Console.
//Get Page URL and verify if it is a correct page opened
//Enter valid username and password (admin01/admin01)

//Click on login button
//Print the title on the console
//Close the Browser.
//