package testngdemo;

import org.testng.annotations.Test;

public class Example3 {
  @Test(priority=2,enabled= true)
  public void testcase1() {
	  System.out.println("Hi, TC1");
  }
  @Test(priority=1,enabled= false)
  public void testcase3() {
	  System.out.println("Hi, TC3");
}
  @Test(priority=3,enabled= true)
  public void testcase2() {
	  System.out.println("Hi, TC2");
  }@Test
  public void testcase4() {
	  System.out.println("Hi, TC4");
  }
  }

