package Assignments2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		Actions action = new Actions(driver);
		List<WebElement>MenuList= driver.findElements(By.cssSelector("._1ch8e_>div>div>*:nth-child(2)"));
		System.out.println("Menu count: "+MenuList.size());
	       
		//hover on particular element like grocery and Beverages 
		//action.moveToElement(MenuList.get(1)).perform();
		
		//to hover on all menu items one by one
		for(int i=0;i<MenuList.size();i++) {
	//		Thread.sleep(2000);
	//		action.moveToElement(MenuList.get(i)).perform();
			System.out.println("Menu Name :  "+MenuList.get(i).getText());

			//hover on SwitchTo using grocery
			action.moveToElement(MenuList.get(2),100,0).perform();
		}
	}
}

/*TC1:
Open any browser and enter flipkart url
Get the top menu count 
One by one print top menu names and also perform mouse hover operations

*/