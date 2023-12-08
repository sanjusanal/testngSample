package testScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
  @Test(groups="feature1")
  public void testOne() {
	  System.out.println("Test31 in SampleThree");
  }
  @Test(groups="feature2")
  public void testTwo() {
	  System.out.println("Test32 in SampleThree");
  }
  @Test(groups="feature3")
  public void testThree() {
	  System.out.println("Test33 in SampleThree");
  }
  @Test(groups="feature4")
  public void testFour() {
	  System.out.println("Test34 in SampleThree");
  }
}
