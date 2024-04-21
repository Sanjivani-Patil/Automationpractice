package testngdemo;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Demo.SeleniumUtility;
import Utilities.SeleniumUtility1;



     public class Assignment extends SeleniumUtility1 {
	    @Test(priority=1)
		public void sourceDemoShopping() {
			 setUp("Chrome","https://www.saucedemo.com/");
			 //Username
			 typeInput(driver.findElement(By.name("user-name")),"standard_user");
			 //Password
			 typeInput(driver.findElement(By.name("password")),"secret_sauce");
			 //click on login button
			 clickOnElement(driver.findElement(By.id("login-button")));
			 //click on Add to cart
			 clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
			 //Click on shopping logo
			 clickOnElement(driver.findElement(By.className("shopping_cart_link")));
			 //click on checkout button
			 clickOnElement(driver.findElement(By.id("checkout")));
			 //Fill first name and last name
			 typeInput(driver.findElement(By.id("first-name")),"Sanjivani");
			 typeInput(driver.findElement(By.id("last-name")),"Patil");
			 //Enter postal code 
			 typeInput(driver.findElement(By.id("postal-code")),"425104");
			 //click on continue button
			 clickOnElement(driver.findElement(By.id("continue")));
			 //click on finish
			 clickOnElement(driver.findElement(By.id("finish")));
			 //click on back to page/products
			 clickOnElement(driver.findElement(By.id("back-to-products")));
			 
			 
			 
			
		}
     
		
		@Test(priority=2)
		public void orangeHRM_PIMCreation() {
			setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			typeInput(driver.findElement(By.name("username")),"Admin");
			typeInput(driver.findElement(By.name("password")),"admin123");
			clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
			clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
			clickOnElement(driver.findElement(By.xpath("//a[text()='Add Employee']")));
			typeInput(driver.findElement(By.name("firstName")),"Sanjivani");
			typeInput(driver.findElement(By.name("lastName")),"Patil");
			//employee id 
			typeInput(driver.findElement(By.cssSelector(".orangehrm-employee-form>div>*:nth-child(2)>div>div>*:nth-child(2)>input")),"20");
			//click on save
			clickOnElement(driver.findElement(By.cssSelector(".orangehrm-card-container>*:nth-child(3)>*:nth-child(3)>*:nth-child(3)")));
			
		}
		
		
		@Test(priority=3)
		public void orangeHRM_PIMUpdate() {
			//click on pim
			clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
			String expectedUrl="pim";
			Assert.assertTrue(getCurrentUrlOfApplication().contains(expectedUrl));
		     //click on employee list
		clickOnElement(driver.findElement(By.xpath("//a[text()='Employee List']")));
		
		    driver.findElement(By.xpath("//label[text()='Employee Id']"));
		    //employee id 
		    typeInput(driver.findElement(By.cssSelector(".oxd-form-row>div>:nth-child(2)>div>:nth-child(2)>input")),"20");

		//typeInput(driver.findElement(By.cssSelector(".orangehrm-employee-form>div>*:nth-child(2)>div>div>*:nth-child(2)>input")),"20");
			//search button
			clickOnElement(driver.findElement(By.cssSelector(".oxd-form>:nth-child(3)>:nth-child(2)")));
			
		}
			
		
		
		@Test
		public void orangeHRM_PIMDelete() {
			
		

	

	}

     }
