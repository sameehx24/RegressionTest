package org.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider123 {

	@Test(dataProvider = "login")
	public void m1(String a, String b) {
		System.out.println(a + "     " + b);
	}

	@DataProvider(name = "login")
	public static String[][] bulkData() {
		return new String[][] { 
			{ "Sameeh", "234567" }, 
			{ "Messi", "345678" }, 
			{ "CR7", "3dfc678" },
		};

	}
}