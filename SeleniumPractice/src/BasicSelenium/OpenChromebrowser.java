package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromebrowser {

	public static void main(String[] args) {
		//Create an instance of required browser
		ChromeDriver driver	= new ChromeDriver();
		
		//enter required application URL
		driver.get("https://www.google.com");
		
		//Get  application Tittle
	String actualTittle	= driver.getTitle();
	String ExpectedTittle ="Google";
	System.out.println("Number of character in application Tittle"+actualTittle.length());
	System.out.println("Is google page open?"+actualTittle.equals(ExpectedTittle ));
	
	
	//get current URL from browser
	System.out.println("current url of application"+driver.getCurrentUrl());
	
		
		//get application source code
	String pagesource = driver.getPageSource();
	System.out.println("Number of character in application of pagesource "+pagesource.length());
	
	//close current browser
	driver.close();
		
		
		
		

	}

}
