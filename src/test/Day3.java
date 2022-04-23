package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//rahulonlinetutor@gmail.com

public class Day3 {	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname, String Key)
	{
		//Selenium
		System.out.println("Weblogin_Car_Day3");
		System.out.println(urlname);
		System.out.println(Key);
	}	
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every method in dya3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	@Test(enabled=false)
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLogin_Car_Day3");
	}
	@BeforeSuite
	public void Beforsuit()
	{
		System.out.println("I am no 1");
	}
	@Test(groups= {"Smoke"})
	public void MobilesigninCarLoan()
	{
		//Appium
		System.out.println("Mobilesignin_Car_Day3");
	}
	@Test(dataProvider="getData")
	public void MobilesignoutCarLoan(String username,String password )
	{
		//Appium
		System.out.println("Mobilesignout_Car_Day3");
		System.out.println(username);
		System.out.println(password);
	}	
	@Test(dependsOnMethods ={"WebloginCarLoan", "MobilesignoutCarLoan"}) 
	public void APICarLoan()
	{
		//Rest API Automation
		System.out.println("APILogoin_Car_Day3");
	}

	@DataProvider
	public Object[][] getData()
	{
		//1st combination - username password
		//2nd - username password - no credit History
		// 3rd - fraudelent credit history
		
		Object[][] data = new Object[3][2];
		//1set set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		// couloumns in the row are noting but values 
		//for that particular combinaiton(row)
		
		//2nd set
		data[1][0] = "Secondsetusername";
		data[1][1] = "Secondsetpassword";
		
		
		data[2][0] = "Thirdsetusername";
		data[2][1] = "Thirdsetpassword";
		
		return data;
		
	}
	
	
}



