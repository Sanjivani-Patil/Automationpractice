package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	//to maximize browser window use
	driver.manage().window().maximize();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("login-button")).click();
		
		WebElement errorMsg = driver.findElement(By.className("validation-summary-errors"));
		String erronTextcolor = errorMsg.getCssValue("color");
		
	}

}
