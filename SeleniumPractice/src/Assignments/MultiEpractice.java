package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiEpractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//to maximize 
		driver.manage().window().maximize();
		//implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter URL
		driver.get("https://demo.automationtesting.in/Register.html");
		
		////identify number link present in the page	
	List<WebElement>MenuName=driver.findElements(By.cssSelector(".navbar-inverse>.container>*:nth-child(2)>ul>li>a"));
		System.out.println("count Menu "+MenuName.size());

		
		
		for (int i=0;i<MenuName.size();i++) {
		System.out.println("Menu count: "+MenuName.get(i).getText());
		

	}

}
}