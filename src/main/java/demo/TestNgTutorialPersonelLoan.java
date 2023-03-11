package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgTutorialPersonelLoan {
  @Test(dataProvider="getData")
  public void loginWithWeb(String username, String password)
  {
	  System.out.println("Login on Web Personel Loan");
	  System.out.println(username + " "+ password);
  }
  @Test
  public void loginWithMobile()
  {
	  System.out.println("Login on mobile Personel Loan");
  }
  @Test(groups = "Smoke")
  public void loginWithAPI()
  {
	  System.out.println("Login on API Personel Loan");
  }
  @DataProvider
  public Object[][] getData()
  {
	  //3 username and password
	  Object[][] data=new Object[3][2];
	  data[0][0]="FirstetUsername";
	  data[0][1]="FirstSetPassword";
	  data[1][0]="SecondetUsername";
	  data[1][1]="SecondSetPassword";
	  data[2][0]="ThirdSetUsername";
	  data[2][1]="ThirdSetPassword";
	  return data;
  }
}
