package day7keyboardops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.get("https://online.actitime.com/cts1/login.do");
       WebElement usernameInputField = driver.findElement(By.id("username"));
       WebElement usernameInputField=driver.findElement(By.id("username"));
	}


