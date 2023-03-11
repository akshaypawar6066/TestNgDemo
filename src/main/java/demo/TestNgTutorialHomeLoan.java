package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgTutorialHomeLoan {
  @Test
  public void webLoginHomeLoan()
  {
	  System.out.println("Logged in on the web for HomeLoan");
  }
  @Test(groups = "Smoke")
  public void mobileLoginHomeLoan()
  {
	  System.out.println("Logged in on the mobile HomeLoan");
  }
  @Test
  @Parameters({"homeLoanUrl"})
  public void LoginAPIHomeLoan(String homeLoanUrl)
  {
	  System.out.println("Logged in With the API HomeLoan");
	  System.out.println(homeLoanUrl);
  }
}
