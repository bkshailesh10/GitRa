package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void LastExecution()
	{
	System.out.println("I will execute last");	
	}
	@Test
	public void Demo() 
	{
		System.out.println("Dem_Day1"); //automation
	}
	@AfterSuite
	public void aftesuite()
	{
		System.out.println("I m the no 1 from last");
	}
	
	
	@Test
	public void SecondTest()	
	{
		System.out.println("SecondTes_Day1");
	}

}
