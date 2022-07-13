package org.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaMaen {
	
	private void gupta() {
	 System.out.println("11");

	}
   private void narsh(String username) {
	System.out.println("12");

}
   @BeforeMethod
	private void sugan() {
		   
		System.out.println("13");
	}
	@BeforeClass
	private void ksk() {
		   
		System.out.println("14");
	}
   @AfterMethod
	private void srk() {
		   
		System.out.println("15");
	}
   @Test(priority = -19)
	private void nagu() {
		   
		System.out.println("16");
   }
}
