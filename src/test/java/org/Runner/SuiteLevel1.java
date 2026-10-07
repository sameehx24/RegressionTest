package org.Runner;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.baseClass.BaseClass;
import org.testng.annotations.Test;

public class SuiteLevel1 extends BaseClass {
	   //Bull shit AND  Operator
	//@Test(groups= {"smoke , sanity"})
	
	
	
//	@BeforeMethod
//	public void printOFf() {
//		System.out.println("This runs before every test cases");
//	}
	
	
	@Test
	public void tc11() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.instagram.com/");
		System.out.println("tc11 instagram");
		quitBrowser();
	}
	
	
	@Test(groups="smoke")
	public void tc12() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.facebook.com/");
		System.out.println("tc12 facebook");
		quitBrowser();
	}
	@Test(groups="regression")
	  public void tc13() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.youtube.com/");
		System.out.println("tc13 Youtube");
		quitBrowser();
	}
	
	
	@Test(groups="unit")
	public void tc14() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.amazon.com/");
		System.out.println("tc13 Amazon");
		quitBrowser();
	}
	

}
