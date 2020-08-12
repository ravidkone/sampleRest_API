package Com.testcowrks.utilities;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTestBase {
	

  @BeforeSuite
  public void TriggerDependencies() {
	  System.out.println("Test class");
  }
}
