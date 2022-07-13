package org.test;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	@Test
	private void hari() {
		System.out.println("1");
	   

	}
	@BeforeSuite
	private void ram() {
		System.out.println("2");   

	}
	@BeforeMethod
	private void kumar() {
		   
		System.out.println("3");
	}
	@BeforeClass
	private void rojaKarthikk() {
		   
		System.out.println("4");
	}
    @AfterMethod
	private void sony() {
		   
		System.out.println("5");
	}
    @Test(priority = -19)
	private void naveen() {
		   
		System.out.println("6");
	}
    @AfterClass
	private void vivek() {
		   
		System.out.println("7");
	}
	@Test
	private void sasi() {
		System.out.println("8");   

	}
	@Test(invocationCount = 2)
	private void hema() {
		   
		System.out.println("9");
	}
	@Test(priority =-10)
	private void prakash() {
		   
		System.out.println("10");
	}

}
