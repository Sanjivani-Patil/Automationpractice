package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//identify username and password from the application and store it into a variable
		String userName=driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
		System.out.println(" "+userName);
		
		String passwordName=driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		System.out.println(" "+passwordName);
		
		driver.findElement(By.name("username")).sendKeys("Admin"); 
        driver.findElement(By.name("password")).sendKeys("admin123"); 
        driver.findElement(By.cssSelector(".oxd-button")).click(); 	
	}

}
/*
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login



	}
*/

