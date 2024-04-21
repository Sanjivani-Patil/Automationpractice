package Assignments2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2 {

	public static void main(String[] args) {
	 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.espncricinfo.com/");
		
		Actions action = new Actions(driver);
		List<WebElement>TopMenuList = driver.findElements(By.cssSelector(".ds-flex>li>a>span"));
		System.out.println("TopMenuList: "+TopMenuList .size());
		//hover on particular element like 
		//action.moveToElement(TopMenuList.get(1)).perform();
		//to hover on all menu items one by one
		for(int i=0; i<TopMenuList.size();i++) {
			System.out.println("TopMenu Name: "+TopMenuList.get(i).getText());
			//hover on SwitchTo using ipl
			action.moveToElement(TopMenuList.get(2),100,0).perform();
			
		}
		

}
}
/*
TC2:
Open any browser and enter https://www.espncricinfo.com/
Get the top menu count 
One by one print top menu names and also perform mouse hover operations

*/