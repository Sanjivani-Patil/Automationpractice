package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElements2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter url
		driver.get("https://www.gsmarena.com/");
		
		
		//identify number link present in the page
		List<WebElement>deviceList= driver.findElements(By.cssSelector("#body>aside>div>ul>li>a"));
		 //decvice count
		System.out.println("Device count: "+deviceList.size());
		
		
		for(int i=0;i<deviceList.size();i++) {
		//WebElement element = deviceList.get(i);
		//String deviceName = element.getText();
		//System.out.println("Device Name: "+hrefLink);
		
		
		System.out.println("Device name: "+deviceList.get(i).getText());
	}

}
}
/*
TC1:
	https://www.gsmarena.com/
	print mobile brand count and names
*/