package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Demo.SeleniumUtility;

public class Sample1 {

	public static void main(String[] args) {
		//Open browser and enter URL
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://jqueryui.com ");
		
		util.clickOnElement(driver.findElement(By.xpath("//a[text()='Sortable']")));
		Actions action = new Actions(driver);
		driver.switchTo().frame(0);
	   //sort the element from 7 to 1
		
		WebElement src = driver.findElement(By.xpath("//li[text()='.ui-sortable-handle']"));
		WebElement  target = driver.findElement(By.xpath("//li[text()='.ui-sortable-handle' ]"));
		
		//now perform drag and drop using Actions class
		
		action.dragAndDrop(src, target).build().perform();
	}

}
/*
TC1:
Open browser and enter URL as https://jqueryui.com 
click on sortable 
 sort the element from 7 to 1

*/