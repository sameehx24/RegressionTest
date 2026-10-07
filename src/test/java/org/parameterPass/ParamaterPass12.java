package org.parameterPass;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterPass12 {
	
	@Parameters("username")
	@Test
	public void m1(String a) {
		System.out.println("name   "+ a);
		
	}
	
	
	@Parameters({"usrname","password"})
	@Test
	public void m2(@Optional("Error")String a,String b) {
		System.out.println("name   "+ a);
		System.out.println("passs   "+ b);
	}

	
	
}
