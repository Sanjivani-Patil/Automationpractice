package Switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;

public class CirnformationHandling {

	public static void main(String[] args) {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		driver.switchTo().frame("iframeResult");

		util.clickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));

		System.out.println("Alert msg : " + driver.switchTo().alert().getText());

		//to click on OK/Yes/Confirm button
		driver.switchTo().alert().accept();
		
		//to click on Cancel/No/Close button
//		driver.switchTo().alert().dismiss();

		System.out.println(driver.findElement(By.id("demo")).getText());

	}

	}


