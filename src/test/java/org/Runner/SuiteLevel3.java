package org.Runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.baseClass.BaseClass;
import org.testng.annotations.Test;

public class SuiteLevel3 extends BaseClass {

	@Test
	public void tc31() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.instagram.com/");
		System.out.println("tc31 instagram");
		quitBrowser();
	}
	
	
	@Test
	public void tc32() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.facebook.com/");
		System.out.println("tc32 facebook");

		quitBrowser();
	}
	
	
	@Test
	  public void tc33() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.youtube.com/");
		System.out.println("tc33 youtube");

		quitBrowser();
	}
	

}
