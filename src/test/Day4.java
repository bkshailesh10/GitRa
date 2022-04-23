package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//rahulonlinetutor@gmail.com

public class Day4 {
	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String urlname )
	{
		//Selenium
		System.out.println("Weblogin_Home_Day4_PersonalLoan");
		System.out.println(urlname);
	
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium
		System.out.println("MobileLogin_Home_Day4");
	}
	@Test
	public void LoginAPIHomeLoan()
	{
		//Rest API Automation
		System.out.println("LoginAPI_Home_Day4");
	}

	
	
	
}



