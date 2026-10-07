package org.crossBrowserTesting;

import org.baseClass.BaseClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting extends BaseClass {
	
	@Parameters("browser")
	@Test
	public void tc1(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
		}
		else if (browser.equals("safari")) {
			driver=new SafariDriver();
			driver.get("https://www.youtube.com/");
			
		}
		else if (browser.equals("ff")){
			driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		}
		
	}

}
