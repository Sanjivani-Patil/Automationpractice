package day2.ObjectIdentification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		//implicite wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
	}

}

/*
here script will be failed due to Sync issue.

Sync- Speed of automation tool is not matching with application

Sync
	1.implicit wait
	2.explicit wait (conditional wait)

*/