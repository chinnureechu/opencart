package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.Loginpage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class Tc_002_logintest extends BaseClass
{
	@Test(groups= {"sanity"})
	public void logintest()
	{
		try {
		HomePage hp=new HomePage(driver);
		hp.clickmyacoount();
		hp.clicllogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setemail(rb.getString("email"));
		lp.setpassword(rb.getString("password"));
		lp.clicklogin();
		
		
		MyAccountPage mac=new MyAccountPage(driver);
		boolean status=mac.isMyAccountPageExists();
		
		Assert.assertEquals(status, true);
		}
		catch(Exception e) 
		{
			Assert.assertTrue(false);
		}
	}

}