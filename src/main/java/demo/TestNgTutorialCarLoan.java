package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgTutorialCarLoan {
	@BeforeTest
	public void preRequiest()
	{
		System.out.println("I will execute before test");
	}
  @Test
  public void webLogincarLoan()
  {
	  System.out.println("Logged in on the web for car loan");
  }
  @Parameters({"url", "token"})
  @Test(enabled = true)
  public void mobileLogincarLoan(String urlName, String token)
  {
	  System.out.println("Logged in on the mobile car loan");
	  System.out.println(urlName+ " "+token+  "******");
  }
  @Test(groups = "Smoke")
  public void LoginAPICraLoan()
  {
	  System.out.println("Logged in With the API car loan");
  }
  @AfterTest
  public void postRequist()
  {
	  System.out.println("I will execute after the test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before method");
  }
  @AfterMethod
  public void aftereMethod()
  {
	  System.out.println("After method");
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Before suite");
  }
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("After suite");
  }
  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("I will execute before the class");
  }
  @AfterClass
  public void afterClass()
  {
	  System.out.println("I will execute after the class");
  }
}
