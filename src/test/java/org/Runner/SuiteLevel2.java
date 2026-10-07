package org.Runner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.baseClass.BaseClass;
import org.testng.annotations.Test;

public class SuiteLevel2 extends BaseClass {

	@Test
	public void tc21() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.instagram.com/");
		System.out.println("tc21 instagram");
		quitBrowser();
	}
	
	
	@Test
	public void tc22() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.facebook.com/");
		System.out.println("tc22 facebook");
		quitBrowser();
	}
	@Test
	  public void tc23() {
		browserLaunch();
		maximizeWindow();
		urlLaunch("https://www.youtube.com/");
		System.out.println("tc23 youtube ");
		quitBrowser();
	}
	
}
