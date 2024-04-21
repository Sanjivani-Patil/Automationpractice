package Suite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.SeleniumUtility1;

public class OrangeHrmPIMWithBeforeAndAfterTest extends SeleniumUtility1 {

	
		@BeforeTest
		public void precondition() {
			setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	

		@Test(priority=2)
		public void testOrangeHrmLogin_PositiveFlow() {
			typeInput(driver.findElement(By.name("username")),"Admin");
			typeInput(driver.findElement(By.name("password")),"admin123");
			clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
			String expectedUrl="dashboard";
			Assert.assertTrue(getCurrentUrlOfApplication().contains(expectedUrl));
		}
		@Test(priority=1)
		public void testOrangeHrmLogin_NegativeFlow() {
			String expectedUrl="login";
			Assert.assertTrue(getCurrentUrlOfApplication().contains(expectedUrl));
		}
		
		@AfterTest
		public void postcondition() {
			driver.close();
		}

	
	}


