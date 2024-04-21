package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample1 {

	
		public static void main(String[] args) throws InterruptedException {
			SeleniumUtility util=new SeleniumUtility();
			WebDriver driver=util.setUp("chrome", "https://jqueryui.com/droppable/");

			//to get inside the frame use below statement
			driver.switchTo().frame(0);
			
			//to perform drag and drop first identify source and target
			WebElement src=driver.findElement(By.id("draggable"));
			WebElement target=driver.findElement(By.id("droppable"));
			
			util.performDragAndDrop(src, target);		
		}
}