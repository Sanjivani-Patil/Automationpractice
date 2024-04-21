package testngdemo;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Example2 {
  @Test
  public void testcase1() {
	  System.out.println("Hi, TC1");
  }
  @Test
  public void testcase3() {
	  System.out.println("Hi, TC3");
}
  @Test
  public void testcase2() {
	  System.out.println("Hi, TC2");
  }@Test
  public void testcase4() {
	  System.out.println("Hi, TC4");
  }
}