package testScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
	@Test(groups="feature1")
  public void testOne() {
      System.out.println("Test41 in SampleFour");
  }
  @Test(groups="feature2")
  public void testTwo() {
	  System.out.println("Test42 in SampleFour");
  }
  @Test(groups="feature3")
  public void testThree() {
	  System.out.println("Test43 in SampleFour");
  }
  @Test(groups="feature4")
  public void testFour() {
	  System.out.println("Test44 in SampleFour");
  }
}
