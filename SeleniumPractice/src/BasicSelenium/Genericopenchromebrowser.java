package BasicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericopenchromebrowser {

	public static void main(String[] args) {
		//create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		
		//enter required Application URL
     driver.get("https://www.google.com");
     
     
     //get application tittle
    String actualTittle  = driver.getTitle();
    String ExpectedTittle = "Google";
    System.out.println("Number of character in application tittle "+actualTittle .length());
    System.out.println("Is Google page opened?"+actualTittle.equals(ExpectedTittle));
    
    //get current url from browser
    
    System.out.println("Current URL  of application "+driver.getCurrentUrl());
    
    
    
  //get application source code
  String SourcePage = driver.getPageSource();
    System.out.println("character in sourcepage application  "+SourcePage.length());
    
    
  //close current browser
    driver.close();
	}

}
